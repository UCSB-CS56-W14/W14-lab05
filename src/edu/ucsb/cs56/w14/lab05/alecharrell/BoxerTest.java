package edu.ucsb.cs56.w14.lab05.alecharrell;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Boxer

    @author Phill Conrad
    @author Alec Harrell
    @version 2014/02/03 for lab04, cs56, W14
    @see Boxer

*/

public class BoxerTest {

    /** Test case for getSSN method of Boxer
     @see Boxer#getSSN
    */

    @Test
	public void test_getSSN() {
	Boxer b1 = new Boxer(123456789,"Ali");
	assertEquals(123456789,b1.getSSN());
    }


    /** Test case for getName method of Boxer
     @see Boxer#getName
    */

    @Test
	public void test_getName() {
	Boxer b1 = new Boxer(123456789,"Ali");
	assertEquals("Ali",b1.getName());
    }

    /** Test case for toString
     @see Boxer#toString
    */

    @Test
	public void test_toString() {
	Boxer b1 = new Boxer(123456789,"Ali");
	assertEquals("[123456789,Ali]",b1.toString());
    }

    /** Test case 1 for .equals
     @see Boxer#toString
    */

    @Test
	public void test_equals1() {
	Boxer b1 = new Boxer(123456789,"Ali");
	Boxer b2 = new Boxer(123456789,"Ali");
	assertTrue(b1.equals(b2));
    }

    /** Test case 2 for .equals
     @see Boxer#toString
    */

    @Test
	public void test_equals2() {
	Boxer b1 = new Boxer(123456789,"Ali");
	Boxer b2 = new Boxer(987654321,"Frazier");
	assertFalse(b1.equals(b2));
    }

    /** Test case 1 for .hashCode
     @see Boxer#hashCode
    */

    @Test
	public void test_hashCode1() {
	Boxer b1 = new Boxer(123456789,"Ali");
	Boxer b2 = new Boxer(123456789,"Ali");
	assertTrue(b1.hashCode()==b2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Boxer#hashCode
    */

    @Test
	public void test_hashCode2() {
	Boxer b1 = new Boxer(123456789,"Ali");
	Boxer b3 = new Boxer(987654321,"Ali");
	assertTrue(b1.hashCode()!=b3.hashCode());
    }

}
