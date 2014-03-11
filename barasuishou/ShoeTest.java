package edu.ucsb.cs56.w14.lab05.barasuishou;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Shoe

    @author Phill Conrad
    @author George Chen
    @version 2014/01/30 for lab04, cs56, W14
    @see Shoe 

*/

public class ShoeTest {

    /** Test case for getSerialNumber method of Shoe
    */

    @Test
	public void test_getSerialNumber() {
	Shoe s1 = new Shoe("00127288","Nike");
	assertEquals("00127288",s1.getSerialNumber());
    }


    /** Test case for getBrand method of Shoe
    */

    @Test
	public void test_getBrand() {
	Shoe s1 = new Shoe("00127288","Nike");
	assertEquals("Nike",s1.getBrand());
    }

    /** Test case for toString
    */

    @Test
	public void test_toString() {
	Shoe s1 = new Shoe("00127288","Nike");
	assertEquals("[00127288,Nike]",s1.toString());
    }

    /** Test case 1 for .equals
    */

    @Test
	public void test_equals1() {
	Shoe s1 = new Shoe("00127288","Nike");
	Shoe s2 = new Shoe("00127288","Nike");
	assertTrue(s1.equals(s2));
    }

    /** Test case 2 for .equals
    */

    @Test
	public void test_equals2() {
	Shoe s1 = new Shoe("00127288","Nike");
	Shoe s2 = new Shoe("99999999","Nike");
	assertFalse(s1.equals(s2));
    }

    /** Test case 1 for .hashCode
    */

    @Test
	public void test_hashCode1() {
	Shoe s1 = new Shoe("00127288","Nike");
	Shoe s2 = new Shoe("00127288","Nike");
	assertTrue(s1.hashCode()==s2.hashCode());
    }

    /** Test case 2 for .hashCode
    */

    @Test
	public void test_hashCode2() {
	Shoe s1 = new Shoe("00127288","Nike");
	Shoe s3 = new Shoe("99999999","Nike");
	assertTrue(s1.hashCode()!=s3.hashCode());
    }

}
