/*
 *  ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_StandardBoard.java
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
 * The class ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_StandardBoard extends ICoordinate_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        setBoard( new Coordinate_GraphImplementation_StandardBoard( ) );
        setOrientation( null );
    }
    
    /**
     * the public method Set<List<String>> getLineBundles( ) is tested.
     */
    public ICoordinate_GetLineBundles_AdjacentByPointWhiteBlack_StandardBoard( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "a1 b2 c3 d4 e5 f6 g7 h8" } );
        parameters.add( new Object[] { "a2", "a2 b3 c4 d5 e6 f7 g8 , b1 a2" } );
        parameters.add( new Object[] { "a3", "a3 b4 c5 d6 e7 f8 , c1 b2 a3" } );
        parameters.add( new Object[] { "a4", "a4 b5 c6 d7 e8 , d1 c2 b3 a4" } );
        parameters.add( new Object[] { "a5", "a5 b6 c7 d8 , e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "a6", "a6 b7 c8 , f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "a7", "a7 b8 , g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "a8", "h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "b1", "b1 c2 d3 e4 f5 g6 h7 , b1 a2" } );
        parameters.add( new Object[] { "b2", "a1 b2 c3 d4 e5 f6 g7 h8 , c1 b2 a3" } );
        parameters.add( new Object[] { "b3", "a2 b3 c4 d5 e6 f7 g8 , d1 c2 b3 a4" } );
        parameters.add( new Object[] { "b4", "a3 b4 c5 d6 e7 f8 , e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "b5", "a4 b5 c6 d7 e8 , f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "b6", "a5 b6 c7 d8 , g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "b7", "a6 b7 c8 , h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "b8", "a7 b8 , h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "c1", "c1 d2 e3 f4 g5 h6 , c1 b2 a3" } );
        parameters.add( new Object[] { "c2", "b1 c2 d3 e4 f5 g6 h7 , d1 c2 b3 a4" } );
        parameters.add( new Object[] { "c3", "a1 b2 c3 d4 e5 f6 g7 h8 , e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "c4", "a2 b3 c4 d5 e6 f7 g8 , f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "c5", "a3 b4 c5 d6 e7 f8 , g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "c6", "a4 b5 c6 d7 e8 , h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "c7", "a5 b6 c7 d8 , h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "c8", "a6 b7 c8 , h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "d1", "d1 e2 f3 g4 h5 , d1 c2 b3 a4" } );
        parameters.add( new Object[] { "d3", "b1 c2 d3 e4 f5 g6 h7 , f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "d4", "a1 b2 c3 d4 e5 f6 g7 h8 , g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "d5", "a2 b3 c4 d5 e6 f7 g8 , h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "d6", "a3 b4 c5 d6 e7 f8 , h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "d7", "a4 b5 c6 d7 e8 , h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "d8", "a5 b6 c7 d8 , h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "e1", "e1 f2 g3 h4 , e1 d2 c3 b4 a5" } );
        parameters.add( new Object[] { "e2", "d1 e2 f3 g4 h5 , f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "e3", "c1 d2 e3 f4 g5 h6 , g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "e4", "b1 c2 d3 e4 f5 g6 h7 , h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "e5", "a1 b2 c3 d4 e5 f6 g7 h8 , h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "e6", "a2 b3 c4 d5 e6 f7 g8 , h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "e7", "a3 b4 c5 d6 e7 f8 , h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "e8", "a4 b5 c6 d7 e8 , h5 g6 f7 e8" } );
        parameters.add( new Object[] { "f1", "f1 g2 h3 , f1 e2 d3 c4 b5 a6" } );
        parameters.add( new Object[] { "f2", "e1 f2 g3 h4 , g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "f3", "d1 e2 f3 g4 h5 , h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "f4", "c1 d2 e3 f4 g5 h6 , h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "f5", "b1 c2 d3 e4 f5 g6 h7 , h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "f6", "a1 b2 c3 d4 e5 f6 g7 h8 , h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "f7", "a2 b3 c4 d5 e6 f7 g8 , h5 g6 f7 e8" } );
        parameters.add( new Object[] { "f8", "a3 b4 c5 d6 e7 f8 , h6 g7 f8" } );
        parameters.add( new Object[] { "g1", "g1 h2 , g1 f2 e3 d4 c5 b6 a7" } );
        parameters.add( new Object[] { "g2", "f1 g2 h3 , h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "g3", "e1 f2 g3 h4 , h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "g4", "d1 e2 f3 g4 h5 , h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "g5", "c1 d2 e3 f4 g5 h6 , h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "g6", "b1 c2 d3 e4 f5 g6 h7 , h5 g6 f7 e8" } );
        parameters.add( new Object[] { "g7", "a1 b2 c3 d4 e5 f6 g7 h8 , h6 g7 f8" } );
        parameters.add( new Object[] { "g8", "a2 b3 c4 d5 e6 f7 g8 , h7 g8" } );
        parameters.add( new Object[] { "h1", "h1 g2 f3 e4 d5 c6 b7 a8" } );
        parameters.add( new Object[] { "h2", "g1 h2 , h2 g3 f4 e5 d6 c7 b8" } );
        parameters.add( new Object[] { "h3", "f1 g2 h3 , h3 g4 f5 e6 d7 c8" } );
        parameters.add( new Object[] { "h4", "e1 f2 g3 h4 , h4 g5 f6 e7 d8" } );
        parameters.add( new Object[] { "h5", "d1 e2 f3 g4 h5 , h5 g6 f7 e8" } );
        parameters.add( new Object[] { "h6", "c1 d2 e3 f4 g5 h6 , h6 g7 f8" } );
        parameters.add( new Object[] { "h7", "b1 c2 d3 e4 f5 g6 h7 , h7 g8" } );
        parameters.add( new Object[] { "h8", "a1 b2 c3 d4 e5 f6 g7 h8" } );

        return( parameters );
    }
}

