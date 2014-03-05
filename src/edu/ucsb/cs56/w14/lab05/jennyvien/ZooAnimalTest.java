package edu.ucsb.cs56.w14.lab05.jennyvien;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Zoo Animal

    @author Phill Conrad
    @author Jenny Vien
    @version 2014/02/06 for lab04, cs56, W14
    @see ZooAnimal

*/

public class ZooAnimalTest {

    /** Test case for getAin method of ZooAnimal
     @see ZooAnimal#getAin
    */

    @Test
	public void test_getAin() {
	ZooAnimal z1 = new ZooAnimal("Polar Bear","1234");
	assertEquals("1234",z1.getAin());
    }


    /** Test case for getName method of ZooAnimal
     @see ZooAnimal#getName
    */

    @Test
	public void test_getName() {
	ZooAnimal z1 = new ZooAnimal("Polar Bear","1234");
	assertEquals("Polar Bear",z1.getName());
    }

    /** Test case for toString
     @see ZooAnimal#toString
    */

    @Test
	public void test_toString() {
	ZooAnimal z1 = new ZooAnimal("Polar Bear","1234");
	assertEquals("[1234,Polar Bear]",z1.toString());
    }

    /** Test case 1 for .equals
     @see ZooAnimal#equals
    */

    @Test
	public void test_equals1() {
	ZooAnimal z1 = new ZooAnimal("Polar Bear","1234");
	ZooAnimal z2 = new ZooAnimal("Polar Bear","1234");
	assertTrue(z1.equals(z2));
    }

    /** Test case 2 for .equals
     @see ZooAnimal#equals
    */

    @Test
	public void test_equals2() {
	ZooAnimal z1 = new ZooAnimal("Polar Bear","1234");
	ZooAnimal z2 = new ZooAnimal("Polar Bear","9999");
	assertFalse(z1.equals(z2));
    }

    /** Test case 1 for .hashCode
     @see ZooAnimal#hashCode
    */

    @Test
	public void test_hashCode1() {
	ZooAnimal z1 = new ZooAnimal("Polar Bear","1234");
	ZooAnimal z2 = new ZooAnimal("Polar Bear","1234");
	assertTrue(z1.hashCode()==z2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see ZooAnimal#hashCode
    */

    @Test
	public void test_hashCode2() {
	ZooAnimal z1 = new ZooAnimal("Polar Bear","1234");
	ZooAnimal z3 = new ZooAnimal("Polar Bear","9999");
	assertTrue(z1.hashCode()!=z3.hashCode());
    }


}
