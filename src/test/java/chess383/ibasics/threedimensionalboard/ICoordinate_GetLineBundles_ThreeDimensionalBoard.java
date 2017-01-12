/*
 *  ICoordinate_GetLineBundles_ThreeDimensionalBoard.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2016, 2017 Jörg Dippel
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
import chess383.ibasics.ICoordinate_GetLineBundles_Wrapper;

/**
 * <p>
 * The class ICoordinate_GetLineBundles_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_ThreeDimensionalBoard extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass 
    public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_ThreeDimensionalBoard( ) );
        setOrientation( null );
    }
    
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_ThreeDimensionalBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "z0", "a0 z0 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , z0 a1 b2 c3 d4 e5 , d8 c6 b4 a2 z0 , d2 b1 z0" } );
        parameters.add( new Object[] { "z1", "e1 d1 c1 b1 a1 z1 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , z1 a2 b3 c4 d5 e6 , a0 z1 , d9 c7 b5 a3 z1 , d3 b2 z1" } );
        parameters.add( new Object[] { "z2", "e2 d2 c2 b2 a2 z2 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , z2 a3 b4 c5 d6 e7 , a1 z2 , c8 b6 a4 z2 , d4 b3 z2 , d0 b1 z2 , a0 z2" } );
        parameters.add( new Object[] { "z3", "e3 d3 c3 b3 a3 z3 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , z3 a4 b5 c6 d7 e8 , b1 a2 z3 , a1 z3 , d1 b2 z3 , d5 b4 z3 , b7 a5 z3" } );
        parameters.add( new Object[] { "z4", "e4 d4 c4 b4 a4 z4 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , z4 a5 b6 c7 d8 e9 , d0 c1 b2 a3 z4 , a2 z4 , d2 b3 z4 , d6 b5 z4 , b8 a6 z4" } );
        parameters.add( new Object[] { "z5", "e5 d5 c5 b5 a5 z5 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , e0 d1 c2 b3 a4 z5 , z5 a6 b7 c8 d9 , a7 z5 , b1 a3 z5 , d3 b4 z5 , d7 b6 z5" } );
        parameters.add( new Object[] { "z6", "e6 d6 c6 b6 a6 z6 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , e1 d2 c3 b4 a5 z6 , z6 a7 b8 , a8 z6 , d8 b7 z6 , b2 a4 z6 , d4 b5 z6" } );
        parameters.add( new Object[] { "z7", "e7 d7 c7 b7 a7 z7 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , e2 d3 c4 b5 a6 z7 , z7 a8 , a9 z7 , c1 b3 a5 z7 , d5 b6 z7 , d9 b8 z7" } );
        parameters.add( new Object[] { "z8", "e8 d8 c8 b8 a8 z8 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , e3 d4 c5 b6 a7 z8 , z8 a9 , d0 c2 b4 a6 z8 , d6 b7 z8" } );
        parameters.add( new Object[] { "z9", "a9 z9 , z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , e4 d5 c6 b7 a8 z9 , d1 c3 b5 a7 z9 , d7 b8 z9" } );
        parameters.add( new Object[] { "a0", "a0 z0 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , a0 b1 c2 d3 e4 , a0 z1 , a0 c1 e2 , a0 z2 , a0 b2 c4 d6 e8" } );        
        parameters.add( new Object[] { "a1", "e1 d1 c1 b1 a1 z1 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , z0 a1 b2 c3 d4 e5 , a1 z2 , a1 c2 e3 , a1 z3 , a1 b3 c5 d7 e9" } );
        parameters.add( new Object[] { "a2", "e2 d2 c2 b2 a2 z2 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , z1 a2 b3 c4 d5 e6 , b1 a2 z3 , a2 c1 e0 , a2 c3 e4 , a2 z4 , d8 c6 b4 a2 z0" } );
        parameters.add( new Object[] { "a3", "e3 d3 c3 b3 a3 z3 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , d0 c1 b2 a3 z4 , z2 a3 b4 c5 d6 e7 , a3 c4 e5 , b1 a3 z5 , a3 c2 e1 , d9 c7 b5 a3 z1" } );
        parameters.add( new Object[] { "a4", "e4 d4 c4 b4 a4 z4 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , e0 d1 c2 b3 a4 z5 , z3 a4 b5 c6 d7 e8 , c8 b6 a4 z2 , b2 a4 z6 , a4 c5 e6 , a4 c3 e2" } );
        parameters.add( new Object[] { "a5", "e5 d5 c5 b5 a5 z5 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , e1 d2 c3 b4 a5 z6 , z4 a5 b6 c7 d8 e9 , a5 c4 e3 , a5 c6 e7 , c1 b3 a5 z7 , b7 a5 z3" } );
        parameters.add( new Object[] { "a6", "e6 d6 c6 b6 a6 z6 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , e2 d3 c4 b5 a6 z7 , z5 a6 b7 c8 d9 , d0 c2 b4 a6 z8 , b8 a6 z4 , a6 c7 e8 , a6 c5 e4" } );
        parameters.add( new Object[] { "a7", "e7 d7 c7 b7 a7 z7 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , e3 d4 c5 b6 a7 z8 , z6 a7 b8 , a7 z5 , d1 c3 b5 a7 z9 , a7 c6 e5 , a7 c8 e9" } );
        parameters.add( new Object[] { "a8", "e8 d8 c8 b8 a8 z8 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , z7 a8 , e4 d5 c6 b7 a8 z9 , a8 b6 c4 d2 e0 , a8 z6 , a8 c7 e6" } );
        parameters.add( new Object[] { "a9", "a9 z9 , a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , e5 d6 c7 b8 a9 , z8 a9 , a9 z7 , a9 b7 c5 d3 e1 , a9 c8 e7" } );
        parameters.add( new Object[] { "b1", "e1 d1 c1 b1 a1 z1 , b1 b2 b3 b4 b5 b6 b7 b8 , b1 a2 z3 , a0 b1 c2 d3 e4 , d0 b1 z2 , b1 a3 z5 , b1 c3 d5 e7 , d2 b1 z0" } );
        parameters.add( new Object[] { "b2", "e2 d2 c2 b2 a2 z2 , b1 b2 b3 b4 b5 b6 b7 b8 , d0 c1 b2 a3 z4 , z0 a1 b2 c3 d4 e5 , d3 b2 z1 , d1 b2 z3 , b2 a4 z6 , a0 b2 c4 d6 e8" } );
        parameters.add( new Object[] { "b3", "e3 d3 c3 b3 a3 z3 , b1 b2 b3 b4 b5 b6 b7 b8 , e0 d1 c2 b3 a4 z5 , z1 a2 b3 c4 d5 e6 , c1 b3 a5 z7 , d4 b3 z2 , d2 b3 z4 , a1 b3 c5 d7 e9" } );
        parameters.add( new Object[] { "b4", "e4 d4 c4 b4 a4 z4 , b1 b2 b3 b4 b5 b6 b7 b8 , z2 a3 b4 c5 d6 e7 , e1 d2 c3 b4 a5 z6 , d0 c2 b4 a6 z8 , d5 b4 z3 , d3 b4 z5 , d8 c6 b4 a2 z0" } );
        parameters.add( new Object[] { "b5", "e5 d5 c5 b5 a5 z5 , b1 b2 b3 b4 b5 b6 b7 b8 , e2 d3 c4 b5 a6 z7 , z3 a4 b5 c6 d7 e8 , d1 c3 b5 a7 z9 , d9 c7 b5 a3 z1 , d6 b5 z4 , d4 b5 z6" } );
        parameters.add( new Object[] { "b6", "e6 d6 c6 b6 a6 z6 , b1 b2 b3 b4 b5 b6 b7 b8 , e3 d4 c5 b6 a7 z8 , z4 a5 b6 c7 d8 e9 , a8 b6 c4 d2 e0 , c8 b6 a4 z2 , d5 b6 z7 , d7 b6 z5" } );
        parameters.add( new Object[] { "b7", "e7 d7 c7 b7 a7 z7 , b1 b2 b3 b4 b5 b6 b7 b8 , e4 d5 c6 b7 a8 z9 , z5 a6 b7 c8 d9 , a9 b7 c5 d3 e1 , d8 b7 z6 , b7 a5 z3 , d6 b7 z8" } );
        parameters.add( new Object[] { "b8", "e8 d8 c8 b8 a8 z8 , b1 b2 b3 b4 b5 b6 b7 b8 , e5 d6 c7 b8 a9 , z6 a7 b8 , b8 a6 z4 , d7 b8 z9 , d9 b8 z7 , b8 c6 d4 e2" } );
        parameters.add( new Object[] { "c1", "e1 d1 c1 b1 a1 z1 , c1 c2 c3 c4 c5 c6 c7 c8 , d0 c1 b2 a3 z4 , c1 d2 e3 , a2 c1 e0 , a0 c1 e2 , c1 b3 a5 z7 , c1 d3 e5" } );
        parameters.add( new Object[] { "c2", "e2 d2 c2 b2 a2 z2 , c1 c2 c3 c4 c5 c6 c7 c8 , e0 d1 c2 b3 a4 z5 , a0 b1 c2 d3 e4 , d0 c2 b4 a6 z8 , c2 d4 e6 , a3 c2 e1 , a1 c2 e3" } );
        parameters.add( new Object[] { "c3", "e3 d3 c3 b3 a3 z3 , c1 c2 c3 c4 c5 c6 c7 c8 , z0 a1 b2 c3 d4 e5 , e1 d2 c3 b4 a5 z6 , a4 c3 e2 , d1 c3 b5 a7 z9 , a2 c3 e4 , b1 c3 d5 e7" } );
        parameters.add( new Object[] { "c4", "e4 d4 c4 b4 a4 z4 , c1 c2 c3 c4 c5 c6 c7 c8 , e2 d3 c4 b5 a6 z7 , z1 a2 b3 c4 d5 e6 , a8 b6 c4 d2 e0 , a5 c4 e3 , a3 c4 e5 , a0 b2 c4 d6 e8" } );
        parameters.add( new Object[] { "c5", "e5 d5 c5 b5 a5 z5 , c1 c2 c3 c4 c5 c6 c7 c8 , e3 d4 c5 b6 a7 z8 , z2 a3 b4 c5 d6 e7 , a9 b7 c5 d3 e1 , a4 c5 e6 , a1 b3 c5 d7 e9 , a6 c5 e4" } );
        parameters.add( new Object[] { "c6", "e6 d6 c6 b6 a6 z6 , c1 c2 c3 c4 c5 c6 c7 c8 , z3 a4 b5 c6 d7 e8 , e4 d5 c6 b7 a8 z9 , a5 c6 e7 , a7 c6 e5 , d8 c6 b4 a2 z0 , b8 c6 d4 e2" } );
        parameters.add( new Object[] { "c7", "e7 d7 c7 b7 a7 z7 , c1 c2 c3 c4 c5 c6 c7 c8 , z4 a5 b6 c7 d8 e9 , e5 d6 c7 b8 a9 , c7 d5 e3 , d9 c7 b5 a3 z1 , a6 c7 e8 , a8 c7 e6" } );
        parameters.add( new Object[] { "c8", "e8 d8 c8 b8 a8 z8 , c1 c2 c3 c4 c5 c6 c7 c8 , e6 d7 c8 , z5 a6 b7 c8 d9 , c8 b6 a4 z2 , a9 c8 e7 , a7 c8 e9 , c8 d6 e4" } );
        parameters.add( new Object[] { "d0", "d0 e0 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , d0 c1 b2 a3 z4 , d0 e1 , d0 c2 b4 a6 z8 , d0 b1 z2 , d0 e2" } );
        parameters.add( new Object[] { "d1", "e1 d1 c1 b1 a1 z1 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , e0 d1 c2 b3 a4 z5 , d1 e2 , d1 c3 b5 a7 z9 , d1 b2 z3 , d1 e3" } );
        parameters.add( new Object[] { "d2", "e2 d2 c2 b2 a2 z2 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , c1 d2 e3 , e1 d2 c3 b4 a5 z6 , a8 b6 c4 d2 e0 , d2 e4 , d2 b3 z4 , d2 b1 z0" } );
        parameters.add( new Object[] { "d3", "e3 d3 c3 b3 a3 z3 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , e2 d3 c4 b5 a6 z7 , a0 b1 c2 d3 e4 , a9 b7 c5 d3 e1 , d3 b2 z1 , d3 b4 z5 , c1 d3 e5" } );
        parameters.add( new Object[] { "d4", "e4 d4 c4 b4 a4 z4 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , e3 d4 c5 b6 a7 z8 , z0 a1 b2 c3 d4 e5 , b8 c6 d4 e2 , c2 d4 e6 , d4 b3 z2 , d4 b5 z6" } );
        parameters.add( new Object[] { "d5", "e5 d5 c5 b5 a5 z5 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , e4 d5 c6 b7 a8 z9 , z1 a2 b3 c4 d5 e6 , d5 b4 z3 , c7 d5 e3 , d5 b6 z7 , b1 c3 d5 e7" } );
        parameters.add( new Object[] { "d6", "e6 d6 c6 b6 a6 z6 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , e5 d6 c7 b8 a9 , z2 a3 b4 c5 d6 e7 , a0 b2 c4 d6 e8 , d6 b5 z4 , c8 d6 e4 , d6 b7 z8" } );
        parameters.add( new Object[] { "d7", "e7 d7 c7 b7 a7 z7 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , e6 d7 c8 , z3 a4 b5 c6 d7 e8 , d7 e5 , d7 b8 z9 , d7 b6 z5 , a1 b3 c5 d7 e9" } );
        parameters.add( new Object[] { "d8", "e8 d8 c8 b8 a8 z8 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , z4 a5 b6 c7 d8 e9 , e7 d8 , d8 b7 z6 , d8 e6 , d8 c6 b4 a2 z0" } );
        parameters.add( new Object[] { "d9", "d9 e9 , d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , e8 d9 , z5 a6 b7 c8 d9 , d9 c7 b5 a3 z1 , d9 e7 , d9 b8 z7" } );
        parameters.add( new Object[] { "e0", "d0 e0 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , e0 d1 c2 b3 a4 z5 , a8 b6 c4 d2 e0 , a2 c1 e0" } );
        parameters.add( new Object[] { "e1", "e1 d1 c1 b1 a1 z1 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , d0 e1 , e1 d2 c3 b4 a5 z6 , a9 b7 c5 d3 e1 , a3 c2 e1" } );
        parameters.add( new Object[] { "e2", "e2 d2 c2 b2 a2 z2 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , d1 e2 , e2 d3 c4 b5 a6 z7 , a0 c1 e2 , d0 e2 , a4 c3 e2 , b8 c6 d4 e2" } );
        parameters.add( new Object[] { "e3", "e3 d3 c3 b3 a3 z3 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , e3 d4 c5 b6 a7 z8 , c1 d2 e3 , a5 c4 e3 , c7 d5 e3 , d1 e3 , a1 c2 e3" } );
        parameters.add( new Object[] { "e4", "e4 d4 c4 b4 a4 z4 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , a0 b1 c2 d3 e4 , e4 d5 c6 b7 a8 z9 , a2 c3 e4 , d2 e4 , c8 d6 e4 , a6 c5 e4" } );
        parameters.add( new Object[] { "e5", "e5 d5 c5 b5 a5 z5 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , e5 d6 c7 b8 a9 , z0 a1 b2 c3 d4 e5 , a3 c4 e5 , d7 e5 , a7 c6 e5 , c1 d3 e5" } );
        parameters.add( new Object[] { "e6", "e6 d6 c6 b6 a6 z6 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , e6 d7 c8 , z1 a2 b3 c4 d5 e6 , c2 d4 e6 , d8 e6 , a4 c5 e6 , a8 c7 e6" } );
        parameters.add( new Object[] { "e7", "e7 d7 c7 b7 a7 z7 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , e7 d8 , z2 a3 b4 c5 d6 e7 , a5 c6 e7 , a9 c8 e7 , d9 e7 , b1 c3 d5 e7" } );
        parameters.add( new Object[] { "e8", "e8 d8 c8 b8 a8 z8 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , e8 d9 , z3 a4 b5 c6 d7 e8 , a0 b2 c4 d6 e8 , a6 c7 e8" } );
        parameters.add( new Object[] { "e9", "d9 e9 , e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , z4 a5 b6 c7 d8 e9 , a7 c8 e9 , a1 b3 c5 d7 e9" } );
        
        return( parameters );
    }
}

