package edu.ucsb.cs56.w14.lab05.loganortega;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for ProteinPowder

    @author Phill Conrad
    @author Logan Ortega
    @author Richard Wang
    @version 2014/01/30 for lab04, cs56, W14
    @see ProteinPowder 

*/

public class ProteinPowderTest {

    /** Test case for getSerialNumber method of ProteinPowder
     @see ProteinPowder#getSerialNumber
    */

    @Test
	public void test_getSerialNumber() {
	ProteinPowder c1 = new ProteinPowder(86028807, 15, "chocolate");
	assertEquals(86028807,c1.getSerialNumber());
    }


    /** Test case for getAmountProtein method of ProteinPowder
     @see ProteinPowder#getAmountProtein
    */

    @Test
	public void test_getAmountProtein() {
	ProteinPowder c1 = new ProteinPowder(86028807, 15, "chocolate");
	assertEquals(15,c1.getAmountProtein());
    }

    /** Test case for toString
     @see ProteinPowder#toString
    */

    @Test
	public void test_toString() {
	ProteinPowder c1 = new ProteinPowder(86028807, 15, "chocolate");
	assertEquals("[86028807, 15, chocolate]",c1.toString());
    }

    /** Test case 1 for .equals
     @see ProteinPowder#equals
    */

    @Test
	public void test_equals1() {
	ProteinPowder c1 = new ProteinPowder(86028807, 15, "chocolate");
	ProteinPowder c2 = new ProteinPowder(86028807, 15, "chocolate");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see ProteinPowder#equals
    */

    @Test
	public void test_equals2() {
	ProteinPowder c1 = new ProteinPowder(86028807, 15, "chocolate");
	ProteinPowder c2 = new ProteinPowder(99999999, 15, "chocolate");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see ProteinPowder#hashCode
    */

    @Test
	public void test_hashCode1() {
	ProteinPowder c1 = new ProteinPowder(86028807, 15, "chocolate");
	ProteinPowder c2 = new ProteinPowder(86028807, 15, "chocolate");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see ProteinPowder#hashCode
    */

    @Test
	public void test_hashCode2() {
	ProteinPowder c1 = new ProteinPowder(86028807, 15, "chocolate");
	ProteinPowder c3 = new ProteinPowder(99999999, 15, "chocolate");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
