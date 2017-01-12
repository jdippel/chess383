/*
 *  ICoordinate_GetLineBundles_AdjacentByEdgeBlackRed_TripleBoardByRectangles.java
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
 * The class ICoordinate_GetLineBundles_AdjacentByEdgeBlackRed_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByEdgeBlackRed_TripleBoardByRectangles extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass 
    public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_TripleBoardByRectangles( ) );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_BLACK_RED );
    }
 
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByEdgeBlackRed_TripleBoardByRectangles( String square, String expected ) {

        super( square, expected );
    }
 
    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "" } );
        parameters.add( new Object[] { "a2", "" } );
        parameters.add( new Object[] { "a3", "" } );
        parameters.add( new Object[] { "a4", "" } );
        parameters.add( new Object[] { "a5", "" } );
        parameters.add( new Object[] { "a6", "" } );
        parameters.add( new Object[] { "a7", "" } );
        parameters.add( new Object[] { "a8", "" } );
        
        parameters.add( new Object[] { "b1", "" } );
        parameters.add( new Object[] { "b2", "" } );
        parameters.add( new Object[] { "b3", "" } );
        parameters.add( new Object[] { "b4", "" } );
        parameters.add( new Object[] { "b5", "" } );
        parameters.add( new Object[] { "b6", "" } );
        parameters.add( new Object[] { "b7", "" } );
        parameters.add( new Object[] { "b8", "" } );
        
        parameters.add( new Object[] { "c1", "" } );
        parameters.add( new Object[] { "c2", "" } );
        parameters.add( new Object[] { "c3", "" } );
        parameters.add( new Object[] { "c4", "" } );
        parameters.add( new Object[] { "c5", "" } );
        parameters.add( new Object[] { "c6", "" } );
        parameters.add( new Object[] { "c7", "" } );
        parameters.add( new Object[] { "c8", "" } );
        
        parameters.add( new Object[] { "d1", "" } );
        parameters.add( new Object[] { "d2", "" } );
        parameters.add( new Object[] { "d3", "" } );
        parameters.add( new Object[] { "d4", "" } );
        parameters.add( new Object[] { "d5", "" } );
        parameters.add( new Object[] { "d6", "" } );
        parameters.add( new Object[] { "d7", "" } );
        parameters.add( new Object[] { "d8", "" } );     
        
        parameters.add( new Object[] { "e1", "" } );
        parameters.add( new Object[] { "e2", "" } );
        parameters.add( new Object[] { "e3", "" } );
        parameters.add( new Object[] { "e4", "" } );
        parameters.add( new Object[] { "e9", "" } );
        parameters.add( new Object[] { "e10", "" } );
        parameters.add( new Object[] { "e11", "" } );
        parameters.add( new Object[] { "e12", "" } );
        
        parameters.add( new Object[] { "f1", "" } );
        parameters.add( new Object[] { "f2", "" } );
        parameters.add( new Object[] { "f3", "" } );
        parameters.add( new Object[] { "f4", "" } );
        parameters.add( new Object[] { "f9", "" } );
        parameters.add( new Object[] { "f10", "" } );
        parameters.add( new Object[] { "f11", "" } );
        parameters.add( new Object[] { "f12", "" } );
        
        parameters.add( new Object[] { "g1", "" } );
        parameters.add( new Object[] { "g2", "" } );
        parameters.add( new Object[] { "g3", "" } );
        parameters.add( new Object[] { "g4", "" } );
        parameters.add( new Object[] { "g9", "" } );
        parameters.add( new Object[] { "g10", "" } );
        parameters.add( new Object[] { "g11", "" } );
        parameters.add( new Object[] { "g12", "" } );
        
        parameters.add( new Object[] { "h1", "" } );
        parameters.add( new Object[] { "h2", "" } );
        parameters.add( new Object[] { "h3", "" } );
        parameters.add( new Object[] { "h4", "" } );
        parameters.add( new Object[] { "h9", "" } );
        parameters.add( new Object[] { "h10", "" } );
        parameters.add( new Object[] { "h11", "" } );
        parameters.add( new Object[] { "h12", "" } );
        
        parameters.add( new Object[] { "i5", "i8 i7 i6 i5 i9 i10 i11 i12" } );
        parameters.add( new Object[] { "i6", "i8 i7 i6 i5 i9 i10 i11 i12" } );
        parameters.add( new Object[] { "i7", "i8 i7 i6 i5 i9 i10 i11 i12" } );
        parameters.add( new Object[] { "i8", "i8 i7 i6 i5 i9 i10 i11 i12" } );
        parameters.add( new Object[] { "i9", "i8 i7 i6 i5 i9 i10 i11 i12" } );
        parameters.add( new Object[] { "i10", "i8 i7 i6 i5 i9 i10 i11 i12" } );
        parameters.add( new Object[] { "i11", "i8 i7 i6 i5 i9 i10 i11 i12" } );
        parameters.add( new Object[] { "i12", "i8 i7 i6 i5 i9 i10 i11 i12" } );
        
        parameters.add( new Object[] { "j5", "j8 j7 j6 j5 j9 j10 j11 j12" } );
        parameters.add( new Object[] { "j6", "j8 j7 j6 j5 j9 j10 j11 j12" } );
        parameters.add( new Object[] { "j7", "j8 j7 j6 j5 j9 j10 j11 j12" } );
        parameters.add( new Object[] { "j8", "j8 j7 j6 j5 j9 j10 j11 j12" } );
        parameters.add( new Object[] { "j9", "j8 j7 j6 j5 j9 j10 j11 j12" } );
        parameters.add( new Object[] { "j10", "j8 j7 j6 j5 j9 j10 j11 j12" } );
        parameters.add( new Object[] { "j11", "j8 j7 j6 j5 j9 j10 j11 j12" } );
        parameters.add( new Object[] { "j12", "j8 j7 j6 j5 j9 j10 j11 j12" } );
        
        parameters.add( new Object[] { "k5", "k8 k7 k6 k5 k9 k10 k11 k12" } );
        parameters.add( new Object[] { "k6", "k8 k7 k6 k5 k9 k10 k11 k12" } );
        parameters.add( new Object[] { "k7", "k8 k7 k6 k5 k9 k10 k11 k12" } );
        parameters.add( new Object[] { "k8", "k8 k7 k6 k5 k9 k10 k11 k12" } );
        parameters.add( new Object[] { "k9", "k8 k7 k6 k5 k9 k10 k11 k12" } );
        parameters.add( new Object[] { "k10", "k8 k7 k6 k5 k9 k10 k11 k12" } );
        parameters.add( new Object[] { "k11", "k8 k7 k6 k5 k9 k10 k11 k12" } );
        parameters.add( new Object[] { "k12", "k8 k7 k6 k5 k9 k10 k11 k12" } );
        
        parameters.add( new Object[] { "l5", "l8 l7 l6 l5 l9 l10 l11 l12" } );
        parameters.add( new Object[] { "l6", "l8 l7 l6 l5 l9 l10 l11 l12" } );
        parameters.add( new Object[] { "l7", "l8 l7 l6 l5 l9 l10 l11 l12" } );
        parameters.add( new Object[] { "l8", "l8 l7 l6 l5 l9 l10 l11 l12" } );
        parameters.add( new Object[] { "l9", "l8 l7 l6 l5 l9 l10 l11 l12" } );
        parameters.add( new Object[] { "l10", "l8 l7 l6 l5 l9 l10 l11 l12" } );
        parameters.add( new Object[] { "l11", "l8 l7 l6 l5 l9 l10 l11 l12" } );
        parameters.add( new Object[] { "l12", "l8 l7 l6 l5 l9 l10 l11 l12" } );
        
        return( parameters );
    }
}

