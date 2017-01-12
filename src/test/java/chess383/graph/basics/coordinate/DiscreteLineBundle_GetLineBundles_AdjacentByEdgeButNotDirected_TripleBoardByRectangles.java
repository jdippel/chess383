/*
 *  DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_TripleBoardByRectangles.java
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

import chess383.graph.basics.coordinate.board.TripleBoardByRectangles;
import chess383.graph.color.DirectedByColorEnum;

/**
 * <p>
 * The class DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_TripleBoardByRectangles 
extends DiscreteLineBundle_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        TripleBoardByRectangles.defineBoard( ); 
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED );
    }
    
    /**
     * the public method DiscreteLine getLineBundles( ) is tested.
     */
    public DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_TripleBoardByRectangles( String square, String expected ) {

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
        parameters.add( new Object[] { "a5", "not directed: a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "a6", "not directed: a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "a7", "not directed: a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "a8", "not directed: a8 b8 c8 d8 i8 j8 k8 l8" } );
        
        parameters.add( new Object[] { "b1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "b2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "b3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "b4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "b5", "not directed: a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "b6", "not directed: a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "b7", "not directed: a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "b8", "not directed: a8 b8 c8 d8 i8 j8 k8 l8" } );
        
        parameters.add( new Object[] { "c1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "c2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "c3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "c4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "c5", "not directed: a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "c6", "not directed: a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "c7", "not directed: a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "c8", "not directed: a8 b8 c8 d8 i8 j8 k8 l8" } );
        
        parameters.add( new Object[] { "d1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "d2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "d3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "d4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "d5", "not directed: a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "d6", "not directed: a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "d7", "not directed: a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "d8", "not directed: a8 b8 c8 d8 i8 j8 k8 l8" } );
        
        parameters.add( new Object[] { "e1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "e2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "e3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "e4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "e9", "not directed: h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "e10", "not directed: h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "e11", "not directed: h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "e12", "not directed: h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "f1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "f2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "f3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "f4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "f9", "not directed: h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "f10", "not directed: h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "f11", "not directed: h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "f12", "not directed: h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "g1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "g2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "g3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "g4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "g9", "not directed: h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "g10", "not directed: h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "g11", "not directed: h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "g12", "not directed: h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "h1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "h2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "h3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "h4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "h9", "not directed: h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "h10", "not directed: h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "h11", "not directed: h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "h12", "not directed: h12 g12 f12 e12 i12 j12 k12 l12" } );
               
        parameters.add( new Object[] { "i5", "not directed: a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "i6", "not directed: a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "i7", "not directed: a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "i8", "not directed: a8 b8 c8 d8 i8 j8 k8 l8" } );
        parameters.add( new Object[] { "i9", "not directed: h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "i10", "not directed: h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "i11", "not directed: h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "i12", "not directed: h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "j5", "not directed: a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "j6", "not directed: a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "j7", "not directed: a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "j8", "not directed: a8 b8 c8 d8 i8 j8 k8 l8" } );
        parameters.add( new Object[] { "j9", "not directed: h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "j10", "not directed: h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "j11", "not directed: h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "j12", "not directed: h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "k5", "not directed: a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "k6", "not directed: a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "k7", "not directed: a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "k8", "not directed: a8 b8 c8 d8 i8 j8 k8 l8" } );
        parameters.add( new Object[] { "k9", "not directed: h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "k10", "not directed: h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "k11", "not directed: h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "k12", "not directed: h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "l5", "not directed: a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "l6", "not directed: a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "l7", "not directed: a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "l8", "not directed: a8 b8 c8 d8 i8 j8 k8 l8" } );
        parameters.add( new Object[] { "l9", "not directed: h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "l10", "not directed: h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "l11", "not directed: h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "l12", "not directed: h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        return( parameters );
    }
}

