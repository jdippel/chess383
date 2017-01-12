/*
 *  ICoordinate_GetLineBundles_TripleBoardByRectangles.java
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
import chess383.ibasics.ICoordinate_GetLineBundles_Wrapper;

/**
 * <p>
 * The class ICoordinate_GetLineBundles_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_TripleBoardByRectangles extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass 
    public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_TripleBoardByRectangles( ) );
        setOrientation( null );
    }
 
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_TripleBoardByRectangles( String square, String expected ) {

        super( square, expected );
    }
 
    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1 b1 c1 d1 e1 f1 g1 h1 , a1 a2 a3 a4 a5 a6 a7 a8 , a1 b2 c3 d4 i5 j6 k7 l8 , a1 b2 c3 d4 e9 f10 g11 h12 , a1 c2 , a1 b3" } );
        parameters.add( new Object[] { "a2", "a2 b2 c2 d2 e2 f2 g2 h2 , a1 a2 a3 a4 a5 a6 a7 a8 , b1 a2 , a2 b3 c4 d5 i6 j7 k8 , a2 c1 , a2 c3 , a2 b4" } );
        parameters.add( new Object[] { "a3", "a3 b3 c3 d3 e3 f3 g3 h3 , a1 a2 a3 a4 a5 a6 a7 a8 , c1 b2 a3 , a3 b4 c5 d6 i7 j8 , a3 b1 , a3 c2 , a3 c4 , a3 b5" } );
        parameters.add( new Object[] { "a4", "a4 b4 c4 d4 e4 f4 g4 h4 , a1 a2 a3 a4 a5 a6 a7 a8 , d1 c2 b3 a4 , a4 b5 c6 d7 i8 , a4 b2 , a4 c3 , a4 c5 , a4 b6" } );
        parameters.add( new Object[] { "a5", "a5 b5 c5 d5 i5 j5 k5 l5 , a1 a2 a3 a4 a5 a6 a7 a8 , e1 d2 c3 b4 a5 , a5 b6 c7 d8 , a5 b3 , a5 c4 , a5 c6 , a5 b7" } );
        parameters.add( new Object[] { "a6", "a6 b6 c6 d6 i6 j6 k6 l6 , a1 a2 a3 a4 a5 a6 a7 a8 , f1 e2 d3 c4 b5 a6 , a6 b7 c8 , a6 b4 , a6 c5 , a6 c7 , a6 b8" } );
        parameters.add( new Object[] { "a7", "a7 b7 c7 d7 i7 j7 k7 l7 , a1 a2 a3 a4 a5 a6 a7 a8 , g1 f2 e3 d4 c5 b6 a7 , a7 b8 , a7 c6 , a7 b5 , a7 c8" } );
        parameters.add( new Object[] { "a8", "a8 b8 c8 d8 i8 j8 k8 l8 , a1 a2 a3 a4 a5 a6 a7 a8 , h1 g2 f3 e4 d5 c6 b7 a8 , a8 b7 c6 d5 i9 j10 k11 l12 , a8 c7 , a8 b6" } );
        
        parameters.add( new Object[] { "b1", "a1 b1 c1 d1 e1 f1 g1 h1 , b1 b2 b3 b4 b5 b6 b7 b8 , b1 a2 , b1 c2 d3 e4 f9 g10 h11 , b1 d2 , b1 c3 , a3 b1" } );
        parameters.add( new Object[] { "b2", "a2 b2 c2 d2 e2 f2 g2 h2 , b1 b2 b3 b4 b5 b6 b7 b8 , a1 b2 c3 d4 i5 j6 k7 l8 , c1 b2 a3 , a1 b2 c3 d4 e9 f10 g11 h12 , b2 c4 , b2 d3 , b2 d1 , a4 b2" } );
        parameters.add( new Object[] { "b3", "a3 b3 c3 d3 e3 f3 g3 h3 , b1 b2 b3 b4 b5 b6 b7 b8 , a2 b3 c4 d5 i6 j7 k8 , d1 c2 b3 a4 , b3 c5 , a1 b3 , b3 d4 , b3 c1 , b3 d2 , a5 b3" } );
        parameters.add( new Object[] { "b4", "a4 b4 c4 d4 e4 f4 g4 h4 , b1 b2 b3 b4 b5 b6 b7 b8 , a3 b4 c5 d6 i7 j8 , e1 d2 c3 b4 a5 , b4 c6 , b4 d5 , b4 c2 , b4 d3 , a6 b4 , a2 b4" } );
        parameters.add( new Object[] { "b5", "a5 b5 c5 d5 i5 j5 k5 l5 , b1 b2 b3 b4 b5 b6 b7 b8 , a4 b5 c6 d7 i8 , f1 e2 d3 c4 b5 a6 , b5 c7 , b5 d6 , b5 c3 , b5 d4 , a7 b5 , a3 b5" } );
        parameters.add( new Object[] { "b6", "a6 b6 c6 d6 i6 j6 k6 l6 , b1 b2 b3 b4 b5 b6 b7 b8 , a5 b6 c7 d8 , g1 f2 e3 d4 c5 b6 a7 , b6 c8 , b6 d7 , b6 c4 , b6 d5 , a8 b6 , a4 b6" } );
        parameters.add( new Object[] { "b7", "a7 b7 c7 d7 i7 j7 k7 l7 , b1 b2 b3 b4 b5 b6 b7 b8 , a6 b7 c8 , h1 g2 f3 e4 d5 c6 b7 a8 , a8 b7 c6 d5 i9 j10 k11 l12 , b7 d6 , b7 c5 , b7 d8 , a5 b7" } );
        parameters.add( new Object[] { "b8", "a8 b8 c8 d8 i8 j8 k8 l8 , b1 b2 b3 b4 b5 b6 b7 b8 , a7 b8 , b8 c7 d6 i5 j9 k10 l11 , b8 d7 , b8 c6 , a6 b8" } );
        
        parameters.add( new Object[] { "c1", "a1 b1 c1 d1 e1 f1 g1 h1 , c1 c2 c3 c4 c5 c6 c7 c8 , c1 b2 a3 , c1 d2 e3 f4 g9 h10 , b3 c1 , c1 d3 , c1 e2 , a2 c1" } );
        parameters.add( new Object[] { "c2", "a2 b2 c2 d2 e2 f2 g2 h2 , c1 c2 c3 c4 c5 c6 c7 c8 , d1 c2 b3 a4 , b1 c2 d3 e4 f9 g10 h11 , c2 e3 , c2 d4 , a1 c2 , b4 c2 , c2 e1 , a3 c2" } );
        parameters.add( new Object[] { "c3", "a3 b3 c3 d3 e3 f3 g3 h3 , c1 c2 c3 c4 c5 c6 c7 c8 , a1 b2 c3 d4 i5 j6 k7 l8 , a1 b2 c3 d4 e9 f10 g11 h12 , e1 d2 c3 b4 a5 , c3 e4 , c3 d5 , c3 d1 , c3 e2 , a4 c3 , a2 c3 , b1 c3 , b5 c3" } );
        parameters.add( new Object[] { "c4", "a4 b4 c4 d4 e4 f4 g4 h4 , c1 c2 c3 c4 c5 c6 c7 c8 , f1 e2 d3 c4 b5 a6 , a2 b3 c4 d5 i6 j7 k8 , c4 d6 , c4 i5 , c4 d2 , c4 e3 , a5 c4 , a3 c4 , c4 e9 , b2 c4 , b6 c4" } );
        parameters.add( new Object[] { "c5", "a5 b5 c5 d5 i5 j5 k5 l5 , c1 c2 c3 c4 c5 c6 c7 c8 , g1 f2 e3 d4 c5 b6 a7 , a3 b4 c5 d6 i7 j8 , c5 d7 , c5 i6 , c5 i9 , c5 d3 , c5 e4 , a6 c5 , a4 c5 , b3 c5 , b7 c5" } );
        parameters.add( new Object[] { "c6", "a6 b6 c6 d6 i6 j6 k6 l6 , c1 c2 c3 c4 c5 c6 c7 c8 , a4 b5 c6 d7 i8 , h1 g2 f3 e4 d5 c6 b7 a8 , a8 b7 c6 d5 i9 j10 k11 l12 , c6 d8 , c6 d4 , c6 i7 , a7 c6 , a5 c6 , b4 c6 , c6 i5 , b8 c6" } );
        parameters.add( new Object[] { "c7", "a7 b7 c7 d7 i7 j7 k7 l7 , c1 c2 c3 c4 c5 c6 c7 c8 , a5 b6 c7 d8 , b8 c7 d6 i5 j9 k10 l11 , b5 c7 , c7 d5 , c7 i8 , a8 c7 , c7 i6 , a6 c7" } );
        parameters.add( new Object[] { "c8", "a8 b8 c8 d8 i8 j8 k8 l8 , c1 c2 c3 c4 c5 c6 c7 c8 , a6 b7 c8 , c8 d7 i6 j5 k9 l10 , b6 c8 , c8 d6 , c8 i7 , a7 c8" } );
        
        parameters.add( new Object[] { "d1", "a1 b1 c1 d1 e1 f1 g1 h1 , d1 d2 d3 d4 d5 d6 d7 d8 , d1 c2 b3 a4 , d1 e2 f3 g4 h9 , b2 d1 , d1 f2 , c3 d1 , d1 e3" } );
        parameters.add( new Object[] { "d2", "a2 b2 c2 d2 e2 f2 g2 h2 , d1 d2 d3 d4 d5 d6 d7 d8 , e1 d2 c3 b4 a5 , c1 d2 e3 f4 g9 h10 , d2 f1 , b1 d2 , b3 d2 , d2 e4 , d2 f3 , c4 d2" } );
        parameters.add( new Object[] { "d3", "a3 b3 c3 d3 e3 f3 g3 h3 , d1 d2 d3 d4 d5 d6 d7 d8 , f1 e2 d3 c4 b5 a6 , b1 c2 d3 e4 f9 g10 h11 , d3 e1 , d3 f2 , b2 d3 , c1 d3 , b4 d3 , d3 f4 , c5 d3 , d3 e9" } );
        parameters.add( new Object[] { "d4", "a4 b4 c4 d4 e4 f4 g4 h4 , d1 d2 d3 d4 d5 d6 d7 d8 , g1 f2 e3 d4 c5 b6 a7 , a1 b2 c3 d4 i5 j6 k7 l8 , a1 b2 c3 d4 e9 f10 g11 h12 , c2 d4 , c6 d4 , d4 e2 , d4 f3 , d4 i6 , b3 d4 , d4 j5 , b5 d4 , d4 e10 , d4 f9" } );
        parameters.add( new Object[] { "d5", "a5 b5 c5 d5 i5 j5 k5 l5 , d1 d2 d3 d4 d5 d6 d7 d8 , h1 g2 f3 e4 d5 c6 b7 a8 , a2 b3 c4 d5 i6 j7 k8 , a8 b7 c6 d5 i9 j10 k11 l12 , c3 d5 , c7 d5 , d5 j9 , d5 e3 , d5 f4 , d5 i7 , b4 d5 , d5 j6 , b6 d5" } );
        parameters.add( new Object[] { "d6", "a6 b6 c6 d6 i6 j6 k6 l6 , d1 d2 d3 d4 d5 d6 d7 d8 , a3 b4 c5 d6 i7 j8 , b8 c7 d6 i5 j9 k10 l11 , c4 d6 , c8 d6 , d6 j5 , b5 d6 , d6 j7 , d6 i8 , d6 e4 , d6 i9 , b7 d6" } );
        parameters.add( new Object[] { "d7", "a7 b7 c7 d7 i7 j7 k7 l7 , d1 d2 d3 d4 d5 d6 d7 d8 , a4 b5 c6 d7 i8 , c8 d7 i6 j5 k9 l10 , c5 d7 , b6 d7 , d7 j8 , b8 d7 , d7 j6 , d7 i5" } );
        parameters.add( new Object[] { "d8", "a8 b8 c8 d8 i8 j8 k8 l8 , d1 d2 d3 d4 d5 d6 d7 d8 , a5 b6 c7 d8 , d8 i7 j6 k5 l9 , c6 d8 , d8 j7 , d8 i6 , b7 d8" } );
        
        parameters.add( new Object[] { "e1", "a1 b1 c1 d1 e1 f1 g1 h1 , e1 e2 e3 e4 e9 e10 e11 e12 , e1 d2 c3 b4 a5 , e1 f2 g3 h4 , c2 e1 , e1 f3 , d3 e1 , e1 g2" } );
        parameters.add( new Object[] { "e2", "a2 b2 c2 d2 e2 f2 g2 h2 , e1 e2 e3 e4 e9 e10 e11 e12 , f1 e2 d3 c4 b5 a6 , d1 e2 f3 g4 h9 , d4 e2 , e2 g1 , e2 g3 , c3 e2 , e2 f4 , c1 e2" } );
        parameters.add( new Object[] { "e3", "a3 b3 c3 d3 e3 f3 g3 h3 , e1 e2 e3 e4 e9 e10 e11 e12 , c1 d2 e3 f4 g9 h10 , g1 f2 e3 d4 c5 b6 a7 , c2 e3 , d5 e3 , e3 f1 , e3 g2 , e3 g4 , d1 e3 , c4 e3 , e3 f9" } );
        parameters.add( new Object[] { "e4", "a4 b4 c4 d4 e4 f4 g4 h4 , e1 e2 e3 e4 e9 e10 e11 e12 , h1 g2 f3 e4 d5 c6 b7 a8 , h1 g2 f3 e4 i9 j10 k11 l12 , b1 c2 d3 e4 f9 g10 h11 , c3 e4 , e4 f2 , e4 g3 , e4 j9 , e4 f10 , c5 e4 , e4 g9 , d2 e4 , d6 e4 , e4 i10" } );
        parameters.add( new Object[] { "e9", "h9 g9 f9 e9 i9 j9 k9 l9 , e1 e2 e3 e4 e9 e10 e11 e12 , a1 b2 c3 d4 e9 f10 g11 h12 , h2 g3 f4 e9 i10 j11 k12 , l8 k7 j6 i5 e9 f10 g11 h12 , e9 f11 , e9 g10 , e9 i11 , e9 j10 , c4 e9 , d3 e9 , e9 f3 , e9 g4 , e9 i6 , e9 j5" } );
        parameters.add( new Object[] { "e10", "h10 g10 f10 e10 i10 j10 k10 l10 , e1 e2 e3 e4 e9 e10 e11 e12 , h3 g4 f9 e10 i11 j12 , l7 k6 j5 i9 e10 f11 g12 , e10 j9 , e10 f4 , e10 i5 , e10 f12 , e10 g11 , e10 i12 , e10 j11 , e10 g9 , d4 e10" } );
        parameters.add( new Object[] { "e11", "h11 g11 f11 e11 i11 j11 k11 l11 , e1 e2 e3 e4 e9 e10 e11 e12 , h4 g9 f10 e11 i12 , l6 k5 j9 i10 e11 f12 , e11 i9 , e11 j10 , e11 g12 , e11 g10 , e11 j12 , e11 f9" } );
        parameters.add( new Object[] { "e12", "h12 g12 f12 e12 i12 j12 k12 l12 , e1 e2 e3 e4 e9 e10 e11 e12 , h9 g10 f11 e12 , l5 k9 j10 i11 e12 , e12 g11 , e12 f10 , e12 i10 , e12 j11" } );
        
        parameters.add( new Object[] { "f1", "a1 b1 c1 d1 e1 f1 g1 h1 , f1 f2 f3 f4 f9 f10 f11 f12 , f1 e2 d3 c4 b5 a6 , f1 g2 h3 , d2 f1 , e3 f1 , f1 g3 , f1 h2" } );
        parameters.add( new Object[] { "f2", "a2 b2 c2 d2 e2 f2 g2 h2 , f1 f2 f3 f4 f9 f10 f11 f12 , g1 f2 e3 d4 c5 b6 a7 , e1 f2 g3 h4 , d3 f2 , e4 f2 , d1 f2 , f2 g4 , f2 h3 , f2 h1" } );
        parameters.add( new Object[] { "f3", "a3 b3 c3 d3 e3 f3 g3 h3 , f1 f2 f3 f4 f9 f10 f11 f12 , h1 g2 f3 e4 d5 c6 b7 a8 , d1 e2 f3 g4 h9 , h1 g2 f3 e4 i9 j10 k11 l12 , f3 g9 , f3 h4 , f3 g1 , f3 h2 , d4 f3 , d2 f3 , e1 f3 , e9 f3" } );
        parameters.add( new Object[] { "f4", "a4 b4 c4 d4 e4 f4 g4 h4 , f1 f2 f3 f4 f9 f10 f11 f12 , c1 d2 e3 f4 g9 h10 , h2 g3 f4 e9 i10 j11 k12 , e10 f4 , e2 f4 , f4 h9 , f4 i9 , f4 g2 , f4 h3 , d5 f4 , f4 g10 , d3 f4" } );
        parameters.add( new Object[] { "f9", "h9 g9 f9 e9 i9 j9 k9 l9 , f1 f2 f3 f4 f9 f10 f11 f12 , b1 c2 d3 e4 f9 g10 h11 , h3 g4 f9 e10 i11 j12 , e3 f9 , f9 g3 , f9 h4 , e11 f9 , f9 i5 , f9 g11 , f9 h10 , f9 i10 , d4 f9" } );
        parameters.add( new Object[] { "f10", "h10 g10 f10 e10 i10 j10 k10 l10 , f1 f2 f3 f4 f9 f10 f11 f12 , a1 b2 c3 d4 e9 f10 g11 h12 , h4 g9 f10 e11 i12 , l8 k7 j6 i5 e9 f10 g11 h12 , e4 f10 , e12 f10 , f10 g12 , f10 h11 , f10 i11 , f10 g4 , f10 i9 , f10 h9" } );
        parameters.add( new Object[] { "f11", "h11 g11 f11 e11 i11 j11 k11 l11 , f1 f2 f3 f4 f9 f10 f11 f12 , l7 k6 j5 i9 e10 f11 g12 , h9 g10 f11 e12 , f11 h10 , f11 i10 , e9 f11 , f11 h12 , f11 i12 , f11 g9" } );
        parameters.add( new Object[] { "f12", "h12 g12 f12 e12 i12 j12 k12 l12 , f1 f2 f3 f4 f9 f10 f11 f12 , h10 g11 f12 , l6 k5 j9 i10 e11 f12 , f12 g10 , f12 h11 , f12 i11 , e10 f12" } );
        
        parameters.add( new Object[] { "g1", "a1 b1 c1 d1 e1 f1 g1 h1 , g1 g2 g3 g4 g9 g10 g11 g12 , g1 h2 , g1 f2 e3 d4 c5 b6 a7 , e2 g1 , g1 h3 , f3 g1" } );
        parameters.add( new Object[] { "g2", "a2 b2 c2 d2 e2 f2 g2 h2 , g1 g2 g3 g4 g9 g10 g11 g12 , h1 g2 f3 e4 i9 j10 k11 l12 , f1 g2 h3 , h1 g2 f3 e4 d5 c6 b7 a8 , e3 g2 , g2 h4 , e1 g2 , f4 g2" } );
        parameters.add( new Object[] { "g3", "a3 b3 c3 d3 e3 f3 g3 h3 , g1 g2 g3 g4 g9 g10 g11 g12 , h2 g3 f4 e9 i10 j11 k12 , e1 f2 g3 h4 , e4 g3 , e2 g3 , g3 h9 , f1 g3 , g3 h1 , f9 g3" } );
        parameters.add( new Object[] { "g4", "a4 b4 c4 d4 e4 f4 g4 h4 , g1 g2 g3 g4 g9 g10 g11 g12 , h3 g4 f9 e10 i11 j12 , d1 e2 f3 g4 h9 , e3 g4 , f2 g4 , f10 g4 , g4 h10 , e9 g4 , g4 h2" } );
        parameters.add( new Object[] { "g9", "h9 g9 f9 e9 i9 j9 k9 l9 , g1 g2 g3 g4 g9 g10 g11 g12 , c1 d2 e3 f4 g9 h10 , h4 g9 f10 e11 i12 , g9 h3 , f3 g9 , e4 g9 , f11 g9 , g9 h11 , e10 g9" } );
        parameters.add( new Object[] { "g10", "h10 g10 f10 e10 i10 j10 k10 l10 , g1 g2 g3 g4 g9 g10 g11 g12 , b1 c2 d3 e4 f9 g10 h11 , h9 g10 f11 e12 , f4 g10 , f12 g10 , e9 g10 , e11 g10 , g10 h4 , g10 h12" } );
        parameters.add( new Object[] { "g11", "h11 g11 f11 e11 i11 j11 k11 l11 , g1 g2 g3 g4 g9 g10 g11 g12 , l8 k7 j6 i5 e9 f10 g11 h12 , h10 g11 f12 , a1 b2 c3 d4 e9 f10 g11 h12 , f9 g11 , g11 h9 , e12 g11 , e10 g11" } );
        parameters.add( new Object[] { "g12", "h12 g12 f12 e12 i12 j12 k12 l12 , g1 g2 g3 g4 g9 g10 g11 g12 , l7 k6 j5 i9 e10 f11 g12 , h11 g12 , g12 h10 , f10 g12 , e11 g12" } );
        
        parameters.add( new Object[] { "h1", "a1 b1 c1 d1 e1 f1 g1 h1 , h1 h2 h3 h4 h9 h10 h11 h12 , h1 g2 f3 e4 d5 c6 b7 a8 , h1 g2 f3 e4 i9 j10 k11 l12 , f2 h1 , g3 h1" } );
        parameters.add( new Object[] { "h2", "a2 b2 c2 d2 e2 f2 g2 h2 , h1 h2 h3 h4 h9 h10 h11 h12 , g1 h2 , h2 g3 f4 e9 i10 j11 k12 , f1 h2 , f3 h2 , g4 h2" } );
        parameters.add( new Object[] { "h3", "a3 b3 c3 d3 e3 f3 g3 h3 , h1 h2 h3 h4 h9 h10 h11 h12 , h3 g4 f9 e10 i11 j12 , f1 g2 h3 , g9 h3 , g1 h3 , f2 h3 , f4 h3" } );
        parameters.add( new Object[] { "h4", "a4 b4 c4 d4 e4 f4 g4 h4 , h1 h2 h3 h4 h9 h10 h11 h12 , h4 g9 f10 e11 i12 , e1 f2 g3 h4 , g2 h4 , f3 h4 , g10 h4 , f9 h4" } );
        parameters.add( new Object[] { "h9", "h9 g9 f9 e9 i9 j9 k9 l9 , h1 h2 h3 h4 h9 h10 h11 h12 , d1 e2 f3 g4 h9 , h9 g10 f11 e12 , g11 h9 , g3 h9 , f4 h9 , f10 h9" } );
        parameters.add( new Object[] { "h10", "h10 g10 f10 e10 i10 j10 k10 l10 , h1 h2 h3 h4 h9 h10 h11 h12 , c1 d2 e3 f4 g9 h10 , h10 g11 f12 , f11 h10 , f9 h10 , g12 h10 , g4 h10" } );
        parameters.add( new Object[] { "h11", "h11 g11 f11 e11 i11 j11 k11 l11 , h1 h2 h3 h4 h9 h10 h11 h12 , b1 c2 d3 e4 f9 g10 h11 , h11 g12 , f12 h11 , f10 h11 , g9 h11" } );
        parameters.add( new Object[] { "h12", "h12 g12 f12 e12 i12 j12 k12 l12 , h1 h2 h3 h4 h9 h10 h11 h12 , l8 k7 j6 i5 e9 f10 g11 h12 , a1 b2 c3 d4 e9 f10 g11 h12 , f11 h12 , g10 h12" } );
               
        parameters.add( new Object[] { "i5", "a5 b5 c5 d5 i5 j5 k5 l5 , i8 i7 i6 i5 i9 i10 i11 i12 , a1 b2 c3 d4 i5 j6 k7 l8 , b8 c7 d6 i5 j9 k10 l11 , l8 k7 j6 i5 e9 f10 g11 h12 , c4 i5 , e10 i5 , d7 i5 , f9 i5 , c6 i5 , i5 j10 , i5 j7 , i5 k9 , i5 k6" } );
        parameters.add( new Object[] { "i6", "a6 b6 c6 d6 i6 j6 k6 l6 , i8 i7 i6 i5 i9 i10 i11 i12 , a2 b3 c4 d5 i6 j7 k8 , c8 d7 i6 j5 k9 l10 , d8 i6 , d4 i6 , c7 i6 , i6 k5 , i6 j8 , i6 j9 , e9 i6 , i6 k7 , c5 i6" } );
        parameters.add( new Object[] { "i7", "a7 b7 c7 d7 i7 j7 k7 l7 , i8 i7 i6 i5 i9 i10 i11 i12 , d8 i7 j6 k5 l9 , a3 b4 c5 d6 i7 j8 , d5 i7 , c6 i7 , c8 i7 , i7 k6 , i7 j5 , i7 k8" } );
        parameters.add( new Object[] { "i8", "a8 b8 c8 d8 i8 j8 k8 l8 , i8 i7 i6 i5 i9 i10 i11 i12 , a4 b5 c6 d7 i8 , i8 j7 k6 l5 , d6 i8 , c7 i8 , i8 k7 , i8 j6" } );
        parameters.add( new Object[] { "i9", "h9 g9 f9 e9 i9 j9 k9 l9 , i8 i7 i6 i5 i9 i10 i11 i12 , h1 g2 f3 e4 i9 j10 k11 l12 , a8 b7 c6 d5 i9 j10 k11 l12 , l7 k6 j5 i9 e10 f11 g12 , e11 i9 , i9 k5 , c5 i9 , f4 i9 , i9 j11 , i9 k10 , d6 i9 , f10 i9 , i9 j6" } );
        parameters.add( new Object[] { "i10", "h10 g10 f10 e10 i10 j10 k10 l10 , i8 i7 i6 i5 i9 i10 i11 i12 , h2 g3 f4 e9 i10 j11 k12 , l6 k5 j9 i10 e11 f12 , f11 i10 , f9 i10 , i10 j5 , e4 i10 , i10 k9 , e12 i10 , i10 j12 , i10 k11" } );
        parameters.add( new Object[] { "i11", "h11 g11 f11 e11 i11 j11 k11 l11 , i8 i7 i6 i5 i9 i10 i11 i12 , h3 g4 f9 e10 i11 j12 , l5 k9 j10 i11 e12 , f12 i11 , f10 i11 , e9 i11 , i11 j9 , i11 k10 , i11 k12" } );
        parameters.add( new Object[] { "i12", "h12 g12 f12 e12 i12 j12 k12 l12 , i8 i7 i6 i5 i9 i10 i11 i12 , l9 k10 j11 i12 , h4 g9 f10 e11 i12 , f11 i12 , i12 k11 , i12 j10 , e10 i12" } );
        
        parameters.add( new Object[] { "j5", "a5 b5 c5 d5 i5 j5 k5 l5 , j8 j7 j6 j5 j9 j10 j11 j12 , c8 d7 i6 j5 k9 l10 , l7 k6 j5 i9 e10 f11 g12 , i10 j5 , d6 j5 , j5 l6 , j5 k7 , j5 l9 , j5 k10 , d4 j5 , i7 j5 , e9 j5" } );
        parameters.add( new Object[] { "j6", "a6 b6 c6 d6 i6 j6 k6 l6 , j8 j7 j6 j5 j9 j10 j11 j12 , d8 i7 j6 k5 l9 , a1 b2 c3 d4 i5 j6 k7 l8 , l8 k7 j6 i5 e9 f10 g11 h12 , d7 j6 , j6 l5 , j6 l7 , j6 k8 , j6 k9 , d5 j6 , i8 j6 , i9 j6" } );
        parameters.add( new Object[] { "j7", "a7 b7 c7 d7 i7 j7 k7 l7 , j8 j7 j6 j5 j9 j10 j11 j12 , i8 j7 k6 l5 , a2 b3 c4 d5 i6 j7 k8 , d6 j7 , d8 j7 , j7 l6 , j7 k5 , i5 j7 , j7 l8" } );
        parameters.add( new Object[] { "j8", "a8 b8 c8 d8 i8 j8 k8 l8 , j8 j7 j6 j5 j9 j10 j11 j12 , j8 k7 l6 , a3 b4 c5 d6 i7 j8 , d7 j8 , j8 l7 , j8 k6 , i6 j8" } );
        parameters.add( new Object[] { "j9", "h9 g9 f9 e9 i9 j9 k9 l9 , j8 j7 j6 j5 j9 j10 j11 j12 , b8 c7 d6 i5 j9 k10 l11 , l6 k5 j9 i10 e11 f12 , e10 j9 , e4 j9 , j9 k6 , j9 k11 , j9 l10 , d5 j9 , j9 l5 , i11 j9 , i6 j9" } );
        parameters.add( new Object[] { "j10", "h10 g10 f10 e10 i10 j10 k10 l10 , j8 j7 j6 j5 j9 j10 j11 j12 , h1 g2 f3 e4 i9 j10 k11 l12 , a8 b7 c6 d5 i9 j10 k11 l12 , l5 k9 j10 i11 e12 , j10 k12 , j10 l11 , e9 j10 , i12 j10 , j10 l9 , j10 k5 , e11 j10 , i5 j10" } );
        parameters.add( new Object[] { "j11", "h11 g11 f11 e11 i11 j11 k11 l11 , j8 j7 j6 j5 j9 j10 j11 j12 , l9 k10 j11 i12 , h2 g3 f4 e9 i10 j11 k12 , i9 j11 , j11 k9 , j11 l10 , j11 l12 , e10 j11 , e12 j11" } );
        parameters.add( new Object[] { "j12", "h12 g12 f12 e12 i12 j12 k12 l12 , j8 j7 j6 j5 j9 j10 j11 j12 , l10 k11 j12 , h3 g4 f9 e10 i11 j12 , j12 k10 , j12 l11 , e11 j12 , i10 j12" } );
        
        parameters.add( new Object[] { "k5", "a5 b5 c5 d5 i5 j5 k5 l5 , k8 k7 k6 k5 k9 k10 k11 k12 , d8 i7 j6 k5 l9 , l6 k5 j9 i10 e11 f12 , k5 l7 , j10 k5 , i9 k5 , k5 l10 , i6 k5 , j7 k5" } );
        parameters.add( new Object[] { "k6", "a6 b6 c6 d6 i6 j6 k6 l6 , k8 k7 k6 k5 k9 k10 k11 k12 , i8 j7 k6 l5 , l7 k6 j5 i9 e10 f11 g12 , j9 k6 , j8 k6 , i5 k6 , k6 l8 , k6 l9 , i7 k6" } );
        parameters.add( new Object[] { "k7", "a7 b7 c7 d7 i7 j7 k7 l7 , k8 k7 k6 k5 k9 k10 k11 k12 , a1 b2 c3 d4 i5 j6 k7 l8 , j8 k7 l6 , l8 k7 j6 i5 e9 f10 g11 h12 , k7 l5 , i8 k7 , j5 k7 , i6 k7" } );
        parameters.add( new Object[] { "k8", "a8 b8 c8 d8 i8 j8 k8 l8 , k8 k7 k6 k5 k9 k10 k11 k12 , k8 l7 , a2 b3 c4 d5 i6 j7 k8 , k8 l6 , j6 k8 , i7 k8" } );
        parameters.add( new Object[] { "k9", "h9 g9 f9 e9 i9 j9 k9 l9 , k8 k7 k6 k5 k9 k10 k11 k12 , c8 d7 i6 j5 k9 l10 , l5 k9 j10 i11 e12 , k9 l11 , i10 k9 , k9 l6 , i5 k9 , j6 k9 , j11 k9" } );
        parameters.add( new Object[] { "k10", "h10 g10 f10 e10 i10 j10 k10 l10 , k8 k7 k6 k5 k9 k10 k11 k12 , l9 k10 j11 i12 , b8 c7 d6 i5 j9 k10 l11 , j5 k10 , i9 k10 , j12 k10 , k10 l5 , i11 k10 , k10 l12" } );
        parameters.add( new Object[] { "k11", "h11 g11 f11 e11 i11 j11 k11 l11 , k8 k7 k6 k5 k9 k10 k11 k12 , l10 k11 j12 , a8 b7 c6 d5 i9 j10 k11 l12 , h1 g2 f3 e4 i9 j10 k11 l12 , i12 k11 , j9 k11 , i10 k11 , k11 l9" } );
        parameters.add( new Object[] { "k12", "h12 g12 f12 e12 i12 j12 k12 l12 , k8 k7 k6 k5 k9 k10 k11 k12 , h2 g3 f4 e9 i10 j11 k12 , l11 k12 , k12 l10 , j10 k12 , i11 k12" } );
        
        parameters.add( new Object[] { "l5", "a5 b5 c5 d5 i5 j5 k5 l5 , l8 l7 l6 l5 l9 l10 l11 l12 , l5 k9 j10 i11 e12 , i8 j7 k6 l5 , j9 l5 , k7 l5 , k10 l5 , j6 l5" } );
        parameters.add( new Object[] { "l6", "a6 b6 c6 d6 i6 j6 k6 l6 , l8 l7 l6 l5 l9 l10 l11 l12 , j8 k7 l6 , l6 k5 j9 i10 e11 f12 , k8 l6 , k9 l6 , j7 l6 , j5 l6" } );
        parameters.add( new Object[] { "l7", "a7 b7 c7 d7 i7 j7 k7 l7 , l8 l7 l6 l5 l9 l10 l11 l12 , k8 l7 , l7 k6 j5 i9 e10 f11 g12 , k5 l7 , j8 l7 , j6 l7" } );
        parameters.add( new Object[] { "l8", "a8 b8 c8 d8 i8 j8 k8 l8 , l8 l7 l6 l5 l9 l10 l11 l12 , a1 b2 c3 d4 i5 j6 k7 l8 , l8 k7 j6 i5 e9 f10 g11 h12 , k6 l8 , j7 l8" } );
        parameters.add( new Object[] { "l9", "h9 g9 f9 e9 i9 j9 k9 l9 , l8 l7 l6 l5 l9 l10 l11 l12 , d8 i7 j6 k5 l9 , l9 k10 j11 i12 , j10 l9 , k6 l9 , k11 l9 , j5 l9" } );
        parameters.add( new Object[] { "l10", "h10 g10 f10 e10 i10 j10 k10 l10 , l8 l7 l6 l5 l9 l10 l11 l12 , c8 d7 i6 j5 k9 l10 , l10 k11 j12 , j11 l10 , k12 l10 , k5 l10 , j9 l10" } );
        parameters.add( new Object[] { "l11", "h11 g11 f11 e11 i11 j11 k11 l11 , l8 l7 l6 l5 l9 l10 l11 l12 , l11 k12 , b8 c7 d6 i5 j9 k10 l11 , j12 l11 , j10 l11 , k9 l11" } );
        parameters.add( new Object[] { "l12", "h12 g12 f12 e12 i12 j12 k12 l12 , l8 l7 l6 l5 l9 l10 l11 l12 , h1 g2 f3 e4 i9 j10 k11 l12 , a8 b7 c6 d5 i9 j10 k11 l12 , j11 l12 , k10 l12" } );

        return( parameters );
    }
}

