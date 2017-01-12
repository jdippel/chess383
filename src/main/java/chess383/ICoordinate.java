/*
 *  ICoordinate.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2016, 2017 Jörg Dippel
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

package chess383;

import java.util.List;
import java.util.Set;

import chess383.graph.color.DirectedByColorEnum;

/**
 * Provides locations on a bundle of lines.
 * 
 * A line is a ordered list of names.
 *
 * @author    J&ouml;rg Dippel
 * @version   Januray 2017
 *
 */
public interface ICoordinate {
    
    /**
     * There is a given set of lines and returned are lines which contain the square as a passed name.
     * 
     * @param square is the name of a location
     * 
     * @return all lines that contain the passed name of a location
     */
    public Set<List<String>> getLineBundles( String square );
    
    /**
     * There is a given set of lines and returned are lines which contain the square as a passed name for an orientation.
     * 
     * @param square is the name of a location
     * @param orientation is the order specified
     * 
     * @return all lines that contain the passed name of a location for the given piece type
     */
    public Set<List<String>> getLineBundles( String square, DirectedByColorEnum orientation );
    
    /**
     * There is a given set of lines and returned are lines which contain both squares as passed names.
     * 
     * @param square1 is the name of a location
     * @param square2 is the name of a location
     * 
     * @return all lines that contain the both passed names.
     */
    public Set<List<String>> getCommonLine( String square1, String square2 );
    
    /**
     * There is a given set of lines with a limited set of names.
     * 
     * @return the set of all defined names.
     */
    public Set<String> getAllLocations( ) ;
    
    /**
     * For a name there is a limited set of lines that contain the square as a name.
     * 
     * @param square is the name of a location
     * 
     * @return the names which are directly neighboured within the line order.
     */
    public Set<String> getDirectlyConnectedLocations( String square );
    
    /**
     * For a name there is a limited set of lines that contain the square as a name.
     * 
     * @param square is the name of a location
     * 
     * @return the names which are directly neighboured by edge within the line order.
     */
    public Set<String> getDirectlyByEdgeConnectedLocations( String square );
    
    /**
     * Returns a defined square as a name.
     * 
     * @return the names of a square.
     */
    public String getDefinedLocation( );
    
    /**
     * Returns the color a defined square
     * 
     * @return the color a defined square.
     */
    public ColorEnum getColorOfDefinedLocation( );
}

