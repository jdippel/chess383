/*
 *  ColorEnum_IsOfSomeColor.java
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
 * The class ColorEnum_IsOfSomeColor implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   November 2016
 *
 */
@RunWith(Parameterized.class)
public class ColorEnum_IsOfSomeColor { 

    /**
     * the public method boolean isOfSomeColor( ) is tested.
     */

    private final Boolean input;
    private final Boolean expected;

    public ColorEnum_IsOfSomeColor( final Boolean expected, final Boolean input ) {

        this.input = input;
        this.expected = expected;
    }
    
    
    @Test
    public void verifyTheCorrectReturnForTheIsOfSomeColorMethod( ) {

        Chess383_MatchingUtils.matchTwoBooleans( "ColorEnum's isOfSomeColor()", this.expected, this.input );
    }

    @Parameters
    public static Collection<Boolean[]> testCases( ) {

        Collection<Boolean[]> parameters = new ArrayList<Boolean[]>( );

        parameters.add( new Boolean[] { true,  ColorEnum.WHITE.isOfWhiteColor( ) } );
        parameters.add( new Boolean[] { true,  ColorEnum.BLACK.isOfBlackColor( ) } );
        parameters.add( new Boolean[] { true,  ColorEnum.RED.isOfRedColor( ) } );
        
        parameters.add( new Boolean[] { false, ColorEnum.WHITE.isOfBlackColor( ) } );
        parameters.add( new Boolean[] { false, ColorEnum.WHITE.isOfRedColor( ) } );
        parameters.add( new Boolean[] { false, ColorEnum.BLACK.isOfWhiteColor( ) } );
        parameters.add( new Boolean[] { false, ColorEnum.BLACK.isOfRedColor( ) } );
        parameters.add( new Boolean[] { false, ColorEnum.RED.isOfWhiteColor( ) } );
        parameters.add( new Boolean[] { false, ColorEnum.RED.isOfBlackColor( ) } );
        
        parameters.add( new Boolean[] { false, ColorEnum.NONE.isOfBlackColor( ) } );
        parameters.add( new Boolean[] { false, ColorEnum.NONE.isOfRedColor( ) } );
        parameters.add( new Boolean[] { false, ColorEnum.NONE.isOfWhiteColor( ) } );

        return( parameters );
    }
}

