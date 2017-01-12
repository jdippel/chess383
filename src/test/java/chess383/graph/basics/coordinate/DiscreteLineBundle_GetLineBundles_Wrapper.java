/*
 *  DiscreteLineBundle_GetLineBundles_Wrapper.java
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

package chess383.graph.basics.coordinate;

import java.util.Iterator;
import java.util.Set;

import chess383.graph.basics.coordinate.board.DiscreteLineBundle;
import chess383.graph.color.DirectedByColorEnum;

/**
 * <p>
 * The class DiscreteLineBundle_GetLineBundles_Wrapper provides a constructor, attributes and a verify method.
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class DiscreteLineBundle_GetLineBundles_Wrapper { 
    
    protected static DirectedByColorEnum ORIENTATION;
    protected static void setOrientation( DirectedByColorEnum value ) { ORIENTATION = value; }
    
    protected final String square;
    protected final String expected;

    public DiscreteLineBundle_GetLineBundles_Wrapper( String square, String expected ) {

        this.square = square;
        this.expected = expected;
    }
    
    protected boolean verifyMethod( String square, String expected ) {
        
        Set<DiscreteLine> received = DiscreteLineBundle.getLineBundles( square, ORIENTATION );
        if( received.isEmpty( ) && ( expected.length( ) == 0 ) ) return( true );
        String[] tokens = expected.split( "\\s+,\\s+" );
        
        Iterator<DiscreteLine> iterator = received.iterator();
        while( iterator.hasNext( ) ) {
            String receivedString = iterator.next( ).toString( );
            
            int index = 0;
            while( index < tokens.length ) {
                if( ( tokens[ index ] != null ) && ( receivedString.compareTo( tokens[ index ] ) == 0 ) ) {
                    tokens[ index ] = null;
                    break;
                }
                index++;
            }
            if( index == tokens.length ) {
                System.out.println( "received: " + receivedString + " cannot be found - not equal" );
                return( false );
            }
        }
        
        for( int index = 0; index < tokens.length; index++ ) {
            if( tokens[ index ] != null ) {
                return( false );
            }
        }
        return( true );
    }
}

