/*
 *  ICoordinate_GetLineBundles_Wrapper.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2017 Jörg Dippel
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

package chess383.ibasics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import chess383.ICoordinate;
import chess383.graph.color.DirectedByColorEnum;

/**
 * <p>
 * The class ICoordinate_GetLineBundles_Wrapper provides a constructor, attributes and a verify method.
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class ICoordinate_GetLineBundles_Wrapper { 

    protected static ICoordinate board;
    protected static void setBoard( ICoordinate value ) { board = value; }
    protected static DirectedByColorEnum ORIENTATION;
    protected static void setOrientation( DirectedByColorEnum value ) { ORIENTATION = value; }
    private   static DirectedByColorEnum getOrientation( ) { return( ORIENTATION ); }
    
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */

    protected final String square;
    protected final String expected;

    public ICoordinate_GetLineBundles_Wrapper( String square, String expected ) {

        this.square = square;
        this.expected = expected;
    }
    
    protected boolean verifyMethod( String square, String expected ) {
        
        Set<List<String>> received = board.getLineBundles( square, getOrientation( ) );
        if( received.isEmpty( ) && ( expected.length( ) == 0 ) ) return( true );
        String[] tokens = expected.split( "\\s+,\\s+" );
        
        int numberOfTokens = tokens.length;
        Iterator<List<String>> iterator = received.iterator( );
        while( iterator.hasNext( ) ) {
            
            List<String> list = iterator.next( );
            for( int index = 0; index < tokens.length; index++ ) {
                if( tokens[ index ] != null ) {
                    if( compareStringToList( tokens[ index ], list ) ) {
                        tokens[ index ] = null;
                        numberOfTokens--;
                        break;
                    }
                }
            }
        }
        
        if( numberOfTokens != 0 ) {
            return( false );
        }
        
        return( true );
    }
    
    private boolean compareStringToList( String value, List<String> list ) {
        
        String[] tokens = value.trim( ).split( "\\s+" );
        for( int index = 0; index < tokens.length; index++ ) {
            if( tokens[ index ].compareTo( list.get( index ) ) != 0 ) {
                return( false );
            }
        }
        return( true );
    }
}

