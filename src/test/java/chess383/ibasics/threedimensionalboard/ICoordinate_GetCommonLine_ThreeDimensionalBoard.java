/*
 *  ICoordinate_GetCommonLine_ThreeDimensionalBoard.java
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

package chess383.ibasics.threedimensionalboard;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.ICoordinate;
import chess383.graph.basics.board.Coordinate_GraphImplementation_ThreeDimensionalBoard;

/**
 * <p>
 * The class ICoordinate_GetCommonLine_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetCommonLine_ThreeDimensionalBoard { 

    static ICoordinate board;
    @BeforeClass public static void beforeAll( ) { 
        board = new Coordinate_GraphImplementation_ThreeDimensionalBoard( );
    }
    
    /**
     * the public method Set<List<String>> getCommonLine( ) is tested.
     */

    private final String square1;
    private final String square2;
    private final String expected;

    public ICoordinate_GetCommonLine_ThreeDimensionalBoard( String square1, String square2, String expected ) {

        this.square1 = square1;
        this.square2 = square2;
        this.expected = expected;
    }

    
    @Test
    public void compareTheLine( ) {
        
        Set<List<String>> received = board.getCommonLine( this.square1, this.square2 );
        assertTrue( "The result is unique", received.size( ) <= 1 );
        
        if( this.expected == null ) {
            assertTrue( "no result expected", received.size( ) == 0 );
        }
        else {
            List<String> singeResult = received.iterator( ).next( );
            String[] tokens = this.expected.split( "\\s+" );
            assertEquals( "result set must be the same size" ,singeResult.size( ), tokens.length );
            for( int index = 0; index < tokens.length; index++ ) {
                assertEquals( "elements are ordered and must be equal" ,singeResult.get( index ), tokens[ index ] );
            }
        }
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );
        
        parameters.add( new Object[] { "z1", "e1", "e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "a1", "e1", "e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "d0", "d6", "d0 d1 d2 d3 d4 d5 d6 d7 d8 d9" } );
        parameters.add( new Object[] { "z1", "a2", "z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "b7", "z9", "e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "d3", "c5", "a9 b7 c5 d3 e1" } );
        parameters.add( new Object[] { "d3", "h6", null } );
        parameters.add( new Object[] { "a9", "d9", null } );
        parameters.add( new Object[] { "e0", "z0", null } );


        return( parameters );
    }
}

