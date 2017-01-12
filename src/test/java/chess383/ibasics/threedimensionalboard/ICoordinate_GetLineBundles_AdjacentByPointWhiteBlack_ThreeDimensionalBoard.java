/*
 *  ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_ThreeDimensionalBoard.java
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
 * The class ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_ThreeDimensionalBoard extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_ThreeDimensionalBoard( ) );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK );
    }
    
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_ThreeDimensionalBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "z0", "z0 a1 b2 c3 d4 e5" } );
        parameters.add( new Object[] { "z1", "z1 a2 b3 c4 d5 e6 , a0 z1" } );
        parameters.add( new Object[] { "z2", "z2 a3 b4 c5 d6 e7 , a1 z2" } );
        parameters.add( new Object[] { "z3", "z3 a4 b5 c6 d7 e8 , b1 a2 z3" } );
        parameters.add( new Object[] { "z4", "z4 a5 b6 c7 d8 e9 , d0 c1 b2 a3 z4" } );
        parameters.add( new Object[] { "z5", "e0 d1 c2 b3 a4 z5 , z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "z6", "e1 d2 c3 b4 a5 z6 , z6 a7 b8" } );
        parameters.add( new Object[] { "z7", "e2 d3 c4 b5 a6 z7 , z7 a8" } );
        parameters.add( new Object[] { "z8", "e3 d4 c5 b6 a7 z8 , z8 a9" } );
        parameters.add( new Object[] { "z9", "e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "a0", "a0 b1 c2 d3 e4 , a0 z1" } );        
        parameters.add( new Object[] { "a1", "z0 a1 b2 c3 d4 e5 , a1 z2" } );
        parameters.add( new Object[] { "a2", "z1 a2 b3 c4 d5 e6 , b1 a2 z3" } );
        parameters.add( new Object[] { "a3", "d0 c1 b2 a3 z4 , z2 a3 b4 c5 d6 e7" } );
        parameters.add( new Object[] { "a4", "e0 d1 c2 b3 a4 z5 , z3 a4 b5 c6 d7 e8" } );
        parameters.add( new Object[] { "a5", "e1 d2 c3 b4 a5 z6 , z4 a5 b6 c7 d8 e9" } );
        parameters.add( new Object[] { "a6", "e2 d3 c4 b5 a6 z7 , z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "a7", "e3 d4 c5 b6 a7 z8 , z6 a7 b8" } );
        parameters.add( new Object[] { "a8", "z7 a8 , e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "a9", "e5 d6 c7 b8 a9 , z8 a9" } );
        parameters.add( new Object[] { "b1", "b1 a2 z3 , a0 b1 c2 d3 e4" } );
        parameters.add( new Object[] { "b2", "d0 c1 b2 a3 z4 , z0 a1 b2 c3 d4 e5" } );
        parameters.add( new Object[] { "b3", "e0 d1 c2 b3 a4 z5 , z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "b4", "z2 a3 b4 c5 d6 e7 , e1 d2 c3 b4 a5 z6" } );
        parameters.add( new Object[] { "b5", "e2 d3 c4 b5 a6 z7 , z3 a4 b5 c6 d7 e8" } );
        parameters.add( new Object[] { "b6", "e3 d4 c5 b6 a7 z8 , z4 a5 b6 c7 d8 e9" } );
        parameters.add( new Object[] { "b7", "e4 d5 c6 b7 a8 z9 , z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "b8", "e5 d6 c7 b8 a9 , z6 a7 b8" } );
        parameters.add( new Object[] { "c1", "d0 c1 b2 a3 z4 , c1 d2 e3" } );
        parameters.add( new Object[] { "c2", "e0 d1 c2 b3 a4 z5 , a0 b1 c2 d3 e4" } );
        parameters.add( new Object[] { "c3", "z0 a1 b2 c3 d4 e5 , e1 d2 c3 b4 a5 z6" } );
        parameters.add( new Object[] { "c4", "e2 d3 c4 b5 a6 z7 , z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "c5", "e3 d4 c5 b6 a7 z8 , z2 a3 b4 c5 d6 e7" } );
        parameters.add( new Object[] { "c6", "z3 a4 b5 c6 d7 e8 , e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "c7", "z4 a5 b6 c7 d8 e9 , e5 d6 c7 b8 a9" } );
        parameters.add( new Object[] { "c8", "e6 d7 c8 , z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "d0", "d0 c1 b2 a3 z4 , d0 e1" } );
        parameters.add( new Object[] { "d1", "e0 d1 c2 b3 a4 z5 , d1 e2" } );
        parameters.add( new Object[] { "d2", "c1 d2 e3 , e1 d2 c3 b4 a5 z6" } );
        parameters.add( new Object[] { "d3", "e2 d3 c4 b5 a6 z7 , a0 b1 c2 d3 e4" } );
        parameters.add( new Object[] { "d4", "e3 d4 c5 b6 a7 z8 , z0 a1 b2 c3 d4 e5" } );
        parameters.add( new Object[] { "d5", "e4 d5 c6 b7 a8 z9 , z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "d6", "e5 d6 c7 b8 a9 , z2 a3 b4 c5 d6 e7" } );
        parameters.add( new Object[] { "d7", "e6 d7 c8 , z3 a4 b5 c6 d7 e8" } );
        parameters.add( new Object[] { "d8", "z4 a5 b6 c7 d8 e9 , e7 d8" } );
        parameters.add( new Object[] { "d9", "e8 d9 , z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "e0", "e0 d1 c2 b3 a4 z5" } );
        parameters.add( new Object[] { "e1", "d0 e1 , e1 d2 c3 b4 a5 z6" } );
        parameters.add( new Object[] { "e2", "d1 e2 , e2 d3 c4 b5 a6 z7" } );
        parameters.add( new Object[] { "e3", "e3 d4 c5 b6 a7 z8 , c1 d2 e3" } );
        parameters.add( new Object[] { "e4", "a0 b1 c2 d3 e4 , e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "e5", "e5 d6 c7 b8 a9 , z0 a1 b2 c3 d4 e5" } );
        parameters.add( new Object[] { "e6", "e6 d7 c8 , z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "e7", "e7 d8 , z2 a3 b4 c5 d6 e7" } );
        parameters.add( new Object[] { "e8", "e8 d9 , z3 a4 b5 c6 d7 e8" } );
        parameters.add( new Object[] { "e9", "z4 a5 b6 c7 d8 e9" } );
        
        return( parameters );
    }
}

