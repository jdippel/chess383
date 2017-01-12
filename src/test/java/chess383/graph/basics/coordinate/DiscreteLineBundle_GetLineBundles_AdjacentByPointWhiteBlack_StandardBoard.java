/*
 *  DiscreteLineBundle_GetLineBundles_AdjacentByPointWhiteBlack_StandardBoard.java
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
 * The class DiscreteLineBundle_GetLineBundles_AdjacentByPointWhiteBlack_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetLineBundles_AdjacentByPointWhiteBlack_StandardBoard 
extends DiscreteLineBundle_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        StandardBoard.defineBoard( ); 
        setOrientation( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK );
    }
    
    /**
     * the public method DiscreteLine getLineBundles( ) is tested.
     */
    public DiscreteLineBundle_GetLineBundles_AdjacentByPointWhiteBlack_StandardBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8" } );
        parameters.add( new Object[] { "a2", "directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: b1 a2" } );
        parameters.add( new Object[] { "a3", "directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: c1 b2 a3" } );
        parameters.add( new Object[] { "a4", "directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: d1 c2 b3 a4" } );
        parameters.add( new Object[] { "a5", "directed from white to black: a5 b6 c7 d8 , directed from white to black: e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "a6", "directed from white to black: a6 b7 c8 , directed from white to black: f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "a7", "directed from white to black: a7 b8 , directed from white to black: g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "a8", "directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "b1", "directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: b1 a2" } );
        parameters.add( new Object[] { "b2", "directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: c1 b2 a3" } );
        parameters.add( new Object[] { "b3", "directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: d1 c2 b3 a4" } );
        parameters.add( new Object[] { "b4", "directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "b5", "directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "b6", "directed from white to black: a5 b6 c7 d8 , directed from white to black: g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "b7", "directed from white to black: a6 b7 c8 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "b8", "directed from white to black: a7 b8 , directed from white to black: h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "c1", "directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: c1 b2 a3" } );
        parameters.add( new Object[] { "c2", "directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: d1 c2 b3 a4" } );
        parameters.add( new Object[] { "c3", "directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "c4", "directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "c5", "directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "c6", "directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "c7", "directed from white to black: a5 b6 c7 d8 , directed from white to black: h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "c8", "directed from white to black: a6 b7 c8 , directed from white to black: h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "d1", "directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: d1 c2 b3 a4" } );
        parameters.add( new Object[] { "d3", "directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "d4", "directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "d5", "directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "d6", "directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "d7", "directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "d8", "directed from white to black: a5 b6 c7 d8 , directed from white to black: h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "e1", "directed from white to black: e1 f2 g3 h4 , directed from white to black: e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "e2", "directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "e3", "directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "e4", "directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "e5", "directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "e6", "directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "e7", "directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "e8", "directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: h5 g6 f7 e8" } );
        parameters.add( new Object[] { "f1", "directed from white to black: f1 g2 h3 , directed from white to black: f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "f2", "directed from white to black: e1 f2 g3 h4 , directed from white to black: g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "f3", "directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "f4", "directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "f5", "directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "f6", "directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "f7", "directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: h5 g6 f7 e8" } );
        parameters.add( new Object[] { "f8", "directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: h6 g7 f8" } );
        parameters.add( new Object[] { "g1", "directed from white to black: g1 h2 , directed from white to black: g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "g2", "directed from white to black: f1 g2 h3 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "g3", "directed from white to black: e1 f2 g3 h4 , directed from white to black: h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "g4", "directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "g5", "directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "g6", "directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: h5 g6 f7 e8" } );
        parameters.add( new Object[] { "g7", "directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: h6 g7 f8" } );
        parameters.add( new Object[] { "g8", "directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: h7 g8" } );
        parameters.add( new Object[] { "h1", "directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "h2", "directed from white to black: g1 h2 , directed from white to black: h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "h3", "directed from white to black: f1 g2 h3 , directed from white to black: h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "h4", "directed from white to black: e1 f2 g3 h4 , directed from white to black: h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "h5", "directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: h5 g6 f7 e8" } );
        parameters.add( new Object[] { "h6", "directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: h6 g7 f8" } );
        parameters.add( new Object[] { "h7", "directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: h7 g8" } );
        parameters.add( new Object[] { "h8", "directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8" } );

        return( parameters );
    }
}

