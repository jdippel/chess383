/*
 *  DiscreteLineBundle_GetLineBundles_AdjacentByPointWhiteBlack_ThreeDimensionalBoard.java
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

package chess383.graph.basics.coordinate;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.graph.basics.coordinate.board.ThreeDimensionalBoard;
import chess383.graph.color.DirectedByColorEnum;

/**
 * <p>
 * The class DiscreteLineBundle_GetLineBundles_AdjacentByPointWhiteBlack_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetLineBundles_AdjacentByPointWhiteBlack_ThreeDimensionalBoard 
extends DiscreteLineBundle_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        ThreeDimensionalBoard.defineBoard( );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK );
    }
    
    /**
     * the public method DiscreteLine getLineBundles( ) is tested.
     */
    public DiscreteLineBundle_GetLineBundles_AdjacentByPointWhiteBlack_ThreeDimensionalBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "z0", "directed from white to black: z0 a1 b2 c3 d4 e5" } );
        parameters.add( new Object[] { "z1", "directed from white to black: z1 a2 b3 c4 d5 e6 , directed from white to black: a0 z1" } );
        parameters.add( new Object[] { "z2", "directed from white to black: z2 a3 b4 c5 d6 e7 , directed from white to black: a1 z2" } );
        parameters.add( new Object[] { "z3", "directed from white to black: z3 a4 b5 c6 d7 e8 , directed from white to black: b1 a2 z3" } );
        parameters.add( new Object[] { "z4", "directed from white to black: z4 a5 b6 c7 d8 e9 , directed from white to black: d0 c1 b2 a3 z4" } );
        parameters.add( new Object[] { "z5", "directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "z6", "directed from white to black: e1 d2 c3 b4 a5 z6 , directed from white to black: z6 a7 b8" } );
        parameters.add( new Object[] { "z7", "directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: z7 a8" } );
        parameters.add( new Object[] { "z8", "directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z8 a9" } );
        parameters.add( new Object[] { "z9", "directed from white to black: e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "a0", "directed from white to black: a0 b1 c2 d3 e4 , directed from white to black: a0 z1" } );        
        parameters.add( new Object[] { "a1", "directed from white to black: z0 a1 b2 c3 d4 e5 , directed from white to black: a1 z2" } );
        parameters.add( new Object[] { "a2", "directed from white to black: z1 a2 b3 c4 d5 e6 , directed from white to black: b1 a2 z3" } );
        parameters.add( new Object[] { "a3", "directed from white to black: d0 c1 b2 a3 z4 , directed from white to black: z2 a3 b4 c5 d6 e7" } );
        parameters.add( new Object[] { "a4", "directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: z3 a4 b5 c6 d7 e8" } );
        parameters.add( new Object[] { "a5", "directed from white to black: e1 d2 c3 b4 a5 z6 , directed from white to black: z4 a5 b6 c7 d8 e9" } );
        parameters.add( new Object[] { "a6", "directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "a7", "directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z6 a7 b8" } );
        parameters.add( new Object[] { "a8", "directed from white to black: z7 a8 , directed from white to black: e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "a9", "directed from white to black: e5 d6 c7 b8 a9 , directed from white to black: z8 a9" } );
        parameters.add( new Object[] { "b1", "directed from white to black: b1 a2 z3 , directed from white to black: a0 b1 c2 d3 e4" } );
        parameters.add( new Object[] { "b2", "directed from white to black: d0 c1 b2 a3 z4 , directed from white to black: z0 a1 b2 c3 d4 e5" } );
        parameters.add( new Object[] { "b3", "directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "b4", "directed from white to black: z2 a3 b4 c5 d6 e7 , directed from white to black: e1 d2 c3 b4 a5 z6" } );
        parameters.add( new Object[] { "b5", "directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: z3 a4 b5 c6 d7 e8" } );
        parameters.add( new Object[] { "b6", "directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z4 a5 b6 c7 d8 e9" } );
        parameters.add( new Object[] { "b7", "directed from white to black: e4 d5 c6 b7 a8 z9 , directed from white to black: z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "b8", "directed from white to black: e5 d6 c7 b8 a9 , directed from white to black: z6 a7 b8" } );
        parameters.add( new Object[] { "c1", "directed from white to black: d0 c1 b2 a3 z4 , directed from white to black: c1 d2 e3" } );
        parameters.add( new Object[] { "c2", "directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: a0 b1 c2 d3 e4" } );
        parameters.add( new Object[] { "c3", "directed from white to black: z0 a1 b2 c3 d4 e5 , directed from white to black: e1 d2 c3 b4 a5 z6" } );
        parameters.add( new Object[] { "c4", "directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "c5", "directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z2 a3 b4 c5 d6 e7" } );
        parameters.add( new Object[] { "c6", "directed from white to black: z3 a4 b5 c6 d7 e8 , directed from white to black: e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "c7", "directed from white to black: z4 a5 b6 c7 d8 e9 , directed from white to black: e5 d6 c7 b8 a9" } );
        parameters.add( new Object[] { "c8", "directed from white to black: e6 d7 c8 , directed from white to black: z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "d0", "directed from white to black: d0 c1 b2 a3 z4 , directed from white to black: d0 e1" } );
        parameters.add( new Object[] { "d1", "directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: d1 e2" } );
        parameters.add( new Object[] { "d2", "directed from white to black: c1 d2 e3 , directed from white to black: e1 d2 c3 b4 a5 z6" } );
        parameters.add( new Object[] { "d3", "directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: a0 b1 c2 d3 e4" } );
        parameters.add( new Object[] { "d4", "directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z0 a1 b2 c3 d4 e5" } );
        parameters.add( new Object[] { "d5", "directed from white to black: e4 d5 c6 b7 a8 z9 , directed from white to black: z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "d6", "directed from white to black: e5 d6 c7 b8 a9 , directed from white to black: z2 a3 b4 c5 d6 e7" } );
        parameters.add( new Object[] { "d7", "directed from white to black: e6 d7 c8 , directed from white to black: z3 a4 b5 c6 d7 e8" } );
        parameters.add( new Object[] { "d8", "directed from white to black: z4 a5 b6 c7 d8 e9 , directed from white to black: e7 d8" } );
        parameters.add( new Object[] { "d9", "directed from white to black: e8 d9 , directed from white to black: z5 a6 b7 c8 d9" } );
        parameters.add( new Object[] { "e0", "directed from white to black: e0 d1 c2 b3 a4 z5" } );
        parameters.add( new Object[] { "e1", "directed from white to black: d0 e1 , directed from white to black: e1 d2 c3 b4 a5 z6" } );
        parameters.add( new Object[] { "e2", "directed from white to black: d1 e2 , directed from white to black: e2 d3 c4 b5 a6 z7" } );
        parameters.add( new Object[] { "e3", "directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: c1 d2 e3" } );
        parameters.add( new Object[] { "e4", "directed from white to black: a0 b1 c2 d3 e4 , directed from white to black: e4 d5 c6 b7 a8 z9" } );
        parameters.add( new Object[] { "e5", "directed from white to black: e5 d6 c7 b8 a9 , directed from white to black: z0 a1 b2 c3 d4 e5" } );
        parameters.add( new Object[] { "e6", "directed from white to black: e6 d7 c8 , directed from white to black: z1 a2 b3 c4 d5 e6" } );
        parameters.add( new Object[] { "e7", "directed from white to black: e7 d8 , directed from white to black: z2 a3 b4 c5 d6 e7" } );
        parameters.add( new Object[] { "e8", "directed from white to black: e8 d9 , directed from white to black: z3 a4 b5 c6 d7 e8" } );
        parameters.add( new Object[] { "e9", "directed from white to black: z4 a5 b6 c7 d8 e9" } );
        
        return( parameters );
    }
}

