package edu.ucsb.cs56.w14.lab05.vinlara;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Watch

    @author Phill Conrad
    @author Vincente Lara
    @version 2014/02/04 for lab04, cs56, W14
    @see Watch 

*/

public class WatchTest {

    /** Test case for getModel method of Watch
     @see Watch#getModel
    */

    @Test
	public void test_getModel() {
	Watch c1 = new Watch("00127288","Trader Joe's Raisin Bran");
	assertEquals("00127288",c1.getModel());
    }


    /** Test case for getBrand method of Watch
     @see Watch#getBrand
    */

    @Test
	public void test_getBrand() {
	Watch c1 = new Watch("00127288","Trader Joe's Raisin Bran");
	assertEquals("Trader Joe's Raisin Bran",c1.getBrand());
    }

    /** Test case for toString
     @see Watch#toString
    */

    @Test
	public void test_toString() {
	Watch c1 = new Watch("00127288","Trader Joe's Raisin Bran");
	assertEquals("[00127288,Trader Joe's Raisin Bran]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Watch#toString
    */

    @Test
	public void test_equals1() {
	Watch c1 = new Watch("00127288","Trader Joe's Raisin Bran");
	Watch c2 = new Watch("00127288","Trader Joe's Raisin Bran");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Watch#toString
    */

    @Test
	public void test_equals2() {
	Watch c1 = new Watch("00127288","Trader Joe's Raisin Bran");
	Watch c2 = new Watch("99999999","Trader Joe's Raisin Bran");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Watch#hashCode
    */

    @Test
	public void test_hashCode1() {
	Watch c1 = new Watch("00127288","Trader Joe's Raisin Bran");
	Watch c2 = new Watch("00127288","Trader Joe's Raisin Bran");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Watch#hashCode
    */

    @Test
	public void test_hashCode2() {
	Watch c1 = new Watch("00127288","Trader Joe's Raisin Bran");
	Watch c3 = new Watch("99999999","Trader Joe's Raisin Bran");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
