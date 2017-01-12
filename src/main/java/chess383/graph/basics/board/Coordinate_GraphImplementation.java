/*
 *  Coordinate_GraphImplementation.java
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

package chess383.graph.basics.board;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import chess383.ColorEnum;
import chess383.ICoordinate;
import chess383.graph.basics.coordinate.DiscreteLine;
import chess383.graph.basics.coordinate.board.DiscreteLineBundle;
import chess383.graph.color.DirectedByColorEnum;
import chess383.graph.basics.coordinate.Location;
import chess383.utils.Basics_Utils;


/**
 * Provides locations on a bundle of lines.
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class Coordinate_GraphImplementation implements ICoordinate {

    @Override
    public Set<List<String>> getLineBundles( String square ) {
        
        return( generalizeSet( DiscreteLineBundle.getLineBundles( square ) ) );
    }
    
    @Override
    public Set<List<String>> getLineBundles( String square, DirectedByColorEnum orientation ) {
        
        return( generalizeSet( DiscreteLineBundle.getLineBundles( square, orientation ) ) );
    }

    @Override
    public Set<List<String>> getCommonLine( String square1, String square2 ) {
        
        Set<List<String>> result = new HashSet<List<String>>( 1 );
        
        // There is at least one result 
        DiscreteLine line = DiscreteLineBundle.getCommonLine( square1, square2 );
        if( line != null ) {
            result.add( generalizeList( line ) );
        }
        
        return( result );
    }

    @Override
    public Set<String> getAllLocations( ) {
        
        Set<String> result = new HashSet<String>( );
        
        for( Location square : DiscreteLineBundle.getAllLocations( ) ) {
            
            result.add( square.toString( ) );
        }
        
        return( result );
    }

    @Override
    public Set<String> getDirectlyConnectedLocations( String square ) {

        Set<String> result = new HashSet<String>( );
        
        for( Location value : DiscreteLineBundle.getDirectlyConnectedLocations( Location.getInstance( square ) ) ) {
            
            result.add( value.toString( ) );
        }
        
        return( result );
    }
    
    @Override
    public Set<String> getDirectlyByEdgeConnectedLocations( String square ) {

        Set<String> result = new HashSet<String>( );
        
        for( Location value : DiscreteLineBundle.getDirectlyByEdgeConnectedLocations( Location.getInstance( square ) ) ) {
            
            result.add( value.toString( ) );
        }
        
        return( result );
    }
    
    @Override
    public String getDefinedLocation( ) { return( "a1" ); }
    
    @Override
    public ColorEnum getColorOfDefinedLocation( ) { return( ColorEnum.BLACK ); }
    
    /** ------------------------------------------------------- */
    
    private Set<List<String>> generalizeSet( Set<DiscreteLine> value ) {
        
        Set<List<String>> result = new HashSet<List<String>>( );
        
        for( DiscreteLine line : value ) {
            
            result.add( generalizeList( line ) );
        }
        
        return( result );
    }
    
    private List<String> generalizeList( DiscreteLine line ) {
        
        List<String> result;
        
        if( line == null ) return( new ArrayList<String>( 0 ) );
        
        result = Basics_Utils.transformStringToListOfStrings( line.getSquares( ) );
        
        return( result );
    }
}

