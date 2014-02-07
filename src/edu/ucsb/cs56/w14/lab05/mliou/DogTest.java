package edu.ucsb.cs56.w14.lab05.mliou;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Dog

    @author Phill Conrad
    @author Marcus Liou
    @version 2014/01/30 for lab04, cs56, W14
    @see Dog 

*/

public class DogTest {

    /** Test case for getName method of Dog
     @see Dog#getName
    */

    @Test
	public void test_getName() {
        Dog d1 = new Dog("Rigby","Dachsund","9696");
	assertEquals("Rigby",d1.getName());
    }


    /** Test case for getBreed method of Dog
     @see Dog#getBreed
    */

    @Test
	public void test_getBreed() {
	Dog d1 = new Dog("Dog","Dachsund","9696");
	assertEquals("Dachsund",d1.getBreed());
    }

    /** Test case for getMicrochipID
	@see Dog#getMicrochipID
    */
    
    @Test
    public void test_getMicrochipID() {
	Dog d1 = new Dog("Rigby","Dachsund","9696");
	assertEquals("9696",d1.getMicrochipID());
    }

    /** Test case for toString
     @see Dog#toString
    */

    @Test
	public void test_toString() {
	Dog d1 = new Dog("Rigby","Dachsund","9696");
	assertEquals("[Rigby,Dachsund,9696]",d1.toString());
    }

    /** Test case 1 for .equals
     @see Dog#equals
    */

    @Test
	public void test_equals1() {
	Dog d1 = new Dog("Rigby","Dachsund","9696");
	Dog d2 = new Dog("Rigby","Dachsund","9696");
	assertTrue(d1.equals(d2));
    }

    /** Test case 2 for .equals
     @see Dog#toString
    */

    @Test
	public void test_equals2() {
	Dog d1 = new Dog("Rigby","Dachsund","9696");
	Dog d2 = new Dog("Rigby","Dachsund","42");
	assertFalse(d1.equals(d2));
    }

    /** Test case 1 for .hashCode
     @see Cereal#hashCode
    */

    @Test
	public void test_hashCode1() {
        Dog d1 = new Dog("Rigby","Dachsund","9696");
	Dog d2 = new Dog("Rigby","Dachsund","9696");
	assertTrue(d1.hashCode()==d2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Dog#hashCode
    */

    @Test
	public void test_hashCode2() {
	Dog d1 = new Dog("Rigby","Dachsund","9696");
        Dog d2 = new Dog("Rigby","Dachsund","42");
	assertTrue(d1.hashCode()!=d2.hashCode());
    }

}
