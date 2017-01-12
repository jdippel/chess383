/*
 *  ICoordinate_GetColorOfDefinedLocation_StandardBoard.java
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

package chess383.ibasics.standardboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chess383.ColorEnum;
import chess383.ICoordinate;
import chess383.graph.basics.board.Coordinate_GraphImplementation_StandardBoard;

/**
 * <p>
 * The class ICoordinate_GetColorOfDefinedLocation_StandardBoard implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class ICoordinate_GetColorOfDefinedLocation_StandardBoard { 

    /**
     * the public method String getColorOfDefinedLocation( ) is tested.
     */

    @Test
    public void compareTheDefinedLocation( ) {
        
        ICoordinate board = new Coordinate_GraphImplementation_StandardBoard( );
        
        assertEquals( "Defined color is predefined:", ColorEnum.BLACK, board.getColorOfDefinedLocation( ) );
    }
}

