/*
 *  DiscreteLineBundle_GetLineBundles_NotAdjacent_TripleBoardByRectangles.java
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
 * The class DiscreteLineBundle_GetLineBundles_NotAdjacent_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetLineBundles_NotAdjacent_TripleBoardByRectangles 
extends DiscreteLineBundle_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        TripleBoardByRectangles.defineBoard( ); 
        setOrientation( DirectedByColorEnum.NOT_ADJACENT );
    }
    
    /**
     * the public method DiscreteLine getLineBundles( ) is tested.
     */
    public DiscreteLineBundle_GetLineBundles_NotAdjacent_TripleBoardByRectangles( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "not directed: a1 c2 , not directed: a1 b3" } );
        parameters.add( new Object[] { "a2", "not directed: a2 c1 , not directed: a2 c3 , not directed: a2 b4" } );
        parameters.add( new Object[] { "a3", "not directed: a3 b1 , not directed: a3 c2 , not directed: a3 c4 , not directed: a3 b5" } );
        parameters.add( new Object[] { "a4", "not directed: a4 b2 , not directed: a4 c3 , not directed: a4 c5 , not directed: a4 b6" } );
        parameters.add( new Object[] { "a5", "not directed: a5 b3 , not directed: a5 c4 , not directed: a5 c6 , not directed: a5 b7" } );
        parameters.add( new Object[] { "a6", "not directed: a6 b4 , not directed: a6 c5 , not directed: a6 c7 , not directed: a6 b8" } );
        parameters.add( new Object[] { "a7", "not directed: a7 c6 , not directed: a7 b5 , not directed: a7 c8" } );
        parameters.add( new Object[] { "a8", "not directed: a8 c7 , not directed: a8 b6" } );
        
        parameters.add( new Object[] { "b1", "not directed: b1 d2 , not directed: b1 c3 , not directed: a3 b1" } );
        parameters.add( new Object[] { "b2", "not directed: b2 c4 , not directed: b2 d3 , not directed: b2 d1 , not directed: a4 b2" } );
        parameters.add( new Object[] { "b3", "not directed: b3 c5 , not directed: a1 b3 , not directed: b3 d4 , not directed: b3 c1 , not directed: b3 d2 , not directed: a5 b3" } );
        parameters.add( new Object[] { "b4", "not directed: b4 c6 , not directed: b4 d5 , not directed: b4 c2 , not directed: b4 d3 , not directed: a6 b4 , not directed: a2 b4" } );
        parameters.add( new Object[] { "b5", "not directed: b5 c7 , not directed: b5 d6 , not directed: b5 c3 , not directed: b5 d4 , not directed: a7 b5 , not directed: a3 b5" } );
        parameters.add( new Object[] { "b6", "not directed: b6 c8 , not directed: b6 d7 , not directed: b6 c4 , not directed: b6 d5 , not directed: a8 b6 , not directed: a4 b6" } );
        parameters.add( new Object[] { "b7", "not directed: b7 d6 , not directed: b7 c5 , not directed: b7 d8 , not directed: a5 b7" } );
        parameters.add( new Object[] { "b8", "not directed: b8 d7 , not directed: b8 c6 , not directed: a6 b8" } );
        
        parameters.add( new Object[] { "c1", "not directed: b3 c1 , not directed: c1 d3 , not directed: c1 e2 , not directed: a2 c1" } );
        parameters.add( new Object[] { "c2", "not directed: c2 e3 , not directed: c2 d4 , not directed: a1 c2 , not directed: b4 c2 , not directed: c2 e1 , not directed: a3 c2" } );
        parameters.add( new Object[] { "c3", "not directed: c3 e4 , not directed: c3 d5 , not directed: c3 d1 , not directed: c3 e2 , not directed: a4 c3 , not directed: a2 c3 , not directed: b1 c3 , not directed: b5 c3" } );
        parameters.add( new Object[] { "c4", "not directed: c4 d6 , not directed: c4 i5 , not directed: c4 d2 , not directed: c4 e3 , not directed: a5 c4 , not directed: a3 c4 , not directed: c4 e9 , not directed: b2 c4 , not directed: b6 c4" } );
        parameters.add( new Object[] { "c5", "not directed: c5 d7 , not directed: c5 i6 , not directed: c5 i9 , not directed: c5 d3 , not directed: c5 e4 , not directed: a6 c5 , not directed: a4 c5 , not directed: b3 c5 , not directed: b7 c5" } );
        parameters.add( new Object[] { "c6", "not directed: c6 d8 , not directed: c6 d4 , not directed: c6 i7 , not directed: a7 c6 , not directed: a5 c6 , not directed: b4 c6 , not directed: c6 i5 , not directed: b8 c6" } );
        parameters.add( new Object[] { "c7", "not directed: b5 c7 , not directed: c7 d5 , not directed: c7 i8 , not directed: a8 c7 , not directed: c7 i6 , not directed: a6 c7" } );
        parameters.add( new Object[] { "c8", "not directed: b6 c8 , not directed: c8 d6 , not directed: c8 i7 , not directed: a7 c8" } );
        
        parameters.add( new Object[] { "d1", "not directed: b2 d1 , not directed: d1 f2 , not directed: c3 d1 , not directed: d1 e3" } );
        parameters.add( new Object[] { "d2", "not directed: d2 f1 , not directed: b1 d2 , not directed: b3 d2 , not directed: d2 e4 , not directed: d2 f3 , not directed: c4 d2" } );
        parameters.add( new Object[] { "d3", "not directed: d3 e1 , not directed: d3 f2 , not directed: b2 d3 , not directed: c1 d3 , not directed: b4 d3 , not directed: d3 f4 , not directed: c5 d3 , not directed: d3 e9" } );
        parameters.add( new Object[] { "d4", "not directed: c2 d4 , not directed: c6 d4 , not directed: d4 e2 , not directed: d4 f3 , not directed: d4 i6 , not directed: b3 d4 , not directed: d4 j5 , not directed: b5 d4 , not directed: d4 e10 , not directed: d4 f9" } );
        parameters.add( new Object[] { "d5", "not directed: c3 d5 , not directed: c7 d5 , not directed: d5 j9 , not directed: d5 e3 , not directed: d5 f4 , not directed: d5 i7 , not directed: b4 d5 , not directed: d5 j6 , not directed: b6 d5" } );
        parameters.add( new Object[] { "d6", "not directed: c4 d6 , not directed: c8 d6 , not directed: d6 j5 , not directed: b5 d6 , not directed: d6 j7 , not directed: d6 i8 , not directed: d6 e4 , not directed: d6 i9 , not directed: b7 d6" } );
        parameters.add( new Object[] { "d7", "not directed: c5 d7 , not directed: b6 d7 , not directed: d7 j8 , not directed: b8 d7 , not directed: d7 j6 , not directed: d7 i5" } );
        parameters.add( new Object[] { "d8", "not directed: c6 d8 , not directed: d8 j7 , not directed: d8 i6 , not directed: b7 d8" } );
        
        parameters.add( new Object[] { "e1", "not directed: c2 e1 , not directed: e1 f3 , not directed: d3 e1 , not directed: e1 g2" } );
        parameters.add( new Object[] { "e2", "not directed: d4 e2 , not directed: e2 g1 , not directed: e2 g3 , not directed: c3 e2 , not directed: e2 f4 , not directed: c1 e2" } );
        parameters.add( new Object[] { "e3", "not directed: c2 e3 , not directed: d5 e3 , not directed: e3 f1 , not directed: e3 g2 , not directed: e3 g4 , not directed: d1 e3 , not directed: c4 e3 , not directed: e3 f9" } );
        parameters.add( new Object[] { "e4", "not directed: c3 e4 , not directed: e4 f2 , not directed: e4 g3 , not directed: e4 j9 , not directed: e4 f10 , not directed: c5 e4 , not directed: e4 g9 , not directed: d2 e4 , not directed: d6 e4 , not directed: e4 i10" } );
        parameters.add( new Object[] { "e9", "not directed: e9 f11 , not directed: e9 g10 , not directed: e9 i11 , not directed: e9 j10 , not directed: c4 e9 , not directed: d3 e9 , not directed: e9 f3 , not directed: e9 g4 , not directed: e9 i6 , not directed: e9 j5" } );
        parameters.add( new Object[] { "e10", "not directed: e10 j9 , not directed: e10 f4 , not directed: e10 i5 , not directed: e10 f12 , not directed: e10 g11 , not directed: e10 i12 , not directed: e10 j11 , not directed: e10 g9 , not directed: d4 e10" } );
        parameters.add( new Object[] { "e11", "not directed: e11 i9 , not directed: e11 j10 , not directed: e11 g12 , not directed: e11 g10 , not directed: e11 j12 , not directed: e11 f9" } );
        parameters.add( new Object[] { "e12", "not directed: e12 g11 , not directed: e12 f10 , not directed: e12 i10 , not directed: e12 j11" } );
        
        parameters.add( new Object[] { "f1", "not directed: d2 f1 , not directed: e3 f1 , not directed: f1 g3 , not directed: f1 h2" } );
        parameters.add( new Object[] { "f2", "not directed: d3 f2 , not directed: e4 f2 , not directed: d1 f2 , not directed: f2 g4 , not directed: f2 h3 , not directed: f2 h1" } );
        parameters.add( new Object[] { "f3", "not directed: f3 g9 , not directed: f3 h4 , not directed: f3 g1 , not directed: f3 h2 , not directed: d4 f3 , not directed: d2 f3 , not directed: e1 f3 , not directed: e9 f3" } );
        parameters.add( new Object[] { "f4", "not directed: e10 f4 , not directed: e2 f4 , not directed: f4 h9 , not directed: f4 i9 , not directed: f4 g2 , not directed: f4 h3 , not directed: d5 f4 , not directed: f4 g10 , not directed: d3 f4" } );
        parameters.add( new Object[] { "f9", "not directed: e3 f9 , not directed: f9 g3 , not directed: f9 h4 , not directed: e11 f9 , not directed: f9 i5 , not directed: f9 g11 , not directed: f9 h10 , not directed: f9 i10 , not directed: d4 f9" } );
        parameters.add( new Object[] { "f10", "not directed: e4 f10 , not directed: e12 f10 , not directed: f10 g12 , not directed: f10 h11 , not directed: f10 i11 , not directed: f10 g4 , not directed: f10 i9 , not directed: f10 h9" } );
        parameters.add( new Object[] { "f11", "not directed: f11 h10 , not directed: f11 i10 , not directed: e9 f11 , not directed: f11 h12 , not directed: f11 i12 , not directed: f11 g9" } );
        parameters.add( new Object[] { "f12", "not directed: f12 g10 , not directed: f12 h11 , not directed: f12 i11 , not directed: e10 f12" } );
        
        parameters.add( new Object[] { "g1", "not directed: e2 g1 , not directed: g1 h3 , not directed: f3 g1" } );
        parameters.add( new Object[] { "g2", "not directed: e3 g2 , not directed: g2 h4 , not directed: e1 g2 , not directed: f4 g2" } );
        parameters.add( new Object[] { "g3", "not directed: e4 g3 , not directed: e2 g3 , not directed: g3 h9 , not directed: f1 g3 , not directed: g3 h1 , not directed: f9 g3" } );
        parameters.add( new Object[] { "g4", "not directed: e3 g4 , not directed: f2 g4 , not directed: f10 g4 , not directed: g4 h10 , not directed: e9 g4 , not directed: g4 h2" } );
        parameters.add( new Object[] { "g9", "not directed: g9 h3 , not directed: f3 g9 , not directed: e4 g9 , not directed: f11 g9 , not directed: g9 h11 , not directed: e10 g9" } );
        parameters.add( new Object[] { "g10", "not directed: f4 g10 , not directed: f12 g10 , not directed: e9 g10 , not directed: e11 g10 , not directed: g10 h4 , not directed: g10 h12" } );
        parameters.add( new Object[] { "g11", "not directed: f9 g11 , not directed: g11 h9 , not directed: e12 g11 , not directed: e10 g11" } );
        parameters.add( new Object[] { "g12", "not directed: g12 h10 , not directed: f10 g12 , not directed: e11 g12" } );
        
        parameters.add( new Object[] { "h1", "not directed: f2 h1 , not directed: g3 h1" } );
        parameters.add( new Object[] { "h2", "not directed: f1 h2 , not directed: f3 h2 , not directed: g4 h2" } );
        parameters.add( new Object[] { "h3", "not directed: g9 h3 , not directed: g1 h3 , not directed: f2 h3 , not directed: f4 h3" } );
        parameters.add( new Object[] { "h4", "not directed: g2 h4 , not directed: f3 h4 , not directed: g10 h4 , not directed: f9 h4" } );
        parameters.add( new Object[] { "h9", "not directed: g11 h9 , not directed: g3 h9 , not directed: f4 h9 , not directed: f10 h9" } );
        parameters.add( new Object[] { "h10", "not directed: f11 h10 , not directed: f9 h10 , not directed: g12 h10 , not directed: g4 h10" } );
        parameters.add( new Object[] { "h11", "not directed: f12 h11 , not directed: f10 h11 , not directed: g9 h11" } );
        parameters.add( new Object[] { "h12", "not directed: f11 h12 , not directed: g10 h12" } );
               
        parameters.add( new Object[] { "i5", "not directed: c4 i5 , not directed: e10 i5 , not directed: d7 i5 , not directed: f9 i5 , not directed: c6 i5 , not directed: i5 j10 , not directed: i5 j7 , not directed: i5 k9 , not directed: i5 k6" } );
        parameters.add( new Object[] { "i6", "not directed: d8 i6 , not directed: d4 i6 , not directed: c7 i6 , not directed: i6 k5 , not directed: i6 j8 , not directed: i6 j9 , not directed: e9 i6 , not directed: i6 k7 , not directed: c5 i6" } );
        parameters.add( new Object[] { "i7", "not directed: d5 i7 , not directed: c6 i7 , not directed: c8 i7 , not directed: i7 k6 , not directed: i7 j5 , not directed: i7 k8" } );
        parameters.add( new Object[] { "i8", "not directed: d6 i8 , not directed: c7 i8 , not directed: i8 k7 , not directed: i8 j6" } );
        parameters.add( new Object[] { "i9", "not directed: e11 i9 , not directed: i9 k5 , not directed: c5 i9 , not directed: f4 i9 , not directed: i9 j11 , not directed: i9 k10 , not directed: d6 i9 , not directed: f10 i9 , not directed: i9 j6" } );
        parameters.add( new Object[] { "i10", "not directed: f11 i10 , not directed: f9 i10 , not directed: i10 j5 , not directed: e4 i10 , not directed: i10 k9 , not directed: e12 i10 , not directed: i10 j12 , not directed: i10 k11" } );
        parameters.add( new Object[] { "i11", "not directed: f12 i11 , not directed: f10 i11 , not directed: e9 i11 , not directed: i11 j9 , not directed: i11 k10 , not directed: i11 k12" } );
        parameters.add( new Object[] { "i12", "not directed: f11 i12 , not directed: i12 k11 , not directed: i12 j10 , not directed: e10 i12" } );
        
        parameters.add( new Object[] { "j5", "not directed: i10 j5 , not directed: d6 j5 , not directed: j5 l6 , not directed: j5 k7 , not directed: j5 l9 , not directed: j5 k10 , not directed: d4 j5 , not directed: i7 j5 , not directed: e9 j5" } );
        parameters.add( new Object[] { "j6", "not directed: d7 j6 , not directed: j6 l5 , not directed: j6 l7 , not directed: j6 k8 , not directed: j6 k9 , not directed: d5 j6 , not directed: i8 j6 , not directed: i9 j6" } );
        parameters.add( new Object[] { "j7", "not directed: d6 j7 , not directed: d8 j7 , not directed: j7 l6 , not directed: j7 k5 , not directed: i5 j7 , not directed: j7 l8" } );
        parameters.add( new Object[] { "j8", "not directed: d7 j8 , not directed: j8 l7 , not directed: j8 k6 , not directed: i6 j8" } );
        parameters.add( new Object[] { "j9", "not directed: e10 j9 , not directed: e4 j9 , not directed: j9 k6 , not directed: j9 k11 , not directed: j9 l10 , not directed: d5 j9 , not directed: j9 l5 , not directed: i11 j9 , not directed: i6 j9" } );
        parameters.add( new Object[] { "j10", "not directed: j10 k12 , not directed: j10 l11 , not directed: e9 j10 , not directed: i12 j10 , not directed: j10 l9 , not directed: j10 k5 , not directed: e11 j10 , not directed: i5 j10" } );
        parameters.add( new Object[] { "j11", "not directed: i9 j11 , not directed: j11 k9 , not directed: j11 l10 , not directed: j11 l12 , not directed: e10 j11 , not directed: e12 j11" } );
        parameters.add( new Object[] { "j12", "not directed: j12 k10 , not directed: j12 l11 , not directed: e11 j12 , not directed: i10 j12" } );
        
        parameters.add( new Object[] { "k5", "not directed: k5 l7 , not directed: j10 k5 , not directed: i9 k5 , not directed: k5 l10 , not directed: i6 k5 , not directed: j7 k5" } );
        parameters.add( new Object[] { "k6", "not directed: j9 k6 , not directed: j8 k6 , not directed: i5 k6 , not directed: k6 l8 , not directed: k6 l9 , not directed: i7 k6" } );
        parameters.add( new Object[] { "k7", "not directed: k7 l5 , not directed: i8 k7 , not directed: j5 k7 , not directed: i6 k7" } );
        parameters.add( new Object[] { "k8", "not directed: k8 l6 , not directed: j6 k8 , not directed: i7 k8" } );
        parameters.add( new Object[] { "k9", "not directed: k9 l11 , not directed: i10 k9 , not directed: k9 l6 , not directed: i5 k9 , not directed: j6 k9 , not directed: j11 k9" } );
        parameters.add( new Object[] { "k10", "not directed: j5 k10 , not directed: i9 k10 , not directed: j12 k10 , not directed: k10 l5 , not directed: i11 k10 , not directed: k10 l12" } );
        parameters.add( new Object[] { "k11", "not directed: i12 k11 , not directed: j9 k11 , not directed: i10 k11 , not directed: k11 l9" } );
        parameters.add( new Object[] { "k12", "not directed: k12 l10 , not directed: j10 k12 , not directed: i11 k12" } );
        
        parameters.add( new Object[] { "l5", "not directed: j9 l5 , not directed: k7 l5 , not directed: k10 l5 , not directed: j6 l5" } );
        parameters.add( new Object[] { "l6", "not directed: k8 l6 , not directed: k9 l6 , not directed: j7 l6 , not directed: j5 l6" } );
        parameters.add( new Object[] { "l7", "not directed: k5 l7 , not directed: j8 l7 , not directed: j6 l7" } );
        parameters.add( new Object[] { "l8", "not directed: k6 l8 , not directed: j7 l8" } );
        parameters.add( new Object[] { "l9", "not directed: j10 l9 , not directed: k6 l9 , not directed: k11 l9 , not directed: j5 l9" } );
        parameters.add( new Object[] { "l10", "not directed: j11 l10 , not directed: k12 l10 , not directed: k5 l10 , not directed: j9 l10" } );
        parameters.add( new Object[] { "l11", "not directed: j12 l11 , not directed: j10 l11 , not directed: k9 l11" } );
        parameters.add( new Object[] { "l12", "not directed: j11 l12 , not directed: k10 l12" } );
        
        return( parameters );
    }
}

