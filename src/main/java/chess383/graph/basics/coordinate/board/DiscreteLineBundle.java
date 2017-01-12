/*
 *  DiscreteLineBundle.java
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

package chess383.graph.basics.coordinate.board;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import chess383.ColorEnum;
import chess383.exception.Chess383BoardUndefinedException;
import chess383.graph.basics.coordinate.DiscreteLine;
import chess383.graph.basics.coordinate.Location;
import chess383.graph.color.DirectedByColorEnum;

/**
 * Provides locations on a bundle of lines.
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class DiscreteLineBundle {
   
    protected static List<DiscreteLine> bundle = null; 
    private static List<DiscreteLine> getBundle( ) { 
        if( bundle == null ) {
            throw new Chess383BoardUndefinedException( );
        }
        return( bundle );
    }
    
    /** ------------------------------------------------------- */
    
    DiscreteLine createHorizontal( String value ) {
        
        return( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_BUT_NOT_DIRECTED, value ) );
    }
    
    DiscreteLine createVertical( String value ) {
        
        return( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_BLACK, value ) );
    }
    
    DiscreteLine createDiagonal( String value ) {
        
        return( DiscreteLine.createDiscreteLine( DirectedByColorEnum.ADJACENT_BY_POINT_WHITE_BLACK, value ) );
    }

    DiscreteLine createKnight( String value ) {
    
        return( DiscreteLine.createDiscreteLine( DirectedByColorEnum.NOT_ADJACENT, value ) );
    }
    
    private static boolean containsExactly( String line, String square ) {
        
        if( line == null ) return( false );
        if( square == null ) return( false );
        if( line.length( ) < square.length( ) ) return( false );
        if( line.length( ) == square.length( ) ) return( line.compareTo( square ) == 0 );
        if( line.substring( 0, square.length( ) ).compareTo( square ) == 0 ) return( line.charAt( square.length( ) ) == ' ' );
        if( line.substring( line.length( ) - square.length( ) ).compareTo( square ) == 0 ) return( line.charAt( line.length( ) - square.length( ) -1 ) == ' ' );
        return( line.contains( ' ' + square + ' ' ) );
    }
    
    public static Set<DiscreteLine> getLineBundles( String square ) {
        
        Set<DiscreteLine> result = new HashSet<DiscreteLine>( );
        
        List<DiscreteLine> lineBundles = getBundle( );
        for( DiscreteLine line : lineBundles ) {
            if( line.getSquares( ).contains( square ) ) {
                if( containsExactly( line.getSquares( ), square ) ) {
                    result.add( line );
                }
            }
        }
    
        return( result );
    }
    
    public static Set<DiscreteLine> getLineBundles( String square, DirectedByColorEnum orientation ) {
        
        if( orientation == null ) return( getLineBundles( square ) );
        
        Set<DiscreteLine> result = new HashSet<DiscreteLine>( );
        
        List<DiscreteLine> lineBundles = getBundle( );
        for( DiscreteLine line : lineBundles ) {
            if( line.getDirection( ) == orientation ) {
                if( line.getSquares( ).contains( square ) ) {
                    if( containsExactly( line.getSquares( ), square ) ) {
                        result.add( line );
                    }
                }
            }
        }
    
        return( result );
    }
  
    public static DiscreteLine getCommonLine( String square1, String square2 ) {
        
        DiscreteLine result = null;
        
        List<DiscreteLine> lineBundles = getBundle( );
        for( DiscreteLine line : lineBundles ) {
            if( line.getSquares( ).contains( square1 ) ) {
                if( line.getSquares( ).contains( square2 ) ) {
                    if( containsExactly( line.getSquares( ), square1 ) ) {
                        if( containsExactly( line.getSquares( ), square2 ) ) {
                            result = line ;
                            break;
                        }
                    }
                }
            }
        }
    
        return( result );
    }
    
    public static Set<Location> getAllLocations( ) {
        
        Set<Location> result = new HashSet<Location>( );
        
        List<DiscreteLine> lineBundles = getBundle( );
        for( DiscreteLine line : lineBundles ) {
            String currentLine = line.getSquares( );
            String[] tokens = currentLine.split( "\\s+" );
            for( String square : tokens ) {
                if( square.length( ) > 0 ) {
                    result.add( Location.getInstance( square ) );
                }
            }
        }
        
        return( result );
    }
    
    
    private static boolean isAdjacent( DirectedByColorEnum direction ) {
        return( direction != DirectedByColorEnum.NOT_ADJACENT );
    }
    
    public static Set<Location> getDirectlyConnectedLocations( Location source ) {

        Set<Location> result = new HashSet<Location>( );
        String square = source.getCoordinate( ).getName( );

        List<DiscreteLine> lineBundles = getBundle( );
        for( DiscreteLine line : lineBundles ) {
            if( isAdjacent( line.getDirection( ) ) && ( line.getSquares( ).contains( square ) ) ) {
                int index = 0;
                String[] tokens = line.getSquares( ).split( "\\s+" );
                while( index < tokens.length ) {
                    if( square.compareTo( tokens[ index ] ) == 0 ) {
                        if( index > 0 ) {
                            result.add( Location.getInstance( tokens[ index - 1 ] ) );
                        }
                        if( index < tokens.length - 1  ) {
                            result.add( Location.getInstance( tokens[ index + 1 ] ) );
                        }
                        break;
                    }
                    index++;
                }  
            }
        }
        
        return( result );
    }
    
    private static boolean isAdjacentByEdge( DirectedByColorEnum direction ) {
        return( direction.isAdjacentByEdge( ) );
    }
    
    public static Set<Location> getDirectlyByEdgeConnectedLocations( Location source ) {

        Set<Location> result = new HashSet<Location>( );
        String square = source.getCoordinate( ).getName( );

        List<DiscreteLine> lineBundles = getBundle( );
        for( DiscreteLine line : lineBundles ) {
            if( isAdjacentByEdge( line.getDirection( ) ) && ( line.getSquares( ).contains( square ) ) ) {
                int index = 0;
                String[] tokens = line.getSquares( ).split( "\\s+" );
                while( index < tokens.length ) {
                    if( square.compareTo( tokens[ index ] ) == 0 ) {
                        if( index > 0 ) {
                            result.add( Location.getInstance( tokens[ index - 1 ] ) );
                        }
                        if( index < tokens.length - 1  ) {
                            result.add( Location.getInstance( tokens[ index + 1 ] ) );
                        }
                        break;
                    }
                    index++;
                }  
            }
        }
        
        return( result );
    }
    
    public String getDefinedLocation( )           { return( "a1" ); }
    public ColorEnum getColorOfDefinedLocation( ) { return( ColorEnum.BLACK ); }
}

