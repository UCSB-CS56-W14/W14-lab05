package edu.ucsb.cs56.w14.lab05.ShadowAries;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Subwoofers

    @author Phill Conrad
    @author Wei-Chieh George Shih
    @version 02/13/2014 for lab04, cs56, W14
    @see Subwoofers

*/

public class SubwoofersTest {

    /** Test case for getSerialNumber method of Subwoofers
     @see Subwoofers#getSerialNumber
    */

    @Test
	public void test_getSerialNumber() {
	Subwoofers s1 = new Subwoofers(123456,96.5f);
	assertEquals(123456,s1.getSerialNumber());
    }


    /** Test case for getSensitivity method of Subwoofers
     @see Subwoofers#getSensitivity
    */

    @Test
	public void test_getSensitivity() {
	Subwoofers s1 = new Subwoofers(123456,96.5f);
	assertEquals(96.5,s1.getSensitivity(),0);
    }

    /** Test case for toString
     @see Subwoofers#toString
    */

    @Test
	public void test_toString() {
	Subwoofers s1 = new Subwoofers(123456,96.5f);
	assertEquals("[123456,96.5]",s1.toString());
    }

    /** Test case 1 for .equals
     @see Subwoofers#toString
    */

    @Test
	public void test_equals1() {
	Subwoofers s1 = new Subwoofers(123456,96.5f);
	Subwoofers s2 = new Subwoofers(123456,96.5f);
	assertTrue(s1.equals(s2));
    }

    /** Test case 2 for .equals
     @see Subwoofers#toString
    */

    @Test
	public void test_equals2() {
	Subwoofers s1 = new Subwoofers(123456,96.5f);
	Subwoofers s2 = new Subwoofers(999999,96.5f);
	assertFalse(s1.equals(s2));
    }

    /** Test case 1 for .hashCode
     @see Subwoofers#hashCode
    */

    @Test
	public void test_hashCode1() {
	Subwoofers s1 = new Subwoofers(123456,96.5f);
        Subwoofers s2 = new Subwoofers(123456,96.5f);
        assertTrue(s1.hashCode()==s2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Subwoofers#hashCode
    */

    @Test
	public void test_hashCode2() {
	Subwoofers s1 = new Subwoofers(123456,96.5f);
        Subwoofers s3 = new Subwoofers(999999,96.5f);
	assertTrue(s1.hashCode()!=s3.hashCode());
    }

}
