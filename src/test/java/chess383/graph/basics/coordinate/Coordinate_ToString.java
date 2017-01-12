/*
 *  Coordinate_ToString.java
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

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * <p>
 * The class Coordinate_ToString implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   May 2015
 *
 */
@RunWith(Parameterized.class)
public class Coordinate_ToString {

    /**
     * the public method String toString( ) is tested.
     */

    private final String input;
    private final String expectedOutput;

    public Coordinate_ToString( final String input, final String expectedOutput ) {

        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Test
    public void namingACoordinateReturnsTheNameDefined( ) {

        final String message = "Name should match for " + expectedOutput;

        Coordinate coordinate = new CoordinateImpl( input );
        assertEquals( message, expectedOutput, coordinate.toString( ) );
    }

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1" } );
        parameters.add( new Object[] { "a8", "a8" } );
        parameters.add( new Object[] { "h1", "h1" } );
        parameters.add( new Object[] { "h8", "h8" } );
        parameters.add( new Object[] { "e5", "e5" } );

        return( parameters );
    }
}
