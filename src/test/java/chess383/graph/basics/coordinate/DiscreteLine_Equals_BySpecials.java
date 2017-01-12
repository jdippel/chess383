/*
 *  DiscreteLine_Equals_BySpecials.java
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

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import chess383.Chess383_MatchingUtils;
import chess383.graph.color.DirectedByColorEnum;

/**
 * <p>
 * The class DiscreteLine_Equals_BySpecials implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   December 2016
 *
 */
public class DiscreteLine_Equals_BySpecials { 

    /**
     * the public method DiscreteLine equals( ) is tested.
     */
    
    private void verifyEqualsMethod( boolean cooperative, DiscreteLine expected, DiscreteLine received ) {

        Chess383_MatchingUtils.matchTwoBooleans( "DiscreteLine's equals()", cooperative, expected.equals( received ) );
    }
    

    @Test
    public void compareAnInstancesWithAnotherType( ) {

        DiscreteLine discreteLine = DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "b2 c3 d4" );
        
        assertFalse( discreteLine.equals( new Integer( 5 ) ) );
    }
    
    @Test
    public void compareAnInstancesWithNull( ) {

        DiscreteLine discreteLine = DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "b2 c3 d4" );
        
        verifyEqualsMethod( false, discreteLine, ( DiscreteLine )null );
    }
    
    @Test
    public void compareDifferentInstancesButSameDirection( ) {

        DiscreteLine discreteLine = DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "b2 c3 d4" );
        
        verifyEqualsMethod( false, discreteLine, DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "b2 c3 d4 e5" ) );
    }
    
    @Test
    public void compareDifferentInstancesButSameLine( ) {

        DiscreteLine discreteLine = DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "b2 c3 d4" );
        
        verifyEqualsMethod( false, discreteLine, DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "b2 c3 d4" ) );
    }
    
    @Test
    public void compareDifferentInstancesButSameDirectionButNullLine( ) {

        DiscreteLine discreteLine = DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "b2 c3 d4" );
        
        verifyEqualsMethod( false, discreteLine, DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, (String )null ) );
    }
    
    @Test
    public void compareDifferentInstancesButSameDirectionButEmptyLine( ) {

        DiscreteLine discreteLine = DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, "" );
        
        verifyEqualsMethod( true, discreteLine, DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, " " ) );
    }
    
    @Test
    public void compareDifferentInstancesButSameDirectionButLineWithOneElement( ) {

        DiscreteLine discreteLine = DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, "b2" );
        
        verifyEqualsMethod( true, discreteLine, DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, " b2 " ) );
    }
}

