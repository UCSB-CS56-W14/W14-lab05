package edu.ucsb.cs56.w14.lab05.asdf;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



/** Test class for Cereal

    @author Phill Conrad
    @author Weihan Wang
    @author Bonan Yan
    @version 2014/01/30 for lab04, cs56, W14
    @see Months.java

*/

public class MonthsTest {

    /** Test case for getNumber method of Months
     @see months#getUpc
    */

    @Test
	public void test_getNumber() {
	Months c1 = new Months(4,"April");
	assertEquals(4,c1.getNumber());
    }


    /** Test case for getName method of Months
     @see months#getName
    */

    @Test
	public void test_getName() {
	Months c1 = new Months(4,"April");
	assertEquals("April",c1.getName());
    }

    /** Test case for toString
     @see Months#toString
    */

    @Test
	public void test_toString() {
	Months c1 = new Months(4,"April");
	assertEquals("[4,April]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Monthsl#toString
    */

    @Test
	public void test_equals1() {
	Months c1 = new Months(4,"April");
	Months c2 = new Months(4,"April");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Months#toString
    */

    @Test
	public void test_equals2() {
	Months c1 = new Months(4,"April");
	Months c2 = new Months(5,"May");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Months#hashCode
    */

    @Test
	public void test_hashCode1() {
	Months c1 = new Months(4,"April");
	Months c2 = new Months(4,"April");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Months#hashCode
    */

    @Test
	public void test_hashCode2() {
	Months c1 = new Months(4,"April");
	Months c3 = new Months(5,"May");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
