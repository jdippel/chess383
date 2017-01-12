/*
 *  ICoordinate_GetDirectlyConnectedLocations_ThreeDimensionalBoard.java
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

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.ICoordinate;
import chess383.graph.basics.board.Coordinate_GraphImplementation_ThreeDimensionalBoard;

/**
 * <p>
 * The class ICoordinate_GetDirectlyConnectedLocations_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetDirectlyConnectedLocations_ThreeDimensionalBoard { 

    static ICoordinate board;
    @BeforeClass public static void beforeAll( ) { 
        board = new Coordinate_GraphImplementation_ThreeDimensionalBoard( );
    }
    
    /**
     * the public method Set<String> getDirectlyConnectedLocations is tested.
     */

    private final String square;
    private final String expected;

    public ICoordinate_GetDirectlyConnectedLocations_ThreeDimensionalBoard( String square, String expected ) {

        this.square = square;
        this.expected = expected;
    }
    
    private void compareSetOfLocations( String expected, Set<String> squares ) {
        
        String[] tokens = expected.split( "\\s+" );
        assertEquals( "Sets must be of same size:", tokens.length, squares.size( ) );
        for( String square : tokens ) {
            assertEquals( "", true, squares.contains( square ) );
        }
    }

    @Test
    public void compareTheNeighbouredSquaresForAGivenLocation( ) {
        
        Set<String> received = board.getDirectlyConnectedLocations( this.square );
        
        compareSetOfLocations( this.expected, received );
    }
    
    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );
        
        parameters.add( new Object[] { "z0", "a0 a1 z1" } );
        parameters.add( new Object[] { "z1", "z0 a0 a1 a2 z2" } );
        parameters.add( new Object[] { "z2", "z1 a1 a2 a3 z3" } );
        parameters.add( new Object[] { "z3", "z2 a2 a3 a4 z4" } );
        parameters.add( new Object[] { "z4", "z3 a3 a4 a5 z5" } );
        parameters.add( new Object[] { "z5", "z4 a4 a5 a6 z6" } );
        parameters.add( new Object[] { "z6", "z5 a5 a6 a7 z7" } );
        parameters.add( new Object[] { "z7", "z6 a6 a7 a8 z8" } );
        parameters.add( new Object[] { "z8", "z7 a7 a8 a9 z9" } );
        parameters.add( new Object[] { "z9", "z8 a8 a9" } );
        
        parameters.add( new Object[] { "a0", "b1 a1 z1 z0" } );
        parameters.add( new Object[] { "a1", "a0 b1 b2 a2 z2 z1 z0" } );
        parameters.add( new Object[] { "a2", "a1 b1 b2 b3 a3 z3 z2 z1" } );
        parameters.add( new Object[] { "a3", "a2 b2 b3 b4 a4 z4 z3 z2" } );
        parameters.add( new Object[] { "a4", "a3 b3 b4 b5 a5 z5 z4 z3" } );
        parameters.add( new Object[] { "a5", "a4 b4 b5 b6 a6 z6 z5 z4" } );
        parameters.add( new Object[] { "a6", "a5 b5 b6 b7 a7 z7 z6 z5" } );
        parameters.add( new Object[] { "a7", "a6 b6 b7 b8 a8 z8 z7 z6" } );
        parameters.add( new Object[] { "a8", "a7 b7 b8 a9 z9 z8 z7" } );
        parameters.add( new Object[] { "a9", "a8 b8 z9 z8" } );
        
        parameters.add( new Object[] { "b1", "b2 c2 c1 a0 a1 a2" } );
        parameters.add( new Object[] { "b2", "b3 c3 c2 c1 b1 a1 a2 a3" } );
        parameters.add( new Object[] { "b3", "b4 c4 c3 c2 b2 a2 a3 a4" } );
        parameters.add( new Object[] { "b4", "b5 c5 c4 c3 b3 a3 a4 a5" } );
        parameters.add( new Object[] { "b5", "b6 c6 c5 c4 b4 a4 a5 a6" } );
        parameters.add( new Object[] { "b6", "b7 c7 c6 c5 b5 a5 a6 a7" } );
        parameters.add( new Object[] { "b7", "b8 c8 c7 c6 b6 a6 a7 a8" } );
        parameters.add( new Object[] { "b8", "c8 c7 b7 a7 a8 a9" } );
        
        parameters.add( new Object[] { "c1", "c2 d2 d1 d0 b1 b2" } );
        parameters.add( new Object[] { "c2", "c3 d3 d2 d1 c1 b1 b2 b3" } );
        parameters.add( new Object[] { "c3", "c4 d4 d3 d2 c2 b2 b3 b4" } );
        parameters.add( new Object[] { "c4", "c5 d5 d4 d3 c3 b3 b4 b5" } );
        parameters.add( new Object[] { "c5", "c6 d6 d5 d4 c4 b4 b5 b6" } );
        parameters.add( new Object[] { "c6", "c7 d7 d6 d5 c5 b5 b6 b7" } );
        parameters.add( new Object[] { "c7", "c8 d8 d7 d6 c6 b6 b7 b8" } );
        parameters.add( new Object[] { "c8", "d9 d8 d7 c7 b7 b8" } );
        
        parameters.add( new Object[] { "d0", "d1 e1 e0 c1" } );
        parameters.add( new Object[] { "d1", "d2 e2 e1 e0 d0 c1 c2" } );
        parameters.add( new Object[] { "d2", "d3 e3 e2 e1 d1 c1 c2 c3" } );
        parameters.add( new Object[] { "d3", "d4 e4 e3 e2 d2 c2 c3 c4" } );
        parameters.add( new Object[] { "d4", "d5 e5 e4 e3 d3 c3 c4 c5" } );
        parameters.add( new Object[] { "d5", "d6 e6 e5 e4 d4 c4 c5 c6" } );
        parameters.add( new Object[] { "d6", "d7 e7 e6 e5 d5 c5 c6 c7" } );
        parameters.add( new Object[] { "d7", "d8 e8 e7 e6 d6 c6 c7 c8" } );
        parameters.add( new Object[] { "d8", "e8 e7 d7 c7 c8 d9 e9" } );
        parameters.add( new Object[] { "d9", "e9 e8 d8 c8" } );
        
        parameters.add( new Object[] { "e0", "d0 d1 e1" } );
        parameters.add( new Object[] { "e1", "e0 d0 d1 d2 e2" } );
        parameters.add( new Object[] { "e2", "e1 d1 d2 d3 e3" } );
        parameters.add( new Object[] { "e3", "e2 d2 d3 d4 e4" } );
        parameters.add( new Object[] { "e4", "e3 d3 d4 d5 e5" } );
        parameters.add( new Object[] { "e5", "e4 d4 d5 d6 e6" } );
        parameters.add( new Object[] { "e6", "e5 d5 d6 d7 e7" } );
        parameters.add( new Object[] { "e7", "e6 d6 d7 d8 e8" } );
        parameters.add( new Object[] { "e8", "e7 d7 d8 d9 e9" } );
        parameters.add( new Object[] { "e9", "e8 d8 d9" } );
        
        return( parameters );
    }
}

