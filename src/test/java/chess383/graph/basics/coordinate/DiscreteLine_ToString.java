/*
 *  DiscreteLine_String.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2015 Jörg Dippel
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

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.Chess383_MatchingUtils;
import chess383.graph.color.DirectedByColorEnum;

/**
 * <p>
 * The class DiscreteLine_String implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   December 2016
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLine_ToString { 

    /**
     * the public method DiscreteLine toString( ) is tested.
     */

    private final boolean matchResult;
    private final DirectedByColorEnum direction;
    private final String input;
    private final String expected;

    public DiscreteLine_ToString( boolean matchResult, DirectedByColorEnum direction, String input, String expected ) {

        this.matchResult = matchResult;
        this.direction = direction;
        this.input = input;
        this.expected = expected;
    }
    
    private void verifyToStringMethod( boolean cooperative, String expected, String received ) {

        Chess383_MatchingUtils.matchTwoStrings( "DiscreteLine's toString()", cooperative, expected, received );
    }
    
    @Test
    public void compareAnInstanceWithItsStringRepresentation( ) {

        DiscreteLine discreteLine = DiscreteLine.createDiscreteLine( this.direction, this.input );
        
        verifyToStringMethod( this.matchResult, this.expected, discreteLine.toString( ) );
    }
    
    static final String NOT_DIRECTED = "not directed: ";
    static final String WHITE_BLACK =  "directed from white to black: ";

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,                   "b2 c2 d2",      NOT_DIRECTED + "b2 c2 d2" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,                   "d2 c2   b2",    NOT_DIRECTED + "b2 c2 d2" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,                   "b2 c2 d2",      NOT_DIRECTED + "b2 c2 d2" } );
        
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT,                   "b2 d2 b2",      NOT_DIRECTED + "b2 c2 d2" } );
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT,                   "b2    d2",      NOT_DIRECTED + "b2 c2 d2" } );
        
        
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,   "b2 b3 b4",      WHITE_BLACK + "b2 b3 b4" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,   "b2  b3  b4",    WHITE_BLACK + "b2 b3 b4" } );
        
        parameters.add( new Object[] { false, DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,   "b2 b4 b3",      WHITE_BLACK + "b2 b3 b4" } );
        parameters.add( new Object[] { false, DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,   "b2    b4",      WHITE_BLACK + "b2 b3 b4" } );

        
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,  "b2 c3 d4",      WHITE_BLACK + "b2 c3 d4" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,  "b2  c3  d4",    WHITE_BLACK + "b2 c3 d4" } );
        
        parameters.add( new Object[] { false, DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,  "b2 d4 c3",      WHITE_BLACK + "b2 c3 d4" } );
        parameters.add( new Object[] { false, DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,  "b2    d4",      WHITE_BLACK + "b2 c3 d4" } );

        
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,                   "b2 c4 d6 e8",   NOT_DIRECTED + "b2 c4 d6 e8" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,                   "e8 d6 c4 b2",   NOT_DIRECTED + "b2 c4 d6 e8" } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,                   "e8  d6 c4  b2", NOT_DIRECTED + "b2 c4 d6 e8" } );
        
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT,                   "e8 c4 d6 b2",   NOT_DIRECTED + "b2 c4 d6 e8" } );
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT,                   "e8   b2",       NOT_DIRECTED + "b2 c4 d6 e8" } );

        return( parameters );
    }
}

