package edu.ucsb.cs56.w14.lab05.bzimm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Cereal

    @author Phill Conrad
    @author Blake Zimmerman
    @version 2014/01/30 for lab04, cs56, W14
    @see Constellation

*/

public class ConstellationTest {

    /** Test case for getName method of Constellation
     @see Constellation#getName
    */

    @Test
	public void test_getName() {
	Constellation c1 = new Constellation("Orion","the Hunter","NQ1",7);
	assertEquals("Orion",c1.getName());
    }


    /** Test case for getSymbol method of Constellation
     @see Constellation#getSymbol
    */

    @Test
	public void test_getSymbol() {
	Constellation c1 = new Constellation("Orion","the Hunter","NQ1",7);
	assertEquals("the Hunter",c1.getSymbol());
    }


    /** Test case for getQuadrant method of Constellation
     @see Constellation#getQuadrant
    */

    @Test
        public void test_getQuadrant() {
	Constellation c1 = new Constellation("Orion","the Hunter","NQ1",7);
	assertEquals("NQ1",c1.getQuadrant());
    }


    /** Test case for getMainStars method of Constellation
     @see Constellation#getMainStars
    */

    @Test
        public void test_getMainStars() {
	Constellation c1 = new Constellation("Orion","the Hunter","NQ1",7);
	assertEquals(7,c1.getMainStars());
    }
    /** Test case for toString
     @see Constellation#toString
    */

    @Test
	public void test_toString() {
	Constellation c1 = new Constellation("Orion","the Hunter","NQ1",7);
	assertEquals("[Orion,the Hunter,NQ1,7]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Constellation#equals
    */

    @Test
	public void test_equals1() {
	Constellation c1 = new Constellation("Orion","the Hunter","NQ1",7);
	Constellation c2 = new Constellation("Orion","the Hunter","NQ1",7);
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Constellation#equals
    */

    @Test
	public void test_equals2() {
	Constellation c1 = new Constellation("Orion","the Hunter","NQ1",7);
	Constellation c2 = new Constellation("Taurus","the Bull","NQ1",14);
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Constellation#hashCode
    */

    @Test
	public void test_hashCode1() {
	Constellation c1 = new Constellation("Orion","the Hunter","NQ1",7);
	Constellation c2 = new Constellation("Orion","the Hunter","NQ1",7);
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Constellation#hashCode
    */

    @Test
	public void test_hashCode2() {
	Constellation c1 = new Constellation("Orion","the Hunter","NQ1",7);
	Constellation c3 = new Constellation("Taurus","the Bull","NQ1",14);
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
