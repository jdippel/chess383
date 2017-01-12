/*
 *  DiscreteLineBundle_GetCommonLine_StandardBoard.java
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
import chess383.graph.basics.coordinate.board.StandardBoard;

/**
 * <p>
 * The class DiscreteLineBundle_GetCommonLine_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetCommonLine_StandardBoard { 

    @BeforeClass public static void beforeAll( ) { StandardBoard.defineBoard( ); }

    /**
     * the public method DiscreteLine getCommonLine( ) is tested.
     */

    private final String square1;
    private final String square2;
    private final String expected;

    public DiscreteLineBundle_GetCommonLine_StandardBoard( String square1, String square2, String expected ) {

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
        parameters.add( new Object[] { "a3", "a6", "directed from white to black: a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "b6", "a7", "directed from white to black: g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "d3", "h5", "not directed: b2 d3 f4 h5" } );
        parameters.add( new Object[] { "d3", "h6", null } );

        return( parameters );
    }
}

