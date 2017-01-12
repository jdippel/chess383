/*
 *  Basics_Utils.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2016 Jörg Dippel
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

package chess383.utils;

import java.util.ArrayList;
import java.util.List;


/**
 * Provides utility methods.
 *
 * @author    J&ouml;rg Dippel
 * @version   March 2016
 *
 */
public class Basics_Utils {

    static public List<String> transformStringToListOfStrings( String line ) {
            
        if( line == null || line.trim( ).length( ) == 0 ) return( new ArrayList<String>( 0 )  );
        
        String[] tokens = line.trim( ).split( "\\s+" );
        int tokensLength = tokens.length;
        List<String> result = new ArrayList<String>( tokensLength );    
        for( int index = 0; index < tokensLength; index++ ) {
            result.add( tokens[ index ] );
        }
        
        return( result );
    }
    
    static public String transformListOfStringsToString( List<String> list ) {
        
        if( list == null || list.size() == 0 ) return( null );
         
        StringBuffer result = new StringBuffer( );
        
        result.append( list.get( 0 ) );
        for( int index = 1; index < list.size( ); index++ ) {
            result.append( " " + list.get( index ) );
        }
        
        return( result.toString( ) );
    }
}

