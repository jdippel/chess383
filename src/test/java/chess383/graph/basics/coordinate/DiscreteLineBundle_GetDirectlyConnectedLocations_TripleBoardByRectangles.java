/*
 *  DiscreteLineBundle_GetDirectlyConnectedLocations_TripleBoardByRectangles.java
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

package chess383.graph.basics.coordinate;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.graph.basics.coordinate.Location;
import chess383.graph.basics.coordinate.board.DiscreteLineBundle;
import chess383.graph.basics.coordinate.board.TripleBoardByRectangles;

/**
 * <p>
 * The class DiscreteLineBundle_GetDirectlyConnectedLocations_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetDirectlyConnectedLocations_TripleBoardByRectangles { 

    @BeforeClass public static void beforeAll( ) { TripleBoardByRectangles.defineBoard( ); }
    
    /**
     * the public method Set<Location> getDirectlyConnectedLocations is tested.
     */

    private final String square;
    private final String expected;

    public DiscreteLineBundle_GetDirectlyConnectedLocations_TripleBoardByRectangles( String square, String expected ) {

        this.square = square;
        this.expected = expected;
    }
    
    private void compareSetOfLocations( String expected, Set<Location> squares ) {
        
        String[] tokens = expected.split( "\\s+" );
        assertEquals( "Sets must be of same size:", tokens.length, squares.size( ) );
        for( String square : tokens ) {
            assertEquals( "", true, squares.contains( Location.getInstance( square ) ) );
        }
    }

    @Test
    public void compareTheNeighbouredSquaresForAGivenLocation( ) {
        
        Location location = Location.getInstance( this.square );
        Set<Location> received = DiscreteLineBundle.getDirectlyConnectedLocations( location );
        
        compareSetOfLocations( this.expected, received );
    }
    
    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );
        
        parameters.add( new Object[] { "a1", "a2 b1 b2" } );
        parameters.add( new Object[] { "a2", "a1 b1 b2 b3 a3" } );
        parameters.add( new Object[] { "a3", "a2 b2 b3 b4 a4" } );
        parameters.add( new Object[] { "a4", "a3 b3 b4 b5 a5" } );
        parameters.add( new Object[] { "a5", "a4 b4 b5 b6 a6" } );
        parameters.add( new Object[] { "a6", "a5 b5 b6 b7 a7" } );
        parameters.add( new Object[] { "a7", "a6 b6 b7 b8 a8" } );
        parameters.add( new Object[] { "a8", "a7 b7 b8" } );
        parameters.add( new Object[] { "b1", "a1 a2 b2 c2 c1" } );
        parameters.add( new Object[] { "b2", "a1 a2 a3 b3 c3 c2 c1 b1" } );
        parameters.add( new Object[] { "b3", "a2 a3 a4 b4 c4 c3 c2 b2" } );
        parameters.add( new Object[] { "b4", "a3 a4 a5 b5 c5 c4 c3 b3" } );
        parameters.add( new Object[] { "b5", "a4 a5 a6 b6 c6 c5 c4 b4" } );
        parameters.add( new Object[] { "b6", "a5 a6 a7 b7 c7 c6 c5 b5" } );
        parameters.add( new Object[] { "b7", "a6 a7 a8 b8 c8 c7 c6 b6" } );
        parameters.add( new Object[] { "b8", "a7 a8 c8 c7 b7" } );
        parameters.add( new Object[] { "c1", "b1 b2 c2 d2 d1" } );
        parameters.add( new Object[] { "c2", "b1 b2 b3 c3 d3 d2 d1 c1" } );
        parameters.add( new Object[] { "c3", "b2 b3 b4 c4 d4 d3 d2 c2" } );
        parameters.add( new Object[] { "c4", "b3 b4 b5 c5 d5 d4 d3 c3" } );
        parameters.add( new Object[] { "c5", "b4 b5 b6 c6 d6 d5 d4 c4" } );
        parameters.add( new Object[] { "c6", "b5 b6 b7 c7 d7 d6 d5 c5" } );
        parameters.add( new Object[] { "c7", "b6 b7 b8 c8 d8 d7 d6 c6" } );
        parameters.add( new Object[] { "c8", "b7 b8 d8 d7 c7" } );
        parameters.add( new Object[] { "d1", "c1 c2 d2 e2 e1" } );
        parameters.add( new Object[] { "d2", "c1 c2 c3 d3 e3 e2 e1 d1" } );
        parameters.add( new Object[] { "d3", "c2 c3 c4 d4 e4 e3 e2 d2" } );
        parameters.add( new Object[] { "d4", "c3 c4 c5 d5 i5 e9 e4 e3 d3" } );
        parameters.add( new Object[] { "d5", "c4 c5 c6 d6 i6 i5 i9 e4 d4" } );
        parameters.add( new Object[] { "d6", "c5 c6 c7 d7 i7 i6 i5 d5" } );
        parameters.add( new Object[] { "d7", "c6 c7 c8 d8 i8 i7 i6 d6" } );
        parameters.add( new Object[] { "d8", "c7 c8 i8 i7 d7" } );
        parameters.add( new Object[] { "e1", "d1 d2 e2 f2 f1" } );
        parameters.add( new Object[] { "e2", "d1 d2 d3 e3 f3 f2 f1 e1" } );
        parameters.add( new Object[] { "e3", "d2 d3 d4 e4 f4 f3 f2 e2" } );
        parameters.add( new Object[] { "e4", "d3 d4 d5 i9 e9 f9 f4 f3 e3" } );
        parameters.add( new Object[] { "e9", "d4 i5 i9 i10 e10 f10 f9 f4 e4" } );
        parameters.add( new Object[] { "e10", "e11 f11 f10 f9 e9 i9 i10 i11" } );
        parameters.add( new Object[] { "e11", "e12 f12 f11 f10 e10 i10 i11 i12" } );
        parameters.add( new Object[] { "e12", "f12 f11 e11 i11 i12" } );
        parameters.add( new Object[] { "f1", "e1 e2 f2 g2 g1" } );
        parameters.add( new Object[] { "f2", "e1 e2 e3 f3 g3 g2 g1 f1" } );
        parameters.add( new Object[] { "f3", "e2 e3 e4 f4 g4 g3 g2 f2" } );
        parameters.add( new Object[] { "f4", "e3 e4 e9 f9 g9 g4 g3 f3" } );
        parameters.add( new Object[] { "f9", "e4 f4 g4 g9 g10 f10 e10 e9" } );
        parameters.add( new Object[] { "f10", "e9 e10 e11 f11 g11 g10 g9 f9" } );
        parameters.add( new Object[] { "f11", "e10 e11 e12 f12 g12 g11 g10 f10" } );
        parameters.add( new Object[] { "f12", "e11 e12 g12 g11 f11" } );
        parameters.add( new Object[] { "g1", "f1 f2 g2 h2 h1" } );
        parameters.add( new Object[] { "g2", "f1 f2 f3 g3 h3 h2 h1 g1" } );
        parameters.add( new Object[] { "g3", "f2 f3 f4 g4 h4 h3 h2 g2" } );
        parameters.add( new Object[] { "g4", "f3 f4 f9 g9 h9 h4 h3 g3" } );
        parameters.add( new Object[] { "g9", "f4 f9 f10 g10 h10 h9 h4 g4" } );
        parameters.add( new Object[] { "g10", "f9 f10 f11 g11 h11 h10 h9 g9" } );
        parameters.add( new Object[] { "g11", "f10 f11 f12 g12 h12 h11 h10 g10" } );
        parameters.add( new Object[] { "g12", "f11 f12 h12 h11 g11" } );
        parameters.add( new Object[] { "h1", "g1 g2 h2" } );
        parameters.add( new Object[] { "h2", "g1 g2 g3 h3 h1" } );
        parameters.add( new Object[] { "h3", "g2 g3 g4 h4 h2" } );
        parameters.add( new Object[] { "h4", "g3 g4 g9 h9 h3" } );
        parameters.add( new Object[] { "h9", "g4 g9 g10 h10 h4" } );
        parameters.add( new Object[] { "h10", "g9 g10 g11 h11 h9" } );
        parameters.add( new Object[] { "h11", "g10 g11 g12 h12 h10" } );
        parameters.add( new Object[] { "h12", "g11 g12 h11" } );
        parameters.add( new Object[] { "i5", "d4 d5 d6 i6 j6 j5 j9 i9 e9" } );
        parameters.add( new Object[] { "i6", "d5 d6 d7 i7 j7 j6 j5 i5" } );
        parameters.add( new Object[] { "i7", "d6 d7 d8 i8 j8 j7 j6 i6" } );
        parameters.add( new Object[] { "i8", "d7 d8 j8 j7 i7" } );
        parameters.add( new Object[] { "i9", "d5 e4 e9 e10 i10 j10 j9 j5 i5" } );
        parameters.add( new Object[] { "i10", "e9 e10 e11 i11 j11 j10 j9 i9" } );
        parameters.add( new Object[] { "i11", "e10 e11 e12 i12 j12 j11 j10 i10" } );
        parameters.add( new Object[] { "i12", "e11 e12 j12 j11 i11" } );
        parameters.add( new Object[] { "j5", "i5 i6 j6 k6 k5 k9 j9 i9" } );
        parameters.add( new Object[] { "j6", "i5 i6 i7 j7 k7 k6 k5 i5" } );
        parameters.add( new Object[] { "j7", "i6 i7 i8 j8 k8 k7 k6 i6" } );
        parameters.add( new Object[] { "j8", "i7 i8 k8 k7 i7" } );
        parameters.add( new Object[] { "j9", "i5 i9 i10 j10 k10 k9 k5 j5" } );
        parameters.add( new Object[] { "j10", "i9 i10 i11 j11 k11 k10 k9 j9" } );
        parameters.add( new Object[] { "j11", "i10 i11 i12 j12 k12 k11 k10 j10" } );
        parameters.add( new Object[] { "j12", "i11 i12 k12 k11 j11" } );
        parameters.add( new Object[] { "k5", "j6 j5 j9 k9 l9 l5 l6 k6" } );
        parameters.add( new Object[] { "k6", "j7 j6 j5 k5 l5 l6 l7 k7" } );
        parameters.add( new Object[] { "k7", "j8 j7 j6 k6 l6 l7 l8 k8" } );
        parameters.add( new Object[] { "k8", "j8 j7 k7 l7 l8" } );
        parameters.add( new Object[] { "k9", "j5 j9 j10 k10 l10 l9 l5 k5" } );
        parameters.add( new Object[] { "k10", "j9 j10 j11 k11 l11 l10 l9 k9" } );
        parameters.add( new Object[] { "k11", "j10 j11 j12 k12 l12 l11 l10 k10" } );
        parameters.add( new Object[] { "k12", "j11 j12 l12 l11 l11" } );
        parameters.add( new Object[] { "l5", "k6 k5 k9 l9 l6" } );
        parameters.add( new Object[] { "l6", "k7 k6 k5 l5 l7" } );
        parameters.add( new Object[] { "l7", "k8 k7 k6 l6 l8" } );
        parameters.add( new Object[] { "l8", "k8 k7 l7" } );
        parameters.add( new Object[] { "l9", "l5 k5 k9 k10 l10" } );
        parameters.add( new Object[] { "l10", "l9 k9 k10 k11 l11" } );
        parameters.add( new Object[] { "l11", "l10 k10 k11 k12 l12" } );
        parameters.add( new Object[] { "l12", "l11 k11 k12" } );
       
        return( parameters );
    }
}

