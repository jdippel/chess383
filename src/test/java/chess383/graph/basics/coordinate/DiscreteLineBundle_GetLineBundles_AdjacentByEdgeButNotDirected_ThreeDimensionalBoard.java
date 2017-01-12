/*
 *  DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_ThreeDimensionalBoard.java
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
 * The class DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_ThreeDimensionalBoard 
extends DiscreteLineBundle_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        ThreeDimensionalBoard.defineBoard( );
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED );
    }
    
    /**
     * the public method DiscreteLine getLineBundles( ) is tested.
     */
    public DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_ThreeDimensionalBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "z0", "not directed: a0 z0" } );
        parameters.add( new Object[] { "z1", "not directed: e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "z2", "not directed: e2 d2 c2 b2 a2 z2" } );
        parameters.add( new Object[] { "z3", "not directed: e3 d3 c3 b3 a3 z3" } );
        parameters.add( new Object[] { "z4", "not directed: e4 d4 c4 b4 a4 z4" } );
        parameters.add( new Object[] { "z5", "not directed: e5 d5 c5 b5 a5 z5" } );
        parameters.add( new Object[] { "z6", "not directed: e6 d6 c6 b6 a6 z6" } );
        parameters.add( new Object[] { "z7", "not directed: e7 d7 c7 b7 a7 z7" } );
        parameters.add( new Object[] { "z8", "not directed: e8 d8 c8 b8 a8 z8" } );
        parameters.add( new Object[] { "z9", "not directed: a9 z9" } );
        parameters.add( new Object[] { "a0", "not directed: a0 z0" } );        
        parameters.add( new Object[] { "a1", "not directed: e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "a2", "not directed: e2 d2 c2 b2 a2 z2" } );
        parameters.add( new Object[] { "a3", "not directed: e3 d3 c3 b3 a3 z3" } );
        parameters.add( new Object[] { "a4", "not directed: e4 d4 c4 b4 a4 z4" } );
        parameters.add( new Object[] { "a5", "not directed: e5 d5 c5 b5 a5 z5" } );
        parameters.add( new Object[] { "a6", "not directed: e6 d6 c6 b6 a6 z6" } );
        parameters.add( new Object[] { "a7", "not directed: e7 d7 c7 b7 a7 z7" } );
        parameters.add( new Object[] { "a8", "not directed: e8 d8 c8 b8 a8 z8" } );
        parameters.add( new Object[] { "a9", "not directed: a9 z9" } );
        parameters.add( new Object[] { "b1", "not directed: e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "b2", "not directed: e2 d2 c2 b2 a2 z2" } );
        parameters.add( new Object[] { "b3", "not directed: e3 d3 c3 b3 a3 z3" } );
        parameters.add( new Object[] { "b4", "not directed: e4 d4 c4 b4 a4 z4" } );
        parameters.add( new Object[] { "b5", "not directed: e5 d5 c5 b5 a5 z5" } );
        parameters.add( new Object[] { "b6", "not directed: e6 d6 c6 b6 a6 z6" } );
        parameters.add( new Object[] { "b7", "not directed: e7 d7 c7 b7 a7 z7" } );
        parameters.add( new Object[] { "b8", "not directed: e8 d8 c8 b8 a8 z8" } );
        parameters.add( new Object[] { "c1", "not directed: e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "c2", "not directed: e2 d2 c2 b2 a2 z2" } );
        parameters.add( new Object[] { "c3", "not directed: e3 d3 c3 b3 a3 z3" } );
        parameters.add( new Object[] { "c4", "not directed: e4 d4 c4 b4 a4 z4" } );
        parameters.add( new Object[] { "c5", "not directed: e5 d5 c5 b5 a5 z5" } );
        parameters.add( new Object[] { "c6", "not directed: e6 d6 c6 b6 a6 z6" } );
        parameters.add( new Object[] { "c7", "not directed: e7 d7 c7 b7 a7 z7" } );
        parameters.add( new Object[] { "c8", "not directed: e8 d8 c8 b8 a8 z8" } );
        parameters.add( new Object[] { "d0", "not directed: d0 e0" } );
        parameters.add( new Object[] { "d1", "not directed: e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "d2", "not directed: e2 d2 c2 b2 a2 z2" } );
        parameters.add( new Object[] { "d3", "not directed: e3 d3 c3 b3 a3 z3" } );
        parameters.add( new Object[] { "d4", "not directed: e4 d4 c4 b4 a4 z4" } );
        parameters.add( new Object[] { "d5", "not directed: e5 d5 c5 b5 a5 z5" } );
        parameters.add( new Object[] { "d6", "not directed: e6 d6 c6 b6 a6 z6" } );
        parameters.add( new Object[] { "d7", "not directed: e7 d7 c7 b7 a7 z7" } );
        parameters.add( new Object[] { "d8", "not directed: e8 d8 c8 b8 a8 z8" } );
        parameters.add( new Object[] { "d9", "not directed: d9 e9" } );
        parameters.add( new Object[] { "e0", "not directed: d0 e0" } );
        parameters.add( new Object[] { "e1", "not directed: e1 d1 c1 b1 a1 z1" } );
        parameters.add( new Object[] { "e2", "not directed: e2 d2 c2 b2 a2 z2" } );
        parameters.add( new Object[] { "e3", "not directed: e3 d3 c3 b3 a3 z3" } );
        parameters.add( new Object[] { "e4", "not directed: e4 d4 c4 b4 a4 z4" } );
        parameters.add( new Object[] { "e5", "not directed: e5 d5 c5 b5 a5 z5" } );
        parameters.add( new Object[] { "e6", "not directed: e6 d6 c6 b6 a6 z6" } );
        parameters.add( new Object[] { "e7", "not directed: e7 d7 c7 b7 a7 z7" } );
        parameters.add( new Object[] { "e8", "not directed: e8 d8 c8 b8 a8 z8" } );
        parameters.add( new Object[] { "e9", "not directed: d9 e9" } );
        
        return( parameters );
    }
}

