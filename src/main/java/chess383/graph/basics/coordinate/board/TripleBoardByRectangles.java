/*
 *  TripleBoardByRectangles.java
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
import chess383.graph.color.DirectedByColorEnum;

/**
 * Provides locations on a bundle of lines for a board for three players: rectangles within a hexagon.
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class TripleBoardByRectangles extends DiscreteLineBundle {

    private static TripleBoardByRectangles INSTANCE = new TripleBoardByRectangles( );

    /** ------------------------------------------------------- */
    
    public static void defineBoard( ) { DiscreteLineBundle.bundle = INSTANCE.create( ); }
    
    private List<DiscreteLine> create( ) {
        
        List<DiscreteLine> factory = new ArrayList<DiscreteLine>( 407 );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "a1 b1 c1 d1 e1 f1 g1 h1" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "a2 b2 c2 d2 e2 f2 g2 h2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "a3 b3 c3 d3 e3 f3 g3 h3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "a4 b4 c4 d4 e4 f4 g4 h4" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "a8 b8 c8 d8 i8 j8 k8 l8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "a7 b7 c7 d7 i7 j7 k7 l7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "a6 b6 c6 d6 i6 j6 k6 l6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "a5 b5 c5 d5 i5 j5 k5 l5" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "h12 g12 f12 e12 i12 j12 k12 l12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "h11 g11 f11 e11 i11 j11 k11 l11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "h10 g10 f10 e10 i10 j10 k10 l10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "h9 g9 f9 e9 i9 j9 k9 l9" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "a1 a2 a3 a4 a5 a6 a7 a8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "b1 b2 b3 b4 b5 b6 b7 b8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "c1 c2 c3 c4 c5 c6 c7 c8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "d1 d2 d3 d4 d5 d6 d7 d8" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_RED, "e1 e2 e3 e4 e9 e10 e11 e12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_RED, "f1 f2 f3 f4 f9 f10 f11 f12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_RED, "g1 g2 g3 g4 g9 g10 g11 g12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_RED, "h1 h2 h3 h4 h9 h10 h11 h12" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BLACK_RED, "i8 i7 i6 i5 i9 i10 i11 i12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BLACK_RED, "j8 j7 j6 j5 j9 j10 j11 j12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BLACK_RED, "k8 k7 k6 k5 k9 k10 k11 k12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BLACK_RED, "l8 l7 l6 l5 l9 l10 l11 l12" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a1 b2 c3 d4 i5 j6 k7 l8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "b1 a2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "c1 b2 a3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "d1 c2 b3 a4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e1 d2 c3 b4 a5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "f1 e2 d3 c4 b5 a6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "g1 f2 e3 d4 c5 b6 a7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "h1 g2 f3 e4 d5 c6 b7 a8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a2 b3 c4 d5 i6 j7 k8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a3 b4 c5 d6 i7 j8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a4 b5 c6 d7 i8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a5 b6 c7 d8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a6 b7 c8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a7 b8" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "h1 g2 f3 e4 i9 j10 k11 l12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "h2 g3 f4 e9 i10 j11 k12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "h3 g4 f9 e10 i11 j12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "h4 g9 f10 e11 i12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "h9 g10 f11 e12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "h10 g11 f12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "h11 g12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "a1 b2 c3 d4 e9 f10 g11 h12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "b1 c2 d3 e4 f9 g10 h11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "c1 d2 e3 f4 g9 h10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "d1 e2 f3 g4 h9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "e1 f2 g3 h4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "f1 g2 h3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED, "g1 h2" ) );

        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "l8 k7 j6 i5 e9 f10 g11 h12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "l7 k6 j5 i9 e10 f11 g12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "l6 k5 j9 i10 e11 f12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "l5 k9 j10 i11 e12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "l9 k10 j11 i12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "l10 k11 j12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "l11 k12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "a8 b7 c6 d5 i9 j10 k11 l12" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "b8 c7 d6 i5 j9 k10 l11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "c8 d7 i6 j5 k9 l10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "d8 i7 j6 k5 l9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "i8 j7 k6 l5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "j8 k7 l6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED, "k8 l7" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a1 b3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a1 c2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b1 a3" ) );        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b1 c3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b1 d2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c1 a2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c1 b3" ) );        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c1 d3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c1 e2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d1 b2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d1 c3" ) );        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d1 e3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d1 f2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e1 c2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e1 d3" ) );        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e1 f3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e1 g2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f1 d2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f1 e3" ) );        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f1 g3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f1 h2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g1 e2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g1 f3" ) );        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g1 h3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h1 f2" ) );        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h1 g3" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a2 b4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a2 c3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b2 a4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b2 c4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b2 d3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c2 a3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c2 b4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c2 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c2 e3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d2 b3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d2 c4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d2 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d2 f3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e2 c3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e2 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e2 f4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e2 g3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f2 d3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f2 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f2 g4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f2 h3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g2 e3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g2 f4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g2 h4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h2 f3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h2 g4" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a3 b5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a3 c4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b3 a5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b3 c5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b3 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c3 a4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c3 b5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c3 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c3 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d3 b4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d3 c5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d3 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d3 f4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e3 c4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e3 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e3 f9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e3 g4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f3 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f3 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f3 g9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f3 h4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g3 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g3 f9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g3 h9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h3 f4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h3 g9" ) );        
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a4 b6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a4 c5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b4 a6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b4 c6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b4 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c4 a5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c4 b6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c4 d6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c4 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c4 i5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d4 b5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d4 c6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d4 i6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d4 f9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e4 c5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e4 f10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e4 i10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e4 g9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f4 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f4 i9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f4 e10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f4 g10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f4 h9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g4 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g4 f10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g4 h10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h4 f9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h4 g10" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h12 g10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h12 f11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g12 h10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g12 f10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g12 e11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f12 h11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f12 g10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f12 e10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f12 i11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e12 g11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e12 f10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e12 i10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e12 j11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i12 f11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i12 e10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i12 j10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i12 k11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j12 e11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j12 i10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j12 k10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j12 l11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k12 i11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k12 j10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k12 l10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l12 j11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l12 k10" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h11 g9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h11 f10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g11 h9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g11 f9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g11 e10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f11 h10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f11 g9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f11 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f11 i10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e11 g10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e11 f9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e11 i9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e11 j10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i11 f10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i11 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i11 j9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i11 k10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j11 e10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j11 i9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j11 k9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j11 l10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k11 i10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k11 j9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k11 l9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l11 j10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l11 k9" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h10 g4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h10 f9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g10 h4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g10 f4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g10 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f10 h9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f10 g4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f10 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f10 i9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f10 i11" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e10 g9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e10 f4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e10 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e10 i5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e10 j9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i10 f9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i10 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i10 j5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i10 k9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j10 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j10 i5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j10 k5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j10 l9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k10 i9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k10 j5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k10 l5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l10 j9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l10 k5" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h9 g3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "h9 f4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g9 h3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g9 f3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "g9 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f9 h4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f9 g3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f9 e3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f9 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "f9 i5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e9 g4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e9 f3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e9 d3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e9 j5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i9 f4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i9 d6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i9 j6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i9 k5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j9 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j9 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j9 i6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j9 k6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j9 l5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k9 i5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k9 j6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k9 l6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l9 j5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l9 k6" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l8 k6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l8 j7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k8 l6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k8 j6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k8 i7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j8 l7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j8 k6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j8 i6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j8 d7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i8 k7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i8 j6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i8 d6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i8 c7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d8 j7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d8 i6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d8 c6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d8 b7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c8 i7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c8 d6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c8 b6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c8 a7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b8 d7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b8 c6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b8 a6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a8 c7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a8 b6" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l7 k5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l7 j6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k7 l5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k7 j5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k7 i6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j7 l6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j7 k5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j7 i5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j7 d6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i7 k6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i7 j5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i7 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i7 c6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d7 j6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d7 i5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d7 c5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d7 b6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c7 i6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c7 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c7 b5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c7 a6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b7 d6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b7 c5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b7 a5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a7 c6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a7 b5" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l6 k9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l6 j5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k6 l9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k6 j9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k6 i5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j6 l5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j6 k9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j6 i9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j6 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i6 k5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i6 j9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i6 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i6 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i6 c5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d6 j5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d6 i9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d6 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d6 c4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d6 b5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c6 i5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c6 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c6 b4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c6 a5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b6 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b6 c4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b6 a4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a6 c5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a6 b4" ) );
                
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l5 k10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "l5 j9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k5 l10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k5 j10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "k5 i9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j5 l9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j5 k10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j5 i10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j5 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "j5 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i5 k9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i5 j10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i5 e10" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "i5 c4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d5 j9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d5 e3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d5 c3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d5 b4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c5 i9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c5 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c5 d3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c5 b3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c5 a4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b5 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b5 c3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b5 a3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a5 c4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a5 b3" ) );
 
        return( factory );
    }
}

