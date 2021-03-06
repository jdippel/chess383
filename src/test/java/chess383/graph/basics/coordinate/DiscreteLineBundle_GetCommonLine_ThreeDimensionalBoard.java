/*
 *  DiscreteLineBundle_GetCommonLine_ThreeDimensionalBoard.java
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
import chess383.graph.basics.coordinate.board.ThreeDimensionalBoard;

/**
 * <p>
 * The class DiscreteLineBundle_GetCommonLine_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetCommonLine_ThreeDimensionalBoard { 

    @BeforeClass public static void beforeAll( ) { ThreeDimensionalBoard.defineBoard( ); }
    
    /**
     * the public method DiscreteLine getCommonLine( ) is tested.
     */

    private final String square1;
    private final String square2;
    private final String expected;

    public DiscreteLineBundle_GetCommonLine_ThreeDimensionalBoard( String square1, String square2, String expected ) {

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
        
        parameters.add( new Object[] { "z1", "e1", "not directed: e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "a1", "e1", "not directed: e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "d0", "d6", "directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "z1", "a2", "directed from white to black: z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "b7", "z9", "directed from white to black: e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "d3", "c5", "not directed: a9 b7 c5 d3 e1" } );
        parameters.add( new Object[] { "d3", "h6", null } );
        parameters.add( new Object[] { "a9", "d9", null } );
        parameters.add( new Object[] { "e0", "z0", null } );

        return( parameters );
    }
}

