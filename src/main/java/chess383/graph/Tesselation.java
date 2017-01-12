/*
 *  Tesselation.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2016 Jörg Dippel
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

package chess383.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import chess383.ColorEnum;
import chess383.ICoordinate;

/**
 * Provides the tesselation of a standard board.
 *
 * @author    J&ouml;rg Dippel
 * @version   December 2016
 *
 */
public class Tesselation {

    /** ---------  Attributes  -------------------------------- */

    private ICoordinate coordinate;
    private Map<String, ColorEnum> tesselation;
    
    /** ---------  Constructors  ------------------------------ */

    public Tesselation( ICoordinate value ) {

        setCoordinate( value );
        setTesselation( null );
    }
    
    /** ---------  Getter and Setter  ------------------------- */

    private void setCoordinate( ICoordinate value )             { this.coordinate = value; }
    private ICoordinate getCoordinate( )                        { return( this.coordinate ); }
    private void setTesselation( Map<String, ColorEnum> value ) { this.tesselation = value; }
    private Map<String, ColorEnum> getTesselation( )            { return( this.tesselation ); }
    
    /** ------------------------------------------------------- */
    
    
    /**
     * Provides the color of a location
     * 
     * @param location as the name of a square
     * 
     * @return the color of the location
     */
    public ColorEnum getColor( String location ) {
    
        Map<String, ColorEnum> map = getTesselation( );
        if( map == null ) {
            setTesselation( provideTesselation( ) );
            map = getTesselation( );
            if( validateTesselation() == false ) {
                throw new AssertionError( "Tesselation should be validated", new RuntimeException( ) );
            }
        }

        return( map.get( location ) );
    }
    
    static private ColorEnum toggleColor( ColorEnum color ) {
        return( ( color == ColorEnum.WHITE ) ? ColorEnum.BLACK : ColorEnum.WHITE );
    }
    
    static private ColorEnum sameColor( ColorEnum color ) {
        return( ( color == ColorEnum.WHITE ) ? ColorEnum.WHITE : ColorEnum.BLACK );
    }
    
    private Map<String, ColorEnum> provideTesselation( ) {
    
        Set<String> locations = getCoordinate( ).getAllLocations( );
        Map<String, ColorEnum> map = new HashMap<String, ColorEnum>( locations.size( ) );
        for( String name : locations ) {
            map.put( name, ColorEnum.NONE );
        }
        
        String definedName = getCoordinate( ).getDefinedLocation( );
        Set<String> list = new HashSet<String>( );
        list.add( definedName );
        map.put( definedName, getCoordinate( ).getColorOfDefinedLocation( ) );
        
        while( ! list.isEmpty( ) ) {
            
            Iterator<String> iterator = list.iterator( );
            while( iterator.hasNext( ) ) {
                String name = iterator.next( );
                if( map.get( name ) != ColorEnum.NONE ) {
                    list.remove( name );
                    
                    Set<String> neighbourhood = getCoordinate( ).getDirectlyConnectedLocations( name );
                    Set<String> anchor = getCoordinate( ).getDirectlyByEdgeConnectedLocations( name );
                    ColorEnum color = map.get( name );
                    
                    for( String neighbourName : neighbourhood ) {
                        if( map.get( neighbourName ) == ColorEnum.NONE ) {
                            if( anchor.contains( neighbourName ) ) {
                                map.put( neighbourName, toggleColor( color ) );
                            }
                            else {
                                map.put( neighbourName, sameColor( color ) );
                            }
                            list.add( neighbourName );
                        }
                    }
                    break;
                }   
            }
        }
        
        return( map );
    }
    
    private boolean validateTesselation( ) {
        
        boolean result = true;

        for( String name : getCoordinate( ).getAllLocations( ) ) {
            if( getColor( name ) == ColorEnum.NONE ) {
                return( false );
            }
        }
        
        return( result );
    }
}

