/*
 *  ICoordinate_GetLineBundles_AdjacentByPointWhiteRed_TripleBoardByRectangles.java
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
 * The class ICoordinate_GetLineBundles_AdjacentByPointWhiteRed_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByPointWhiteRed_TripleBoardByRectangles extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass 
    public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_TripleBoardByRectangles( ) );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_RED );
    }
 
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByPointWhiteRed_TripleBoardByRectangles( String square, String expected ) {

        super( square, expected );
    }
 
    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1 b2 c3 d4 e9 f10 g11 h12" } );
        parameters.add( new Object[] { "a2", "" } );
        parameters.add( new Object[] { "a3", "" } );
        parameters.add( new Object[] { "a4", "" } );
        parameters.add( new Object[] { "a5", "" } );
        parameters.add( new Object[] { "a6", "" } );
        parameters.add( new Object[] { "a7", "" } );
        parameters.add( new Object[] { "a8", "" } );
        
        parameters.add( new Object[] { "b1", "b1 c2 d3 e4 f9 g10 h11" } );
        parameters.add( new Object[] { "b2", "a1 b2 c3 d4 e9 f10 g11 h12" } );
        parameters.add( new Object[] { "b3", "" } );
        parameters.add( new Object[] { "b4", "" } );
        parameters.add( new Object[] { "b5", "" } );
        parameters.add( new Object[] { "b6", "" } );
        parameters.add( new Object[] { "b7", "" } );
        parameters.add( new Object[] { "b8", "" } );
        
        parameters.add( new Object[] { "c1", "c1 d2 e3 f4 g9 h10" } );
        parameters.add( new Object[] { "c2", "b1 c2 d3 e4 f9 g10 h11" } );
        parameters.add( new Object[] { "c3", "a1 b2 c3 d4 e9 f10 g11 h12" } );
        parameters.add( new Object[] { "c4", "" } );
        parameters.add( new Object[] { "c5", "" } );
        parameters.add( new Object[] { "c6", "" } );
        parameters.add( new Object[] { "c7", "" } );
        parameters.add( new Object[] { "c8", "" } );
        
        parameters.add( new Object[] { "d1", "d1 e2 f3 g4 h9" } );
        parameters.add( new Object[] { "d2", "c1 d2 e3 f4 g9 h10" } );
        parameters.add( new Object[] { "d3", "b1 c2 d3 e4 f9 g10 h11" } );
        parameters.add( new Object[] { "d4", "a1 b2 c3 d4 e9 f10 g11 h12" } );
        parameters.add( new Object[] { "d5", "" } );
        parameters.add( new Object[] { "d6", "" } );
        parameters.add( new Object[] { "d7", "" } );
        parameters.add( new Object[] { "d8", "" } );
        
        parameters.add( new Object[] { "e1", "e1 f2 g3 h4" } );
        parameters.add( new Object[] { "e2", "d1 e2 f3 g4 h9" } );
        parameters.add( new Object[] { "e3", "c1 d2 e3 f4 g9 h10" } );
        parameters.add( new Object[] { "e4", "h1 g2 f3 e4 i9 j10 k11 l12 , b1 c2 d3 e4 f9 g10 h11" } );
        parameters.add( new Object[] { "e9", "a1 b2 c3 d4 e9 f10 g11 h12 , h2 g3 f4 e9 i10 j11 k12" } );
        parameters.add( new Object[] { "e10", "h3 g4 f9 e10 i11 j12" } );
        parameters.add( new Object[] { "e11", "h4 g9 f10 e11 i12" } );
        parameters.add( new Object[] { "e12", "h9 g10 f11 e12" } );
        
        parameters.add( new Object[] { "f1", "f1 g2 h3" } );
        parameters.add( new Object[] { "f2", "e1 f2 g3 h4" } );
        parameters.add( new Object[] { "f3", "d1 e2 f3 g4 h9 , h1 g2 f3 e4 i9 j10 k11 l12" } );
        parameters.add( new Object[] { "f4", "c1 d2 e3 f4 g9 h10 , h2 g3 f4 e9 i10 j11 k12" } );
        parameters.add( new Object[] { "f9", "b1 c2 d3 e4 f9 g10 h11 , h3 g4 f9 e10 i11 j12" } );
        parameters.add( new Object[] { "f10", "a1 b2 c3 d4 e9 f10 g11 h12 , h4 g9 f10 e11 i12" } );
        parameters.add( new Object[] { "f11", "h9 g10 f11 e12" } );
        parameters.add( new Object[] { "f12", "h10 g11 f12" } );
        
        parameters.add( new Object[] { "g1", "g1 h2" } );
        parameters.add( new Object[] { "g2", "h1 g2 f3 e4 i9 j10 k11 l12 , f1 g2 h3" } );
        parameters.add( new Object[] { "g3", "h2 g3 f4 e9 i10 j11 k12 , e1 f2 g3 h4" } );
        parameters.add( new Object[] { "g4", "h3 g4 f9 e10 i11 j12 , d1 e2 f3 g4 h9" } );
        parameters.add( new Object[] { "g9", "c1 d2 e3 f4 g9 h10 , h4 g9 f10 e11 i12" } );
        parameters.add( new Object[] { "g10", "b1 c2 d3 e4 f9 g10 h11 , h9 g10 f11 e12" } );
        parameters.add( new Object[] { "g11", "h10 g11 f12 , a1 b2 c3 d4 e9 f10 g11 h12" } );
        parameters.add( new Object[] { "g12", "h11 g12" } );
        
        parameters.add( new Object[] { "h1", "h1 g2 f3 e4 i9 j10 k11 l12" } );
        parameters.add( new Object[] { "h2", "g1 h2 , h2 g3 f4 e9 i10 j11 k12" } );
        parameters.add( new Object[] { "h3", "h3 g4 f9 e10 i11 j12 , f1 g2 h3" } );
        parameters.add( new Object[] { "h4", "h4 g9 f10 e11 i12 , e1 f2 g3 h4" } );
        parameters.add( new Object[] { "h9", "d1 e2 f3 g4 h9 , h9 g10 f11 e12" } );
        parameters.add( new Object[] { "h10", "c1 d2 e3 f4 g9 h10 , h10 g11 f12" } );
        parameters.add( new Object[] { "h11", "b1 c2 d3 e4 f9 g10 h11 , h11 g12" } );
        parameters.add( new Object[] { "h12", "a1 b2 c3 d4 e9 f10 g11 h12" } );
               
        parameters.add( new Object[] { "i5", "" } );
        parameters.add( new Object[] { "i6", "" } );
        parameters.add( new Object[] { "i7", "" } );
        parameters.add( new Object[] { "i8", "" } );
        parameters.add( new Object[] { "i9", "h1 g2 f3 e4 i9 j10 k11 l12" } );
        parameters.add( new Object[] { "i10", "h2 g3 f4 e9 i10 j11 k12" } );
        parameters.add( new Object[] { "i11", "h3 g4 f9 e10 i11 j12" } );
        parameters.add( new Object[] { "i12", "h4 g9 f10 e11 i12" } );
        
        parameters.add( new Object[] { "j5", "" } );
        parameters.add( new Object[] { "j6", "" } );
        parameters.add( new Object[] { "j7", "" } );
        parameters.add( new Object[] { "j8", "" } );
        parameters.add( new Object[] { "j9", "" } );
        parameters.add( new Object[] { "j10", "h1 g2 f3 e4 i9 j10 k11 l12" } );
        parameters.add( new Object[] { "j11", "h2 g3 f4 e9 i10 j11 k12" } );
        parameters.add( new Object[] { "j12", "h3 g4 f9 e10 i11 j12" } );
        
        parameters.add( new Object[] { "k5", "" } );
        parameters.add( new Object[] { "k6", "" } );
        parameters.add( new Object[] { "k7", "" } );
        parameters.add( new Object[] { "k8", "" } );
        parameters.add( new Object[] { "k9", "" } );
        parameters.add( new Object[] { "k10", "" } );
        parameters.add( new Object[] { "k11", "h1 g2 f3 e4 i9 j10 k11 l12" } );
        parameters.add( new Object[] { "k12", "h2 g3 f4 e9 i10 j11 k12" } );
        
        parameters.add( new Object[] { "l5", "" } );
        parameters.add( new Object[] { "l6", "" } );
        parameters.add( new Object[] { "l7", "" } );
        parameters.add( new Object[] { "l8", "" } );
        parameters.add( new Object[] { "l9", "" } );
        parameters.add( new Object[] { "l10", "" } );
        parameters.add( new Object[] { "l11", "" } );
        parameters.add( new Object[] { "l12", "h1 g2 f3 e4 i9 j10 k11 l12" } );
        
        return( parameters );
    }
}

