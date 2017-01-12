/*
 *  DirectedByColorEnum_ToString.java
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

package chess383.graph.color;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.Chess383_MatchingUtils;

/**
 * <p>
 * The class DirectedByColorEnum_ToString implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DirectedByColorEnum_ToString { 

    /**
     * the public method DirectedByColorEnum toString( ) is tested.
     */

    private final boolean matchResult;
    private final DirectedByColorEnum input;
    private final String expected;

    public DirectedByColorEnum_ToString( final boolean match, final DirectedByColorEnum input, final String expected ) {

        this.matchResult = match;
        this.input = input;
        this.expected = expected;
    }

    private void verifyToStringMethod( boolean cooperative, String expected, String received ) {
   
        Chess383_MatchingUtils.matchTwoStrings( "DirectedByColorEnum's toString()", cooperative, expected, received );
    }
    
    
    @Test
    public void verifyTheCorrectReturnForTheToStringMethod( ) {

        verifyToStringMethod( this.matchResult, this.expected, this.input.toString( ) );
    }

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, "not directed" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,      "directed from white to black" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_RED,        "directed from white to red" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_EDGE_BLACK_RED,        "directed from black to red" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,     "directed from white to black" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED,       "directed from white to red" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED,       "directed from black to red" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,                      "not directed" } );
       
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT, "directed from white to black" } );
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT, "directed from white to red" } );
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT, "directed from black to red" } );
        
        return( parameters );
    }
}

