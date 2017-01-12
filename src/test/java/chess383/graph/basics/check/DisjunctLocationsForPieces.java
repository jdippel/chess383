/*
 *  DisjunctLocationsForPieces.java
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

package chess383.graph.basics.check;

import java.util.HashSet;
import java.util.Set;

import chess383.graph.basics.coordinate.DiscreteLine;
import chess383.graph.basics.coordinate.board.DiscreteLineBundle;
import chess383.graph.basics.coordinate.Location;

/**
 * The class DisjunctLocationsForPieces implements different sets of locations.
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class DisjunctLocationsForPieces {

    static public Set<Location> getConnectedLocationsWithDistanceLengthTwo( Location source ) {
        
        Set<Location> result = new HashSet<Location>( );
        
        Set<Location> directlyConnected = DiscreteLineBundle.getDirectlyConnectedLocations( source );
        unite( result, directlyConnected );
        
        for( Location location : directlyConnected ) {
            unite( result, DiscreteLineBundle.getDirectlyConnectedLocations( location ) );
        }
        
        return( result );
    }
    
    static public Set<Location> unite( Set<Location> collection, Set<Location> add ) {
        
        for( Location location : add ) {
            collection.add( location );
        }
        
        return( collection );
    }
    
    static public Set<Location> getLocationsWithMaximalDistance( Location source, DiscreteLine line, int limit ) {
        
        Set<Location> result = new HashSet<Location>( );
        
        String square = source.getCoordinate( ).getName( );
        String[] tokens = line.getSquares().split( "\\s+" );
        int index = 0;
        while( index < tokens.length ) {
            if( tokens[ index ].compareTo( square ) == 0 ) {
                break;      // source found within the discrete line
            }
            index++;
        }
        if( index == tokens.length ) return( result );
        
        for( int lower = 1; lower <= limit; lower++ ) {
            if( ( index - lower ) < 0 ) break;
            result.add( Location.getInstance( tokens[ index - lower ] ) );

        }
        for( int upper = 1; upper <= limit; upper++ ) {
            if( ( index + upper ) >= tokens.length ) break;
            result.add( Location.getInstance( tokens[ index + upper ] ) );
        }
        return( result );
    }
    
    static public Set<Location> getAdjacentByEdgeLocations( Location source ) {
        
        final int LIMIT = 2;
        Set<Location> result = new HashSet<Location>( );
        
        Set<DiscreteLine> lines = DiscreteLineBundle.getLineBundles( source.getCoordinate( ).getName( ) );
        for( DiscreteLine line : lines ) {
            if( line.getDirection( ).isAdjacentByEdge( ) ) {
                unite( result, getLocationsWithMaximalDistance( source, line, LIMIT ) );
            }
        }
        return( result );
    }
    
    static public Set<Location> getAdjacentByPointLocations( Location source ) {
        
        final int LIMIT = 2;
        Set<Location> result = new HashSet<Location>( );
        
        Set<DiscreteLine> lines = DiscreteLineBundle.getLineBundles( source.getCoordinate( ).getName( ) );
        for( DiscreteLine line : lines ) {
            if( line.getDirection( ).isAdjacentByPoint( ) ) {
                unite( result, getLocationsWithMaximalDistance( source, line, LIMIT ) );
            }
        }
        return( result );
    }

    static public Set<Location> getNonAdjacentLocations( Location source ) {
        
        final int LIMIT = 1;
        Set<Location> result = new HashSet<Location>( );
        
        Set<DiscreteLine> lines = DiscreteLineBundle.getLineBundles( source.getCoordinate( ).getName( ) );
        for( DiscreteLine line : lines ) {
            if( ! ( line.getDirection( ).isAdjacentByEdge( ) || line.getDirection( ).isAdjacentByPoint( ) ) ) {
                unite( result, getLocationsWithMaximalDistance( source, line, LIMIT ) );
            }
        }
        return( result );
    }
    
    static public boolean isDisjunct( Set<Location> collection, Set<Location> subset ) {
        
        for( Location location : subset ) {
            if( collection.contains( location ) ) return( false );
        }
        
        return( true );
    }
    
    static public boolean isSubset( Set<Location> collection, Set<Location> subset ) {
        
        for( Location location : subset ) {
            if( ! collection.contains( location ) ) return( false );
        }
        
        return( true );
    }
    
    static public String provideSetString( Set<Location> collection ) {
        
        StringBuffer result = new StringBuffer( );
        
        for( Location location : collection ) {
            if( result.length( ) == 0 ) {
                result.append( location.getCoordinate( ).getName( ) );
            }
            else {
                result.append( " " + location.getCoordinate( ).getName( ) );
            }
        }
        
        return( result.toString( ) );
    }
    
    static public void printSet( Set<Location> collection ) {
        
        System.out.println( provideSetString( collection ) );
    }
}
