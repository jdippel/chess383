/*
 *  Chess383_Test.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2015-2016 Jörg Dippel
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

package chess383;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import chess383.colorenum.ColorEnum_Test;
import chess383.exception.Test_Exception;
import chess383.graph.basics.Test_Basics;
import chess383.ibasics.IBasics_Test;

/**
 * The class Chess383_Test composes a suite of upper testers
 *
 * @author    J&ouml;rg Dippel
 * @version   December 2016
 *
 */
@RunWith( value = Suite.class )
@SuiteClasses( value = {
           Test_Exception.class,
           ColorEnum_Test.class,
           IBasics_Test.class,
           
           Test_Basics.class  } )
public class Chess383_Test {
    // empty: annotations define the suite
}

