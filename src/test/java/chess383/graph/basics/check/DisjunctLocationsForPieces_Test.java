/*
 *  DisjunctLocationsForPieces_Test.java
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

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

import chess383.graph.basics.coordinate.Location;
import chess383.graph.basics.coordinate.board.DiscreteLineBundle;
import chess383.graph.basics.coordinate.board.StandardBoard;
import chess383.graph.basics.coordinate.board.ThreeDimensionalBoard;

/**
 * <p>
 * The class DisjunctLocationsForPieces implements checks for rooks, bishops and knights.
 * All types can reach a set of locations which are disjunct, but all of them will define an
 * area which is only at last a two locations distance from the origin. 
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
public class DisjunctLocationsForPieces_Test { 

    /**
     * sets of locations are compared
     */

    @Test
    public void checkSuperpositionForStandardBoard( ) {

        StandardBoard.defineBoard( );
        checkSuperposition( );
    }
    
    @Test
    public void checkSuperpositionForThreeDimensionalBoard( ) {

        ThreeDimensionalBoard.defineBoard( );
        checkSuperposition( );
    }
    
    @Ignore
    @Test
    public void checkSuperpositionForTripleBoard( ) {

        checkSuperposition( );
    }
    
    private void checkSuperposition( ) {

        for( Location source : DiscreteLineBundle.getAllLocations( ) ) {
            
            checkSuperposition( source );
        }
    }
    
    private void checkSuperposition( Location source ) {
        
        adjacentEdgesArePartOfNeighbourhood( source );
        adjacentPointsArePartOfNeighbourhood( source );
        nonConnectedArePartOfNeighbourhood( source );
        checkDisjunctionBetweenEdgesAndPoint( source );
        checkDisjunctionBetweenEdgesAndNonConnected( source );
        checkDisjunctionBetweenPointAndNonConnected( source );
        
        checkNeigbourhood( source );
    }
    
    private void adjacentEdgesArePartOfNeighbourhood( Location source ) {

        Set<Location> neighbourhood = DisjunctLocationsForPieces.getConnectedLocationsWithDistanceLengthTwo( source );
//      DisjunctLocationsForPieces.printSet( neighbourhood );
        Set<Location> edge = DisjunctLocationsForPieces.getAdjacentByEdgeLocations( source );
//      DisjunctLocationsForPieces.printSet( edge );
        
        assertTrue( DisjunctLocationsForPieces.isSubset( neighbourhood, edge ) );
    }
    
    private void adjacentPointsArePartOfNeighbourhood( Location source ) {

        Set<Location> neighbourhood = DisjunctLocationsForPieces.getConnectedLocationsWithDistanceLengthTwo( source );
//      DisjunctLocationsForPieces.printSet( neighbourhood );
        Set<Location> point = DisjunctLocationsForPieces.getAdjacentByPointLocations( source );
//      DisjunctLocationsForPieces.printSet( point );
        
        assertTrue( DisjunctLocationsForPieces.isSubset( neighbourhood, point ) );
    }
    
    private void nonConnectedArePartOfNeighbourhood( Location source ) {

        Set<Location> neighbourhood = DisjunctLocationsForPieces.getConnectedLocationsWithDistanceLengthTwo( source );
//      DisjunctLocationsForPieces.printSet( neighbourhood );
        Set<Location> nonConnected = DisjunctLocationsForPieces.getNonAdjacentLocations( source );
//      DisjunctLocationsForPieces.printSet( nonConnected );
        
        assertTrue( DisjunctLocationsForPieces.isSubset( neighbourhood, nonConnected ) );
    }
    
    private void checkDisjunctionBetweenEdgesAndPoint( Location source ) {

        Set<Location> edge = DisjunctLocationsForPieces.getAdjacentByEdgeLocations( source );
        Set<Location> point = DisjunctLocationsForPieces.getAdjacentByPointLocations( source );
//      DisjunctLocationsForPieces.printSet( edge );
//      DisjunctLocationsForPieces.printSet( point );
        
        assertTrue( DisjunctLocationsForPieces.isDisjunct( edge, point ) );
        assertTrue( DisjunctLocationsForPieces.isDisjunct( point, edge ) );
    }
    
    private void checkDisjunctionBetweenEdgesAndNonConnected( Location source ) {

        Set<Location> edge = DisjunctLocationsForPieces.getAdjacentByEdgeLocations( source );
        Set<Location> nonConnected = DisjunctLocationsForPieces.getNonAdjacentLocations( source );
//      DisjunctLocationsForPieces.printSet( edge );
//      DisjunctLocationsForPieces.printSet( nonConnected );
        
        assertTrue( DisjunctLocationsForPieces.isDisjunct( edge, nonConnected ) );
        assertTrue( DisjunctLocationsForPieces.isDisjunct( nonConnected, edge ) );
    }
    
    private void checkDisjunctionBetweenPointAndNonConnected( Location source ) {

        Set<Location> point = DisjunctLocationsForPieces.getAdjacentByPointLocations( source );
        Set<Location> nonConnected = DisjunctLocationsForPieces.getNonAdjacentLocations( source );
//      DisjunctLocationsForPieces.printSet( point );
//      DisjunctLocationsForPieces.printSet( nonConnected );
        
        assertTrue( DisjunctLocationsForPieces.isDisjunct( point, nonConnected ) );
        assertTrue( DisjunctLocationsForPieces.isDisjunct( nonConnected, point ) );
    }
    
    private void checkNeigbourhood( Location source ) {

        Set<Location> neighbourhood = DisjunctLocationsForPieces.getConnectedLocationsWithDistanceLengthTwo( source );

        Set<Location> edge = DisjunctLocationsForPieces.getAdjacentByEdgeLocations( source );
        Set<Location> point = DisjunctLocationsForPieces.getAdjacentByPointLocations( source );
        Set<Location> nonConnected = DisjunctLocationsForPieces.getNonAdjacentLocations( source );
//      System.out.println( "Source: " + source.getCoordinate( ).getName( ) );
//      DisjunctLocationsForPieces.printSet( neighbourhood );
//      DisjunctLocationsForPieces.printSet( edge );
//      DisjunctLocationsForPieces.printSet( point );
//      DisjunctLocationsForPieces.printSet( nonConnected );
        Set<Location> createdNeighbourhood = new HashSet<Location>( );
        DisjunctLocationsForPieces.unite( createdNeighbourhood, edge );
        DisjunctLocationsForPieces.unite( createdNeighbourhood, point );
        DisjunctLocationsForPieces.unite( createdNeighbourhood, nonConnected );
        createdNeighbourhood.add( source );
//      DisjunctLocationsForPieces.printSet( createdNeighbourhood );
        
        assertTrue( DisjunctLocationsForPieces.isSubset( neighbourhood, createdNeighbourhood ) );
    }

}
