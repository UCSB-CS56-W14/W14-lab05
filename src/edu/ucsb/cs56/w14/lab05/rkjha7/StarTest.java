package edu.ucsb.cs56.w14.lab05.rkjha7;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Star

    @author Phill Conrad
    @author Rishabh Jha
    @version 2014/01/30 for lab04, cs56, W14
    @see Star

*/

public class StarTest {

    /** Test case for get star
     @see Star#getStar
    */

    @Test
	public void test_getStar() {
	Star c1 = new Star("Alpha Centauri",1.519);
	assertEquals("Alpha Centauri",c1.getStar());
    }


    /** Test case for getLuminosity method of Star
     @see Star#getLuminosity
    */

    @Test
	public void test_getLuminosity() {
	Star c1 = new Star("Alpha Centauri",1.519);
	assertEquals(1.519,c1.getLuminosity());
    }

    /** Test case for toString
     @see Star#toString
    */

    @Test
	public void test_toString() {
	Star c1 = new Star("Alpha Centauri",1.519);
	assertEquals("[Alpha Centauri,1.519]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Star#toString
    */

    @Test
	public void test_equals1() {
	Star c1 = new Star("Alpha Centauri",1.519);
	Star c2 = new Star("Alpha Centauri",1.519);
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Star#toString
    */

    @Test
	public void test_equals2() {
	Star c1 = new Star("Alpha Centauri",1.519);
	Star c2 = new Star("Vega",37);
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Star#hashCode
    */

    @Test
	public void test_hashCode1() {
	Star c1 = new Star("Alpha Centauri",1.519);
	Star c2 = new Star("Alpha Centauri",1.519);
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Star#hashCode
    */

    @Test
	public void test_hashCode2() {
	Star c1 = new Star("Alpha Centauri",1.519);
	Star c3 = new Star("Vega",37);
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
