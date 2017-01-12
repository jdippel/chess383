/*
 *  ThreeDimensionalBoard.java
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

package chess383.graph.basics.coordinate.board;

import java.util.ArrayList;
import java.util.List;

import chess383.graph.basics.coordinate.DiscreteLine;
import chess383.graph.color.DirectedByColorEnum;

/**
 * Provides locations on a bundle of lines for a three dimensional board for two players.
 * Please have a look to the descriptions of rules, search for rules by Jens Meder ...
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class ThreeDimensionalBoard extends DiscreteLineBundle {
    
    private static ThreeDimensionalBoard INSTANCE = new ThreeDimensionalBoard( );

    /** ------------------------------------------------------- */
    
    public static void defineBoard( ) { DiscreteLineBundle.bundle = INSTANCE.create( ); }
    
    private List<DiscreteLine> create( ) {
        
        List<DiscreteLine> factory = new ArrayList<DiscreteLine>( 12 + 6 + 26 + 66 );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z0 a0" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "d0 e0" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z1 a1 b1 c1 d1 e1" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z2 a2 b2 c2 d2 e2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z3 a3 b3 c3 d3 e3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z4 a4 b4 c4 d4 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z5 a5 b5 c5 d5 e5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z6 a6 b6 c6 d6 e6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z7 a7 b7 c7 d7 e7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z8 a8 b8 c8 d8 e8" ) );       
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "z9 a9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "d9 e9" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "z0 z1 z2 z3 z4 z5 z6 z7 z8 z9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,    "b1 b2 b3 b4 b5 b6 b7 b8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,    "c1 c2 c3 c4 c5 c6 c7 c8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "e0 e1 e2 e3 e4 e5 e6 e7 e8 e9" ) );
        
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "z0 a1 b2 c3 d4 e5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a0 z1" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a0 b1 c2 d3 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "d0 c1 b2 a3 z4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "d0 e1" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e0 d1 c2 b3 a4 z5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "z1 a2 b3 c4 d5 e6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "a1 z2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "b1 a2 z3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "c1 d2 e3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "d1 e2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e1 d2 c3 b4 a5 z6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "z2 a3 b4 c5 d6 e7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e2 d3 c4 b5 a6 z7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "z3 a4 b5 c6 d7 e8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e3 d4 c5 b6 a7 z8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "z4 a5 b6 c7 d8 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e4 d5 c6 b7 a8 z9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "z5 a6 b7 c8 d9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e5 d6 c7 b8 a9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "z6 a7 b8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e6 d7 c8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "z7 a8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e7 d8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "z8 a9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "e8 d9" ) );      

        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z0 b1 d2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z0 a2 b4 c6 d8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a0 c1 e2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a0 b2 c4 d6 e8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a0 z2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d0 b1 z2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d0 c2 b4 a6 z8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d0 e2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e0 c1 a2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e0 d2 c4 b6 a8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z1 b2 d3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z1 a3 b5 c7 d9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a1 c2 e3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a1 b3 c5 d7 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a1 z3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b1 c3 d5 e7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b1 a3 z5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c1 d3 e5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c1 b3 a5 z7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d1 e3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d1 c3 b5 a7 z9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d1 b2 z3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e1 d3 c5 b7 a9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e1 c2 a3" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z2 b3 d4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z2 a4 b6 c8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a2 c3 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a2 z4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b2 a4 z6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "c2 d4 e6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d2 e4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d2 b3 z4" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e2 d4 c6 b8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z3 b4 d5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z3 a5 b7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a3 c4 e5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d3 b4 z5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e3 d5 c7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e3 c4 a5" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z4 b5 d6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z4 a6 b8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a4 c5 e6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a4 c3 e2" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d4 b5 z6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e4 c5 a6" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e4 d6 c8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z5 b6 d7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z5 a7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a5 c6 e7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d5 b6 z7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e5 c6 a7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e5 d7" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z6 b7 d8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z6 a8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a6 c7 e8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d6 b7 z8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e6 c7 a8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e6 d8" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z7 b8 d9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "z7 a9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "a7 c8 e9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "d7 b8 z9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e7 c8 a9" ) );
        factory.add( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "e7 d9" ) );
  
        return( factory );
    }
}

