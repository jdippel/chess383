/*
 *  Tesselation_TripleBoardByRectangles_GetColor.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2016, 2017 Jörg Dippel
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

package chess383.tesselation;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.ColorEnum;
import chess383.graph.Tesselation;
import chess383.graph.basics.board.Coordinate_GraphImplementation_TripleBoardByRectangles;

/**
 * <p>
 * The class Tesselation_TripleBoardByRectangles_GetColor implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class Tesselation_TripleBoardByRectangles_GetColor { 

    
    static Tesselation tesselation = new Tesselation( new Coordinate_GraphImplementation_TripleBoardByRectangles( ) );
    
    /**
     * the public method ColorEnum getColor( ) is tested.
     */

    private final String location;
    private final ColorEnum expected;

    public Tesselation_TripleBoardByRectangles_GetColor( final String location, final ColorEnum expected ) {

        this.location = location;
        this.expected = expected;
    }
    
    
    @Test
    public void verifyTheCorrectReturnForTheGetValueMethod( ) {
        
        final String message = "Color must match the expected value: ";

        assertEquals( message, this.expected, tesselation.getColor( this.location ) );
    }

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", ColorEnum.BLACK } );
        parameters.add( new Object[] { "a2", ColorEnum.WHITE } );
        parameters.add( new Object[] { "a3", ColorEnum.BLACK } );
        parameters.add( new Object[] { "a4", ColorEnum.WHITE } );
        parameters.add( new Object[] { "a5", ColorEnum.BLACK } );
        parameters.add( new Object[] { "a6", ColorEnum.WHITE } );
        parameters.add( new Object[] { "a7", ColorEnum.BLACK } );
        parameters.add( new Object[] { "a8", ColorEnum.WHITE } );
        parameters.add( new Object[] { "b1", ColorEnum.WHITE } );
        parameters.add( new Object[] { "b2", ColorEnum.BLACK } );
        parameters.add( new Object[] { "b3", ColorEnum.WHITE } );
        parameters.add( new Object[] { "b4", ColorEnum.BLACK } );
        parameters.add( new Object[] { "b5", ColorEnum.WHITE } );
        parameters.add( new Object[] { "b6", ColorEnum.BLACK } );
        parameters.add( new Object[] { "b7", ColorEnum.WHITE } );
        parameters.add( new Object[] { "b8", ColorEnum.BLACK } );
        parameters.add( new Object[] { "c1", ColorEnum.BLACK } );
        parameters.add( new Object[] { "c2", ColorEnum.WHITE } );
        parameters.add( new Object[] { "c3", ColorEnum.BLACK } );
        parameters.add( new Object[] { "c4", ColorEnum.WHITE } );
        parameters.add( new Object[] { "c5", ColorEnum.BLACK } );
        parameters.add( new Object[] { "c6", ColorEnum.WHITE } );
        parameters.add( new Object[] { "c7", ColorEnum.BLACK } );
        parameters.add( new Object[] { "c8", ColorEnum.WHITE } );
        parameters.add( new Object[] { "d1", ColorEnum.WHITE } );
        parameters.add( new Object[] { "d2", ColorEnum.BLACK } );
        parameters.add( new Object[] { "d3", ColorEnum.WHITE } );
        parameters.add( new Object[] { "d4", ColorEnum.BLACK } );
        parameters.add( new Object[] { "d5", ColorEnum.WHITE } );
        parameters.add( new Object[] { "d6", ColorEnum.BLACK } );
        
        parameters.add( new Object[] { "l8", ColorEnum.BLACK } );
        parameters.add( new Object[] { "k8", ColorEnum.WHITE } );
        parameters.add( new Object[] { "j8", ColorEnum.BLACK } );
        parameters.add( new Object[] { "i8", ColorEnum.WHITE } );
        parameters.add( new Object[] { "d8", ColorEnum.BLACK } );
        parameters.add( new Object[] { "c8", ColorEnum.WHITE } );
        parameters.add( new Object[] { "b8", ColorEnum.BLACK } );
        parameters.add( new Object[] { "a8", ColorEnum.WHITE } );
        parameters.add( new Object[] { "l7", ColorEnum.WHITE } );
        parameters.add( new Object[] { "k7", ColorEnum.BLACK } );
        parameters.add( new Object[] { "j7", ColorEnum.WHITE } );
        parameters.add( new Object[] { "i7", ColorEnum.BLACK } );
        parameters.add( new Object[] { "d7", ColorEnum.WHITE } );
        parameters.add( new Object[] { "c7", ColorEnum.BLACK } );
        parameters.add( new Object[] { "b7", ColorEnum.WHITE } );
        parameters.add( new Object[] { "a7", ColorEnum.BLACK } );
        parameters.add( new Object[] { "l6", ColorEnum.BLACK } );
        parameters.add( new Object[] { "k6", ColorEnum.WHITE } );
        parameters.add( new Object[] { "j6", ColorEnum.BLACK } );
        parameters.add( new Object[] { "i6", ColorEnum.WHITE } );
        parameters.add( new Object[] { "d6", ColorEnum.BLACK } );
        parameters.add( new Object[] { "c6", ColorEnum.WHITE } );
        parameters.add( new Object[] { "b6", ColorEnum.BLACK } );
        parameters.add( new Object[] { "a6", ColorEnum.WHITE } );
        parameters.add( new Object[] { "l5", ColorEnum.WHITE } );
        parameters.add( new Object[] { "k5", ColorEnum.BLACK } );
        parameters.add( new Object[] { "j5", ColorEnum.WHITE } );
        parameters.add( new Object[] { "i5", ColorEnum.BLACK } );
        parameters.add( new Object[] { "d5", ColorEnum.WHITE } );
        parameters.add( new Object[] { "c5", ColorEnum.BLACK } );
        parameters.add( new Object[] { "b5", ColorEnum.WHITE } );
        parameters.add( new Object[] { "a5", ColorEnum.BLACK } );
      
        parameters.add( new Object[] { "h12", ColorEnum.BLACK } );
        parameters.add( new Object[] { "g12", ColorEnum.WHITE } );
        parameters.add( new Object[] { "f12", ColorEnum.BLACK } );
        parameters.add( new Object[] { "e12", ColorEnum.WHITE } );
        parameters.add( new Object[] { "i12", ColorEnum.BLACK } );
        parameters.add( new Object[] { "j12", ColorEnum.WHITE } );
        parameters.add( new Object[] { "k12", ColorEnum.BLACK } );
        parameters.add( new Object[] { "l12", ColorEnum.WHITE } );
        parameters.add( new Object[] { "h11", ColorEnum.WHITE } );
        parameters.add( new Object[] { "g11", ColorEnum.BLACK } );
        parameters.add( new Object[] { "f11", ColorEnum.WHITE } );
        parameters.add( new Object[] { "e11", ColorEnum.BLACK } );
        parameters.add( new Object[] { "i11", ColorEnum.WHITE } );
        parameters.add( new Object[] { "j11", ColorEnum.BLACK } );
        parameters.add( new Object[] { "k11", ColorEnum.WHITE } );
        parameters.add( new Object[] { "l11", ColorEnum.BLACK } );
        parameters.add( new Object[] { "h10", ColorEnum.BLACK } );
        parameters.add( new Object[] { "g10", ColorEnum.WHITE } );
        parameters.add( new Object[] { "f10", ColorEnum.BLACK } );
        parameters.add( new Object[] { "e10", ColorEnum.WHITE } );
        parameters.add( new Object[] { "i10", ColorEnum.BLACK } );
        parameters.add( new Object[] { "j10", ColorEnum.WHITE } );
        parameters.add( new Object[] { "k10", ColorEnum.BLACK } );
        parameters.add( new Object[] { "l10", ColorEnum.WHITE } );
        parameters.add( new Object[] { "h9", ColorEnum.WHITE } );
        parameters.add( new Object[] { "g9", ColorEnum.BLACK } );
        parameters.add( new Object[] { "f9", ColorEnum.WHITE } );
        parameters.add( new Object[] { "e9", ColorEnum.BLACK } );
        parameters.add( new Object[] { "i9", ColorEnum.WHITE } );
        parameters.add( new Object[] { "j9", ColorEnum.BLACK } );
        parameters.add( new Object[] { "k9", ColorEnum.WHITE } );
        parameters.add( new Object[] { "l9", ColorEnum.BLACK } );
        
        return( parameters );
    }
}

