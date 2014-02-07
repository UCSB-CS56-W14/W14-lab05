package edu.ucsb.cs56.w14.lab05.zhansaya19;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Country

    @author Phill Conrad
    @author Zhansaya Abdikarimova
    @version 2014/01/30 for lab04, cs56, W14
    @see Country 

*/

public class CountryTest {

    /** Test case for getName method of Country
     @see Country#getName
    */

    @Test
	public void test_getName() {
	Country c1 = new Country("Sweden","Stockholm");
	assertEquals("Sweden",c1.getName());
    }


    /** Test case for getCapital method of Cereal
     @see Country#getCapital
    */

    @Test
	public void test_getCapital() {
	Country c1 = new Country("Kazakhstan","Astana");
	assertEquals("Astana",c1.getCapital());
    }

    /** Test case for toString
     @see Country#toString
    */

    @Test
	public void test_toString() {
	Country c1 = new Country("Germany","Berlin");
	assertEquals("[Germany,Berlin]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Country#toString
    */

    @Test
	public void test_equals1() {
	Country c1 = new Country("Russia","Moscow");
	Country c2 = new Country("Russia","Moscow");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Country#toString
    */

    @Test
	public void test_equals2() {
	Country c1 = new Country("Sweden","Berlin");
	Country c2 = new Country("Germany","Berlin");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Country#hashCode
    */

    @Test
	public void test_hashCode1() {
	Country c1 = new Country("Germany","Berlin");
	Country c2 = new Country("Germany","Berlin");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Country#hashCode
    */

    @Test
	public void test_hashCode2() {
	Country c1 = new Country("Sweden","Berlin");
	Country c3 = new Country("Germany","Berlin");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
