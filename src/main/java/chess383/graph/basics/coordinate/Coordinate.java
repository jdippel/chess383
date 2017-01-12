/*
 *  Coordinate.java
 *
 *  chess383 is a collection of chess related utilities.
 *  chess383/graph/basics is the implementation of basic movements
 *  according to the laws of chess.
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


/**
 * Provides a location.
 *
 * @author    J&ouml;rg Dippel
 * @version   May 2015
 *
 */
public interface Coordinate {

    public String getName( );

    @Override
    public String toString( );
}

