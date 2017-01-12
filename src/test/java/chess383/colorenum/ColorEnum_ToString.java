/*
 *  ColorEnum_ToString.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2015-2016 Jörg Dippel
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

package chess383.colorenum;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.Chess383_MatchingUtils;
import chess383.ColorEnum;

/**
 * <p>
 * The class ColorEnum_ToString implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   November 2016
 *
 */
@RunWith(Parameterized.class)
public class ColorEnum_ToString { 

    /**
     * the public method ColorEnum toString( ) is tested.
     */

    private final boolean matchResult;
    private final ColorEnum input;
    private final String expected;

    public ColorEnum_ToString( final boolean matchResult, final ColorEnum input, final String expected ) {

        this.matchResult = matchResult;
        this.input = input;
        this.expected = expected;
    }

    
    @Test
    public void verifyTheCorrectReturnForTheToStringMethod( ) {

        Chess383_MatchingUtils.matchTwoStrings( 
            "ColorEnum's toString()", this.matchResult, this.expected, this.input.toString( ) );
    }

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { true,  ColorEnum.WHITE, "white" } );
        parameters.add( new Object[] { true,  ColorEnum.BLACK, "black" } );
        parameters.add( new Object[] { true,  ColorEnum.RED,   "red" } );
        
        parameters.add( new Object[] { true,  ColorEnum.NONE,  "no color" } );
       
        parameters.add( new Object[] { false, ColorEnum.WHITE,  ColorEnum.BLACK.toString( ) } );
        parameters.add( new Object[] { false, ColorEnum.WHITE,  ColorEnum.RED.toString( ) } );
        parameters.add( new Object[] { false, ColorEnum.BLACK,  ColorEnum.RED.toString( ) } );
        
        parameters.add( new Object[] { false, ColorEnum.WHITE,  ColorEnum.NONE.toString( ) } );
        parameters.add( new Object[] { false, ColorEnum.WHITE,  ColorEnum.NONE.toString( ) } );
        parameters.add( new Object[] { false, ColorEnum.BLACK,  ColorEnum.NONE.toString( ) } );
        parameters.add( new Object[] { false, ColorEnum.NONE,   ColorEnum.WHITE.toString( ) } );
        parameters.add( new Object[] { false, ColorEnum.NONE,   ColorEnum.BLACK.toString( ) } );
        parameters.add( new Object[] { false, ColorEnum.NONE,   ColorEnum.RED.toString( ) } );

        return( parameters );
    }
}

