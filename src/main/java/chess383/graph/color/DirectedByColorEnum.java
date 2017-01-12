/*
 *  DirectedByColorEnum.java
 *
 *  chess383 is a collection of chess related utilities.
 *  chess383/graph/basics is the implementation of basic movements
 *  according to the laws of chess.
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

package chess383.graph.color;

import chess383.ColorEnum;

/**
 * Defines directions based on colors.
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public enum DirectedByColorEnum {

    ADJACENT_BY_EDGE_BUT_NOT_DIRECTED(  ColorEnum.NONE,  ColorEnum.NONE ) {
        public boolean isDirected( ) { return( false ); }
        public boolean isAdjacentByEdge( )  { return( true ); }
    },
    ADJACENT_BY_EDGE_WHITE_BLACK(       ColorEnum.WHITE, ColorEnum.BLACK ) {
        public boolean isAdjacentByEdge( )  { return( true ); }
    },
    ADJACENT_BY_EDGE_WHITE_RED(         ColorEnum.WHITE, ColorEnum.RED ) {
        public boolean isAdjacentByEdge( )  { return( true ); }
    },
    ADJACENT_BY_EDGE_BLACK_RED(         ColorEnum.BLACK, ColorEnum.RED ) {
        public boolean isAdjacentByEdge( )  { return( true ); }
    },
    ADJACENT_BY_POINT_WHITE_BLACK(      ColorEnum.WHITE, ColorEnum.BLACK ) {
        public boolean isAdjacentByPoint( ) { return( true ); }
    },
    ADJACENT_BY_POINT_WHITE_RED(        ColorEnum.WHITE, ColorEnum.RED ) {
        public boolean isAdjacentByPoint( ) { return( true ); }
    },
    ADJACENT_BY_POINT_BLACK_RED(        ColorEnum.BLACK, ColorEnum.RED ) {
        public boolean isAdjacentByPoint( ) { return( true ); }
    },
    NOT_ADJACENT(                       ColorEnum.NONE,  ColorEnum.NONE ) {
        public boolean isDirected( ) { return( false ); }
    };
    
    private ColorEnum startDirection;
    private ColorEnum endDirection;
    
    DirectedByColorEnum( ColorEnum start, ColorEnum end ) {
        this.startDirection = start;
        this.endDirection = end;
    }
    
    public boolean isDirected( )        { return( true ); }
    public boolean isAdjacentByEdge( )  { return( false ); }
    public boolean isAdjacentByPoint( ) { return( false ); }
    public ColorEnum getStart( )        { return( this.startDirection ); }
    public ColorEnum getEnd( )          { return( this.endDirection ); }
    
    public String toString( ) {
        
        return( isDirected( ) ? "directed from " + getStart( ) + " to " + getEnd( ) : "not directed" );
    }
}

