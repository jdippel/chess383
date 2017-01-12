/*
 *  DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_StandardBoard.java
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

package chess383.graph.basics.coordinate;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.graph.basics.coordinate.board.StandardBoard;
import chess383.graph.color.DirectedByColorEnum;

/**
 * <p>
 * The class DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_StandardBoard 
extends DiscreteLineBundle_GetLineBundles_Wrapper { 
    
    @BeforeClass public static void beforeAll( ) { 
        StandardBoard.defineBoard( ); 
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED );
    }
    
    /**
     * the public method DiscreteLine getLineBundles( ) is tested.
     */
    public DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_StandardBoard( String square, String expected ) {

        super( square, expected );
    }
  
    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "a2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "a3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "a4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "a5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "a6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "a7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "a8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "b1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "b2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "b3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "b4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "b5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "b6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "b7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "b8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "c1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "c2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "c3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "c4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "c5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "c6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "c7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "c8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "d1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "d2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "d3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "d4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "d5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "d6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "d7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "d8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "e1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "e2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "e3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "e4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "e5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "e6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "e7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "e8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "f1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "f2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "f3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "f4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "f5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "f6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "f7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "f8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "g1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "g2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "g3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "g4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "g5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "g6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "g7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "g8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8" } );
        parameters.add( new Object[] { "h1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "h2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "h3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "h4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "h5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5" } );
        parameters.add( new Object[] { "h6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6" } );
        parameters.add( new Object[] { "h7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7" } );
        parameters.add( new Object[] { "h8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8" } );

        return( parameters );
    }
}

