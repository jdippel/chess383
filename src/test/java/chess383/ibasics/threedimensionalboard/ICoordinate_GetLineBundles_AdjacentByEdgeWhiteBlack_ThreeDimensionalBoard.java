/*
 *  ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_ThreeDimensionalBoard.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2017 Jörg Dippel
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package chess383.ibasics.threedimensionalboard;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.graph.basics.board.Coordinate_GraphImplementation_ThreeDimensionalBoard;
import chess383.graph.color.DirectedByColorEnum;
import chess383.ibasics.ICoordinate_GetLineBundles_Wrapper;

/**
 * <p>
 * The class ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_ThreeDimensionalBoard extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_ThreeDimensionalBoard( ) );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK );
    }
    
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_ThreeDimensionalBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "z0", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "z1", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "z2", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "z3", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "z4", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "z5", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "z6", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "z7", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "z8", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "z9", "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" } );
        parameters.add( new Object[] { "a0", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );        
        parameters.add( new Object[] { "a1", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );
        parameters.add( new Object[] { "a2", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );
        parameters.add( new Object[] { "a3", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );
        parameters.add( new Object[] { "a4", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );
        parameters.add( new Object[] { "a5", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );
        parameters.add( new Object[] { "a6", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );
        parameters.add( new Object[] { "a7", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );
        parameters.add( new Object[] { "a8", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );
        parameters.add( new Object[] { "a9", "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" } );
        parameters.add( new Object[] { "b1", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b2", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b3", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b4", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b5", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b6", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b7", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b8", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "c1", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c2", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c3", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c4", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c5", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c6", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c7", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c8", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "d0", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "d1", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "d2", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "d3", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "d4", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "d5", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "d6", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "d7", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "d8", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "d9", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "e0", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        parameters.add( new Object[] { "e1", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        parameters.add( new Object[] { "e2", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        parameters.add( new Object[] { "e3", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        parameters.add( new Object[] { "e4", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        parameters.add( new Object[] { "e5", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        parameters.add( new Object[] { "e6", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        parameters.add( new Object[] { "e7", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        parameters.add( new Object[] { "e8", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        parameters.add( new Object[] { "e9", "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" } );
        
        return( parameters );
    }
}

