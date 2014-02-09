package edu.ucsb.cs56.w14.lab05.sarahdarwiche;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



/** Test class for Ipod

    @author Phill Conrad
    @author Sarah Darwiche
    @author Ben Hartl
    @version 2014/02/08 for lab04, cs56, W14
    @see Ipod 

*/

public class IpodTest {

    /** Test case for getserialNumber method of Ipod
     @see Ipod#getserialNumber
    */

    @Test
	public void test_getserialNumber() {
	Ipod c1 = new Ipod("00127288","purple");
	assertEquals("00127288",c1.getserialNumber());
    }


    /** Test case for getColor method of Ipod
     @see Ipod#getColor
    */

    @Test
	public void test_getColor() {
	Ipod c1 = new Ipod("00127288","purple");
	assertEquals("purple",c1.getColor());
    }

    /** Test case for toString
     @see Ipod#toString
    */

    @Test
	public void test_toString() {
	Ipod c1 = new Ipod("00127288","blue");
	assertEquals("[00127288,blue]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Ipod#toString
    */

    @Test
	public void test_equals1() {
	Ipod c1 = new Ipod("00127288","blue");
	Ipod c2 = new Ipod("00127288","blue");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Cereal#toString
    */

    @Test
	public void test_equals2() {
	Ipod c1 = new Ipod("00127288","blue");
	Ipod c2 = new Ipod("99999999","blue");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Ipod#hashCode
    */

    @Test
	public void test_hashCode1() {
        Ipod c1 = new Ipod("00127288","blue");
	Ipod c2 = new Ipod("00127288","blue");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Ipod#hashCode
    */

    @Test
	public void test_hashCode2() {
        Ipod c1 = new Ipod("00127288","blue");
	Ipod c3 = new Ipod("99999999","blue");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
