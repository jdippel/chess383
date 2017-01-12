/*
 *  ICoordinate_GetLineBundles_NotAdjacent_ThreeDimensionalBoard.java
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
 * The class ICoordinate_GetLineBundles_NotAdjacent_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_NotAdjacent_ThreeDimensionalBoard extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_ThreeDimensionalBoard( ) );
        setOrientation( DirectedByColorEnum.NOT_ADJACENT );
    }
    
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_NotAdjacent_ThreeDimensionalBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "z0", "d8 c6 b4 a2 z0 , d2 b1 z0" } );
        parameters.add( new Object[] { "z1", "d9 c7 b5 a3 z1 , d3 b2 z1" } );
        parameters.add( new Object[] { "z2", "c8 b6 a4 z2 , d4 b3 z2 , d0 b1 z2 , a0 z2" } );
        parameters.add( new Object[] { "z3", "a1 z3 , d1 b2 z3 , d5 b4 z3 , b7 a5 z3" } );
        parameters.add( new Object[] { "z4", "a2 z4 , d2 b3 z4 , d6 b5 z4 , b8 a6 z4" } );
        parameters.add( new Object[] { "z5", "a7 z5 , b1 a3 z5 , d3 b4 z5 , d7 b6 z5" } );
        parameters.add( new Object[] { "z6", "a8 z6 , d8 b7 z6 , b2 a4 z6 , d4 b5 z6" } );
        parameters.add( new Object[] { "z7", "a9 z7 , c1 b3 a5 z7 , d5 b6 z7 , d9 b8 z7" } );
        parameters.add( new Object[] { "z8", "d0 c2 b4 a6 z8 , d6 b7 z8" } );
        parameters.add( new Object[] { "z9", "d1 c3 b5 a7 z9 , d7 b8 z9" } );
        parameters.add( new Object[] { "a0", "a0 c1 e2 , a0 z2 , a0 b2 c4 d6 e8" } );        
        parameters.add( new Object[] { "a1", "a1 c2 e3 , a1 z3 , a1 b3 c5 d7 e9" } );
        parameters.add( new Object[] { "a2", "a2 c1 e0 , a2 c3 e4 , a2 z4 , d8 c6 b4 a2 z0" } );
        parameters.add( new Object[] { "a3", "a3 c4 e5 , b1 a3 z5 , a3 c2 e1 , d9 c7 b5 a3 z1" } );
        parameters.add( new Object[] { "a4", "c8 b6 a4 z2 , b2 a4 z6 , a4 c5 e6 , a4 c3 e2" } );
        parameters.add( new Object[] { "a5", "a5 c4 e3 , a5 c6 e7 , c1 b3 a5 z7 , b7 a5 z3" } );
        parameters.add( new Object[] { "a6", "d0 c2 b4 a6 z8 , b8 a6 z4 , a6 c7 e8 , a6 c5 e4" } );
        parameters.add( new Object[] { "a7", "a7 z5 , d1 c3 b5 a7 z9 , a7 c6 e5 , a7 c8 e9" } );
        parameters.add( new Object[] { "a8", "a8 b6 c4 d2 e0 , a8 z6 , a8 c7 e6" } );
        parameters.add( new Object[] { "a9", "a9 z7 , a9 b7 c5 d3 e1 , a9 c8 e7" } );
        parameters.add( new Object[] { "b1", "d0 b1 z2 , b1 a3 z5 , b1 c3 d5 e7 , d2 b1 z0" } );
        parameters.add( new Object[] { "b2", "d3 b2 z1 , d1 b2 z3 , b2 a4 z6 , a0 b2 c4 d6 e8" } );
        parameters.add( new Object[] { "b3", "c1 b3 a5 z7 , d4 b3 z2 , d2 b3 z4 , a1 b3 c5 d7 e9" } );
        parameters.add( new Object[] { "b4", "d0 c2 b4 a6 z8 , d5 b4 z3 , d3 b4 z5 , d8 c6 b4 a2 z0" } );
        parameters.add( new Object[] { "b5", "d1 c3 b5 a7 z9 , d9 c7 b5 a3 z1 , d6 b5 z4 , d4 b5 z6" } );
        parameters.add( new Object[] { "b6", "a8 b6 c4 d2 e0 , c8 b6 a4 z2 , d5 b6 z7 , d7 b6 z5" } );
        parameters.add( new Object[] { "b7", "a9 b7 c5 d3 e1 , d8 b7 z6 , b7 a5 z3 , d6 b7 z8" } );
        parameters.add( new Object[] { "b8", "b8 a6 z4 , d7 b8 z9 , d9 b8 z7 , b8 c6 d4 e2" } );
        parameters.add( new Object[] { "c1", "a2 c1 e0 , a0 c1 e2 , c1 b3 a5 z7 , c1 d3 e5" } );
        parameters.add( new Object[] { "c2", "d0 c2 b4 a6 z8 , c2 d4 e6 , a3 c2 e1 , a1 c2 e3" } );
        parameters.add( new Object[] { "c3", "a4 c3 e2 , d1 c3 b5 a7 z9 , a2 c3 e4 , b1 c3 d5 e7" } );
        parameters.add( new Object[] { "c4", "a8 b6 c4 d2 e0 , a5 c4 e3 , a3 c4 e5 , a0 b2 c4 d6 e8" } );
        parameters.add( new Object[] { "c5", "a9 b7 c5 d3 e1 , a4 c5 e6 , a1 b3 c5 d7 e9 , a6 c5 e4" } );
        parameters.add( new Object[] { "c6", "a5 c6 e7 , a7 c6 e5 , d8 c6 b4 a2 z0 , b8 c6 d4 e2" } );
        parameters.add( new Object[] { "c7", "c7 d5 e3 , d9 c7 b5 a3 z1 , a6 c7 e8 , a8 c7 e6" } );
        parameters.add( new Object[] { "c8", "c8 b6 a4 z2 , a9 c8 e7 , a7 c8 e9 , c8 d6 e4" } );
        parameters.add( new Object[] { "d0", "d0 c2 b4 a6 z8 , d0 b1 z2 , d0 e2" } );
        parameters.add( new Object[] { "d1", "d1 c3 b5 a7 z9 , d1 b2 z3 , d1 e3" } );
        parameters.add( new Object[] { "d2", "a8 b6 c4 d2 e0 , d2 e4 , d2 b3 z4 , d2 b1 z0" } );
        parameters.add( new Object[] { "d3", "a9 b7 c5 d3 e1 , d3 b2 z1 , d3 b4 z5 , c1 d3 e5" } );
        parameters.add( new Object[] { "d4", "b8 c6 d4 e2 , c2 d4 e6 , d4 b3 z2 , d4 b5 z6" } );
        parameters.add( new Object[] { "d5", "d5 b4 z3 , c7 d5 e3 , d5 b6 z7 , b1 c3 d5 e7" } );
        parameters.add( new Object[] { "d6", "a0 b2 c4 d6 e8 , d6 b5 z4 , c8 d6 e4 , d6 b7 z8" } );
        parameters.add( new Object[] { "d7", "d7 e5 , d7 b8 z9 , d7 b6 z5 , a1 b3 c5 d7 e9" } );
        parameters.add( new Object[] { "d8", "d8 b7 z6 , d8 e6 , d8 c6 b4 a2 z0" } );
        parameters.add( new Object[] { "d9", "d9 c7 b5 a3 z1 , d9 e7 , d9 b8 z7" } );
        parameters.add( new Object[] { "e0", "a8 b6 c4 d2 e0 , a2 c1 e0" } );
        parameters.add( new Object[] { "e1", "a9 b7 c5 d3 e1 , a3 c2 e1" } );
        parameters.add( new Object[] { "e2", "a0 c1 e2 , d0 e2 , a4 c3 e2 , b8 c6 d4 e2" } );
        parameters.add( new Object[] { "e3", "a5 c4 e3 , c7 d5 e3 , d1 e3 , a1 c2 e3" } );
        parameters.add( new Object[] { "e4", "a2 c3 e4 , d2 e4 , c8 d6 e4 , a6 c5 e4" } );
        parameters.add( new Object[] { "e5", "a3 c4 e5 , d7 e5 , a7 c6 e5 , c1 d3 e5" } );
        parameters.add( new Object[] { "e6", "c2 d4 e6 , d8 e6 , a4 c5 e6 , a8 c7 e6" } );
        parameters.add( new Object[] { "e7", "a5 c6 e7 , a9 c8 e7 , d9 e7 , b1 c3 d5 e7" } );
        parameters.add( new Object[] { "e8", "a0 b2 c4 d6 e8 , a6 c7 e8" } );
        parameters.add( new Object[] { "e9", "a7 c8 e9 , a1 b3 c5 d7 e9" } );
        
        return( parameters );
    }
}

