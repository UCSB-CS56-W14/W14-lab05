package edu.ucsb.cs56.w14.lab05.ericpalyan;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Planet

    @author Phill Conrad
    @author Eric Palyan
    @author Max Sorenson
    @version 2014/01/30 for lab04, cs56, W14
    @see Planet

*/

public class PlanetTest {

    /** Test case for getName method of Planet
     @see Planet#getName
    */

    @Test
	public void test_getName() {
	Planet p1 = new Planet("Earth", 5.9e24);
	assertEquals("Earth",p1.getName());
    }


    /** Test case for getMass method of Planet
     @see Planet#getMass
    */

    @Test
	public void test_getMass() {
	Planet p1 = new Planet("Earth",5.9e24);
	assertEquals(5.9e24, p1.getMass(),0);
    }

    /** Test case for toString
     @see Planet#toString
    */

    @Test
	public void test_toString() {
	Planet p1 = new Planet("Earth", 5.9e24);
	assertEquals("[Earth,5.9E24]", p1.toString());
    }

    /** Test case 1 for .equals
     @see Planet#toString
    */

    @Test
	public void test_equals1() {
	Planet p1 = new Planet("Earth", 5.9e24);
	Planet p2 = new Planet("Earth", 5.9e24);
	assertTrue(p1.equals(p2));
    }

    /** Test case 2 for .equals
     @see Planet#toString
    */

    @Test
	public void test_equals2() {
	Planet p1 = new Planet("Earth",5.9e24);
	Planet p2 = new Planet("Jupiter", 5.9e24);
	assertFalse(p1.equals(p2));
    }

    /** Test case 1 for .hashCode
     @see Planet#hashCode
    */

    @Test
	public void test_hashCode1() {
	Planet p1 = new Planet("Earth", 5.9e24);
	Planet p2 = new Planet("Earth", 5.9e24);
	assertTrue(p1.hashCode()==p2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Planet#hashCode
    */

    @Test
	public void test_hashCode2() {
	Planet p1 = new Planet("Earth", 5.9e24);
	Planet p2 = new Planet("Jupiter", 5.9e24);
	assertTrue(p1.hashCode()!=p2.hashCode());
    }

}
