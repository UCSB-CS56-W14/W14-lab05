package edu.ucsb.cs56.w14.lab05.katfom;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for SoccerPlayer

    @author Phill Conrad
    @author Deanna Hartsook
    @author Kateryna Fomenko
    @version 2014/02/5 for lab04, cs56, W14
    @see SoccerPlayer 

*/

public class SoccerPlayerTest {

    /** Test case for getJerseyNum method of SoccerPlayer
     @see SoccerPlayer#getJerseyNum
    */

    @Test
	public void test_getJerseyNum() {
	SoccerPlayer c1 = new SoccerPlayer(23,"David Beckham");
	assertEquals(23,c1.getJerseyNum());
    }


    /** Test case for getName method of SoccerPlayer
     @see SoccerPlayer#getName
    */

    @Test
	public void test_getName() {
	SoccerPlayer c1 = new SoccerPlayer(23,"David Beckham");
	assertEquals("David Beckham",c1.getName());
    }

    /** Test case for toString
     @see SoccerPlayer#toString
    */

    @Test
	public void test_toString() {
	SoccerPlayer c1 = new SoccerPlayer(23,"David Beckham");
	assertEquals("David Beckham, 23",c1.toString());
    }

    /** Test case 1 for .equals
     @see SoccerPlayer#toString
    */

    @Test
	public void test_equals1() {
	SoccerPlayer c1 = new SoccerPlayer(23,"David Beckham");
	SoccerPlayer c2 = new SoccerPlayer(23,"Dave Beckham");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see SoccerPlayer#toString
    */

    @Test
	public void test_equals2() {
	SoccerPlayer c1 = new SoccerPlayer(23,"David Beckham");
	SoccerPlayer c2 = new SoccerPlayer(55,"David Beckham");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see SoccerPlayer#hashCode
    */

    @Test
	public void test_hashCode1() {
	SoccerPlayer c1 = new SoccerPlayer(23,"David Beckham");
	SoccerPlayer c2 = new SoccerPlayer(23,"Dave B");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see SoccerPlayer#hashCode
    */

    @Test
	public void test_hashCode2() {
	SoccerPlayer c1 = new SoccerPlayer(23,"David Beckham");
	SoccerPlayer c3 = new SoccerPlayer(40,"David Beckham");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
