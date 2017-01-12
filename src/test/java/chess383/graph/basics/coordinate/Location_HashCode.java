/*
 *  Location_HashCode.java
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

import chess383.graph.basics.coordinate.Location;

/**
 * The class Location_HashCode implements an upper tester
 *
 * @author    J&ouml;rg Dippel
 * @version   December 2016
 *
 */
public class Location_HashCode {

    static private String COORDINATE_NAME = "e5";
    static private Location LOCATION = Location.getInstance( COORDINATE_NAME );
    static private int HASH_CODE = LOCATION.hashCode( );
    
    /**
     * the public method int hashCode( ) is tested.
     */

    @Test
    public void identicalInstances( ) {

        final String message = "identical instances are compared";

        assertEquals( message, HASH_CODE, LOCATION.hashCode( ) );
    }

    @Test
    public void meaningfullyEquivalentInstances( ) {

        final String message = "meaningfully equivalent instances are compared";

        assertEquals( message, HASH_CODE, Location.getInstance( COORDINATE_NAME ).hashCode( ) );
    }

    @Test
    public void differentInstances( ) {

        final String message = "different instances are compared";

        assertNotSame( message, HASH_CODE, Location.getInstance( "a1" ).hashCode( ) );
    }
}
