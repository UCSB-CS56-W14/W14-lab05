package edu.ucsb.cs56.w14.lab05.theredraid;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Airport

    @author Phill Conrad
    @author Colin Biafore
    @version 2014/01/30 for lab04, cs56, W14
    @see Airport

*/

public class AirportTest {

    /** Test case for getIATA method of Airport
     @see Airport#getIATA
    */

    @Test
	public void test_getIATA() {
	Airport a1 = new Airport("DEN","Denver International Airport","Denver");
	assertEquals("DEN",a1.getIATA());
    }


    /** Test case for getName method of Airport
     @see Airport#getName
    */

    @Test
	public void test_getName() {
	Airport a1 = new Airport("DEN","Denver International Airport","Denver");
	assertEquals("Denver International Airport",a1.getName());
    }

    /** Test case for getCity method of Airport
     @see Airport#getCity
    */

    @Test
	public void test_getCity() {
	Airport a1 = new Airport("DEN","Denver International Airport","Denver");
	assertEquals("Denver",a1.getCity());
    }

    /** Test case for toString
     @see Airport#toString
    */

    @Test
	public void test_toString() {
	Airport a1 = new Airport("DEN","Denver International Airport","Denver");
	assertEquals("[DEN,Denver International Airport,Denver]",a1.toString());
    }

    /** Test case 1 for .equals
     @see Airport#toString
    */

    @Test
	public void test_equals1() {
	Airport a1 = new Airport("DEN","Denver International Airport","Denver");
	Airport a2 = new Airport("DEN","Denver International Airport","Denver");
	assertTrue(a1.equals(a2));
    }

    /** Test case 2 for .equals
     @see Airport#toString
    */

    @Test
	public void test_equals2() {
	Airport a1 = new Airport("DEN","Denver International Airport","Denver");
	Airport a2 = new Airport("LAX","Denver International Airport","Denver");
	assertFalse(a1.equals(a2));
    }

    /** Test case 1 for .hashCode
     @see Airport#hashCode
    */

    @Test
	public void test_hashCode1() {
	Airport a1 = new Airport("DEN","Denver International Airport","Denver");
	Airport a2 = new Airport("DEN","Denver International Airport","Denver");
	assertTrue(a1.hashCode()==a2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Cereal#hashCode
    */

    @Test
	public void test_hashCode2() {
	Airport a1 = new Airport("DEN","Denver International Airport","Denver");
	Airport a3 = new Airport("IAH","Denver International Airport","Denver");
	assertTrue(a1.hashCode()!=a3.hashCode());
    }

}
