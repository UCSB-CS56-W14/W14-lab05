package edu.ucsb.cs56.w14.lab05.kjih;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Patient

    @author Phill Conrad
    @author Kevin Jih
    @version 2014/01/30 for lab04, cs56, W14
    @see Patient

*/

public class PatientTest {

    /** Test case for getSSN method of Patient
     @see Patient#getSSN
    */

    @Test
	public void test_getSSN() {
	Patient c1 = new Patient("127288","Bob Chen","fever");
	assertEquals("127288",c1.getSSN());
    }


    /** Test case for getName method of Cereal
     @see Patient#getName
    */

    @Test
	public void test_getName() {
	Patient c1 = new Patient("127288","Bob Chen","fever");
	assertEquals("Bob Chen",c1.getName());
    }

    /** Test case for toString
     @see Cereal#toString
    */

    @Test
	public void test_toString() {
	Patient c1 = new Patient("127288","Bob Chen","fever");
	assertEquals("[127288,Bob Chen,fever]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Patient#toString
    */

    @Test
	public void test_equals1() {
	Patient c1 = new Patient("127288","Bob Chen","fever");
	Patient c2 = new Patient("127288","Bob Chen","fever");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Patient#toString
    */

    @Test
	public void test_equals2() {
	Patient c1 = new Patient("127288","Bob Chen","fever");
	Patient c2 = new Patient("999999","Bob Chen","fever");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Patient#hashCode
    */

    @Test
	public void test_hashCode1() {
	Patient c1 = new Patient("127288","Bob Chen","fever");
	Patient c2 = new Patient("127288","Bob Chen","fever");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Patient#hashCode
    */

    @Test
	public void test_hashCode2() {
	Patient c1 = new Patient("127288","Bob Chen","fever");
	Patient c3 = new Patient("999999","Bob Chen","fever");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
