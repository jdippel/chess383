/*
 *  Location_ToString.java
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

import org.junit.Test;

import chess383.graph.basics.coordinate.Location;

/**
 * The class Location_ToString implements an upper tester
 *
 * @author    J&ouml;rg Dippel
 * @version   December 2016
 *
 */
public class Location_ToString {

    /**
     * the static method String toString( ) is tested.
     */

    @Test
    public void checkForStringCreation( ) {

        final String COORDINATE_NAME = "e5";
        final String DESCRIPTION = "Name for location and coordinate should match for ";
        final String message = DESCRIPTION + COORDINATE_NAME;

        Location location = Location.getInstance( COORDINATE_NAME );
        assertEquals( message, COORDINATE_NAME, location.toString( ) );
    }
}
