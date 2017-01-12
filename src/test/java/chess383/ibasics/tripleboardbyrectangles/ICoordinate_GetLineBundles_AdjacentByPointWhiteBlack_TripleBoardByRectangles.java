/*
 *  ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_TripleBoardByRectangles.java
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

package chess383.ibasics.tripleboardbyrectangles;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.graph.basics.board.Coordinate_GraphImplementation_TripleBoardByRectangles;
import chess383.graph.color.DirectedByColorEnum;
import chess383.ibasics.ICoordinate_GetLineBundles_Wrapper;

/**
 * <p>
 * The class ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_TripleBoardByRectangles extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass 
    public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_TripleBoardByRectangles( ) );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK );
    }
 
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_TripleBoardByRectangles( String square, String expected ) {

        super( square, expected );
    }
 
    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1 b2 c3 d4 i5 j6 k7 l8" } );
        parameters.add( new Object[] { "a2", "b1 a2 , a2 b3 c4 d5 i6 j7 k8" } );
        parameters.add( new Object[] { "a3", "c1 b2 a3 , a3 b4 c5 d6 i7 j8" } );
        parameters.add( new Object[] { "a4", "d1 c2 b3 a4 , a4 b5 c6 d7 i8" } );
        parameters.add( new Object[] { "a5", "e1 d2 c3 b4 a5 , a5 b6 c7 d8" } );
        parameters.add( new Object[] { "a6", "f1 e2 d3 c4 b5 a6 , a6 b7 c8" } );
        parameters.add( new Object[] { "a7", "g1 f2 e3 d4 c5 b6 a7 , a7 b8" } );
        parameters.add( new Object[] { "a8", "h1 g2 f3 e4 d5 c6 b7 a8" } );
        
        parameters.add( new Object[] { "b1", "b1 a2" } );
        parameters.add( new Object[] { "b2", "a1 b2 c3 d4 i5 j6 k7 l8 , c1 b2 a3" } );
        parameters.add( new Object[] { "b3", "a2 b3 c4 d5 i6 j7 k8 , d1 c2 b3 a4" } );
        parameters.add( new Object[] { "b4", "a3 b4 c5 d6 i7 j8 , e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "b5", "a4 b5 c6 d7 i8 , f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "b6", "a5 b6 c7 d8 , g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "b7", "a6 b7 c8 , h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "b8", "a7 b8" } );
        
        parameters.add( new Object[] { "c1", "c1 b2 a3" } );
        parameters.add( new Object[] { "c2", "d1 c2 b3 a4" } );
        parameters.add( new Object[] { "c3", "a1 b2 c3 d4 i5 j6 k7 l8 , e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "c4", "f1 e2 d3 c4 b5 a6 , a2 b3 c4 d5 i6 j7 k8" } );
        parameters.add( new Object[] { "c5", "g1 f2 e3 d4 c5 b6 a7 , a3 b4 c5 d6 i7 j8" } );
        parameters.add( new Object[] { "c6", "a4 b5 c6 d7 i8 , h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "c7", "a5 b6 c7 d8" } );
        parameters.add( new Object[] { "c8", "a6 b7 c8" } );
        
        parameters.add( new Object[] { "d1", "d1 c2 b3 a4" } );
        parameters.add( new Object[] { "d2", "e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "d3", "f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "d4", "g1 f2 e3 d4 c5 b6 a7 , a1 b2 c3 d4 i5 j6 k7 l8" } );
        parameters.add( new Object[] { "d5", "h1 g2 f3 e4 d5 c6 b7 a8 , a2 b3 c4 d5 i6 j7 k8" } );
        parameters.add( new Object[] { "d6", "a3 b4 c5 d6 i7 j8" } );
        parameters.add( new Object[] { "d7", "a4 b5 c6 d7 i8" } );
        parameters.add( new Object[] { "d8", "a5 b6 c7 d8" } );
        
        parameters.add( new Object[] { "e1", "e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "e2", "f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "e3", "g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "e4", "h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "e9", "" } );
        parameters.add( new Object[] { "e10", "" } );
        parameters.add( new Object[] { "e11", "" } );
        parameters.add( new Object[] { "e12", "" } );
        
        parameters.add( new Object[] { "f1", "f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "f2", "g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "f3", "h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "f4", "" } );
        parameters.add( new Object[] { "f9", "" } );
        parameters.add( new Object[] { "f10", "" } );
        parameters.add( new Object[] { "f11", "" } );
        parameters.add( new Object[] { "f12", "" } );
        
        parameters.add( new Object[] { "g1", "g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "g2", "h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "g3", "" } );
        parameters.add( new Object[] { "g4", "" } );
        parameters.add( new Object[] { "g9", "" } );
        parameters.add( new Object[] { "g10", "" } );
        parameters.add( new Object[] { "g11", "" } );
        parameters.add( new Object[] { "g12", "" } );
        
        parameters.add( new Object[] { "h1", "h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "h2", "" } );
        parameters.add( new Object[] { "h3", "" } );
        parameters.add( new Object[] { "h4", "" } );
        parameters.add( new Object[] { "h9", "" } );
        parameters.add( new Object[] { "h10", "" } );
        parameters.add( new Object[] { "h11", "" } );
        parameters.add( new Object[] { "h12", "" } );
        
        parameters.add( new Object[] { "i5", "a1 b2 c3 d4 i5 j6 k7 l8" } );
        parameters.add( new Object[] { "i6", "a2 b3 c4 d5 i6 j7 k8" } );
        parameters.add( new Object[] { "i7", "a3 b4 c5 d6 i7 j8" } );
        parameters.add( new Object[] { "i8", "a4 b5 c6 d7 i8" } );
        parameters.add( new Object[] { "i9", "" } );
        parameters.add( new Object[] { "i10", "" } );
        parameters.add( new Object[] { "i11", "" } );
        parameters.add( new Object[] { "i12", "" } );
        
        parameters.add( new Object[] { "j5", "" } );
        parameters.add( new Object[] { "j6", "a1 b2 c3 d4 i5 j6 k7 l8" } );
        parameters.add( new Object[] { "j7", "a2 b3 c4 d5 i6 j7 k8" } );
        parameters.add( new Object[] { "j8", "a3 b4 c5 d6 i7 j8" } );
        parameters.add( new Object[] { "j9", "" } );
        parameters.add( new Object[] { "j10", "" } );
        parameters.add( new Object[] { "j11", "" } );
        parameters.add( new Object[] { "j12", "" } );
      
        parameters.add( new Object[] { "k5", "" } );
        parameters.add( new Object[] { "k6", "" } );
        parameters.add( new Object[] { "k7", "a1 b2 c3 d4 i5 j6 k7 l8" } );
        parameters.add( new Object[] { "k8", "a2 b3 c4 d5 i6 j7 k8" } );
        parameters.add( new Object[] { "k9", "" } );
        parameters.add( new Object[] { "k10", "" } );
        parameters.add( new Object[] { "k11", "" } );
        parameters.add( new Object[] { "k12", "" } );
     
        parameters.add( new Object[] { "l5", "" } );
        parameters.add( new Object[] { "l6", "" } );
        parameters.add( new Object[] { "l7", "" } );
        parameters.add( new Object[] { "l8", "a1 b2 c3 d4 i5 j6 k7 l8" } );
        parameters.add( new Object[] { "l9", "" } );
        parameters.add( new Object[] { "l10", "" } );
        parameters.add( new Object[] { "l11", "" } );
        parameters.add( new Object[] { "l12", "" } );
        
        return( parameters );
    }
}

