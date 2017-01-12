/*
 *  DiscreteLine_Equals_ByParameter.java
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
 * The class DiscreteLine_Equals_ByParameter implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLine_Equals_ByParameter { 

    /**
     * the public method DiscreteLine equals( ) is tested.
     */

    private final boolean matchResult;
    private final DirectedByColorEnum direction;
    private final String input;
    private final DiscreteLine expected;

    public DiscreteLine_Equals_ByParameter( boolean matchResult, DirectedByColorEnum direction, String input, DiscreteLine expected ) {

        this.matchResult = matchResult;
        this.direction = direction;
        this.input = input;
        this.expected = expected;
    }
    
    private void verifyEqualsMethod( boolean cooperative, DiscreteLine expected, DiscreteLine received ) {

        Chess383_MatchingUtils.matchTwoBooleans( "DiscreteLine's equals()", cooperative, expected.equals( received ) );
    }
    
    @Test
    public void compareAnInstanceWithAnother( ) {

        DiscreteLine discreteLine = DiscreteLine.createDiscreteLine( this.direction, this.input );
        
        verifyEqualsMethod( this.matchResult, this.expected, discreteLine );
    }

    
    static final DiscreteLine DISCRETE_LINE_HORIZONTAL = DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b2 c2 d2" );
    static final DiscreteLine DISCRETE_LINE_VERTICTAL =  DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "b2 b3 b4" );
    static final DiscreteLine DISCRETE_LINE_DIAGONAL =   DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "b2 c3 d4" );
    static final DiscreteLine DISCRETE_LINE_KNIGHT =     DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, "b2 c4 d6 e8" );
    
    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );
        
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT, "b2 c2 d2",      DISCRETE_LINE_HORIZONTAL } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT, "d2 c2   b2",    DISCRETE_LINE_HORIZONTAL } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT, "b2 c2 d2",      DISCRETE_LINE_HORIZONTAL } );
        
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT, "b2 d2 b2",      DISCRETE_LINE_HORIZONTAL } );
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT, "b2    d2",      DISCRETE_LINE_HORIZONTAL } );
        

        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,   "b2 b3 b4",      DISCRETE_LINE_VERTICTAL } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,   "b2  b3  b4",    DISCRETE_LINE_VERTICTAL } );
        
        parameters.add( new Object[] { false, DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,   "b2 b4 b3",      DISCRETE_LINE_VERTICTAL } );
        parameters.add( new Object[] { false, DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,   "b2    b4",      DISCRETE_LINE_VERTICTAL } );

        
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,   "b2 c3 d4",      DISCRETE_LINE_DIAGONAL } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,   "b2  c3  d4",    DISCRETE_LINE_DIAGONAL } );
        
        parameters.add( new Object[] { false, DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,   "b2 d4 c3",      DISCRETE_LINE_DIAGONAL } );
        parameters.add( new Object[] { false, DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,   "b2    d4",      DISCRETE_LINE_DIAGONAL } );

        
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,     "b2 c4 d6 e8",   DISCRETE_LINE_KNIGHT } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,     "e8 d6 c4 b2",   DISCRETE_LINE_KNIGHT } );
        parameters.add( new Object[] { true,  DirectedByColorEnum.NOT_ADJACENT,     "e8  d6 c4  b2", DISCRETE_LINE_KNIGHT } );
        
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT,     "e8 c4 d6 b2",   DISCRETE_LINE_KNIGHT } );
        parameters.add( new Object[] { false, DirectedByColorEnum.NOT_ADJACENT,     "e8   b2",       DISCRETE_LINE_KNIGHT } );

        return( parameters );
    }
}

