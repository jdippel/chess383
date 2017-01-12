/*
 *  ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_StandardBoard.java
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
 * The class ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_StandardBoard extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_StandardBoard( ) );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK );
    }
    
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_StandardBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a2", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a3", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a4", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a5", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a6", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a7", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a8", "a1 a2 a3 a4 a5 a6 a7 a8" } );
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
        parameters.add( new Object[] { "d1", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d2", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d3", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d4", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d5", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d6", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d7", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d8", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "e1", "e1 e2 e3 e4 e5 e6 e7 e8" } );
        parameters.add( new Object[] { "e2", "e1 e2 e3 e4 e5 e6 e7 e8" } );
        parameters.add( new Object[] { "e3", "e1 e2 e3 e4 e5 e6 e7 e8" } );
        parameters.add( new Object[] { "e4", "e1 e2 e3 e4 e5 e6 e7 e8" } );
        parameters.add( new Object[] { "e5", "e1 e2 e3 e4 e5 e6 e7 e8" } );
        parameters.add( new Object[] { "e6", "e1 e2 e3 e4 e5 e6 e7 e8" } );
        parameters.add( new Object[] { "e7", "e1 e2 e3 e4 e5 e6 e7 e8" } );
        parameters.add( new Object[] { "e8", "e1 e2 e3 e4 e5 e6 e7 e8" } );
        parameters.add( new Object[] { "f1", "f1 f2 f3 f4 f5 f6 f7 f8" } );
        parameters.add( new Object[] { "f2", "f1 f2 f3 f4 f5 f6 f7 f8" } );
        parameters.add( new Object[] { "f3", "f1 f2 f3 f4 f5 f6 f7 f8" } );
        parameters.add( new Object[] { "f4", "f1 f2 f3 f4 f5 f6 f7 f8" } );
        parameters.add( new Object[] { "f5", "f1 f2 f3 f4 f5 f6 f7 f8" } );
        parameters.add( new Object[] { "f6", "f1 f2 f3 f4 f5 f6 f7 f8" } );
        parameters.add( new Object[] { "f7", "f1 f2 f3 f4 f5 f6 f7 f8" } );
        parameters.add( new Object[] { "f8", "f1 f2 f3 f4 f5 f6 f7 f8" } );
        parameters.add( new Object[] { "g1", "g1 g2 g3 g4 g5 g6 g7 g8" } );
        parameters.add( new Object[] { "g2", "g1 g2 g3 g4 g5 g6 g7 g8" } );
        parameters.add( new Object[] { "g3", "g1 g2 g3 g4 g5 g6 g7 g8" } );
        parameters.add( new Object[] { "g4", "g1 g2 g3 g4 g5 g6 g7 g8" } );
        parameters.add( new Object[] { "g5", "g1 g2 g3 g4 g5 g6 g7 g8" } );
        parameters.add( new Object[] { "g6", "g1 g2 g3 g4 g5 g6 g7 g8" } );
        parameters.add( new Object[] { "g7", "g1 g2 g3 g4 g5 g6 g7 g8" } );
        parameters.add( new Object[] { "g8", "g1 g2 g3 g4 g5 g6 g7 g8" } );
        parameters.add( new Object[] { "h1", "h1 h2 h3 h4 h5 h6 h7 h8" } );
        parameters.add( new Object[] { "h2", "h1 h2 h3 h4 h5 h6 h7 h8" } );
        parameters.add( new Object[] { "h3", "h1 h2 h3 h4 h5 h6 h7 h8" } );
        parameters.add( new Object[] { "h4", "h1 h2 h3 h4 h5 h6 h7 h8" } );
        parameters.add( new Object[] { "h5", "h1 h2 h3 h4 h5 h6 h7 h8" } );
        parameters.add( new Object[] { "h6", "h1 h2 h3 h4 h5 h6 h7 h8" } );
        parameters.add( new Object[] { "h7", "h1 h2 h3 h4 h5 h6 h7 h8" } );
        parameters.add( new Object[] { "h8", "h1 h2 h3 h4 h5 h6 h7 h8" } );
        
        return( parameters );
    }
}

