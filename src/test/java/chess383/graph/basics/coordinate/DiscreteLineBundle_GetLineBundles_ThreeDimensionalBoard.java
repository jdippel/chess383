/*
 *  DiscreteLineBundle_GetLineBundles_ThreeDimensionalBoard.java
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

/**
 * <p>
 * The class DiscreteLineBundle_GetLineBundles_ThreeDimensionalBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetLineBundles_ThreeDimensionalBoard extends DiscreteLineBundle_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        ThreeDimensionalBoard.defineBoard( ); 
        setOrientation( null );
    }
    
    /**
     * the public method DiscreteLine getLineBundles( ) is tested.
     */
    public DiscreteLineBundle_GetLineBundles_ThreeDimensionalBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "z0", "not directed: a0 z0 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: z0 a1 b2 c3 d4 e5 , not directed: d8 c6 b4 a2 z0 , not directed: d2 b1 z0" } );
        parameters.add( new Object[] { "z1", "not directed: e1 d1 c1 b1 a1 z1 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: z1 a2 b3 c4 d5 e6 , directed from white to black: a0 z1 , not directed: d9 c7 b5 a3 z1 , not directed: d3 b2 z1" } );
        parameters.add( new Object[] { "z2", "not directed: e2 d2 c2 b2 a2 z2 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: z2 a3 b4 c5 d6 e7 , directed from white to black: a1 z2 , not directed: c8 b6 a4 z2 , not directed: d4 b3 z2 , not directed: d0 b1 z2 , not directed: a0 z2" } );
        parameters.add( new Object[] { "z3", "not directed: e3 d3 c3 b3 a3 z3 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: z3 a4 b5 c6 d7 e8 , directed from white to black: b1 a2 z3 , not directed: a1 z3 , not directed: d1 b2 z3 , not directed: d5 b4 z3 , not directed: b7 a5 z3" } );
        parameters.add( new Object[] { "z4", "not directed: e4 d4 c4 b4 a4 z4 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: z4 a5 b6 c7 d8 e9 , directed from white to black: d0 c1 b2 a3 z4 , not directed: a2 z4 , not directed: d2 b3 z4 , not directed: d6 b5 z4 , not directed: b8 a6 z4" } );
        parameters.add( new Object[] { "z5", "not directed: e5 d5 c5 b5 a5 z5 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: z5 a6 b7 c8 d9 , not directed: a7 z5 , not directed: b1 a3 z5 , not directed: d3 b4 z5 , not directed: d7 b6 z5" } );
        parameters.add( new Object[] { "z6", "not directed: e6 d6 c6 b6 a6 z6 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: e1 d2 c3 b4 a5 z6 , directed from white to black: z6 a7 b8 , not directed: a8 z6 , not directed: d8 b7 z6 , not directed: b2 a4 z6 , not directed: d4 b5 z6" } );
        parameters.add( new Object[] { "z7", "not directed: e7 d7 c7 b7 a7 z7 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: z7 a8 , not directed: a9 z7 , not directed: c1 b3 a5 z7 , not directed: d5 b6 z7 , not directed: d9 b8 z7" } );
        parameters.add( new Object[] { "z8", "not directed: e8 d8 c8 b8 a8 z8 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z8 a9 , not directed: d0 c2 b4 a6 z8 , not directed: d6 b7 z8" } );
        parameters.add( new Object[] { "z9", "not directed: a9 z9 , directed from white to black: z0 z1 z2 z3 z4 z5 z6 z7 z8 z9 , directed from white to black: e4 d5 c6 b7 a8 z9 , not directed: d1 c3 b5 a7 z9 , not directed: d7 b8 z9" } );
        parameters.add( new Object[] { "a0", "not directed: a0 z0 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: a0 b1 c2 d3 e4 , directed from white to black: a0 z1 , not directed: a0 c1 e2 , not directed: a0 z2 , not directed: a0 b2 c4 d6 e8" } );        
        parameters.add( new Object[] { "a1", "not directed: e1 d1 c1 b1 a1 z1 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: z0 a1 b2 c3 d4 e5 , directed from white to black: a1 z2 , not directed: a1 c2 e3 , not directed: a1 z3 , not directed: a1 b3 c5 d7 e9" } );
        parameters.add( new Object[] { "a2", "not directed: e2 d2 c2 b2 a2 z2 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: z1 a2 b3 c4 d5 e6 , directed from white to black: b1 a2 z3 , not directed: a2 c1 e0 , not directed: a2 c3 e4 , not directed: a2 z4 , not directed: d8 c6 b4 a2 z0" } );
        parameters.add( new Object[] { "a3", "not directed: e3 d3 c3 b3 a3 z3 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: d0 c1 b2 a3 z4 , directed from white to black: z2 a3 b4 c5 d6 e7 , not directed: a3 c4 e5 , not directed: b1 a3 z5 , not directed: a3 c2 e1 , not directed: d9 c7 b5 a3 z1" } );
        parameters.add( new Object[] { "a4", "not directed: e4 d4 c4 b4 a4 z4 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: z3 a4 b5 c6 d7 e8 , not directed: c8 b6 a4 z2 , not directed: b2 a4 z6 , not directed: a4 c5 e6 , not directed: a4 c3 e2" } );
        parameters.add( new Object[] { "a5", "not directed: e5 d5 c5 b5 a5 z5 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: e1 d2 c3 b4 a5 z6 , directed from white to black: z4 a5 b6 c7 d8 e9 , not directed: a5 c4 e3 , not directed: a5 c6 e7 , not directed: c1 b3 a5 z7 , not directed: b7 a5 z3" } );
        parameters.add( new Object[] { "a6", "not directed: e6 d6 c6 b6 a6 z6 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: z5 a6 b7 c8 d9 , not directed: d0 c2 b4 a6 z8 , not directed: b8 a6 z4 , not directed: a6 c7 e8 , not directed: a6 c5 e4" } );
        parameters.add( new Object[] { "a7", "not directed: e7 d7 c7 b7 a7 z7 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z6 a7 b8 , not directed: a7 z5 , not directed: d1 c3 b5 a7 z9 , not directed: a7 c6 e5 , not directed: a7 c8 e9" } );
        parameters.add( new Object[] { "a8", "not directed: e8 d8 c8 b8 a8 z8 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: z7 a8 , directed from white to black: e4 d5 c6 b7 a8 z9 , not directed: a8 b6 c4 d2 e0 , not directed: a8 z6 , not directed: a8 c7 e6" } );
        parameters.add( new Object[] { "a9", "not directed: a9 z9 , directed from white to black: a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 , directed from white to black: e5 d6 c7 b8 a9 , directed from white to black: z8 a9 , not directed: a9 z7 , not directed: a9 b7 c5 d3 e1 , not directed: a9 c8 e7" } );
        parameters.add( new Object[] { "b1", "not directed: e1 d1 c1 b1 a1 z1 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: b1 a2 z3 , directed from white to black: a0 b1 c2 d3 e4 , not directed: d0 b1 z2 , not directed: b1 a3 z5 , not directed: b1 c3 d5 e7 , not directed: d2 b1 z0" } );
        parameters.add( new Object[] { "b2", "not directed: e2 d2 c2 b2 a2 z2 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: d0 c1 b2 a3 z4 , directed from white to black: z0 a1 b2 c3 d4 e5 , not directed: d3 b2 z1 , not directed: d1 b2 z3 , not directed: b2 a4 z6 , not directed: a0 b2 c4 d6 e8" } );
        parameters.add( new Object[] { "b3", "not directed: e3 d3 c3 b3 a3 z3 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: z1 a2 b3 c4 d5 e6 , not directed: c1 b3 a5 z7 , not directed: d4 b3 z2 , not directed: d2 b3 z4 , not directed: a1 b3 c5 d7 e9" } );
        parameters.add( new Object[] { "b4", "not directed: e4 d4 c4 b4 a4 z4 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: z2 a3 b4 c5 d6 e7 , directed from white to black: e1 d2 c3 b4 a5 z6 , not directed: d0 c2 b4 a6 z8 , not directed: d5 b4 z3 , not directed: d3 b4 z5 , not directed: d8 c6 b4 a2 z0" } );
        parameters.add( new Object[] { "b5", "not directed: e5 d5 c5 b5 a5 z5 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: z3 a4 b5 c6 d7 e8 , not directed: d1 c3 b5 a7 z9 , not directed: d9 c7 b5 a3 z1 , not directed: d6 b5 z4 , not directed: d4 b5 z6" } );
        parameters.add( new Object[] { "b6", "not directed: e6 d6 c6 b6 a6 z6 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z4 a5 b6 c7 d8 e9 , not directed: a8 b6 c4 d2 e0 , not directed: c8 b6 a4 z2 , not directed: d5 b6 z7 , not directed: d7 b6 z5" } );
        parameters.add( new Object[] { "b7", "not directed: e7 d7 c7 b7 a7 z7 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: e4 d5 c6 b7 a8 z9 , directed from white to black: z5 a6 b7 c8 d9 , not directed: a9 b7 c5 d3 e1 , not directed: d8 b7 z6 , not directed: b7 a5 z3 , not directed: d6 b7 z8" } );
        parameters.add( new Object[] { "b8", "not directed: e8 d8 c8 b8 a8 z8 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: e5 d6 c7 b8 a9 , directed from white to black: z6 a7 b8 , not directed: b8 a6 z4 , not directed: d7 b8 z9 , not directed: d9 b8 z7 , not directed: b8 c6 d4 e2" } );
        parameters.add( new Object[] { "c1", "not directed: e1 d1 c1 b1 a1 z1 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: d0 c1 b2 a3 z4 , directed from white to black: c1 d2 e3 , not directed: a2 c1 e0 , not directed: a0 c1 e2 , not directed: c1 b3 a5 z7 , not directed: c1 d3 e5" } );
        parameters.add( new Object[] { "c2", "not directed: e2 d2 c2 b2 a2 z2 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: a0 b1 c2 d3 e4 , not directed: d0 c2 b4 a6 z8 , not directed: c2 d4 e6 , not directed: a3 c2 e1 , not directed: a1 c2 e3" } );
        parameters.add( new Object[] { "c3", "not directed: e3 d3 c3 b3 a3 z3 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: z0 a1 b2 c3 d4 e5 , directed from white to black: e1 d2 c3 b4 a5 z6 , not directed: a4 c3 e2 , not directed: d1 c3 b5 a7 z9 , not directed: a2 c3 e4 , not directed: b1 c3 d5 e7" } );
        parameters.add( new Object[] { "c4", "not directed: e4 d4 c4 b4 a4 z4 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: z1 a2 b3 c4 d5 e6 , not directed: a8 b6 c4 d2 e0 , not directed: a5 c4 e3 , not directed: a3 c4 e5 , not directed: a0 b2 c4 d6 e8" } );
        parameters.add( new Object[] { "c5", "not directed: e5 d5 c5 b5 a5 z5 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z2 a3 b4 c5 d6 e7 , not directed: a9 b7 c5 d3 e1 , not directed: a4 c5 e6 , not directed: a1 b3 c5 d7 e9 , not directed: a6 c5 e4" } );
        parameters.add( new Object[] { "c6", "not directed: e6 d6 c6 b6 a6 z6 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: z3 a4 b5 c6 d7 e8 , directed from white to black: e4 d5 c6 b7 a8 z9 , not directed: a5 c6 e7 , not directed: a7 c6 e5 , not directed: d8 c6 b4 a2 z0 , not directed: b8 c6 d4 e2" } );
        parameters.add( new Object[] { "c7", "not directed: e7 d7 c7 b7 a7 z7 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: z4 a5 b6 c7 d8 e9 , directed from white to black: e5 d6 c7 b8 a9 , not directed: c7 d5 e3 , not directed: d9 c7 b5 a3 z1 , not directed: a6 c7 e8 , not directed: a8 c7 e6" } );
        parameters.add( new Object[] { "c8", "not directed: e8 d8 c8 b8 a8 z8 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: e6 d7 c8 , directed from white to black: z5 a6 b7 c8 d9 , not directed: c8 b6 a4 z2 , not directed: a9 c8 e7 , not directed: a7 c8 e9 , not directed: c8 d6 e4" } );
        parameters.add( new Object[] { "d0", "not directed: d0 e0 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: d0 c1 b2 a3 z4 , directed from white to black: d0 e1 , not directed: d0 c2 b4 a6 z8 , not directed: d0 b1 z2 , not directed: d0 e2" } );
        parameters.add( new Object[] { "d1", "not directed: e1 d1 c1 b1 a1 z1 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: e0 d1 c2 b3 a4 z5 , directed from white to black: d1 e2 , not directed: d1 c3 b5 a7 z9 , not directed: d1 b2 z3 , not directed: d1 e3" } );
        parameters.add( new Object[] { "d2", "not directed: e2 d2 c2 b2 a2 z2 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: c1 d2 e3 , directed from white to black: e1 d2 c3 b4 a5 z6 , not directed: a8 b6 c4 d2 e0 , not directed: d2 e4 , not directed: d2 b3 z4 , not directed: d2 b1 z0" } );
        parameters.add( new Object[] { "d3", "not directed: e3 d3 c3 b3 a3 z3 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: e2 d3 c4 b5 a6 z7 , directed from white to black: a0 b1 c2 d3 e4 , not directed: a9 b7 c5 d3 e1 , not directed: d3 b2 z1 , not directed: d3 b4 z5 , not directed: c1 d3 e5" } );
        parameters.add( new Object[] { "d4", "not directed: e4 d4 c4 b4 a4 z4 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: z0 a1 b2 c3 d4 e5 , not directed: b8 c6 d4 e2 , not directed: c2 d4 e6 , not directed: d4 b3 z2 , not directed: d4 b5 z6" } );
        parameters.add( new Object[] { "d5", "not directed: e5 d5 c5 b5 a5 z5 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: e4 d5 c6 b7 a8 z9 , directed from white to black: z1 a2 b3 c4 d5 e6 , not directed: d5 b4 z3 , not directed: c7 d5 e3 , not directed: d5 b6 z7 , not directed: b1 c3 d5 e7" } );
        parameters.add( new Object[] { "d6", "not directed: e6 d6 c6 b6 a6 z6 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: e5 d6 c7 b8 a9 , directed from white to black: z2 a3 b4 c5 d6 e7 , not directed: a0 b2 c4 d6 e8 , not directed: d6 b5 z4 , not directed: c8 d6 e4 , not directed: d6 b7 z8" } );
        parameters.add( new Object[] { "d7", "not directed: e7 d7 c7 b7 a7 z7 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: e6 d7 c8 , directed from white to black: z3 a4 b5 c6 d7 e8 , not directed: d7 e5 , not directed: d7 b8 z9 , not directed: d7 b6 z5 , not directed: a1 b3 c5 d7 e9" } );
        parameters.add( new Object[] { "d8", "not directed: e8 d8 c8 b8 a8 z8 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: z4 a5 b6 c7 d8 e9 , directed from white to black: e7 d8 , not directed: d8 b7 z6 , not directed: d8 e6 , not directed: d8 c6 b4 a2 z0" } );
        parameters.add( new Object[] { "d9", "not directed: d9 e9 , directed from white to black: d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 , directed from white to black: e8 d9 , directed from white to black: z5 a6 b7 c8 d9 , not directed: d9 c7 b5 a3 z1 , not directed: d9 e7 , not directed: d9 b8 z7" } );
        parameters.add( new Object[] { "e0", "not directed: d0 e0 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: e0 d1 c2 b3 a4 z5 , not directed: a8 b6 c4 d2 e0 , not directed: a2 c1 e0" } );
        parameters.add( new Object[] { "e1", "not directed: e1 d1 c1 b1 a1 z1 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: d0 e1 , directed from white to black: e1 d2 c3 b4 a5 z6 , not directed: a9 b7 c5 d3 e1 , not directed: a3 c2 e1" } );
        parameters.add( new Object[] { "e2", "not directed: e2 d2 c2 b2 a2 z2 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: d1 e2 , directed from white to black: e2 d3 c4 b5 a6 z7 , not directed: a0 c1 e2 , not directed: d0 e2 , not directed: a4 c3 e2 , not directed: b8 c6 d4 e2" } );
        parameters.add( new Object[] { "e3", "not directed: e3 d3 c3 b3 a3 z3 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: e3 d4 c5 b6 a7 z8 , directed from white to black: c1 d2 e3 , not directed: a5 c4 e3 , not directed: c7 d5 e3 , not directed: d1 e3 , not directed: a1 c2 e3" } );
        parameters.add( new Object[] { "e4", "not directed: e4 d4 c4 b4 a4 z4 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: a0 b1 c2 d3 e4 , directed from white to black: e4 d5 c6 b7 a8 z9 , not directed: a2 c3 e4 , not directed: d2 e4 , not directed: c8 d6 e4 , not directed: a6 c5 e4" } );
        parameters.add( new Object[] { "e5", "not directed: e5 d5 c5 b5 a5 z5 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: e5 d6 c7 b8 a9 , directed from white to black: z0 a1 b2 c3 d4 e5 , not directed: a3 c4 e5 , not directed: d7 e5 , not directed: a7 c6 e5 , not directed: c1 d3 e5" } );
        parameters.add( new Object[] { "e6", "not directed: e6 d6 c6 b6 a6 z6 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: e6 d7 c8 , directed from white to black: z1 a2 b3 c4 d5 e6 , not directed: c2 d4 e6 , not directed: d8 e6 , not directed: a4 c5 e6 , not directed: a8 c7 e6" } );
        parameters.add( new Object[] { "e7", "not directed: e7 d7 c7 b7 a7 z7 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: e7 d8 , directed from white to black: z2 a3 b4 c5 d6 e7 , not directed: a5 c6 e7 , not directed: a9 c8 e7 , not directed: d9 e7 , not directed: b1 c3 d5 e7" } );
        parameters.add( new Object[] { "e8", "not directed: e8 d8 c8 b8 a8 z8 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: e8 d9 , directed from white to black: z3 a4 b5 c6 d7 e8 , not directed: a0 b2 c4 d6 e8 , not directed: a6 c7 e8" } );
        parameters.add( new Object[] { "e9", "not directed: d9 e9 , directed from white to black: e0 e1 e2 e3 e4 e5 e6 e7 e8 e9 , directed from white to black: z4 a5 b6 c7 d8 e9 , not directed: a7 c8 e9 , not directed: a1 b3 c5 d7 e9" } );
        
        return( parameters );
    }
}

