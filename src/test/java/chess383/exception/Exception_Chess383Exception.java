/*
 *  Exception_Chess383Exception.java
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

package chess383.exception;

import org.junit.Test;


/**
 * <p>
 * The class Exception_Chess383Exception implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   December 2016
 *
 */
public class Exception_Chess383Exception { 

    /**
     * throwing an exception is tested.
     */

    @Test( expected = Chess383Exception.class )
    public void throwingWithoutMessage( ) {
        
        throw new Chess383Exception( );
    }
    
    @Test( expected = Chess383Exception.class )
    public void throwingWithMessage( ) {
        
        throw new Chess383Exception( "This is a specific exception!");
    }
}

