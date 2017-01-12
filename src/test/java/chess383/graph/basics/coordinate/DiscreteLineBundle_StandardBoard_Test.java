/*
 *  DiscreteLineBundle_StandardBoard_Test.java
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

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * The class DiscreteLineBundle_StandardBoard_Test composes a suite of upper testers
 *
 * @author    J&ouml;rg Dippel
 * @version   January 2017
 *
 */
@RunWith( value = Suite.class )
@SuiteClasses( value = {
               DiscreteLineBundle_GetLineBundles_StandardBoard.class,
               DiscreteLineBundle_GetLineBundles_NotAdjacent_StandardBoard.class,
               DiscreteLineBundle_GetLineBundles_AdjacentByEdgeButNotDirected_StandardBoard.class,
               DiscreteLineBundle_GetLineBundles_AdjacentByEdgeWhiteBlack_StandardBoard.class,
               DiscreteLineBundle_GetLineBundles_AdjacentByPointWhiteBlack_StandardBoard.class,
               DiscreteLineBundle_GetCommonLine_StandardBoard.class,
               DiscreteLineBundle_GetAllLocations_StandardBoard.class,
               DiscreteLineBundle_GetDirectlyConnectedLocations_StandardBoard.class } )
public class DiscreteLineBundle_StandardBoard_Test {
    // empty: annotations define the suite
}

