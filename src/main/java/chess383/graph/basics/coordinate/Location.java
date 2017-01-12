/*
 *  Location.java
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

import java.io.Serializable;

/**
 * Provides a location.
 *
 * @author    J&ouml;rg Dippel
 * @version   December 2016
 *
 */
public class Location implements Serializable {

    // for interface Serializable
    private static final long serialVersionUID = -3776094538231115587L;

    /** ---------  Attributes  -------------------------------- */

    private Coordinate coordinate;

    /** ---------  Constructors  ------------------------------ */

    private Location( Coordinate value ) {

        setCoordinate( value );
    }

    /** ---------  Factory  ----------------------------------- */

    static private Location create( String value ) {

        return( new Location( new CoordinateImpl( value ) ) );
    }
    
    static public Location getInstance( String value ) {

        return( create( value ) );
    }

    /** ---------  Getter and Setter  ------------------------- */

    private void setCoordinate( Coordinate value ) { this.coordinate = value; }
    public Coordinate getCoordinate( )             { return( this.coordinate ); }

    /** ---------  Inheritance from Object  ------------------- */

    @Override
    public String toString( ) {

        return( getCoordinate( ).getName( ) );
    }

    @Override
    public boolean equals( Object value ) {

        boolean result;

        if( value instanceof Location ) {
            result = isMeaningfullyEquivalent( ( Location )value );
        }
        else {
            result = false;
        }

        return( result );
    }

    private boolean isMeaningfullyEquivalent( Location value ) {

        boolean result = true;

        result = getCoordinate( ).equals( value.getCoordinate( ) );

        return( result );
    }

    @Override
    public int hashCode( ) {

        int result;

        result = getCoordinate( ).hashCode( );

        return( result );
    }
}
