/*
 *  DiscreteLineBundle_GetAllLocations_StandardBoard.java
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

import static org.junit.Assert.assertEquals;
import java.util.Set;

import org.junit.Test;

import chess383.graph.basics.coordinate.board.DiscreteLineBundle;
import chess383.graph.basics.coordinate.board.StandardBoard;

/**
 * <p>
 * The class DiscreteLineBundle_GetAllLocations_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class DiscreteLineBundle_GetAllLocations_StandardBoard { 

    /**
     * the public method Set<Location> getAllLocations( ) is tested.
     */
    
    private void compareSetOfLocations( String expected, Set<Location> squares ) {
        
        String[] tokens = expected.split( "\\s+" );
        assertEquals( "Sets must be of same size:", tokens.length, squares.size( ) );
        for( String square : tokens ) {
            assertEquals( "", true, squares.contains( Location.getInstance( square ) ) );
        }
    }
    

    @Test
    public void compareTheDefinedSetOfLocations( ) {
        
        StandardBoard.defineBoard( );
        
        Set<Location> squares = DiscreteLineBundle.getAllLocations( );
        String expectedSquares = 
                  "a1 b1 c1 d1 e1 f1 g1 h1 a2 b2 c2 d2 e2 f2 g2 h2 a3 b3 c3 d3 e3 f3 g3 h3 "
                + "a4 b4 c4 d4 e4 f4 g4 h4 a5 b5 c5 d5 e5 f5 g5 h5 a6 b6 c6 d6 e6 f6 g6 h6 "
                + "a7 b7 c7 d7 e7 f7 g7 h7 a8 b8 c8 d8 e8 f8 g8 h8";
        
        compareSetOfLocations( expectedSquares, squares );
    }
}

