package edu.ucsb.cs56.w14.lab05.paranoia1120;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Usps

    @author Phill Conrad
    @author Yue Xin
    @version 2014/02/06 for lab05, cs56, W14
    @see Usps 

*/

public class UspsTest {

    /** Test case for getTrackingNum method of Usps
     @see Usps#getTrackingNum
    */

    @Test
	public void test_getTrackingNum() {
	Usps c1 = new Usps("9405509","Ariel");
	assertEquals("9405509",c1.getTrackingNum());
    }


    /** Test case for getName method of Usps
     @see Usps#getName
    */

    @Test
	public void test_getName() {
	Usps c1 = new Usps("9405509","Ariel");
	assertEquals("Ariel",c1.getName());
    }

    /** Test case for toString
     @see Usps#toString
    */

    @Test
	public void test_toString() {
	Usps c1 = new Usps("9405509","Ariel");
	assertEquals("[9405509,Ariel]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Usps#equals
    */

    @Test
	public void test_equals1() {
	Usps c1 = new Usps("9405509","Ariel");
	Usps c2 = new Usps("9405509","Ariel");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Usps#equals
    */

    @Test
	public void test_equals2() {
	Usps c1 = new Usps("9405509","Ariel");
	Usps c2 = new Usps("6999381","Ariel");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Usps#hashCode
    */

    @Test
	public void test_hashCode1() {
	Usps c1 = new Usps("9405509","Ariel");
	Usps c2 = new Usps("9405509","Ariel");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Usps#hashCode
    */

    @Test
	public void test_hashCode2() {
	Usps c1 = new Usps("9405509","Ariel");
	Usps c3 = new Usps("6999381","Ariel");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
