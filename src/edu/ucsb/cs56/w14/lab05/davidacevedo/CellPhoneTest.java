package edu.ucsb.cs56.w14.lab05.davidacevedo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Cereal

    @author Phill Conrad
    @author David Acevedo
    @version 2014/01/30 for lab04, cs56, W14
    @see CellPhone 

*/

public class CellPhoneTest {

    /** 
	 * Test case for getCodeName method of CellPhone
	 
     * @see CellPhone#getCodeName
    */

    @Test
	public void test_getCodeName() {
	CellPhone c1 = new CellPhone("hammerhead","Nexus 5");
	assertEquals("hammerhead",c1.getCodeName());
    }


    /**
	 * Test case for getModel method of CellPhone
	 *
     * @see CellPhone#getModel
    */

    @Test
	public void test_getModel() {
	CellPhone c1 = new CellPhone("hammerhead","Nexus 5");
	assertEquals("Nexus 5",c1.getModel());
    }

    /**
	 * Test case for toString
	 *
     * @see CellPhone#toString
    */

    @Test
	public void test_toString() {
	CellPhone c1 = new CellPhone("hammerhead","Nexus 5");
	assertEquals("[hammerhead,Nexus 5]",c1.toString());
    }

    /** 
	 * Test case 1 for .equals
	 *
     * @see CellPhone#toString
    */

    @Test
	public void test_equals1() {
	CellPhone c1 = new CellPhone("hammerhead","Nexus 5");
	CellPhone c2 = new CellPhone("hammerhead","Nexus 5");
	assertTrue(c1.equals(c2));
    }

    /** 
	 * Test case 2 for .equals
     * @see CellPhone#toString
    */

    @Test
	public void test_equals2() {
	CellPhone c1 = new CellPhone("shooter","Evo 3D");
	CellPhone c2 = new CellPhone("shooteru","Evo 3D");
	assertFalse(c1.equals(c2));
    }

    /** 
	 * Test case 1 for .hashCode
	 *
     * @see CellPhone#hashCode
    */

    @Test
	public void test_hashCode1() {
	CellPhone c1 = new CellPhone("shooter","Evo 3D");
	CellPhone c2 = new CellPhone("shooter","Evo 3D");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** 
	 * Test case 2 for .hashCode
	 *
     * @see CellPhone#hashCode
    */

    @Test
	public void test_hashCode2() {
	CellPhone c1 = new CellPhone("shooter","Evo 3d");
	CellPhone c3 = new CellPhone("shooteru","Evo 3d");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
