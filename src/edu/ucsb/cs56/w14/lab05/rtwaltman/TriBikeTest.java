package edu.ucsb.cs56.w14.lab05.rtwaltman;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for TriBike

    @author Phill Conrad
    @author Richard Waltman
    @version 02/10/2014 for lab05, cs56, W14
    @see TriBike 

*/

public class TriBikeTest {

    /** Test case for getRegNumber method of TriBike
     @see TriBike#getRegNumber
    */

    @Test
	public void test_getRegNumber() {
	TriBike c1 = new TriBike("Specialized SHIV",54321);
	assertEquals(54321,c1.getRegNumber());
    }


    /** Test case for getModel method of TriBike
     @see TriBike#getModel
    */

    @Test
	public void test_getModel() {
	TriBike c1 = new TriBike("Specialized SHIV",54321);
	assertEquals("Specialized SHIV",c1.getModel());
    }

    /** Test case for toString
     @see TriBike#toString
    */

    @Test
	public void test_toString() {
	TriBike c1 = new TriBike("Specialized SHIV",54321);
	assertEquals("[Specialized SHIV,54321]",c1.toString());
    }

    /** Test case 1 for .equals
     @see TriBike#toString
    */

    @Test
	public void test_equals1() {
	TriBike c1 = new TriBike("Specialized SHIV",54321);
	TriBike c2 = new TriBike("Specialized SHIV",54321);
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see TriBike#toString
    */

    @Test
	public void test_equals2() {
	TriBike c1 = new TriBike("Specialized SHIV",54321);
	TriBike c2 = new TriBike("99999999",99999);
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see TriBike#hashCode
    */

    @Test
	public void test_hashCode1() {
	TriBike c1 = new TriBike("Specialized SHIV",54321);
	TriBike c2 = new TriBike("Specialized SHIV",54321);
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see TriBike#hashCode
    */

    @Test
	public void test_hashCode2() {
	TriBike c1 = new TriBike("Specialized SHIV",54321);
	TriBike c3 = new TriBike("99999999",99999);
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
