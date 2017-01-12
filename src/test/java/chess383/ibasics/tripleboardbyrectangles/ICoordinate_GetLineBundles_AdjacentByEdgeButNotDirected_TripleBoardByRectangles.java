/*
 *  ICoordinate_GetLineBundles_AdjacentByEdgeButNotDirected_TripleBoardByRectangles.java
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
 * The class ICoordinate_GetLineBundles_AdjacentByEdgeButNotDirected_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByEdgeButNotDirected_TripleBoardByRectangles extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass 
    public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_TripleBoardByRectangles( ) );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED );
    }
 
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByEdgeButNotDirected_TripleBoardByRectangles( String square, String expected ) {

        super( square, expected );
    }
 
    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "a2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "a3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "a4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "a5", "a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "a6", "a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "a7", "a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "a8", "a8 b8 c8 d8 i8 j8 k8 l8" } );
        
        parameters.add( new Object[] { "b1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "b2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "b3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "b4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "b5", "a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "b6", "a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "b7", "a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "b8", "a8 b8 c8 d8 i8 j8 k8 l8" } );
        
        parameters.add( new Object[] { "c1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "c2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "c3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "c4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "c5", "a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "c6", "a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "c7", "a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "c8", "a8 b8 c8 d8 i8 j8 k8 l8" } );
        
        parameters.add( new Object[] { "d1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "d2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "d3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "d4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "d5", "a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "d6", "a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "d7", "a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "d8", "a8 b8 c8 d8 i8 j8 k8 l8" } );
        
        parameters.add( new Object[] { "e1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "e2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "e3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "e4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "e9", "h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "e10", "h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "e11", "h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "e12", "h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "f1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "f2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "f3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "f4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "f9", "h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "f10", "h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "f11", "h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "f12", "h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "g1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "g2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "g3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "g4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "g9", "h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "g10", "h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "g11", "h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "g12", "h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "h1", "a1 b1 c1 d1 e1 f1 g1 h1" } );
        parameters.add( new Object[] { "h2", "a2 b2 c2 d2 e2 f2 g2 h2" } );
        parameters.add( new Object[] { "h3", "a3 b3 c3 d3 e3 f3 g3 h3" } );
        parameters.add( new Object[] { "h4", "a4 b4 c4 d4 e4 f4 g4 h4" } );
        parameters.add( new Object[] { "h9", "h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "h10", "h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "h11", "h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "h12", "h12 g12 f12 e12 i12 j12 k12 l12" } );
               
        parameters.add( new Object[] { "i5", "a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "i6", "a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "i7", "a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "i8", "a8 b8 c8 d8 i8 j8 k8 l8" } );
        parameters.add( new Object[] { "i9", "h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "i10", "h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "i11", "h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "i12", "h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "j5", "a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "j6", "a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "j7", "a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "j8", "a8 b8 c8 d8 i8 j8 k8 l8" } );
        parameters.add( new Object[] { "j9", "h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "j10", "h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "j11", "h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "j12", "h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "k5", "a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "k6", "a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "k7", "a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "k8", "a8 b8 c8 d8 i8 j8 k8 l8" } );
        parameters.add( new Object[] { "k9", "h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "k10", "h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "k11", "h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "k12", "h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        parameters.add( new Object[] { "l5", "a5 b5 c5 d5 i5 j5 k5 l5" } );
        parameters.add( new Object[] { "l6", "a6 b6 c6 d6 i6 j6 k6 l6" } );
        parameters.add( new Object[] { "l7", "a7 b7 c7 d7 i7 j7 k7 l7" } );
        parameters.add( new Object[] { "l8", "a8 b8 c8 d8 i8 j8 k8 l8" } );
        parameters.add( new Object[] { "l9", "h9 g9 f9 e9 i9 j9 k9 l9" } );
        parameters.add( new Object[] { "l10", "h10 g10 f10 e10 i10 j10 k10 l10" } );
        parameters.add( new Object[] { "l11", "h11 g11 f11 e11 i11 j11 k11 l11" } );
        parameters.add( new Object[] { "l12", "h12 g12 f12 e12 i12 j12 k12 l12" } );
        
        return( parameters );
    }
}

