/*
 *  DirectedByColorEnum_IsDirected.java
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

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * <p>
 * The class DirectedByColorEnum_IsDirected implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DirectedByColorEnum_IsDirected { 

    /**
     * the public method DirectedByColorEnum isDirected( ) is tested.
     */

    private final DirectedByColorEnum input;
    private final boolean expected;

    public DirectedByColorEnum_IsDirected( final DirectedByColorEnum input, final boolean expected ) {

        this.input = input;
        this.expected = expected;
    }

    private void verifyMethod( boolean expected, boolean received ) {

        final String message = "DirectedByColorEnum's isDirected() return value should match for " + received;
        
        assertEquals( message, expected, received );
    }
    
    
    @Test
    public void verifyTheCorrectReturnForTheIsDrectedMethod( ) {

        verifyMethod( this.expected, this.input.isDirected( ) );
    }

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, false } );
        parameters.add( new Object[] { DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK,      true } );
        parameters.add( new Object[] { DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_RED,        true } );
        parameters.add( new Object[] { DirectedByColorEnum.ADJACENT_BY_EDGE_BLACK_RED,        true } );
        parameters.add( new Object[] { DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK,     true } );
        parameters.add( new Object[] { DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED,       true } );
        parameters.add( new Object[] { DirectedByColorEnum.ADJACENT_BY_POINT_BLACK_RED,       true } );
        parameters.add( new Object[] { DirectedByColorEnum.NOT_ADJACENT,                      false } );
        
        return( parameters );
    }
}

