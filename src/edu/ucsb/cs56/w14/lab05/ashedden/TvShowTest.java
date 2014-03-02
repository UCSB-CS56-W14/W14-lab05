package edu.ucsb.cs56.w14.lab05.ashedden;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for TvShow

    @author Phill Conrad
    @author Allison Shedden
    @author Logan Schmidt
    @version 2014/02/05 for lab04, cs56, W14
    @see TvShow

*/

public class TvShowTest {

    /** Test case for getTitle method of TvShow
     @see TvShow#getTitle
    */

    @Test
	public void test_getTitle() {
	TvShow t1 = new TvShow("Sherlock","BBC");
	assertEquals("Sherlock",t1.getTitle());
    }


    /** Test case for getNetwork method of TvShow
     @see TvShow#getNetwork
    */

    @Test
	public void test_getNetwork() {
	TvShow t1 = new TvShow("Sherlock","BBC");
	assertEquals("BBC",t1.getNetwork());
    }

    /** Test case for toString
     @see TvShow#toString
    */

    @Test
	public void test_toString() {
	TvShow t1 = new TvShow("Sherlock","BBC");
	assertEquals("[Sherlock,BBC]",t1.toString());
    }

    /** Test case 1 for .equals
     @see TvShow#toString
    */

    @Test
	public void test_equals1() {
	TvShow t1 = new TvShow("Sherlock","BBC");
	TvShow t2 = new TvShow("Sherlock","BBC");
	assertTrue(t1.equals(t2));
    }

    /** Test case 2 for .equals
     @see TvShow#toString
    */

    @Test
	public void test_equals2() {
	TvShow t1 = new TvShow("Sherlock","BBC");
	TvShow t2 = new TvShow("NotSherlock","BBC");
	assertFalse(t1.equals(t2));
    }

    /** Test case 1 for .hashCode
     @see TvShow#hashCode
    */

    @Test
	public void test_hashCode1() {
	TvShow t1 = new TvShow("Sherlock","BBC");
	TvShow t2 = new TvShow("Sherlock","BBC");
	assertTrue(t1.hashCode()==t2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see TvShow#hashCode
    */

    @Test
	public void test_hashCode2() {
	TvShow t1 = new TvShow("Sherlock","BBC");
	TvShow t3 = new TvShow("NotSherlock","BBC");
	assertTrue(t1.hashCode()!=t3.hashCode());
    }

}
