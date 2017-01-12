/*
 *  CoordinateImpl.java
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
 * @version   July 2015
 *
 */
public class CoordinateImpl implements Coordinate, Serializable {

    // for interface Serializable
    private static final long serialVersionUID = 158604117447218071L;
    
    /** ---------  Attributes  -------------------------------- */

    private String name;

    /** ---------  Constructors  ------------------------------ */

    public CoordinateImpl( String name ) {

        setName( name );
    }

    /** ---------  Getter and Setter  ------------------------- */

    private void setName( String value ) { this.name = value; }
    @Override public String getName( )   { return( this.name ); }

    /** ---------  Inheritance from Object  ------------------- */

    @Override
    public String toString( ) {

        return( getName( ) );
    }

    @Override
    public boolean equals( Object value ) {

        boolean result;

        if( value instanceof CoordinateImpl ) {
            result = isMeaningfullyEquivalent( ( CoordinateImpl ) value );
        }
        else {
            result = false;
        }

        return( result );
    }

    private boolean isMeaningfullyEquivalent( CoordinateImpl value ) {

        boolean result = true;

        result = getName( ).equalsIgnoreCase( value.getName( ) );

        return( result );
    }

    @Override
    public int hashCode( ) {

        int result;

        result = getName( ).hashCode( );

        return( result );
    }
}

