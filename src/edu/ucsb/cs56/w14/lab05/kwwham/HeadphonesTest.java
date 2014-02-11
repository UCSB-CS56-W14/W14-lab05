package edu.ucsb.cs56.w14.lab05.kwwham;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Headphone

    @author Phill Conrad
    @author Keith Waldron
    @author Nick Abrahan
    @version 2014/01/30 for lab04, cs56, W14
    @see Headphones

*/


public class HeadphonesTest {

    /** Test case for getSerialNumber method of Headphones
     @see Headphones#getSerialNumber
    */

    @Test
	public void test_getSerialNumber() {
	Headphones h1 = new Headphones("00127288","Audio Technica");
	assertEquals("00127288",h1.getSerialNumber());
    }


    /** Test case for getName method of Headphones
     @see Headphones#getBrand
    */

    @Test
	public void test_getBrand() {
	Headphones h1 = new Headphones("00127288","Audio Techinica");
	assertEquals("Audio Techinica",h1.getBrand());
    }

    /** Test case for toString
     @see Headphones#toString
    */

    @Test
	public void test_toString() {
	Headphones h1 = new Headphones("00127288","Audio Techinica");
	assertEquals("[00127288,Audio Techinica]",h1.toString());
    }

    /** Test case 1 for .equals
     @see Headphones#equals
    */

    @Test
	public void test_equals1() {
	Headphones h1 = new Headphones("00127288","Audio Techinica");
	Headphones h2 = new Headphones("00127288","Audio Techinica");
	assertTrue(h1.equals(h2));
    }

    /** Test case 2 for .equals
     @see Headphones#equals
    */

    @Test
	public void test_equals2() {
	Headphones h1 = new Headphones("00127288","Audio Techinica");
	Headphones h2 = new Headphones("99999999","Audio Techinica");
	assertFalse(h1.equals(h2));
    }

    /** Test case 1 for .hashCode
     @see Headphones#hashCode
    */

    @Test
	public void test_hashCode1() {
	Headphones h1 = new Headphones("00127288","Audio Techinica");
	Headphones h2 = new Headphones("00127288","Audio Techinica");
	assertTrue(h1.hashCode()==h2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Headphones#hashCode
    */

    @Test
	public void test_hashCode2() {
	Headphones h1 = new Headphones("00127288","Audio Techinica");
	Headphones h3 = new Headphones("99999999","Audio Techinica");
	assertTrue(h1.hashCode()!=h3.hashCode());
    }

}
