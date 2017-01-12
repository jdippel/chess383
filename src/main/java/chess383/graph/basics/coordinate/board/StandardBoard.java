/*
 *  StandardBoard.java
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

package chess383.graph.basics.coordinate.board;

import java.util.ArrayList;
import java.util.List;

import chess383.graph.basics.coordinate.DiscreteLine;


/**
 * Provides locations on a bundle of lines for a standard board.
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class StandardBoard extends DiscreteLineBundle {
    
    private static StandardBoard INSTANCE = new StandardBoard( );

    /** ------------------------------------------------------- */
    
    public static void defineBoard( ) { DiscreteLineBundle.bundle = INSTANCE.create( ); }
    
    private List<DiscreteLine> create( ) {
        
        final int NUMBER_OF_LINES = 114;
        List<DiscreteLine> factory = new ArrayList<DiscreteLine>( NUMBER_OF_LINES );
        
        factory.add( createHorizontal( "a1 b1 c1 d1 e1 f1 g1 h1" ) );
        factory.add( createHorizontal( "a2 b2 c2 d2 e2 f2 g2 h2" ) );
        factory.add( createHorizontal( "a3 b3 c3 d3 e3 f3 g3 h3" ) );
        factory.add( createHorizontal( "a4 b4 c4 d4 e4 f4 g4 h4" ) );
        factory.add( createHorizontal( "a5 b5 c5 d5 e5 f5 g5 h5" ) );
        factory.add( createHorizontal( "a6 b6 c6 d6 e6 f6 g6 h6" ) );
        factory.add( createHorizontal( "a7 b7 c7 d7 e7 f7 g7 h7" ) );
        factory.add( createHorizontal( "a8 b8 c8 d8 e8 f8 g8 h8" ) );
        factory.add( createVertical(   "a1 a2 a3 a4 a5 a6 a7 a8" ) );
        factory.add( createVertical(   "b1 b2 b3 b4 b5 b6 b7 b8" ) );
        factory.add( createVertical(   "c1 c2 c3 c4 c5 c6 c7 c8" ) );
        factory.add( createVertical(   "d1 d2 d3 d4 d5 d6 d7 d8" ) );
        factory.add( createVertical(   "e1 e2 e3 e4 e5 e6 e7 e8" ) );
        factory.add( createVertical(   "f1 f2 f3 f4 f5 f6 f7 f8" ) );
        factory.add( createVertical(   "g1 g2 g3 g4 g5 g6 g7 g8" ) );
        factory.add( createVertical(   "h1 h2 h3 h4 h5 h6 h7 h8" ) );
        factory.add( createDiagonal(   "a1 b2 c3 d4 e5 f6 g7 h8" ) );
        factory.add( createDiagonal(   "a2 b3 c4 d5 e6 f7 g8" ) );
        factory.add( createDiagonal(   "a3 b4 c5 d6 e7 f8" ) );
        factory.add( createDiagonal(   "a4 b5 c6 d7 e8" ) );
        factory.add( createDiagonal(   "a5 b6 c7 d8" ) );
        factory.add( createDiagonal(   "a6 b7 c8" ) );
        factory.add( createDiagonal(   "a7 b8" ) );
        factory.add( createDiagonal(   "b1 c2 d3 e4 f5 g6 h7" ) );
        factory.add( createDiagonal(   "b1 a2" ) );
        factory.add( createDiagonal(   "c1 d2 e3 f4 g5 h6" ) );
        factory.add( createDiagonal(   "c1 b2 a3" ) );
        factory.add( createDiagonal(   "d1 e2 f3 g4 h5" ) );
        factory.add( createDiagonal(   "d1 c2 b3 a4" ) );
        factory.add( createDiagonal(   "e1 f2 g3 h4" ) );
        factory.add( createDiagonal(   "e1 d2 c3 b4 a5" ) );
        factory.add( createDiagonal(   "f1 g2 h3" ) );
        factory.add( createDiagonal(   "f1 e2 d3 c4 b5 a6" ) );
        factory.add( createDiagonal(   "g1 h2" ) );
        factory.add( createDiagonal(   "g1 f2 e3 d4 c5 b6 a7" ) );
        factory.add( createDiagonal(   "h1 g2 f3 e4 d5 c6 b7 a8" ) );
        factory.add( createDiagonal(   "h2 g3 f4 e5 d6 c7 b8" ) );
        factory.add( createDiagonal(   "h3 g4 f5 e6 d7 c8" ) );
        factory.add( createDiagonal(   "h4 g5 f6 e7 d8" ) );
        factory.add( createDiagonal(   "h5 g6 f7 e8" ) );
        factory.add( createDiagonal(   "h6 g7 f8" ) );
        factory.add( createDiagonal(   "h7 g8" ) );
        factory.add( createKnight(     "a1 b3 c5 d7" ) );
        factory.add( createKnight(     "a1 c2 e3 g4" ) );
        factory.add( createKnight(     "a2 b4 c6 d8" ) );
        factory.add( createKnight(     "a2 c3 e4 g5" ) );
        factory.add( createKnight(     "a2 c1" ) );
        factory.add( createKnight(     "a3 b5 c7" ) );
        factory.add( createKnight(     "a3 c4 e5 g6" ) );
        factory.add( createKnight(     "a3 c2 e1" ) );
        factory.add( createKnight(     "a3 b1" ) );
        factory.add( createKnight(     "a4 b6 c8" ) );
        factory.add( createKnight(     "a4 c5 e6 g7" ) );
        factory.add( createKnight(     "a4 c3 e2 g1" ) );
        factory.add( createKnight(     "a4 b2" ) );
        factory.add( createKnight(     "a5 b7" ) );
        factory.add( createKnight(     "a5 c6 e7 g8" ) );
        factory.add( createKnight(     "a5 c4 e3 g2" ) );
        factory.add( createKnight(     "a5 b3 c1" ) );
        factory.add( createKnight(     "a6 b8" ) );
        factory.add( createKnight(     "a6 c7 e8" ) );
        factory.add( createKnight(     "a6 c5 e4 g3" ) );
        factory.add( createKnight(     "a6 b4 c2" ) );
        factory.add( createKnight(     "a7 c8" ) );
        factory.add( createKnight(     "a7 c6 e5 g4" ) );
        factory.add( createKnight(     "a7 b5 c3 d1" ) );
        factory.add( createKnight(     "a8 c7 e6 g5" ) );
        factory.add( createKnight(     "a8 b6 c4 d2" ) );
        factory.add( createKnight(     "b1 c3 d5 e7" ) );
        factory.add( createKnight(     "b1 d2 f3 h4" ) );
        factory.add( createKnight(     "b2 c4 d6 e8" ) );
        factory.add( createKnight(     "b2 d3 f4 h5" ) );
        factory.add( createKnight(     "b2 d1" ) );
        factory.add( createKnight(     "b3 d4 f5 h6" ) );
        factory.add( createKnight(     "b3 d2 f1" ) );
        factory.add( createKnight(     "b4 d5 f6 h7" ) );
        factory.add( createKnight(     "b4 d3 f2 h1" ) );
        factory.add( createKnight(     "b5 d6 f7 h8" ) );
        factory.add( createKnight(     "b5 d4 f3 h2" ) );
        factory.add( createKnight(     "b6 d7 f8" ) );
        factory.add( createKnight(     "b6 d5 f4 h3" ) );
        factory.add( createKnight(     "b7 d8" ) );
        factory.add( createKnight(     "b7 d6 f5 h4" ) );
        factory.add( createKnight(     "b7 c5 d3 e1" ) );
        factory.add( createKnight(     "b8 d7 f6 h5" ) );
        factory.add( createKnight(     "b8 c6 d4 e2" ) );
        factory.add( createKnight(     "c1 d3 e5 f7" ) );
        factory.add( createKnight(     "c1 e2 g3" ) );
        factory.add( createKnight(     "c2 d4 e6 f8" ) );
        factory.add( createKnight(     "c7 d5 e3 f1" ) );
        factory.add( createKnight(     "c8 e7 g6" ) );
        factory.add( createKnight(     "c8 d6 e4 f2" ) );
        factory.add( createKnight(     "d1 e3 f5 g7" ) );
        factory.add( createKnight(     "d1 f2 h3" ) );
        factory.add( createKnight(     "d2 e4 f6 g8" ) );
        factory.add( createKnight(     "d7 e5 f3 g1" ) );
        factory.add( createKnight(     "d8 f7 h6" ) );
        factory.add( createKnight(     "d8 e6 f4 g2" ) );
        factory.add( createKnight(     "e1 f3 g5 h7" ) );
        factory.add( createKnight(     "e1 g2" ) );
        factory.add( createKnight(     "e2 f4 g6 h8" ) );
        factory.add( createKnight(     "e7 f5 g3 h1" ) );
        factory.add( createKnight(     "e8 g7" ) );
        factory.add( createKnight(     "e8 f6 g4 h2" ) );
        factory.add( createKnight(     "f1 g3 h5" ) );
        factory.add( createKnight(     "f1 h2" ) );
        factory.add( createKnight(     "f2 g4 h6" ) );
        factory.add( createKnight(     "f7 g5 h3" ) );
        factory.add( createKnight(     "f8 h7" ) );
        factory.add( createKnight(     "f8 g6 h4" ) );
        factory.add( createKnight(     "g1 h3" ) );
        factory.add( createKnight(     "g2 h4" ) );
        factory.add( createKnight(     "g7 h5" ) );
        factory.add( createKnight(     "g8 h6" ) );

        return( factory );
    }
}

