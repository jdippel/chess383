/*
 *  DiscreteLineBundle_GetLineBundles_AdjacentByEdgeWhiteRed_TripleBoardByRectangles.java
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

package chess383.graph.basics.coordinate;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import chess383.graph.basics.coordinate.board.TripleBoardByRectangles;
import chess383.graph.color.DirectedByColorEnum;

/**
 * <p>
 * The class DiscreteLineBundle_GetLineBundles_AdjacentByEdgeWhiteRed_TripleBoardByRectangles implements an upper tester
 * </p>
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith(Parameterized.class)
public class DiscreteLineBundle_GetLineBundles_AdjacentByEdgeWhiteRed_TripleBoardByRectangles 
extends DiscreteLineBundle_GetLineBundles_Wrapper { 

    @BeforeClass public static void beforeAll( ) { 
        TripleBoardByRectangles.defineBoard( ); 
        setOrientation( DirectedByColorEnum.ADJACENT_BY_EDGE_WHITE_RED );
    }
    
    /**
     * the public method DiscreteLine getLineBundles( ) is tested.
     */
    public DiscreteLineBundle_GetLineBundles_AdjacentByEdgeWhiteRed_TripleBoardByRectangles( String square, String expected ) {

        super( square, expected );
    }

    @Test
    public void compareTheSquares( ) {
        
        assertTrue( verifyMethod( this.square, this.expected ) );
    }
   

    @Parameters
    public static Collection<Object[]> testCases( ) {

        Collection<Object[]> parameters = new ArrayList<Object[]>( );

        parameters.add( new Object[] { "a1", "" } );
        parameters.add( new Object[] { "a2", "" } );
        parameters.add( new Object[] { "a3", "" } );
        parameters.add( new Object[] { "a4", "" } );
        parameters.add( new Object[] { "a5", "" } );
        parameters.add( new Object[] { "a6", "" } );
        parameters.add( new Object[] { "a7", "" } );
        parameters.add( new Object[] { "a8", "" } );
        
        parameters.add( new Object[] { "b1", "" } );
        parameters.add( new Object[] { "b2", "" } );
        parameters.add( new Object[] { "b3", "" } );
        parameters.add( new Object[] { "b4", "" } );
        parameters.add( new Object[] { "b5", "" } );
        parameters.add( new Object[] { "b6", "" } );
        parameters.add( new Object[] { "b7", "" } );
        parameters.add( new Object[] { "b8", "" } );
        
        parameters.add( new Object[] { "c1", "" } );
        parameters.add( new Object[] { "c2", "" } );
        parameters.add( new Object[] { "c3", "" } );
        parameters.add( new Object[] { "c4", "" } );
        parameters.add( new Object[] { "c5", "" } );
        parameters.add( new Object[] { "c6", "" } );
        parameters.add( new Object[] { "c7", "" } );
        parameters.add( new Object[] { "c8", "" } );
        
        parameters.add( new Object[] { "d1", "" } );
        parameters.add( new Object[] { "d2", "" } );
        parameters.add( new Object[] { "d3", "" } );
        parameters.add( new Object[] { "d4", "" } );
        parameters.add( new Object[] { "d5", "" } );
        parameters.add( new Object[] { "d6", "" } );
        parameters.add( new Object[] { "d7", "" } );
        parameters.add( new Object[] { "d8", "" } );
            
        parameters.add( new Object[] { "e1", "directed from white to red: e1 e2 e3 e4 e9 e10 e11 e12" } );
        parameters.add( new Object[] { "e2", "directed from white to red: e1 e2 e3 e4 e9 e10 e11 e12" } );
        parameters.add( new Object[] { "e3", "directed from white to red: e1 e2 e3 e4 e9 e10 e11 e12" } );
        parameters.add( new Object[] { "e4", "directed from white to red: e1 e2 e3 e4 e9 e10 e11 e12" } );
        parameters.add( new Object[] { "e9", "directed from white to red: e1 e2 e3 e4 e9 e10 e11 e12" } );
        parameters.add( new Object[] { "e10", "directed from white to red: e1 e2 e3 e4 e9 e10 e11 e12" } );
        parameters.add( new Object[] { "e11", "directed from white to red: e1 e2 e3 e4 e9 e10 e11 e12" } );
        parameters.add( new Object[] { "e12", "directed from white to red: e1 e2 e3 e4 e9 e10 e11 e12" } );
        
        parameters.add( new Object[] { "f1", "directed from white to red: f1 f2 f3 f4 f9 f10 f11 f12" } );
        parameters.add( new Object[] { "f2", "directed from white to red: f1 f2 f3 f4 f9 f10 f11 f12" } );
        parameters.add( new Object[] { "f3", "directed from white to red: f1 f2 f3 f4 f9 f10 f11 f12" } );
        parameters.add( new Object[] { "f4", "directed from white to red: f1 f2 f3 f4 f9 f10 f11 f12" } );
        parameters.add( new Object[] { "f9", "directed from white to red: f1 f2 f3 f4 f9 f10 f11 f12" } );
        parameters.add( new Object[] { "f10", "directed from white to red: f1 f2 f3 f4 f9 f10 f11 f12" } );
        parameters.add( new Object[] { "f11", "directed from white to red: f1 f2 f3 f4 f9 f10 f11 f12" } );
        parameters.add( new Object[] { "f12", "directed from white to red: f1 f2 f3 f4 f9 f10 f11 f12" } );
        
        parameters.add( new Object[] { "g1", "directed from white to red: g1 g2 g3 g4 g9 g10 g11 g12" } );
        parameters.add( new Object[] { "g2", "directed from white to red: g1 g2 g3 g4 g9 g10 g11 g12" } );
        parameters.add( new Object[] { "g3", "directed from white to red: g1 g2 g3 g4 g9 g10 g11 g12" } );
        parameters.add( new Object[] { "g4", "directed from white to red: g1 g2 g3 g4 g9 g10 g11 g12" } );
        parameters.add( new Object[] { "g9", "directed from white to red: g1 g2 g3 g4 g9 g10 g11 g12" } );
        parameters.add( new Object[] { "g10", "directed from white to red: g1 g2 g3 g4 g9 g10 g11 g12" } );
        parameters.add( new Object[] { "g11", "directed from white to red: g1 g2 g3 g4 g9 g10 g11 g12" } );
        parameters.add( new Object[] { "g12", "directed from white to red: g1 g2 g3 g4 g9 g10 g11 g12" } );
      
        parameters.add( new Object[] { "h1", "directed from white to red: h1 h2 h3 h4 h9 h10 h11 h12" } );
        parameters.add( new Object[] { "h2", "directed from white to red: h1 h2 h3 h4 h9 h10 h11 h12" } );
        parameters.add( new Object[] { "h3", "directed from white to red: h1 h2 h3 h4 h9 h10 h11 h12" } );
        parameters.add( new Object[] { "h4", "directed from white to red: h1 h2 h3 h4 h9 h10 h11 h12" } );
        parameters.add( new Object[] { "h9", "directed from white to red: h1 h2 h3 h4 h9 h10 h11 h12" } );
        parameters.add( new Object[] { "h10", "directed from white to red: h1 h2 h3 h4 h9 h10 h11 h12" } );
        parameters.add( new Object[] { "h11", "directed from white to red: h1 h2 h3 h4 h9 h10 h11 h12" } );
        parameters.add( new Object[] { "h12", "directed from white to red: h1 h2 h3 h4 h9 h10 h11 h12" } );
              
        parameters.add( new Object[] { "i5", "" } );
        parameters.add( new Object[] { "i6", "" } );
        parameters.add( new Object[] { "i7", "" } );
        parameters.add( new Object[] { "i8", "" } );
        parameters.add( new Object[] { "i9", "" } );
        parameters.add( new Object[] { "i10", "" } );
        parameters.add( new Object[] { "i11", "" } );
        parameters.add( new Object[] { "i12", "" } );
        
        parameters.add( new Object[] { "j5", "" } );
        parameters.add( new Object[] { "j6", "" } );
        parameters.add( new Object[] { "j7", "" } );
        parameters.add( new Object[] { "j8", "" } );
        parameters.add( new Object[] { "j9", "" } );
        parameters.add( new Object[] { "j10", "" } );
        parameters.add( new Object[] { "j11", "" } );
        parameters.add( new Object[] { "j12", "" } );
        
        parameters.add( new Object[] { "k5", "" } );
        parameters.add( new Object[] { "k6", "" } );
        parameters.add( new Object[] { "k7", "" } );
        parameters.add( new Object[] { "k8", "" } );
        parameters.add( new Object[] { "k9", "" } );
        parameters.add( new Object[] { "k10", "" } );
        parameters.add( new Object[] { "k11", "" } );
        parameters.add( new Object[] { "k12", "" } );
        
        parameters.add( new Object[] { "l5", "" } );
        parameters.add( new Object[] { "l6", "" } );
        parameters.add( new Object[] { "l7", "" } );
        parameters.add( new Object[] { "l8", "" } );
        parameters.add( new Object[] { "l9", "" } );
        parameters.add( new Object[] { "l10", "" } );
        parameters.add( new Object[] { "l11", "" } );
        parameters.add( new Object[] { "l12", "" } );
        
        return( parameters );
    }
}

