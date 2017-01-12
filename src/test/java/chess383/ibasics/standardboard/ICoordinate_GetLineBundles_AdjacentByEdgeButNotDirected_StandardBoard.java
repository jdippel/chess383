/*
 *  ICoordinate_GetLineBundles_AdjacentByEdgeButNotDirected_StandardBoard.java
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

package chess383.ibasics.standardboard;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.graph.basics.board.Coordinate_GraphImplementation_StandardBoard;
import chess383.graph.color.DirectedByColorEnum;
import chess383.ibasics.ICoordinate_GetLineBundles_Wrapper;

/**
 * <p>
 * The class ICoordinate_GetLineBundles_AdjacentByEdgeButNotDirected_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByEdgeButNotDirected_StandardBoard extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_StandardBoard( ) );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED );
    }
    
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByEdgeButNotDirected_StandardBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "a2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "a3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "a4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "a5", "a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "a6", "a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "a7", "a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "a8", "a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "b1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "b2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "b3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "b4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "b5", "a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "b6", "a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "b7", "a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "b8", "a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "c1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "c2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "c3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "c4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "c5", "a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "c6", "a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "c7", "a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "c8", "a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "d1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "d2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "d3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "d4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "d5", "a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "d6", "a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "d7", "a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "d8", "a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "e1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "e2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "e3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "e4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "e5", "a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "e6", "a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "e7", "a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "e8", "a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "f1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "f2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "f3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "f4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "f5", "a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "f6", "a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "f7", "a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "f8", "a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "g1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "g2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "g3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "g4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "g5", "a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "g6", "a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "g7", "a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "g8", "a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "h1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "h2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "h3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "h4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "h5", "a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "h6", "a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "h7", "a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "h8", "a8 b8 c8 d8 e8 f8 g8 h8" } );

        return( parameters );
    }
}

