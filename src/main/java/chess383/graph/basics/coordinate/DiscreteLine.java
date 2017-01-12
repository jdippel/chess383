/*
 *  DiscreteLine.java
 *
 *  chess383 is a collection of chess related utilities.
 *  chess383/graph/basics is the implementation of basic movements
 *  according to the laws of chess.
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

package chess383.graph.basics.coordinate;

import java.io.Serializable;

import chess383.graph.color.DirectedByColorEnum;

/**
 * Provides locations on a line.
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class DiscreteLine implements Serializable {

    // for interface Serializable
    private static final long serialVersionUID = -1916176937838219205L;
    
    /** ---------  Attributes  -------------------------------- */

    private DirectedByColorEnum direction;
    private String squares;

    /** ---------  Constructors  ------------------------------ */

    private DiscreteLine( DirectedByColorEnum kindOfDirection, String squares ) {

        setDirection( kindOfDirection );
        setSquares( squares );
    }

    /** ---------  Getter and Setter  ------------------------- */

    private void setDirection( DirectedByColorEnum value ) { this.direction = value; }
    public DirectedByColorEnum getDirection( )             { return( this.direction ); }
    private void setSquares( String value )                { this.squares = value; }
    public String getSquares( )                            { return( this.squares ); }

    /** ---------  Factory  ----------------------------------- */
    
    static public DiscreteLine createDiscreteLine( DirectedByColorEnum direction, String squares ) {

        if( direction.isDirected( ) ) {
            return( new DiscreteLine( direction, getOrderedString( squares ) ) );
        }
        return( new DiscreteLine( direction, getUniqueString( getOrderedString( squares ) ) ) );
    }
    
    // only let pass strings with at least two values separated by a single white space
    private static String getOrderedString( String value ) {
        
        if( value == null ) return( value );
        
        StringBuffer buffer = new StringBuffer( );
        String[] tokens = value.trim( ).split( "\\s+");
        if( tokens.length <= 1 ) return( null );
        
        int index = 0;
        int counter = 0;
        while( index < tokens.length ) {
            if( tokens[ index ].length( ) > 0 ) {
                if( buffer.length( ) == 0 ) {
                    buffer.append( tokens[ index ] );
                }
                else {
                    buffer.append( " " + tokens[ index ] );
                }
                counter++;
            }
            index++;
        }
        
        if( counter <= 1 ) return( null );
        return( buffer.toString( ) );
    }
    
    private static String getReverseOrderedString( String value ) {

        if( value == null ) return( value );
        
        StringBuffer buffer = new StringBuffer( );
        String[] tokens = value.split( "\\s+");
        
        int index = tokens.length - 1;
        while( index >= 0 ) {
            if( tokens[ index ].length( ) > 0 ) {
                if( buffer.length( ) == 0 ) {
                    buffer.append( tokens[ index ] );
                }
                else {
                    buffer.append( " " + tokens[ index ] );
                }
            }
            index--;
        }

        return( buffer.toString( ) );
    }
    
    private static String getUniqueString( String value ) {

        if( value == null ) return( value );
        
        String reverse = getReverseOrderedString( value );
        return( ( reverse.compareTo( value ) < 0 ) ? reverse : value );
    }
    
    /** ---------  Inheritance from Object  ------------------- */

    @Override
    public String toString( ) {

        return( getDirection( ) + ": " + getSquares( ) );
    }

    @Override
    public boolean equals( Object value ) {

        boolean result;

        if( value instanceof DiscreteLine ) {
            result = isMeaningfullyEquivalent( ( DiscreteLine ) value );
        }
        else {
            result = false;
        }

        return( result );
    }

    private boolean isMeaningfullyEquivalent( DiscreteLine value ) {

        boolean result;
        String localSquares = getSquares( );

        if( localSquares == null ) return( value.getSquares( ) == null );
        if( getDirection( ).equals( value.getDirection( ) ) ) {
            result = localSquares.equalsIgnoreCase( value.getSquares( ) );
            
            if( result == false && getDirection( ) == DirectedByColorEnum.NOT_ADJACENT ) {
                result = localSquares.equalsIgnoreCase( getReverseOrderedString( value.getSquares( ) ) );
            }
        }
        else {
            result = false;
        }

        return( result );
    }

    @Override public int hashCode( ) { return( toString( ).hashCode( ) ); }
}

