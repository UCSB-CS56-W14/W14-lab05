package edu.ucsb.cs56.W14.lab05.xgmak94;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Drinker

    @author Phill Conrad
    @author Gary Mak
    @author Brandon Hammel
    @version 2014/01/30 for lab04, cs56, W14
    @see Drinker

*/

public class DrinkerTest {

    /** Test case for getBAC method of Drinker
     @see Drinker#getBAC
    */

    @Test
	public void test_getBAC() {
	   Drinker d1 = new Drinker(0.13,123456789);
	   assertEquals(0.13,d1.getBAC(),1e-15);
    }

    /** Test case for getSSN method of Drinker
     @see Drinker#getSSN
    */

    @Test
	public void test_getSSN() {
	   Drinker d1 = new Drinker(0.13,123456789);
	   assertEquals(123456789,d1.getSSN());
    }

    /** Test case for toString
     @see Drinker#toString
    */

    @Test
	public void test_toString() {
	   Drinker d1 = new Drinker(0.13,123456789);
	   assertEquals("[0.13,123456789]",d1.toString());
    }

    /** Test case 1 for .equals
     @see Drinker#toString
    */

    @Test
	public void test_equals1() {
	   Drinker d1 = new Drinker(0.13,123456789);
	   Drinker d2 = new Drinker(0.13,123456789);
	   assertTrue(d1.equals(d2));
    }

    /** Test case 2 for .equals
     @see Drinker#toString
    */

    @Test
	public void test_equals2() {
	   Drinker d1 = new Drinker(0.13,123456789);
	   Drinker d2 = new Drinker(1.00,987654321);
	   assertFalse(d1.equals(d2));
    }

    /** Test case 1 for .hashCode
     @see Drinker#hashCode
    */

    @Test
	public void test_hashCode1() {
	   Drinker d1 = new Drinker(0.13,123456789);
	   Drinker d2 = new Drinker(0.13,123456789);
	   assertTrue(d1.hashCode()==d2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Drinker#hashCode
    */

    @Test
	public void test_hashCode2() {
	   Drinker d1 = new Drinker(0.13,123456789);
	   Drinker d3 = new Drinker(1.00,987654321);
	   assertTrue(d1.hashCode()!=d3.hashCode());
    }
}
