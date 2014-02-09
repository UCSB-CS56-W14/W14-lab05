package edu.ucsb.cs56.w14.lab05.jovo123;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for SeaMammal

    @author Phill Conrad
    @author Josephine Vo
    @version 2014/02/06 for lab04, cs56, W14
    @see SeaMammal 

*/

public class SeaMammalTest {

    /** Test case for getTagNumber method of SeaMammal
     @see SeaMammal#getTagNumber
    */

    @Test
	public void test_getTagNumber() {
	SeaMammal c1 = new SeaMammal("123456","Dolphin");
	assertEquals("123456",c1.getTagNumber());
    }


    /** Test case for getSpecies method of SeaMammal
     @see SeaMammal#getSpecies
    */

    @Test
	public void test_getName() {
	SeaMammal c1 = new SeaMammal("123456","Dolphin");
	assertEquals("Dolphin",c1.getSpecies());
    }

    /** Test case for toString
     @see SeaMammal#toString
    */

    @Test
	public void test_toString() {
	SeaMammal c1 = new SeaMammal("123456","Dolphin");
	assertEquals("[123456,Dolphin]",c1.toString());
    }

    /** Test case 1 for .equals
     @see SeaMammal#equals
    */

    @Test
	public void test_equals1() {
	SeaMammal c1 = new SeaMammal("123456","Dolphin");
	SeaMammal c2 = new SeaMammal("123456","Dolphin");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see SeaMammal#equals
    */

    @Test
	public void test_equals2() {
	SeaMammal c1 = new SeaMammal("123456","Dolphin");
	SeaMammal c2 = new SeaMammal("999999","Dolphin");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see SeaMammal#hashCode
    */

    @Test
	public void test_hashCode1() {
	SeaMammal c1 = new SeaMammal("123456","Dolphin");
	SeaMammal c2 = new SeaMammal("123456","Dolphin");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see SeaMammal#hashCode
    */

    @Test
	public void test_hashCode2() {
	SeaMammal c1 = new SeaMammal("123456","Dolphin");
	SeaMammal c3 = new SeaMammal("999999","Dolphin");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
