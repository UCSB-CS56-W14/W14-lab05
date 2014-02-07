package edu.ucsb.cs56.w14.lab05.dcoffill;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for RadioStation

    @author Phill Conrad
    @author David Coffill
    @version 2014/01/30 for lab04, cs56, W14
    @see RadioStation

*/

public class RadioStationTest {

    /** Test case for getFacilityID method of RadioStation
     @see RadioStation#getFacilityID
    */

    @Test
	public void test_getFacilityID() {
		RadioStation s1 = new RadioStation(69081,"KCSB-FM");
		assertEquals(69081,s1.getFacilityID());
    }


    /** Test case for getCallSign method of RadioStation
     @see RadioStation#getCallSign
    */

    @Test
	public void test_getCallSign() {
		RadioStation s1 = new RadioStation(69081,"KCSB-FM");
		assertEquals("KCSB-FM",s1.getCallSign());
    }

    /** Test case for toString
     @see RadioStation#toString
    */

    @Test
	public void test_toString() {
		RadioStation s1 = new RadioStation(69081,"KCSB-FM");
		assertEquals("[69081,KCSB-FM]",s1.toString());
    }

    /** Test case 1 for .equals
     @see RadioStation#toString
    */

    @Test
	public void test_equals1() {
		RadioStation s1 = new RadioStation(69081,"KCSB-FM");
		RadioStation s2 = new RadioStation(69081,"KCSB-FM");
		assertTrue(s1.equals(s2));
    }

    /** Test case 2 for .equals
     @see RadioStation#toString
    */

    @Test
	public void test_equals2() {
		RadioStation s1 = new RadioStation(69081,"KCSB-FM");
		RadioStation s2 = new RadioStation(99999,"KCSB-FM");
		assertFalse(s1.equals(s2));
    }

    /** Test case 1 for .hashCode
     @see RadioStation#hashCode
    */

    @Test
	public void test_hashCode1() {
		RadioStation s1 = new RadioStation(69081,"KCSB-FM");
		RadioStation s2 = new RadioStation(69081,"KCSB-FM");
		assertTrue(s1.hashCode()==s2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see RadioStation#hashCode
    */

    @Test
	public void test_hashCode2() {
		RadioStation s1 = new RadioStation(69081,"KCSB-FM");
		RadioStation s3 = new RadioStation(0,"KCSB-FM");
		assertTrue(s1.hashCode()!=s3.hashCode());
    }

}
