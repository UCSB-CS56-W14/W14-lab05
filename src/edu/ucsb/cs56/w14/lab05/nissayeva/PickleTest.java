package edu.ucsb.cs56.w14.lab05.nissayeva;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for Cereal

    @author Phill Conrad
    @author Nataliya Issayeva
    @version 2014/01/30 for lab04, cs56, W14
    @see Pickle 

*/

public class PickleTest {

    /** Test case for getUpc method of Pickle
     @see Pickle#getUpc
    */

    @Test
	public void test_getUpc() {
	Pickle p1 = new Pickle("5410000030","Vlasic","kosher dill");
	assertEquals("5410000030",p1.getUpc());
    }


    /** Test case for getBrand method of Pickle
     @see Pickle#getBrand
    */

    @Test
	public void test_getBrand() {
	Pickle p1 = new Pickle("5410000030","Vlasic","kosher dill");
	assertEquals("Vlasic",p1.getBrand());
    }


    /** Test case for getType method of Pickle
     @see Pickle#getType
    */

    @Test
	public void test_getType() {
	Pickle p1 = new Pickle("5410000030","Vlasic","kosher dill");
	assertEquals("kosher dill",p1.getType());
    }


    /** Test case for toString
     @see Pickle#toString
    */

    @Test
	public void test_toString() {
	Pickle p1 = new Pickle("5410000030","Vlasic","kosher dill");
	assertEquals("[5410000030,Vlasic,kosher dill]",p1.toString());
    }

    /** Test case 1 for .equals
     @see Pickle#toString
    */

    @Test
	public void test_equals1() {
	Pickle p1 = new Pickle("5410000030","Vlasic","kosher dill");
	Pickle p2 = new Pickle("5410000030","Vlasic","kosher dill");
	assertTrue(p1.equals(p2));
    }

    /** Test case 2 for .equals
     @see Pickle#toString
    */

    @Test
	public void test_equals2() {
	Pickle p1 = new Pickle("5410000030","Vlasic","kosher dill");
	Pickle p2 = new Pickle("3333333333","Vlasic","kosher dill");
	assertFalse(p1.equals(p2));
    }

    /** Test case 1 for .hashCode
     @see Pickle#hashCode
    */

    @Test
	public void test_hashCode1() {
	Pickle p1 = new Pickle("5410000030","Vlasic","kosher dill");
	Pickle p2 = new Pickle("5410000030","Vlasic","kosher dill");
	assertTrue(p1.hashCode()==p2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Pickle#hashCode
    */

    @Test
	public void test_hashCode2() {
	Pickle p1 = new Pickle("5410000030","Vlasic","kosher dill");
	Pickle p3 = new Pickle("3333333333","Vlasic","kosher dill");
	assertTrue(p1.hashCode()!=p3.hashCode());
    }

}
