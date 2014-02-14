package edu.ucsb.cs56.w14.lab05.amwexler;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Lego

    @author Phill Conrad
    @author Aaton Wexler
    @version 2014/01/30 for lab04, cs56, W14
    @see Lego 

*/

public class LegoTest {

    /** Test case for getPieces method of Lego
     @see Lego#getPieces
    */

    @Test
	public void test_getPieces() {
	Lego c1 = new Lego(88,"Spaceship");
	assertEquals(88,c1.getPieces());
    }


    /** Test case for getName method of Lego
     @see Lego#getName
    */

    @Test
	public void test_getName() {
	Lego c1 = new Lego(88,"Spaceship");
	assertEquals("Spaceship",c1.getName());
    }

    /** Test case for toString
     @see Lego#toString
    */

    @Test
	public void test_toString() {
	Lego c1 = new Lego(88,"Spaceship");
	assertEquals("[88,Spaceship]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Lego#toString
    */

    @Test
	public void test_equals1() {
	Lego c1 = new Lego(88,"Spaceship");
	Lego c2 = new Lego(88,"Spaceship");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Lego#toString
    */

    @Test
	public void test_equals2() {
	Lego c1 = new Lego(88,"Spaceship");
	Lego c2 = new Lego(99,"Spaceship");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Lego#hashCode
    */

    @Test
	public void test_hashCode1() {
	Lego c1 = new Lego(88,"Spaceship");
	Lego c2 = new Lego(88,"Spaceship");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Lego#hashCode
    */

    @Test
	public void test_hashCode2() {
	Lego c1 = new Lego(88,"Spaceship");
	Lego c3 = new Lego(99,"Spaceship");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
