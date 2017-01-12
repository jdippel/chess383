/*
 *  Coordinate_HashCode.java
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
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

/**
 * The class Coordinate_HashCode implements an upper tester
 *
 * @author    J&ouml;rg Dippel
 * @version   May 2015
 *
 */
public class Coordinate_HashCode {

    /**
     * the public method int hashCode( ) is tested.
     */

    @Test
    public void identicalInstances( ) {

        final Coordinate COORDINATE = new CoordinateImpl( "h8" );
        final int HASH_CODE = COORDINATE.hashCode( );
        final String message = "identical instances are compared";

        assertEquals( message, HASH_CODE, COORDINATE.hashCode( ) );
    }

    @Test
    public void meaningfullyEquivalentInstances( ) {

        final Coordinate COORDINATE = new CoordinateImpl( "h8" );
        final int HASH_CODE = COORDINATE.hashCode( );
        final String message = "meaningfully equivalent instances are compared";

        assertEquals( message, HASH_CODE, new CoordinateImpl( "h8" ).hashCode( ) );
    }

    @Test
    public void differentInstances( ) {

        final Coordinate COORDINATE = new CoordinateImpl( "h8" );
        final int HASH_CODE = COORDINATE.hashCode( );
        final String message = "different instances are compared";

        assertNotSame( message, HASH_CODE, new CoordinateImpl( "a1" ).hashCode( ) );
    }
}
