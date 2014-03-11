package edu.ucsb.cs56.w14.lab05.migueld37;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for Handgun

    @author Phill Conrad
    @author Miguel Delgado
    @author Mena Iskander
    @version 2014/01/30 for lab04, cs56, W14
    @see Handgun 

*/

public class HandgunTest {

    /** Test case for getserialNumber method of Handgun
     @see Handgun#getserialNumber
    */

    @Test
	public void test_getserialNumber() {
	Handgun h1 = new Handgun(123456,"Glock");
	assertEquals(123456,h1.getserialNumber());
    }


    /** Test case for getModel method of Handgun
     @see Handgun#getModel
    */

    @Test
	public void test_getModel() {
	Handgun h1 = new Handgun(123456,"Glock");
	assertEquals("Glock",h1.getModel());
    }

    /** Test case for toString
     @see Handgun#toString
    */

    @Test
	public void test_toString() {
	Handgun h1 = new Handgun(123456,"Glock");
	assertEquals("[123456,Glock]",h1.toString());
    }

    /** Test case 1 for .equals
     @see Handgun#toString
    */

    @Test
	public void test_equals1() {
	Handgun h1 = new Handgun(123456,"Glock");
	Handgun h2 = new Handgun(123456,"Glock");
	assertTrue(h1.equals(h2));
    }

    /** Test case 2 for .equals
     @see Handgun#toString
    */

    @Test
	public void test_equals2() {
	Handgun h1 = new Handgun(123456,"Glock");
	Handgun h2 = new Handgun(654321,"Glock");
	assertFalse(h1.equals(h2));
    }

    /** Test case 1 for .hashCode
     @see Handgun#hashCode
    */

    @Test
	public void test_hashCode1() {
	Handgun h1 = new Handgun(123456,"Glock");
	Handgun h2 = new Handgun(123456,"Glock");
	assertTrue(h1.hashCode()==h2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Handgun#hashCode
    */

    @Test
	public void test_hashCode2() {
	Handgun h1 = new Handgun(123456,"Glock");
	Handgun h3 = new Handgun(654321,"Glock");
	assertTrue(h1.hashCode()!=h3.hashCode());
    }

}
