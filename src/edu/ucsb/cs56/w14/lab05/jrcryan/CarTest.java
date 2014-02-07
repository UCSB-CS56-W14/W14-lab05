package edu.ucsb.cs56.w14.lab05.jrcryan;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Car

    @author Phill Conrad
    @author Jenna Cryan
    @version 2014/01/30 for lab04, cs56, W14
    @see Car 

*/

public class CarTest {

    /** Test case for getVin method of Car
     @see Car#getVin
    */

    @Test
	public void test_getVin() {
	Car c1 = new Car("1GNCS18Z30115561","Nissan Altima");
	assertEquals("1GNCS18Z30115561",c1.getVin());
    }


    /** Test case for getMakeModel method of Car
     @see Car#getMakeModel
    */

    @Test
	public void test_getMakeModel() {
	Car c1 = new Car("1GNCS18Z30115561","Nissan Altima");
	assertEquals("Nissan Altima",c1.getMakeModel());
    }

    /** Test case for toString
     @see Car#toString
    */

    @Test
	public void test_toString() {
	Car c1 = new Car("1GNCS18Z30115561","Nissan Altima");
	assertEquals("[1GNCS18Z30115561,Nissan Altima]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Car#toString
    */

    @Test
	public void test_equals1() {
	Car c1 = new Car("1GNCS18Z30115561","Nissan Altima");
	Car c2 = new Car("1GNCS18Z30115561","Nissan Altima");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Car#toString
    */

    @Test
	public void test_equals2() {
	Car c1 = new Car("1GNCS18Z30115561","Nissan Altima");
	Car c2 = new Car("9QPKB99A99999999","Nissan Altima");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Car#hashCode
    */

    @Test
	public void test_hashCode1() {
	Car c1 = new Car("1GNCS18Z30115561","Nissan Altima");
	Car c2 = new Car("1GNCS18Z30115561","Nissan Altima");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Car#hashCode
    */

    @Test
	public void test_hashCode2() {
	Car c1 = new Car("1GNCS18Z30115561","Nissan Altima");
	Car c3 = new Car("9QPKB99A99999999","Nissan Altima");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
