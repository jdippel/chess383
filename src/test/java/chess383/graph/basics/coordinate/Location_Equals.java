/*
 *  Location_Equals.java
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
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chess383.graph.basics.coordinate.Location;

/**
 * The class Location_Equals implements an upper tester
 *
 * @author    J&ouml;rg Dippel
 * @version   December 2016
 *
 */
public class Location_Equals {

    static private String COORDINATE_NAME = "e5";
    static private Location LOCATION = Location.getInstance( COORDINATE_NAME );
    
    /**
     * the public method boolean equals( ) is tested.
     */

    @Test
    public void identicalInstances( ) {

        final String message = "identical instances are compared";

        assertTrue( message, LOCATION.equals( LOCATION ) );
    }

    @Test
    public void meaningfullyEquivalentInstances( ) {

        final String message = "meaningfully equivalent instances are compared";

        assertTrue( message, LOCATION.equals( Location.getInstance( COORDINATE_NAME ) ) );
    }

    @Test
    public void differentInstances( ) {

        final String message = "different instances are compared";

        assertFalse( message, LOCATION.equals( Location.getInstance( "a1" ) ) );
    }
    
    @Test
    public void differentObjects( ) {

        final String message = "different objects are compared";

        assertFalse( message, LOCATION.equals( new Integer( 5 ) ) );
    }
}
