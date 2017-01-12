/*
 *  ICoordinate_GetDirectlyConnectedLocations_StandardBoard.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2015-2017 Jörg Dippel
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

package chess383.ibasics.standardboard;

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
import chess383.graph.basics.board.Coordinate_GraphImplementation_StandardBoard;

/**
 * <p>
 * The class ICoordinate_GetDirectlyConnectedLocations_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetDirectlyConnectedLocations_StandardBoard { 

    static ICoordinate board;
    @BeforeClass public static void beforeAll( ) { 
        board = new Coordinate_GraphImplementation_StandardBoard( );
    }
    
    /**
     * the public method Set<String> getDirectlyConnectedLocations is tested.
     */

    private final String square;
    private final String expected;

    public ICoordinate_GetDirectlyConnectedLocations_StandardBoard( String square, String expected ) {

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
        
        parameters.add( new Object[] { "a1", "a2 b2 b1" } );
        parameters.add( new Object[] { "a2", "a3 b3 b2 b1 a1" } );
        parameters.add( new Object[] { "a3", "a4 b4 b3 b2 a2" } );
        parameters.add( new Object[] { "a4", "a5 b5 b4 b3 a3" } );
        parameters.add( new Object[] { "a5", "a6 b6 b5 b4 a4" } );
        parameters.add( new Object[] { "a6", "a7 b7 b6 b5 a5" } );
        parameters.add( new Object[] { "a7", "a8 b8 b7 b6 a6" } );
        parameters.add( new Object[] { "a8", "b8 b7 a7" } );
        parameters.add( new Object[] { "b1", "b2 c2 c1 a1 a2" } );
        parameters.add( new Object[] { "b2", "b3 c3 c2 c1 b1 a1 a2 a3" } );
        parameters.add( new Object[] { "b3", "b4 c4 c3 c2 b2 a2 a3 a4" } );
        parameters.add( new Object[] { "b4", "b5 c5 c4 c3 b3 a3 a4 a5" } );
        parameters.add( new Object[] { "b5", "b6 c6 c5 c4 b4 a4 a5 a6" } );
        parameters.add( new Object[] { "b6", "b7 c7 c6 c5 b5 a5 a6 a7" } );
        parameters.add( new Object[] { "b7", "b8 c8 c7 c6 b6 a6 a7 a8" } );
        parameters.add( new Object[] { "b8", "c8 c7 b7 a7 a8" } );
        parameters.add( new Object[] { "c1", "c2 d2 d1 b1 b2" } );
        parameters.add( new Object[] { "c2", "c3 d3 d2 d1 c1 b1 b2 b3" } );
        parameters.add( new Object[] { "c3", "c4 d4 d3 d2 c2 b2 b3 b4" } );
        parameters.add( new Object[] { "c4", "c5 d5 d4 d3 c3 b3 b4 b5" } );
        parameters.add( new Object[] { "c5", "c6 d6 d5 d4 c4 b4 b5 b6" } );
        parameters.add( new Object[] { "c6", "c7 d7 d6 d5 c5 b5 b6 b7" } );
        parameters.add( new Object[] { "c7", "c8 d8 d7 d6 c6 b6 b7 b8" } );
        parameters.add( new Object[] { "c8", "d8 d7 c7 b7 b8" } );
        parameters.add( new Object[] { "d1", "d2 e2 e1 c1 c2" } );
        parameters.add( new Object[] { "d2", "d3 e3 e2 e1 d1 c1 c2 c3" } );
        parameters.add( new Object[] { "d3", "d4 e4 e3 e2 d2 c2 c3 c4" } );
        parameters.add( new Object[] { "d4", "d5 e5 e4 e3 d3 c3 c4 c5" } );
        parameters.add( new Object[] { "d5", "d6 e6 e5 e4 d4 c4 c5 c6" } );
        parameters.add( new Object[] { "d6", "d7 e7 e6 e5 d5 c5 c6 c7" } );
        parameters.add( new Object[] { "d7", "d8 e8 e7 e6 d6 c6 c7 c8" } );
        parameters.add( new Object[] { "d8", "e8 e7 d7 c7 c8" } );
        parameters.add( new Object[] { "e1", "e2 f2 f1 d1 d2" } );
        parameters.add( new Object[] { "e2", "e3 f3 f2 f1 e1 d1 d2 d3" } );
        parameters.add( new Object[] { "e3", "e4 f4 f3 f2 e2 d2 d3 d4" } );
        parameters.add( new Object[] { "e4", "e5 f5 f4 f3 e3 d3 d4 d5" } );
        parameters.add( new Object[] { "e5", "e6 f6 f5 f4 e4 d4 d5 d6" } );
        parameters.add( new Object[] { "e6", "e7 f7 f6 f5 e5 d5 d6 d7" } );
        parameters.add( new Object[] { "e7", "e8 f8 f7 f6 e6 d6 d7 d8" } );
        parameters.add( new Object[] { "e8", "f8 f7 e7 d7 d8" } );
        parameters.add( new Object[] { "f1", "f2 g2 g1 e1 e2" } );
        parameters.add( new Object[] { "f2", "f3 g3 g2 g1 f1 e1 e2 e3" } );
        parameters.add( new Object[] { "f3", "f4 g4 g3 g2 f2 e2 e3 e4" } );
        parameters.add( new Object[] { "f4", "f5 g5 g4 g3 f3 e3 e4 e5" } );
        parameters.add( new Object[] { "f5", "f6 g6 g5 g4 f4 e4 e5 e6" } );
        parameters.add( new Object[] { "f6", "f7 g7 g6 g5 f5 e5 e6 e7" } );
        parameters.add( new Object[] { "f7", "f8 g8 g7 g6 f6 e6 e7 e8" } );
        parameters.add( new Object[] { "f8", "g8 g7 f7 e7 e8" } );
        parameters.add( new Object[] { "g1", "g2 h2 h1 f1 f2" } );
        parameters.add( new Object[] { "g2", "g3 h3 h2 h1 g1 f1 f2 f3" } );
        parameters.add( new Object[] { "g3", "g4 h4 h3 h2 g2 f2 f3 f4" } );
        parameters.add( new Object[] { "g4", "g5 h5 h4 h3 g3 f3 f4 f5" } );
        parameters.add( new Object[] { "g5", "g6 h6 h5 h4 g4 f4 f5 f6" } );
        parameters.add( new Object[] { "g6", "g7 h7 h6 h5 g5 f5 f6 f7" } );
        parameters.add( new Object[] { "g7", "g8 h8 h7 h6 g6 f6 f7 f8" } );
        parameters.add( new Object[] { "g8", "h8 h7 g7 f7 f8" } );
        parameters.add( new Object[] { "h1", "h2 g1 g2" } );
        parameters.add( new Object[] { "h2", "h3 h1 g1 g2 g3" } );
        parameters.add( new Object[] { "h3", "h4 h2 g2 g3 g4" } );
        parameters.add( new Object[] { "h4", "h5 h3 g3 g4 g5" } );
        parameters.add( new Object[] { "h5", "h6 h4 g4 g5 g6" } );
        parameters.add( new Object[] { "h6", "h7 h5 g5 g6 g7" } );
        parameters.add( new Object[] { "h7", "h8 h6 g6 g7 g8" } );
        parameters.add( new Object[] { "h8", "h7 g7 g8" } );
        
        return( parameters );
    }
}

