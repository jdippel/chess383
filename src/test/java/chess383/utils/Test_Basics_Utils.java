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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * <p>
 * The class Basics_Utils implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   February 2016
 *
 */
@RunWith(Parameterized.class)
public class Test_Basics_Utils { 

    /**
     * the public static method List<String> generalizeList( ) is tested.
     */
    
    private final String input;
    private final String expected;

    public Test_Basics_Utils( String input, String expected ) {

        this.input = input;
        this.expected = expected;
    }
    
    @Test
    public void compareTransformationFromStringToListOfString( ) {
        
        String[] tokens = this.expected.split( "\\s+" );
        List<String> result = Basics_Utils.transformStringToListOfStrings( this.input );
        if( result.size( ) == 0 ) {
            assertTrue( this.input == null || this.input.trim( ).length( ) == 0 );
            return;
        }
        else {
            assertEquals( "List size must be of same size:", tokens.length, result.size( ) );
        }
        
        for( int index = 0; index < tokens.length; index++ ) {
            assertEquals( "", tokens[ index ], result.get( index ) );
        }
    } 
    
    
    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );
        
        parameters.add( new Object[] { null, "" } );
        parameters.add( new Object[] { "", "" } );
        parameters.add( new Object[] { "   ", "" } );
        parameters.add( new Object[] { "a1", "a1" } );
        parameters.add( new Object[] { " a1 ", "a1" } );
        parameters.add( new Object[] { "a1 a2 a3", "a1 a2 a3" } );
        parameters.add( new Object[] { "a1    a3", "a1 a3" } );
        
        return( parameters );
    }
}


