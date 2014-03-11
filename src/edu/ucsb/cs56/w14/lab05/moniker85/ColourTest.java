package edu.ucsb.cs56.w14.lab05.moniker85;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Colour

    @author Phill Conrad
    @author Dwayne Conard
    @version 2014/01/30 for lab04, cs56, W14
    @see Colour

*/

public class ColourTest {

    /** Test case for getRGB method of Colour
     @see Colour#getRGB
    */

    @Test
	public void test_getRGB() {
	Colour c1 = new Colour("127000255","Purple");
	assertEquals("127000255",c1.getRGB());
    }


    /** Test case for getName method of Colour
     @see Colour#getName
    */

    @Test
	public void test_getName() {
	Colour c1 = new Colour("127000255","Purple");
	assertEquals("Purple",c1.getName());
    }

    /** Test case for toString
     @see Colour#toString
    */

    @Test
	public void test_toString() {
        Colour c1 = new Colour("127000255","Purple");
	assertEquals("[127000255,Purple]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Colour#equals
    */

    @Test
	public void test_equals1() {
	Colour c1 = new Colour("127000255","Purple");
	Colour c2 = new Colour("127000255","Purple");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Colour#equals
    */

    @Test
	public void test_equals2() {
	Colour c1 = new Colour("127000255","Purple");
	Colour c2 = new Colour("255002153","Purple");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Colour#hashCode
    */

    @Test
	public void test_hashCode1() {
	Colour c1 = new Colour("127000255","Purple");
	Colour c2 = new Colour("127000255","Purple");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Colour#hashCode
    */

    @Test
	public void test_hashCode2() {
	Colour c1 = new Colour("127000255","Purple");
	Colour c3 = new Colour("255255255","White");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
