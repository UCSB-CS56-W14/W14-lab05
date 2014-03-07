package edu.ucsb.cs56.w14.lab05.ericchen94;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for Beverage

    @author Phill Conrad
    @author Eric Chen
    @version 2014/01/30 for lab04, cs56, W14
    @see Beverage 

*/

public class BeverageTest {

    /** Test case for getBrand method of Beverage
     @see Beverage#getBrand
    */

    @Test
	public void test_getBrand() {
	Beverage b1 = new Beverage("Jack Daniel's Tennessee Whiskey","8218409046");
	assertEquals("Jack Daniel's Tennessee Whiskey",b1.getBrand());
    }


    /** Test case for getBarcode method of Beverage
     @see Beverage#getBarcode
    */

    @Test
	public void test_getBarcode() {
	Beverage b1 = new Beverage("Jack Daniel's Tennessee Whiskey","8218409046");
	assertEquals("8218409046",b1.getBarcode());
    }

    /** Test case for toString
     @see Beverage#toString
    */

    @Test
	public void test_toString() {
	Beverage b1 = new Beverage("Jack Daniel's Tennessee Whiskey","8218409046");
	assertEquals("[Jack Daniel's Tennessee Whiskey,8218409046]",b1.toString());
    }

    /** Test case 1 for .equals
     @see Beverage#toString
    */

    @Test
	public void test_equals1() {
	Beverage b1 = new Beverage("Jack Daniel's Tennessee Whiskey","8218409046");
	Beverage b2 = new Beverage("Jack Daniel's Tennessee Whiskey","8218409046");
	assertTrue(b1.equals(b2));
    }

    /** Test case 2 for .equals
     @see Beverage#toString
    */

    @Test
	public void test_equals2() {
	Beverage b1 = new Beverage("Jack Daniel's Tennessee Whiskey","8218409046");
	Beverage b2 = new Beverage("Jack Daniel's Tennessee Whiskey","99999999");
	assertFalse(b1.equals(b2));
    }

    /** Test case 1 for .hashCode
     @see Beverage#hashCode
    */

    @Test
	public void test_hashCode1() {
	Beverage b1 = new Beverage("Jack Daniel's Tennessee Whiskey","8218409046");
	Beverage b2 = new Beverage("Jack Daniel's Tennessee Whiskey","8218409046");
	assertTrue(b1.hashCode()==b2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Beverage#hashCode
    */

    @Test
	public void test_hashCode2() {
	Beverage b1 = new Beverage("Jack Daniel's Tennessee Whiskey","8218409046");
        Beverage b3 = new Beverage("Jack Daniel's Tennessee Whiskey","99999999");
	assertTrue(b1.hashCode()!=b3.hashCode());
    }

}
