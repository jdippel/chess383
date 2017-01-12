/*
 *  DiscreteLineBundle_GetLineBundles_StandardBoard.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2015-2017 Jörg Dippel
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

import chess383.graph.basics.coordinate.board.StandardBoard;

/**
 * <p>
 * The class DiscreteLineBundle_GetLineBundles_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetLineBundles_StandardBoard extends DiscreteLineBundle_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        StandardBoard.defineBoard( ); 
        setOrientation( null );
    }
    
    /**
     * the public method DiscreteLine getLineBundles( ) is tested.
     */
    public DiscreteLineBundle_GetLineBundles_StandardBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1 , directed from white to black: a1 a2 a3 a4 a5 a6 a7 a8 , directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , not directed: a1 c2 e3 g4 , not directed: a1 b3 c5 d7" } );
        parameters.add( new Object[] { "a2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2 , directed from white to black: a1 a2 a3 a4 a5 a6 a7 a8 , directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: b1 a2 , not directed: a2 c3 e4 g5 , not directed: a2 b4 c6 d8 , not directed: a2 c1" } );
        parameters.add( new Object[] { "a3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3 , directed from white to black: a1 a2 a3 a4 a5 a6 a7 a8 , directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: c1 b2 a3 , not directed: a3 c4 e5 g6 , not directed: a3 b5 c7 , not directed: a3 b1 , not directed: a3 c2 e1" } );
        parameters.add( new Object[] { "a4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4 , directed from white to black: a1 a2 a3 a4 a5 a6 a7 a8 , directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: d1 c2 b3 a4 , not directed: a4 c5 e6 g7 , not directed: a4 b6 c8 , not directed: a4 b2 , not directed: a4 c3 e2 g1" } );
        parameters.add( new Object[] { "a5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5 , directed from white to black: a1 a2 a3 a4 a5 a6 a7 a8 , directed from white to black: a5 b6 c7 d8 , directed from white to black: e1 d2 c3 b4 a5 , not directed: a5 c6 e7 g8 , not directed: a5 b7 , not directed: a5 b3 c1 , not directed: a5 c4 e3 g2" } );
        parameters.add( new Object[] { "a6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6 , directed from white to black: a1 a2 a3 a4 a5 a6 a7 a8 , directed from white to black: a6 b7 c8 , directed from white to black: f1 e2 d3 c4 b5 a6 , not directed: a6 c7 e8 , not directed: a6 b8 , not directed: a6 b4 c2 , not directed: a6 c5 e4 g3" } );
        parameters.add( new Object[] { "a7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7 , directed from white to black: a1 a2 a3 a4 a5 a6 a7 a8 , directed from white to black: a7 b8 , directed from white to black: g1 f2 e3 d4 c5 b6 a7 , not directed: a7 c8 , not directed: a7 b5 c3 d1 , not directed: a7 c6 e5 g4" } );
        parameters.add( new Object[] { "a8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8 , directed from white to black: a1 a2 a3 a4 a5 a6 a7 a8 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8 , not directed: a8 b6 c4 d2 , not directed: a8 c7 e6 g5" } );
        parameters.add( new Object[] { "b1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: b1 a2 , not directed: b1 d2 f3 h4 , not directed: b1 c3 d5 e7 , not directed: a3 b1" } );
        parameters.add( new Object[] { "b2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: c1 b2 a3 , not directed: b2 d3 f4 h5 , not directed: b2 c4 d6 e8 , not directed: a4 b2 , not directed: b2 d1" } );
        parameters.add( new Object[] { "b3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: d1 c2 b3 a4 , not directed: b3 d4 f5 h6 , not directed: a1 b3 c5 d7 , not directed: a5 b3 c1 , not directed: b3 d2 f1" } );
        parameters.add( new Object[] { "b4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: e1 d2 c3 b4 a5 , not directed: b4 d5 f6 h7 , not directed: a2 b4 c6 d8 , not directed: a6 b4 c2 , not directed: b4 d3 f2 h1" } );
        parameters.add( new Object[] { "b5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: f1 e2 d3 c4 b5 a6 , not directed: b5 d6 f7 h8 , not directed: a3 b5 c7 , not directed: a7 b5 c3 d1 , not directed: b5 d4 f3 h2" } );
        parameters.add( new Object[] { "b6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: a5 b6 c7 d8 , directed from white to black: g1 f2 e3 d4 c5 b6 a7 , not directed: b6 d7 f8 , not directed: a4 b6 c8 , not directed: a8 b6 c4 d2 , not directed: b6 d5 f4 h3" } );
        parameters.add( new Object[] { "b7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: a6 b7 c8 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8 , not directed: b7 d8 , not directed: a5 b7 , not directed: b7 c5 d3 e1 , not directed: b7 d6 f5 h4" } );
        parameters.add( new Object[] { "b8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8 , directed from white to black: b1 b2 b3 b4 b5 b6 b7 b8 , directed from white to black: a7 b8 , directed from white to black: h2 g3 f4 e5 d6 c7 b8 , not directed: a6 b8 , not directed: b8 c6 d4 e2 , not directed: b8 d7 f6 h5" } );
        parameters.add( new Object[] { "c1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: c1 b2 a3 , not directed: c1 e2 g3 , not directed: c1 d3 e5 f7 , not directed: a5 b3 c1 , not directed: a2 c1" } );
        parameters.add( new Object[] { "c2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: d1 c2 b3 a4 , not directed: a1 c2 e3 g4 , not directed: c2 d4 e6 f8 , not directed: a6 b4 c2 , not directed: a3 c2 e1" } );
        parameters.add( new Object[] { "c3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: e1 d2 c3 b4 a5 , not directed: a2 c3 e4 g5 , not directed: b1 c3 d5 e7 , not directed: a7 b5 c3 d1 , not directed: a4 c3 e2 g1" } );
        parameters.add( new Object[] { "c4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: f1 e2 d3 c4 b5 a6 , not directed: a3 c4 e5 g6 , not directed: b2 c4 d6 e8 , not directed: a8 b6 c4 d2 , not directed: a5 c4 e3 g2" } );
        parameters.add( new Object[] { "c5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: g1 f2 e3 d4 c5 b6 a7 , not directed: a4 c5 e6 g7 , not directed: a1 b3 c5 d7 , not directed: b7 c5 d3 e1 , not directed: a6 c5 e4 g3" } );
        parameters.add( new Object[] { "c6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8 , not directed: a5 c6 e7 g8 , not directed: a2 b4 c6 d8 , not directed: b8 c6 d4 e2 , not directed: a7 c6 e5 g4" } );
        parameters.add( new Object[] { "c7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: a5 b6 c7 d8 , directed from white to black: h2 g3 f4 e5 d6 c7 b8 , not directed: a6 c7 e8 , not directed: a3 b5 c7 , not directed: c7 d5 e3 f1 , not directed: a8 c7 e6 g5" } );
        parameters.add( new Object[] { "c8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8 , directed from white to black: c1 c2 c3 c4 c5 c6 c7 c8 , directed from white to black: a6 b7 c8 , directed from white to black: h3 g4 f5 e6 d7 c8 , not directed: a7 c8 , not directed: a4 b6 c8 , not directed: c8 d6 e4 f2 , not directed: c8 e7 g6" } );
        parameters.add( new Object[] { "d1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1 , directed from white to black: d1 d2 d3 d4 d5 d6 d7 d8 , directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: d1 c2 b3 a4 , not directed: d1 f2 h3 , not directed: d1 e3 f5 g7 , not directed: a7 b5 c3 d1 , not directed: b2 d1" } );
        parameters.add( new Object[] { "d2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2 , directed from white to black: d1 d2 d3 d4 d5 d6 d7 d8 , directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: e1 d2 c3 b4 a5 , not directed: b1 d2 f3 h4 , not directed: d2 e4 f6 g8 , not directed: a8 b6 c4 d2 , not directed: b3 d2 f1" } );
        parameters.add( new Object[] { "d3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3 , directed from white to black: d1 d2 d3 d4 d5 d6 d7 d8 , directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: f1 e2 d3 c4 b5 a6 , not directed: b2 d3 f4 h5 , not directed: c1 d3 e5 f7 , not directed: b7 c5 d3 e1 , not directed: b4 d3 f2 h1" } );
        parameters.add( new Object[] { "d4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4 , directed from white to black: d1 d2 d3 d4 d5 d6 d7 d8 , directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: g1 f2 e3 d4 c5 b6 a7 , not directed: b3 d4 f5 h6 , not directed: c2 d4 e6 f8 , not directed: b8 c6 d4 e2 , not directed: b5 d4 f3 h2" } );
        parameters.add( new Object[] { "d5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5 , directed from white to black: d1 d2 d3 d4 d5 d6 d7 d8 , directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8 , not directed: b4 d5 f6 h7 , not directed: b1 c3 d5 e7 , not directed: c7 d5 e3 f1 , not directed: b6 d5 f4 h3" } );
        parameters.add( new Object[] { "d6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6 , directed from white to black: d1 d2 d3 d4 d5 d6 d7 d8 , directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: h2 g3 f4 e5 d6 c7 b8 , not directed: b5 d6 f7 h8 , not directed: b2 c4 d6 e8 , not directed: c8 d6 e4 f2 , not directed: b7 d6 f5 h4" } );
        parameters.add( new Object[] { "d7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7 , directed from white to black: d1 d2 d3 d4 d5 d6 d7 d8 , directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: h3 g4 f5 e6 d7 c8 , not directed: b6 d7 f8 , not directed: a1 b3 c5 d7 , not directed: d7 e5 f3 g1 , not directed: b8 d7 f6 h5" } );
        parameters.add( new Object[] { "d8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8 , directed from white to black: d1 d2 d3 d4 d5 d6 d7 d8 , directed from white to black: a5 b6 c7 d8 , directed from white to black: h4 g5 f6 e7 d8 , not directed: b7 d8 , not directed: a2 b4 c6 d8 , not directed: d8 e6 f4 g2 , not directed: d8 f7 h6" } );
        parameters.add( new Object[] { "e1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1 , directed from white to black: e1 e2 e3 e4 e5 e6 e7 e8 , directed from white to black: e1 f2 g3 h4 , directed from white to black: e1 d2 c3 b4 a5 , not directed: e1 g2 , not directed: e1 f3 g5 h7 , not directed: b7 c5 d3 e1 , not directed: a3 c2 e1" } );
        parameters.add( new Object[] { "e2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2 , directed from white to black: e1 e2 e3 e4 e5 e6 e7 e8 , directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: f1 e2 d3 c4 b5 a6 , not directed: c1 e2 g3 , not directed: e2 f4 g6 h8 , not directed: b8 c6 d4 e2 , not directed: a4 c3 e2 g1" } );
        parameters.add( new Object[] { "e3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3 , directed from white to black: e1 e2 e3 e4 e5 e6 e7 e8 , directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: g1 f2 e3 d4 c5 b6 a7 , not directed: a1 c2 e3 g4 , not directed: d1 e3 f5 g7 , not directed: c7 d5 e3 f1 , not directed: a5 c4 e3 g2" } );
        parameters.add( new Object[] { "e4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4 , directed from white to black: e1 e2 e3 e4 e5 e6 e7 e8 , directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8 , not directed: a2 c3 e4 g5 , not directed: d2 e4 f6 g8 , not directed: c8 d6 e4 f2 , not directed: a6 c5 e4 g3" } );
        parameters.add( new Object[] { "e5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5 , directed from white to black: e1 e2 e3 e4 e5 e6 e7 e8 , directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: h2 g3 f4 e5 d6 c7 b8 , not directed: a3 c4 e5 g6 , not directed: c1 d3 e5 f7 , not directed: d7 e5 f3 g1 , not directed: a7 c6 e5 g4" } );
        parameters.add( new Object[] { "e6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6 , directed from white to black: e1 e2 e3 e4 e5 e6 e7 e8 , directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: h3 g4 f5 e6 d7 c8 , not directed: a4 c5 e6 g7 , not directed: c2 d4 e6 f8 , not directed: d8 e6 f4 g2 , not directed: a8 c7 e6 g5" } );
        parameters.add( new Object[] { "e7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7 , directed from white to black: e1 e2 e3 e4 e5 e6 e7 e8 , directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: h4 g5 f6 e7 d8 , not directed: a5 c6 e7 g8 , not directed: b1 c3 d5 e7 , not directed: e7 f5 g3 h1 , not directed: c8 e7 g6" } );
        parameters.add( new Object[] { "e8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8 , directed from white to black: e1 e2 e3 e4 e5 e6 e7 e8 , directed from white to black: a4 b5 c6 d7 e8 , directed from white to black: h5 g6 f7 e8 , not directed: a6 c7 e8 , not directed: b2 c4 d6 e8 , not directed: e8 f6 g4 h2 , not directed: e8 g7" } );
        parameters.add( new Object[] { "f1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1 , directed from white to black: f1 f2 f3 f4 f5 f6 f7 f8 , directed from white to black: f1 g2 h3 , directed from white to black: f1 e2 d3 c4 b5 a6 , not directed: f1 h2 , not directed: f1 g3 h5 , not directed: c7 d5 e3 f1 , not directed: b3 d2 f1" } );
        parameters.add( new Object[] { "f2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2 , directed from white to black: f1 f2 f3 f4 f5 f6 f7 f8 , directed from white to black: e1 f2 g3 h4 , directed from white to black: g1 f2 e3 d4 c5 b6 a7 , not directed: d1 f2 h3 , not directed: f2 g4 h6 , not directed: c8 d6 e4 f2 , not directed: b4 d3 f2 h1" } );
        parameters.add( new Object[] { "f3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3 , directed from white to black: f1 f2 f3 f4 f5 f6 f7 f8 , directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8 , not directed: b1 d2 f3 h4 , not directed: e1 f3 g5 h7 , not directed: d7 e5 f3 g1 , not directed: b5 d4 f3 h2" } );
        parameters.add( new Object[] { "f4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4 , directed from white to black: f1 f2 f3 f4 f5 f6 f7 f8 , directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: h2 g3 f4 e5 d6 c7 b8 , not directed: b2 d3 f4 h5 , not directed: e2 f4 g6 h8 , not directed: d8 e6 f4 g2 , not directed: b6 d5 f4 h3" } );
        parameters.add( new Object[] { "f5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5 , directed from white to black: f1 f2 f3 f4 f5 f6 f7 f8 , directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: h3 g4 f5 e6 d7 c8 , not directed: b3 d4 f5 h6 , not directed: d1 e3 f5 g7 , not directed: e7 f5 g3 h1 , not directed: b7 d6 f5 h4" } );
        parameters.add( new Object[] { "f6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6 , directed from white to black: f1 f2 f3 f4 f5 f6 f7 f8 , directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: h4 g5 f6 e7 d8 , not directed: b4 d5 f6 h7 , not directed: d2 e4 f6 g8 , not directed: e8 f6 g4 h2 , not directed: b8 d7 f6 h5" } );
        parameters.add( new Object[] { "f7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7 , directed from white to black: f1 f2 f3 f4 f5 f6 f7 f8 , directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: h5 g6 f7 e8 , not directed: b5 d6 f7 h8 , not directed: c1 d3 e5 f7 , not directed: f7 g5 h3 , not directed: d8 f7 h6" } );
        parameters.add( new Object[] { "f8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8 , directed from white to black: f1 f2 f3 f4 f5 f6 f7 f8 , directed from white to black: a3 b4 c5 d6 e7 f8 , directed from white to black: h6 g7 f8 , not directed: b6 d7 f8 , not directed: c2 d4 e6 f8 , not directed: f8 g6 h4 , not directed: f8 h7" } );
        parameters.add( new Object[] { "g1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1 , directed from white to black: g1 g2 g3 g4 g5 g6 g7 g8 , directed from white to black: g1 h2 , directed from white to black: g1 f2 e3 d4 c5 b6 a7 , not directed: g1 h3 , not directed: d7 e5 f3 g1 , not directed: a4 c3 e2 g1" } );
        parameters.add( new Object[] { "g2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2 , directed from white to black: g1 g2 g3 g4 g5 g6 g7 g8 , directed from white to black: f1 g2 h3 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8 , not directed: e1 g2 , not directed: g2 h4 , not directed: d8 e6 f4 g2 , not directed: a5 c4 e3 g2" } );
        parameters.add( new Object[] { "g3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3 , directed from white to black: g1 g2 g3 g4 g5 g6 g7 g8 , directed from white to black: e1 f2 g3 h4 , directed from white to black: h2 g3 f4 e5 d6 c7 b8 , not directed: c1 e2 g3 , not directed: f1 g3 h5 , not directed: e7 f5 g3 h1 , not directed: a6 c5 e4 g3" } );
        parameters.add( new Object[] { "g4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4 , directed from white to black: g1 g2 g3 g4 g5 g6 g7 g8 , directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: h3 g4 f5 e6 d7 c8 , not directed: a1 c2 e3 g4 , not directed: f2 g4 h6 , not directed: e8 f6 g4 h2 , not directed: a7 c6 e5 g4" } );
        parameters.add( new Object[] { "g5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5 , directed from white to black: g1 g2 g3 g4 g5 g6 g7 g8 , directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: h4 g5 f6 e7 d8 , not directed: a2 c3 e4 g5 , not directed: e1 f3 g5 h7 , not directed: f7 g5 h3 , not directed: a8 c7 e6 g5" } );
        parameters.add( new Object[] { "g6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6 , directed from white to black: g1 g2 g3 g4 g5 g6 g7 g8 , directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: h5 g6 f7 e8 , not directed: a3 c4 e5 g6 , not directed: e2 f4 g6 h8 , not directed: f8 g6 h4 , not directed: c8 e7 g6" } );
        parameters.add( new Object[] { "g7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7 , directed from white to black: g1 g2 g3 g4 g5 g6 g7 g8 , directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , directed from white to black: h6 g7 f8 , not directed: a4 c5 e6 g7 , not directed: d1 e3 f5 g7 , not directed: g7 h5 , not directed: e8 g7" } );
        parameters.add( new Object[] { "g8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8 , directed from white to black: g1 g2 g3 g4 g5 g6 g7 g8 , directed from white to black: a2 b3 c4 d5 e6 f7 g8 , directed from white to black: h7 g8 , not directed: a5 c6 e7 g8 , not directed: d2 e4 f6 g8 , not directed: g8 h6" } );
        parameters.add( new Object[] { "h1", "not directed: a1 b1 c1 d1 e1 f1 g1 h1 , directed from white to black: h1 h2 h3 h4 h5 h6 h7 h8 , directed from white to black: h1 g2 f3 e4 d5 c6 b7 a8 , not directed: e7 f5 g3 h1 , not directed: b4 d3 f2 h1" } );
        parameters.add( new Object[] { "h2", "not directed: a2 b2 c2 d2 e2 f2 g2 h2 , directed from white to black: h1 h2 h3 h4 h5 h6 h7 h8 , directed from white to black: g1 h2 , directed from white to black: h2 g3 f4 e5 d6 c7 b8 , not directed: f1 h2 , not directed: e8 f6 g4 h2 , not directed: b5 d4 f3 h2" } );
        parameters.add( new Object[] { "h3", "not directed: a3 b3 c3 d3 e3 f3 g3 h3 , directed from white to black: h1 h2 h3 h4 h5 h6 h7 h8 , directed from white to black: f1 g2 h3 , directed from white to black: h3 g4 f5 e6 d7 c8 , not directed: d1 f2 h3 , not directed: g1 h3 , not directed: f7 g5 h3 , not directed: b6 d5 f4 h3" } );
        parameters.add( new Object[] { "h4", "not directed: a4 b4 c4 d4 e4 f4 g4 h4 , directed from white to black: h1 h2 h3 h4 h5 h6 h7 h8 , directed from white to black: e1 f2 g3 h4 , directed from white to black: h4 g5 f6 e7 d8 , not directed: b1 d2 f3 h4 , not directed: g2 h4 , not directed: f8 g6 h4 , not directed: b7 d6 f5 h4" } );
        parameters.add( new Object[] { "h5", "not directed: a5 b5 c5 d5 e5 f5 g5 h5 , directed from white to black: h1 h2 h3 h4 h5 h6 h7 h8 , directed from white to black: d1 e2 f3 g4 h5 , directed from white to black: h5 g6 f7 e8 , not directed: b2 d3 f4 h5 , not directed: f1 g3 h5 , not directed: g7 h5 , not directed: b8 d7 f6 h5" } );
        parameters.add( new Object[] { "h6", "not directed: a6 b6 c6 d6 e6 f6 g6 h6 , directed from white to black: h1 h2 h3 h4 h5 h6 h7 h8 , directed from white to black: c1 d2 e3 f4 g5 h6 , directed from white to black: h6 g7 f8 , not directed: b3 d4 f5 h6 , not directed: f2 g4 h6 , not directed: g8 h6 , not directed: d8 f7 h6" } );
        parameters.add( new Object[] { "h7", "not directed: a7 b7 c7 d7 e7 f7 g7 h7 , directed from white to black: h1 h2 h3 h4 h5 h6 h7 h8 , directed from white to black: b1 c2 d3 e4 f5 g6 h7 , directed from white to black: h7 g8 , not directed: b4 d5 f6 h7 , not directed: e1 f3 g5 h7 , not directed: f8 h7" } );
        parameters.add( new Object[] { "h8", "not directed: a8 b8 c8 d8 e8 f8 g8 h8 , directed from white to black: h1 h2 h3 h4 h5 h6 h7 h8 , directed from white to black: a1 b2 c3 d4 e5 f6 g7 h8 , not directed: b5 d6 f7 h8 , not directed: e2 f4 g6 h8" } );

        return( parameters );
    }
}

