package edu.ucsb.cs56.w14.lab05.khaliddhanani;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Hat

    @author Phill Conrad
    @author Sohan Shah
    @author Khalid Dhanani
    @version 2014/01/30 for lab04, cs56, W14
    @see Hat

*/

public class HatTest {

    /** Test case for getSerialNum method of Hat
     @see Hat#getSerialNum
    */

    @Test
	public void test_getSerialNum() {
        Hat h1 = new Hat("00127288","UNDFTD");
	assertEquals("00127288",h1.getSerialNum());
    }


    /** Test case for getBrand method of Hat
     @see Hat#getBrand
    */

    @Test
	public void test_getBrand() {
        Hat h1 = new Hat("00127288","UNDFTD");
	assertEquals("UNDFTD",h1.getBrand());
    }

    /** Test case for toString
     @see Hat#toString
    */

    @Test
	public void test_toString() {
	Hat h1 = new Hat("00127288","UNDFTD");
	assertEquals("[00127288,UNDFTD]",h1.toString());
    }

    /** Test case 1 for .equals
     @see Hat#toString
    */

    @Test
	public void test_equals1() {
	Hat h1 = new Hat("00127288","UNDFTD");
	Hat h2 = new Hat("00127288","UNDFTD");
	assertTrue(h1.equals(h2));
    }

    /** Test case 2 for .equals
     @see Hat#toString
    */

    @Test
	public void test_equals2() {
	Hat h1 = new Hat("00127288","UNDFTD");
	Hat h2 = new Hat("99999999","UNDFTD");
	assertFalse(h1.equals(h2));
    }

    /** Test case 1 for .hashCode
     @see Hat#hashCode
    */

    @Test
	public void test_hashCode1() {
	Hat h1 = new Hat("00127288","UNDFTD");
	Hat h2 = new Hat("00127288","UNDFTD");
	assertTrue(h1.hashCode()==h2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Hat#hashCode
    */

    @Test
	public void test_hashCode2() {
	Hat h1 = new Hat("00127288","UNDFTD");
	Hat h3 = new Hat("99999999","UNDFTD");
	assertTrue(h1.hashCode()!=h3.hashCode());
    }

}
