package edu.ucsb.cs56.w14.lab05.kmai12;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Inmate

    @author Phill Conrad
    @author Kevin Mai
    @version 2014/01/30 for lab04, cs56, W14
    @see Inmate 

*/

public class InmateTest {

    /** Test case for getName method of Inmate
     @see Inmate#getName
    */

    @Test
	public void test_getName() {
	Inmate c1 = new Inmate("Mike Hunt", 293);
	assertEquals("Mike Hunt",c1.getName());
    }


    /** Test case for getNumber method of Inmate
     @see Inmate#getNumber
    */

    @Test
	public void test_getNumber() {
	Inmate c1 = new Inmate("Mike Hunt",293);
	assertEquals(293,c1.getNumber());
    }

    /** Test case for toString
     @see Inmate#toString
    */

    @Test
	public void test_toString() {
	Inmate c1 = new Inmate("Mike Hunt",293);
	assertEquals("[Mike Hunt,293]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Inmate#toString
    */

    @Test
	public void test_equals1() {
	Inmate c1 = new Inmate("Mike Hunt",293);
	Inmate c2 = new Inmate("Mike Hunt",293);
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Inmate#toString
    */

    @Test
	public void test_equals2() {
	Inmate c1 = new Inmate("Mike Hunt",293);
	Inmate c2 = new Inmate("Mike Hunt",99999);
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Inmate#hashCode
    */

    @Test
	public void test_hashCode1() {
	Inmate c1 = new Inmate("Mike Hunt",293);
	Inmate c2 = new Inmate("Mike Hunt",293);
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Inmate#hashCode
    */

    @Test
	public void test_hashCode2() {
	Inmate c1 = new Inmate("Mike Hunt",293);
	Inmate c3 = new Inmate("Mike Hunt",00000);
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
