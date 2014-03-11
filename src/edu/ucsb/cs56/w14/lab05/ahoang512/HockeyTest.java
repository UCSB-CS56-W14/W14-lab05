package edu.ucsb.cs56.w14.lab05.ahoang512;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Hockey

    @author Phill Conrad
    @author Anthony Hoang
    @version 2014/01/30 for lab04, cs56, W14
    @see Hockey

*/

public class HockeyTest {

    /** Test case for getZipCode method of Hockey
     @see Hockey#getZipCode
    */

    @Test
	public void test_getZipCode() {
	Hockey c1 = new Hockey("00127288","Trader Joe's Raisin Bran");
	assertEquals("00127288",c1.getZipCode());
    }


    /** Test case for getMascot method of Hockey
     @see Hockey#getMascot
    */

    @Test
	public void test_getMascot() {
	Hockey c1 = new Hockey("00127288","Trader Joe's Raisin Bran");
	assertEquals("Trader Joe's Raisin Bran",c1.getMascot());
    }

    /** Test case for toString
     @see Hockey#toString
    */

    @Test
	public void test_toString() {
	Hockey c1 = new Hockey("00127288","Trader Joe's Raisin Bran");
	assertEquals("[00127288,Trader Joe's Raisin Bran]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Hockey#toString
    */

    @Test
	public void test_equals1() {
	Hockey c1 = new Hockey("00127288","Trader Joe's Raisin Bran");
	Hockey c2 = new Hockey("00127288","Trader Joe's Raisin Bran");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Hockey#toString
    */

    @Test
	public void test_equals2() {
	Hockey c1 = new Hockey("00127288","Trader Joe's Raisin Bran");
	Hockey c2 = new Hockey("99999999","Trader Joe's Raisin Bran");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Hockey#hashCode
    */

    @Test
	public void test_hashCode1() {
	Hockey c1 = new Hockey("00127288","Trader Joe's Raisin Bran");
	Hockey c2 = new Hockey("00127288","Trader Joe's Raisin Bran");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Hockey#hashCode
    */

    @Test
	public void test_hashCode2() {
	Hockey c1 = new Hockey("00127288","Trader Joe's Raisin Bran");
	Hockey c3 = new Hockey("99999999","Trader Joe's Raisin Bran");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
