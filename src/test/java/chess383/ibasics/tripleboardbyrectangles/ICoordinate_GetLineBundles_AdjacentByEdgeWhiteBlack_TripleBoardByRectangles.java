/*
 *  ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_TripleBoardByRectangles.java
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
 * The class ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_TripleBoardByRectangles extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass 
    public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_TripleBoardByRectangles( ) );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK );
    }
 
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByEdgeWhiteBlack_TripleBoardByRectangles( String square, String expected ) {

        super( square, expected );
    }
 
    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a2", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a3", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a4", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a5", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a6", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a7", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        parameters.add( new Object[] { "a8", "a1 a2 a3 a4 a5 a6 a7 a8" } );
        
        parameters.add( new Object[] { "b1", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b2", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b3", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b4", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b5", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b6", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b7", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        parameters.add( new Object[] { "b8", "b1 b2 b3 b4 b5 b6 b7 b8" } );
        
        parameters.add( new Object[] { "c1", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c2", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c3", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c4", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c5", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c6", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c7", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        parameters.add( new Object[] { "c8", "c1 c2 c3 c4 c5 c6 c7 c8" } );
        
        parameters.add( new Object[] { "d1", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d2", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d3", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d4", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d5", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d6", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d7", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        parameters.add( new Object[] { "d8", "d1 d2 d3 d4 d5 d6 d7 d8" } );
        
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
               
        parameters.add( new Object[] { "i5", "" } );
        parameters.add( new Object[] { "i6", "" } );
        parameters.add( new Object[] { "i7", "" } );
        parameters.add( new Object[] { "i8", "" } );
        parameters.add( new Object[] { "i9", "" } );
        parameters.add( new Object[] { "i10", "" } );
        parameters.add( new Object[] { "i11", "" } );
        parameters.add( new Object[] { "i12", "" } );
        
        parameters.add( new Object[] { "j5", "" } );
        parameters.add( new Object[] { "j6", "" } );
        parameters.add( new Object[] { "j7", "" } );
        parameters.add( new Object[] { "j8", "" } );
        parameters.add( new Object[] { "j9", "" } );
        parameters.add( new Object[] { "j10", "" } );
        parameters.add( new Object[] { "j11", "" } );
        parameters.add( new Object[] { "j12", "" } );
        
        parameters.add( new Object[] { "k5", "" } );
        parameters.add( new Object[] { "k6", "" } );
        parameters.add( new Object[] { "k7", "" } );
        parameters.add( new Object[] { "k8", "" } );
        parameters.add( new Object[] { "k9", "" } );
        parameters.add( new Object[] { "k10", "" } );
        parameters.add( new Object[] { "k11", "" } );
        parameters.add( new Object[] { "k12", "" } );
        
        parameters.add( new Object[] { "l5", "" } );
        parameters.add( new Object[] { "l6", "" } );
        parameters.add( new Object[] { "l7", "" } );
        parameters.add( new Object[] { "l8", "" } );
        parameters.add( new Object[] { "l9", "" } );
        parameters.add( new Object[] { "l10", "" } );
        parameters.add( new Object[] { "l11", "" } );
        parameters.add( new Object[] { "l12", "" } );
        
        return( parameters );
    }
}

