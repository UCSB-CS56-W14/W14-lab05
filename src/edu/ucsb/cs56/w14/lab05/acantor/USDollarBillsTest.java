package edu.ucsb.cs56.w14.lab05.acantor;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for USDollarBills

    @author Phill Conrad
    @author Antonio Cantor
    @version 2014/02/06 for lab04, cs56, W14
    @see USDollarBills 

*/

public class USDollarBillsTest {
    /** Test case for getName method of USDollarBills
     @see USDollarBills#getName
    */

    @Test
	public void test_getName() {
	USDollarBills c1 = new USDollarBills("Thomas Jefferson",2);
	assertEquals("Thomas Jefferson",c1.getName());
    }


    /** Test case for getUpc method of USDollarBills
     @see USDollarBills#getValue
    */

    @Test
	public void test_value() {
	USDollarBills c1 = new USDollarBills("Thomas Jefferson",2);
	assertEquals(2,c1.getValue());
    }


    /** Test case for toString
     @see USDollarBills#toString
    */

    @Test
	public void test_toString() {
	USDollarBills c1 = new USDollarBills("Thomas Jefferson",2);
	assertEquals("[Thomas Jefferson,2]",c1.toString());
    }

    /** Test case 1 for .equals
     @see USDollarBills#toString
    */

    @Test
	public void test_equals1() {
	USDollarBills c1 = new USDollarBills("Thomas Jefferson",2);
	USDollarBills c2 = new USDollarBills("Thomas Jefferson",2);
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see USDollarBills#toString
    */

    @Test
	public void test_equals2() {
	USDollarBills c1 = new USDollarBills("Thomas Jefferson",2);
	USDollarBills c2 = new USDollarBills("George Washington",1);
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see USDollarBills#hashCode
    */

    @Test
	public void test_hashCode1() {
	USDollarBills c1 = new USDollarBills("Thomas Jefferson",2);
	USDollarBills c2 = new USDollarBills("Thomas Jefferson",2);
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see USDollarBills#hashCode
    */

    @Test
	public void test_hashCode2() {
	USDollarBills c1 = new USDollarBills("Thomas Jefferson",2);
	USDollarBills c3 = new USDollarBills("George Washington",1);
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
