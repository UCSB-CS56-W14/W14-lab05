package edu.ucsb.cs56.w14.lab05.krbriggs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for Burrito

    @author Phill Conrad
    @author Kevin Briggs
    @version 2014/02/13 for lab05, cs56, W14
    @see Burrito 

*/

public class BurritoTest {

    /** Test case for getLength method of  Burrito
     @see Burrito#getLength
    */

    @Test
	public void test_getLength() {
	Burrito c1 = new Burrito(12, 12, "Freebirds");
	assertEquals(12,c1.getLength());
    }

    /** Test case for getGirth method of Burrito
	@see Burrito#getGirth
    */

    @Test
    public void test_getGirth() {
	Burrito c1 = new Burrito(12, 12, "Freebirds");
	assertEquals(12, c1.getGirth());
    }


    /** Test case for getRestaurant method of Burrito
     @see Burrito#getRestaurant
    */

    @Test
	public void test_getRestaurant() {
	Burrito c1 = new Burrito(12, 12, "Freebirds");
	assertEquals("Freebirds",c1.getRestaurant());
    }

    /** Test case for toString
     @see Burrito#toString
    */

    @Test
	public void test_toString() {
	Burrito c1 = new Burrito(12, 12, "Freebirds");
	assertEquals("[12,12,Freebirds]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Burrito#toString
    */

    @Test
	public void test_equals1() {
	Burrito c1 = new Burrito(12, 12, "Freebirds");
	Burrito c2 = new Burrito(12, 12, "Freebirds");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Burrito#toString
    */

    @Test
	public void test_equals2() {
	Burrito c1 = new Burrito(12, 12, "Freebirds");
	Burrito c2 = new Burrito(12, 12, "Chipotle");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Burrito#hashCode
    */

    @Test
	public void test_hashCode1() {
        Burrito c1 = new Burrito(12, 12, "Freebirds");
	Burrito c2 = new Burrito(12, 12, "Freebirds");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Burrito#hashCode
    */

    @Test
	public void test_hashCode2() {
	Burrito c1 = new Burrito(12, 12, "Freebirds");
	Burrito c3 = new Burrito(12, 12, "Chipotle");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
