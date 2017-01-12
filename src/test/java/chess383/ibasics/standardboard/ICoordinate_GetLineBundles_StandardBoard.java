/*
 *  ICoordinate_GetLineBundles_StandardBoard.java
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

package chess383.ibasics.standardboard;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.graph.basics.board.Coordinate_GraphImplementation_StandardBoard;
import chess383.ibasics.ICoordinate_GetLineBundles_Wrapper;

/**
 * <p>
 * The class ICoordinate_GetLineBundles_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_StandardBoard extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_StandardBoard( ) );
        setOrientation( null );
    }
    
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_StandardBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1 b1 c1 d1 e1 f1 g1 h1 , a1 a2 a3 a4 a5 a6 a7 a8 , a1 b2 c3 d4 e5 f6 g7 h8 , a1 c2 e3 g4 , a1 b3 c5 d7" } );
        parameters.add( new Object[] { "a2", "a2 b2 c2 d2 e2 f2 g2 h2 , a1 a2 a3 a4 a5 a6 a7 a8 , a2 b3 c4 d5 e6 f7 g8 , b1 a2 , a2 c3 e4 g5 , a2 b4 c6 d8 , a2 c1" } );
        parameters.add( new Object[] { "a3", "a3 b3 c3 d3 e3 f3 g3 h3 , a1 a2 a3 a4 a5 a6 a7 a8 , a3 b4 c5 d6 e7 f8 , c1 b2 a3 , a3 c4 e5 g6 , a3 b5 c7 , a3 b1 , a3 c2 e1" } );
        parameters.add( new Object[] { "a4", "a4 b4 c4 d4 e4 f4 g4 h4 , a1 a2 a3 a4 a5 a6 a7 a8 , a4 b5 c6 d7 e8 , d1 c2 b3 a4 , a4 c5 e6 g7 , a4 b6 c8 , a4 b2 , a4 c3 e2 g1" } );
        parameters.add( new Object[] { "a5", "a5 b5 c5 d5 e5 f5 g5 h5 , a1 a2 a3 a4 a5 a6 a7 a8 , a5 b6 c7 d8 , e1 d2 c3 b4 a5 , a5 c6 e7 g8 , a5 b7 , a5 b3 c1 , a5 c4 e3 g2" } );
        parameters.add( new Object[] { "a6", "a6 b6 c6 d6 e6 f6 g6 h6 , a1 a2 a3 a4 a5 a6 a7 a8 , a6 b7 c8 , f1 e2 d3 c4 b5 a6 , a6 c7 e8 , a6 b8 , a6 b4 c2 , a6 c5 e4 g3" } );
        parameters.add( new Object[] { "a7", "a7 b7 c7 d7 e7 f7 g7 h7 , a1 a2 a3 a4 a5 a6 a7 a8 , a7 b8 , g1 f2 e3 d4 c5 b6 a7 , a7 c8 , a7 b5 c3 d1 , a7 c6 e5 g4" } );
        parameters.add( new Object[] { "a8", "a8 b8 c8 d8 e8 f8 g8 h8 , a1 a2 a3 a4 a5 a6 a7 a8 , h1 g2 f3 e4 d5 c6 b7 a8 , a8 b6 c4 d2 , a8 c7 e6 g5" } );
        parameters.add( new Object[] { "b1", "a1 b1 c1 d1 e1 f1 g1 h1 , b1 b2 b3 b4 b5 b6 b7 b8 , b1 c2 d3 e4 f5 g6 h7 , b1 a2 , b1 d2 f3 h4 , b1 c3 d5 e7 , a3 b1" } );
        parameters.add( new Object[] { "b2", "a2 b2 c2 d2 e2 f2 g2 h2 , b1 b2 b3 b4 b5 b6 b7 b8 , a1 b2 c3 d4 e5 f6 g7 h8 , c1 b2 a3 , b2 d3 f4 h5 , b2 c4 d6 e8 , a4 b2 , b2 d1" } );
        parameters.add( new Object[] { "b3", "a3 b3 c3 d3 e3 f3 g3 h3 , b1 b2 b3 b4 b5 b6 b7 b8 , a2 b3 c4 d5 e6 f7 g8 , d1 c2 b3 a4 , b3 d4 f5 h6 , a1 b3 c5 d7 , a5 b3 c1 , b3 d2 f1" } );
        parameters.add( new Object[] { "b4", "a4 b4 c4 d4 e4 f4 g4 h4 , b1 b2 b3 b4 b5 b6 b7 b8 , a3 b4 c5 d6 e7 f8 , e1 d2 c3 b4 a5 , b4 d5 f6 h7 , a2 b4 c6 d8 , a6 b4 c2 , b4 d3 f2 h1" } );
        parameters.add( new Object[] { "b5", "a5 b5 c5 d5 e5 f5 g5 h5 , b1 b2 b3 b4 b5 b6 b7 b8 , a4 b5 c6 d7 e8 , f1 e2 d3 c4 b5 a6 , b5 d6 f7 h8 , a3 b5 c7 , a7 b5 c3 d1 , b5 d4 f3 h2" } );
        parameters.add( new Object[] { "b6", "a6 b6 c6 d6 e6 f6 g6 h6 , b1 b2 b3 b4 b5 b6 b7 b8 , a5 b6 c7 d8 , g1 f2 e3 d4 c5 b6 a7 , b6 d7 f8 , a4 b6 c8 , a8 b6 c4 d2 , b6 d5 f4 h3" } );
        parameters.add( new Object[] { "b7", "a7 b7 c7 d7 e7 f7 g7 h7 , b1 b2 b3 b4 b5 b6 b7 b8 , a6 b7 c8 , h1 g2 f3 e4 d5 c6 b7 a8 , b7 d8 , a5 b7 , b7 c5 d3 e1 , b7 d6 f5 h4" } );
        parameters.add( new Object[] { "b8", "a8 b8 c8 d8 e8 f8 g8 h8 , b1 b2 b3 b4 b5 b6 b7 b8 , a7 b8 , h2 g3 f4 e5 d6 c7 b8 , a6 b8 , b8 c6 d4 e2 , b8 d7 f6 h5" } );
        parameters.add( new Object[] { "c1", "a1 b1 c1 d1 e1 f1 g1 h1 , c1 c2 c3 c4 c5 c6 c7 c8 , c1 d2 e3 f4 g5 h6 , c1 b2 a3 , c1 e2 g3 , c1 d3 e5 f7 , a5 b3 c1 , a2 c1" } );
        parameters.add( new Object[] { "c2", "a2 b2 c2 d2 e2 f2 g2 h2 , c1 c2 c3 c4 c5 c6 c7 c8 , b1 c2 d3 e4 f5 g6 h7 , d1 c2 b3 a4 , a1 c2 e3 g4 , c2 d4 e6 f8 , a6 b4 c2 , a3 c2 e1" } );
        parameters.add( new Object[] { "c3", "a3 b3 c3 d3 e3 f3 g3 h3 , c1 c2 c3 c4 c5 c6 c7 c8 , a1 b2 c3 d4 e5 f6 g7 h8 , e1 d2 c3 b4 a5 , a2 c3 e4 g5 , b1 c3 d5 e7 , a7 b5 c3 d1 , a4 c3 e2 g1" } );
        parameters.add( new Object[] { "c4", "a4 b4 c4 d4 e4 f4 g4 h4 , c1 c2 c3 c4 c5 c6 c7 c8 , a2 b3 c4 d5 e6 f7 g8 , f1 e2 d3 c4 b5 a6 , a3 c4 e5 g6 , b2 c4 d6 e8 , a8 b6 c4 d2 , a5 c4 e3 g2" } );
        parameters.add( new Object[] { "c5", "a5 b5 c5 d5 e5 f5 g5 h5 , c1 c2 c3 c4 c5 c6 c7 c8 , a3 b4 c5 d6 e7 f8 , g1 f2 e3 d4 c5 b6 a7 , a4 c5 e6 g7 , a1 b3 c5 d7 , b7 c5 d3 e1 , a6 c5 e4 g3" } );
        parameters.add( new Object[] { "c6", "a6 b6 c6 d6 e6 f6 g6 h6 , c1 c2 c3 c4 c5 c6 c7 c8 , a4 b5 c6 d7 e8 , h1 g2 f3 e4 d5 c6 b7 a8 , a5 c6 e7 g8 , a2 b4 c6 d8 , b8 c6 d4 e2 , a7 c6 e5 g4" } );
        parameters.add( new Object[] { "c7", "a7 b7 c7 d7 e7 f7 g7 h7 , c1 c2 c3 c4 c5 c6 c7 c8 , a5 b6 c7 d8 , h2 g3 f4 e5 d6 c7 b8 , a6 c7 e8 , a3 b5 c7 , c7 d5 e3 f1 , a8 c7 e6 g5" } );
        parameters.add( new Object[] { "c8", "a8 b8 c8 d8 e8 f8 g8 h8 , c1 c2 c3 c4 c5 c6 c7 c8 , a6 b7 c8 , h3 g4 f5 e6 d7 c8 , a7 c8 , a4 b6 c8 , c8 d6 e4 f2 , c8 e7 g6" } );
        parameters.add( new Object[] { "d1", "a1 b1 c1 d1 e1 f1 g1 h1 , d1 d2 d3 d4 d5 d6 d7 d8 , d1 e2 f3 g4 h5 , d1 c2 b3 a4 , d1 f2 h3 , d1 e3 f5 g7 , a7 b5 c3 d1 , b2 d1" } );
        parameters.add( new Object[] { "d2", "a2 b2 c2 d2 e2 f2 g2 h2 , d1 d2 d3 d4 d5 d6 d7 d8 , c1 d2 e3 f4 g5 h6 , e1 d2 c3 b4 a5 , b1 d2 f3 h4 , d2 e4 f6 g8 , a8 b6 c4 d2 , b3 d2 f1" } );
        parameters.add( new Object[] { "d3", "a3 b3 c3 d3 e3 f3 g3 h3 , d1 d2 d3 d4 d5 d6 d7 d8 , b1 c2 d3 e4 f5 g6 h7 , f1 e2 d3 c4 b5 a6 , b2 d3 f4 h5 , c1 d3 e5 f7 , b7 c5 d3 e1 , b4 d3 f2 h1" } );
        parameters.add( new Object[] { "d4", "a4 b4 c4 d4 e4 f4 g4 h4 , d1 d2 d3 d4 d5 d6 d7 d8 , a1 b2 c3 d4 e5 f6 g7 h8 , g1 f2 e3 d4 c5 b6 a7 , b3 d4 f5 h6 , c2 d4 e6 f8 , b8 c6 d4 e2 , b5 d4 f3 h2" } );
        parameters.add( new Object[] { "d5", "a5 b5 c5 d5 e5 f5 g5 h5 , d1 d2 d3 d4 d5 d6 d7 d8 , a2 b3 c4 d5 e6 f7 g8 , h1 g2 f3 e4 d5 c6 b7 a8 , b4 d5 f6 h7 , b1 c3 d5 e7 , c7 d5 e3 f1 , b6 d5 f4 h3" } );
        parameters.add( new Object[] { "d6", "a6 b6 c6 d6 e6 f6 g6 h6 , d1 d2 d3 d4 d5 d6 d7 d8 , a3 b4 c5 d6 e7 f8 , h2 g3 f4 e5 d6 c7 b8 , b5 d6 f7 h8 , b2 c4 d6 e8 , c8 d6 e4 f2 , b7 d6 f5 h4" } );
        parameters.add( new Object[] { "d7", "a7 b7 c7 d7 e7 f7 g7 h7 , d1 d2 d3 d4 d5 d6 d7 d8 , a4 b5 c6 d7 e8 , h3 g4 f5 e6 d7 c8 , b6 d7 f8 , a1 b3 c5 d7 , d7 e5 f3 g1 , b8 d7 f6 h5" } );
        parameters.add( new Object[] { "d8", "a8 b8 c8 d8 e8 f8 g8 h8 , d1 d2 d3 d4 d5 d6 d7 d8 , a5 b6 c7 d8 , h4 g5 f6 e7 d8 , b7 d8 , a2 b4 c6 d8 , d8 e6 f4 g2 , d8 f7 h6" } );
        parameters.add( new Object[] { "e1", "a1 b1 c1 d1 e1 f1 g1 h1 , e1 e2 e3 e4 e5 e6 e7 e8 , e1 f2 g3 h4 , e1 d2 c3 b4 a5 , e1 g2 , e1 f3 g5 h7 , b7 c5 d3 e1 , a3 c2 e1" } );
        parameters.add( new Object[] { "e2", "a2 b2 c2 d2 e2 f2 g2 h2 , e1 e2 e3 e4 e5 e6 e7 e8 , d1 e2 f3 g4 h5 , f1 e2 d3 c4 b5 a6 , c1 e2 g3 , e2 f4 g6 h8 , b8 c6 d4 e2 , a4 c3 e2 g1" } );
        parameters.add( new Object[] { "e3", "a3 b3 c3 d3 e3 f3 g3 h3 , e1 e2 e3 e4 e5 e6 e7 e8 , c1 d2 e3 f4 g5 h6 , g1 f2 e3 d4 c5 b6 a7 , a1 c2 e3 g4 , d1 e3 f5 g7 , c7 d5 e3 f1 , a5 c4 e3 g2" } );
        parameters.add( new Object[] { "e4", "a4 b4 c4 d4 e4 f4 g4 h4 , e1 e2 e3 e4 e5 e6 e7 e8 , b1 c2 d3 e4 f5 g6 h7 , h1 g2 f3 e4 d5 c6 b7 a8 , a2 c3 e4 g5 , d2 e4 f6 g8 , c8 d6 e4 f2 , a6 c5 e4 g3" } );
        parameters.add( new Object[] { "e5", "a5 b5 c5 d5 e5 f5 g5 h5 , e1 e2 e3 e4 e5 e6 e7 e8 , a1 b2 c3 d4 e5 f6 g7 h8 , h2 g3 f4 e5 d6 c7 b8 , a3 c4 e5 g6 , c1 d3 e5 f7 , d7 e5 f3 g1 , a7 c6 e5 g4" } );
        parameters.add( new Object[] { "e6", "a6 b6 c6 d6 e6 f6 g6 h6 , e1 e2 e3 e4 e5 e6 e7 e8 , a2 b3 c4 d5 e6 f7 g8 , h3 g4 f5 e6 d7 c8 , a4 c5 e6 g7 , c2 d4 e6 f8 , d8 e6 f4 g2 , a8 c7 e6 g5" } );
        parameters.add( new Object[] { "e7", "a7 b7 c7 d7 e7 f7 g7 h7 , e1 e2 e3 e4 e5 e6 e7 e8 , a3 b4 c5 d6 e7 f8 , h4 g5 f6 e7 d8 , a5 c6 e7 g8 , b1 c3 d5 e7 , e7 f5 g3 h1 , c8 e7 g6" } );
        parameters.add( new Object[] { "e8", "a8 b8 c8 d8 e8 f8 g8 h8 , e1 e2 e3 e4 e5 e6 e7 e8 , a4 b5 c6 d7 e8 , h5 g6 f7 e8 , a6 c7 e8 , b2 c4 d6 e8 , e8 f6 g4 h2 , e8 g7" } );
        parameters.add( new Object[] { "f1", "a1 b1 c1 d1 e1 f1 g1 h1 , f1 f2 f3 f4 f5 f6 f7 f8 , f1 g2 h3 , f1 e2 d3 c4 b5 a6 , f1 h2 , f1 g3 h5 , c7 d5 e3 f1 , b3 d2 f1" } );
        parameters.add( new Object[] { "f2", "a2 b2 c2 d2 e2 f2 g2 h2 , f1 f2 f3 f4 f5 f6 f7 f8 , e1 f2 g3 h4 , g1 f2 e3 d4 c5 b6 a7 , d1 f2 h3 , f2 g4 h6 , c8 d6 e4 f2 , b4 d3 f2 h1" } );
        parameters.add( new Object[] { "f3", "a3 b3 c3 d3 e3 f3 g3 h3 , f1 f2 f3 f4 f5 f6 f7 f8 , d1 e2 f3 g4 h5 , h1 g2 f3 e4 d5 c6 b7 a8 , b1 d2 f3 h4 , e1 f3 g5 h7 , d7 e5 f3 g1 , b5 d4 f3 h2" } );
        parameters.add( new Object[] { "f4", "a4 b4 c4 d4 e4 f4 g4 h4 , f1 f2 f3 f4 f5 f6 f7 f8 , c1 d2 e3 f4 g5 h6 , h2 g3 f4 e5 d6 c7 b8 , b2 d3 f4 h5 , e2 f4 g6 h8 , d8 e6 f4 g2 , b6 d5 f4 h3" } );
        parameters.add( new Object[] { "f5", "a5 b5 c5 d5 e5 f5 g5 h5 , f1 f2 f3 f4 f5 f6 f7 f8 , b1 c2 d3 e4 f5 g6 h7 , h3 g4 f5 e6 d7 c8 , b3 d4 f5 h6 , d1 e3 f5 g7 , e7 f5 g3 h1 , b7 d6 f5 h4" } );
        parameters.add( new Object[] { "f6", "a6 b6 c6 d6 e6 f6 g6 h6 , f1 f2 f3 f4 f5 f6 f7 f8 , a1 b2 c3 d4 e5 f6 g7 h8 , h4 g5 f6 e7 d8 , b4 d5 f6 h7 , d2 e4 f6 g8 , e8 f6 g4 h2 , b8 d7 f6 h5" } );
        parameters.add( new Object[] { "f7", "a7 b7 c7 d7 e7 f7 g7 h7 , f1 f2 f3 f4 f5 f6 f7 f8 , a2 b3 c4 d5 e6 f7 g8 , h5 g6 f7 e8 , b5 d6 f7 h8 , c1 d3 e5 f7 , f7 g5 h3 , d8 f7 h6" } );
        parameters.add( new Object[] { "f8", "a8 b8 c8 d8 e8 f8 g8 h8 , f1 f2 f3 f4 f5 f6 f7 f8 , a3 b4 c5 d6 e7 f8 , h6 g7 f8 , b6 d7 f8 , c2 d4 e6 f8 , f8 g6 h4 , f8 h7" } );
        parameters.add( new Object[] { "g1", "a1 b1 c1 d1 e1 f1 g1 h1 , g1 g2 g3 g4 g5 g6 g7 g8 , g1 h2 , g1 f2 e3 d4 c5 b6 a7 , g1 h3 , d7 e5 f3 g1 , a4 c3 e2 g1" } );
        parameters.add( new Object[] { "g2", "a2 b2 c2 d2 e2 f2 g2 h2 , g1 g2 g3 g4 g5 g6 g7 g8 , f1 g2 h3 , h1 g2 f3 e4 d5 c6 b7 a8 , e1 g2 , g2 h4 , d8 e6 f4 g2 , a5 c4 e3 g2" } );
        parameters.add( new Object[] { "g3", "a3 b3 c3 d3 e3 f3 g3 h3 , g1 g2 g3 g4 g5 g6 g7 g8 , e1 f2 g3 h4 , h2 g3 f4 e5 d6 c7 b8 , c1 e2 g3 , f1 g3 h5 , e7 f5 g3 h1 , a6 c5 e4 g3" } );
        parameters.add( new Object[] { "g4", "a4 b4 c4 d4 e4 f4 g4 h4 , g1 g2 g3 g4 g5 g6 g7 g8 , d1 e2 f3 g4 h5 , h3 g4 f5 e6 d7 c8 , a1 c2 e3 g4 , f2 g4 h6 , e8 f6 g4 h2 , a7 c6 e5 g4" } );
        parameters.add( new Object[] { "g5", "a5 b5 c5 d5 e5 f5 g5 h5 , g1 g2 g3 g4 g5 g6 g7 g8 , c1 d2 e3 f4 g5 h6 , h4 g5 f6 e7 d8 , a2 c3 e4 g5 , e1 f3 g5 h7 , f7 g5 h3 , a8 c7 e6 g5" } );
        parameters.add( new Object[] { "g6", "a6 b6 c6 d6 e6 f6 g6 h6 , g1 g2 g3 g4 g5 g6 g7 g8 , b1 c2 d3 e4 f5 g6 h7 , h5 g6 f7 e8 , a3 c4 e5 g6 , e2 f4 g6 h8 , f8 g6 h4 , c8 e7 g6" } );
        parameters.add( new Object[] { "g7", "a7 b7 c7 d7 e7 f7 g7 h7 , g1 g2 g3 g4 g5 g6 g7 g8 , a1 b2 c3 d4 e5 f6 g7 h8 , h6 g7 f8 , a4 c5 e6 g7 , d1 e3 f5 g7 , g7 h5 , e8 g7" } );
        parameters.add( new Object[] { "g8", "a8 b8 c8 d8 e8 f8 g8 h8 , g1 g2 g3 g4 g5 g6 g7 g8 , a2 b3 c4 d5 e6 f7 g8 , h7 g8 , a5 c6 e7 g8 , d2 e4 f6 g8 , g8 h6" } );
        parameters.add( new Object[] { "h1", "a1 b1 c1 d1 e1 f1 g1 h1 , h1 h2 h3 h4 h5 h6 h7 h8 , h1 g2 f3 e4 d5 c6 b7 a8 , e7 f5 g3 h1 , b4 d3 f2 h1" } );
        parameters.add( new Object[] { "h2", "a2 b2 c2 d2 e2 f2 g2 h2 , h1 h2 h3 h4 h5 h6 h7 h8 , g1 h2 , h2 g3 f4 e5 d6 c7 b8 , f1 h2 , e8 f6 g4 h2 , b5 d4 f3 h2" } );
        parameters.add( new Object[] { "h3", "a3 b3 c3 d3 e3 f3 g3 h3 , h1 h2 h3 h4 h5 h6 h7 h8 , f1 g2 h3 , h3 g4 f5 e6 d7 c8 , d1 f2 h3 , g1 h3 , f7 g5 h3 , b6 d5 f4 h3" } );
        parameters.add( new Object[] { "h4", "a4 b4 c4 d4 e4 f4 g4 h4 , h1 h2 h3 h4 h5 h6 h7 h8 , e1 f2 g3 h4 , h4 g5 f6 e7 d8 , b1 d2 f3 h4 , g2 h4 , f8 g6 h4 , b7 d6 f5 h4" } );
        parameters.add( new Object[] { "h5", "a5 b5 c5 d5 e5 f5 g5 h5 , h1 h2 h3 h4 h5 h6 h7 h8 , d1 e2 f3 g4 h5 , h5 g6 f7 e8 , b2 d3 f4 h5 , f1 g3 h5 , g7 h5 , b8 d7 f6 h5" } );
        parameters.add( new Object[] { "h6", "a6 b6 c6 d6 e6 f6 g6 h6 , h1 h2 h3 h4 h5 h6 h7 h8 , c1 d2 e3 f4 g5 h6 , h6 g7 f8 , b3 d4 f5 h6 , f2 g4 h6 , g8 h6 , d8 f7 h6" } );
        parameters.add( new Object[] { "h7", "a7 b7 c7 d7 e7 f7 g7 h7 , h1 h2 h3 h4 h5 h6 h7 h8 , b1 c2 d3 e4 f5 g6 h7 , h7 g8 , b4 d5 f6 h7 , e1 f3 g5 h7 , f8 h7" } );
        parameters.add( new Object[] { "h8", "a8 b8 c8 d8 e8 f8 g8 h8 , h1 h2 h3 h4 h5 h6 h7 h8 , a1 b2 c3 d4 e5 f6 g7 h8 , b5 d6 f7 h8 , e2 f4 g6 h8" } );

        return( parameters );
    }
}

