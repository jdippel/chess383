/*
 *  Chess383_MatchingUtils.java
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

package chess383;

import static org.junit.Assert.assertEquals;

/**
 * <p>
 * The class Chess383_MatchingUtils provides some helper methods
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   November 2016
 *
 */
public class Chess383_MatchingUtils { 

    static private String getModalVerb( Boolean value ) {
        
        final String EQUALITY_TRUE = "should";
        final String EQUALITY_FALSE = "must not";
        
        return( ( ( value == true ) ? EQUALITY_TRUE : EQUALITY_FALSE ) );
    }
    
    static public void matchTwoBooleans( String methodName, Boolean expected, Boolean received ) {
        
        final String message = methodName + " return value " + getModalVerb( expected ) +  " match " + received;
         
        assertEquals( message, expected, received );
    }
    
    static public void matchTwoStrings( String methodName, Boolean cooperative, String expected, String received ) {

        final Boolean comparison = ( 0 == expected.compareTo( received ) );
        final String message = methodName + " return value " + getModalVerb( comparison ) +  " match " + received;
        
        assertEquals( message, cooperative, comparison );
    }
}

