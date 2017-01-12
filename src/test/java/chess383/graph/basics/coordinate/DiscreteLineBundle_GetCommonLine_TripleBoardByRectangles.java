/*
 *  DiscreteLineBundle_GetCommonLine_TripleBoardByRectangles.java
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

package chess383.graph.basics.coordinate;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.graph.basics.coordinate.board.DiscreteLineBundle;
import chess383.graph.basics.coordinate.board.TripleBoardByRectangles;

/**
 * <p>
 * The class DiscreteLineBundle_GetCommonLine_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetCommonLine_TripleBoardByRectangles { 

    @BeforeClass public static void beforeAll( ) { TripleBoardByRectangles.defineBoard( ); }

    /**
     * the public method DiscreteLine getCommonLine( ) is tested.
     */

    private final String square1;
    private final String square2;
    private final String expected;

    public DiscreteLineBundle_GetCommonLine_TripleBoardByRectangles( String square1, String square2, String expected ) {

        this.square1 = square1;
        this.square2 = square2;
        this.expected = expected;
    }

    
    @Test
    public void compareTheLine( ) {
        
        DiscreteLine received = DiscreteLineBundle.getCommonLine( this.square1, this.square2 );
        assertEquals( ( received == null ) ? received : received.toString( ), this.expected );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );
        
        parameters.add( new Object[] { "a1", "h1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "j6", "c6", "not directed: a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "g11", "k11", "not directed: h11 g11 f11 e11 i11 j11 k11 l11" } );
        
        parameters.add( new Object[] { "g1", "g9", "directed from white to red: g1 g2 g3 g4 g9 g10 g11 g12" } );
        parameters.add( new Object[] { "d4", "d5", "directed from white to black: d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "j10", "j7", "directed from black to red: j8 j7 j6 j5 j9 j10 j11 j12" } );
        
        parameters.add( new Object[] { "b2", "f10", "directed from white to red: a1 b2 c3 d4 e9 f10 g11 h12" } );
        parameters.add( new Object[] { "l8", "b2", "directed from white to black: a1 b2 c3 d4 i5 j6 k7 l8" } );
        parameters.add( new Object[] { "h1", "a8", "directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "i9", "e4", "directed from white to red: h1 g2 f3 e4 i9 j10 k11 l12" } );
        
        parameters.add( new Object[] { "e1", "h4", "directed from white to red: e1 f2 g3 h4" } );
        parameters.add( new Object[] { "f3", "d1", "directed from white to red: d1 e2 f3 g4 h9" } );
        parameters.add( new Object[] { "c1", "a3", "directed from white to black: c1 b2 a3" } );
        parameters.add( new Object[] { "f2", "d4", "directed from white to black: g1 f2 e3 d4 c5 b6 a7" } );
        
        parameters.add( new Object[] { "f12", "h10", "directed from white to red: h10 g11 f12" } );
        parameters.add( new Object[] { "f9", "i11", "directed from white to red: h3 g4 f9 e10 i11 j12" } );
        parameters.add( new Object[] { "k12", "l11", "directed from black to red: l11 k12" } );
        parameters.add( new Object[] { "j10", "k9", "directed from black to red: l5 k9 j10 i11 e12" } );
        
        parameters.add( new Object[] { "d8", "a5", "directed from white to black: a5 b6 c7 d8" } );
        parameters.add( new Object[] { "i7", "a3", "directed from white to black: a3 b4 c5 d6 i7 j8" } );
        parameters.add( new Object[] { "j7", "i8", "directed from black to red: i8 j7 k6 l5" } );
        parameters.add( new Object[] { "l10", "d7", "directed from black to red: c8 d7 i6 j5 k9 l10" } );  
        
        parameters.add( new Object[] { "d3", "j5", null } );
        parameters.add( new Object[] { "i9", "d4", null } );

        return( parameters );
    }
}

