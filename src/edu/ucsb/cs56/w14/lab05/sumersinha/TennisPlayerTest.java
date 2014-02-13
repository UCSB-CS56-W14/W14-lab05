package edu.ucsb.cs56.w14.lab05.sumersinha;
//Sumer Sinha

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for TennisPlayer

    @author Phill Conrad
    @author Sumer Sinha
    @version 2014/01/30 for lab04, cs56, W14
    @see TennisPlayer

*/

public class TennisPlayerTest {

    /** Test case for getatpRank method of TennisPlayer
     @see TennisPlayer#getatpRank
    */

    @Test
	public void test_getatpRank() {
	TennisPlayer c1 = new TennisPlayer(5,"David Ferrer");
	assertEquals(5,c1.getatpRank());
    }


    /** Test case for getName method of TennisPlayer
     @see TennisPlayer#getName
    */

    @Test
	public void test_getName() {
	TennisPlayer c1 = new TennisPlayer(24,"John Isner");
	assertEquals("John Isner",c1.getName());
    }

    /** Test case for toString
     @see TennisPlayer#toString
    */

    @Test
	public void test_toString() {
	TennisPlayer c1 = new TennisPlayer(5,"David Ferrer");
	assertEquals("[5,David Ferrer]",c1.toString());
    }

    /** Test case 1 for .equals
     @see TennisPlayer#toString
    */

    @Test
	public void test_equals1() {
	TennisPlayer c1 = new TennisPlayer(11,"Joe Tsonga");
	TennisPlayer c2 = new TennisPlayer(11,"Joe Tsonga");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see TennisPlayer#toString
    */

    @Test
	public void test_equals2() {
	TennisPlayer c1 = new TennisPlayer(11,"Joe Tsonga");
	TennisPlayer c2 = new TennisPlayer(521,"Joe Tsonga");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see TennisPlayer#hashCode
    */

    @Test
	public void test_hashCode1() {
	TennisPlayer c1 = new TennisPlayer(5,"David Ferrer");
	TennisPlayer c2 = new TennisPlayer(5,"David Ferrer");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see TennisPlayer#hashCode
    */

    @Test
	public void test_hashCode2() {
	TennisPlayer c1 = new TennisPlayer(5,"David Ferrer");
	TennisPlayer c3 = new TennisPlayer(99,"David Ferrer");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
