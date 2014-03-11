package edu.ucsb.cs56.w14.lab05.jgee67;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for FootballPlayer

    @author Phill Conrad
    @author Julian Gee
    @author If working in pair, insert 2nd pair here, else delete this line
    @version 2014/01/30 for lab04, cs56, W14
    @see FootballPlayer

*/

public class FootballPlayerTest {

    /** Test case for getJerseyNumber method of FootballPlayer
     @see FootballPlayer#getJerseyNumber
    */

    @Test
	public void test_getJerseyNumber() {
	FootballPlayer c1 = new FootballPlayer(69,"Cringle McDingleberry");
	assertEquals(69,c1.getJerseyNumber());
    }


    /** Test case for getName method of FootballPlayer
     @see FootballPlayer#getName
    */

    @Test
	public void test_getName() {
	FootballPlayer c1 = new FootballPlayer(69,"Cringle McDingleberry");
	assertEquals("Cringle McDingleberry",c1.getName());
    }

    /** Test case for toString
     @see FootballPlayer#toString
    */

    @Test
	public void test_toString() {
	FootballPlayer c1 = new FootballPlayer(69,"Cringle McDingleberry");
	assertEquals("[69,Cringle McDingleberry]",c1.toString());
    }

    /** Test case 1 for .equals
     @see FootballPlayer#toString
    */

    @Test
	public void test_equals1() {
	FootballPlayer c1 = new FootballPlayer(69,"Cringle McDingleberry");
	FootballPlayer c2 = new FootballPlayer(69,"Cringle McDingleberry");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see FootballPlayer#toString
    */

    @Test
	public void test_equals2() {
	FootballPlayer c1 = new FootballPlayer(69,"Cringle McDingleberry");
	FootballPlayer c2 = new FootballPlayer(33,"Cringle McDingleberry");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see FootballPlayer#hashCode
    */

    @Test
	public void test_hashCode1() {
	FootballPlayer c1 = new FootballPlayer(69,"Cringle McDingleberry");
	FootballPlayer c2 = new FootballPlayer(69,"Cringle McDingleberry");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see FootballPlayer#hashCode
    */

    @Test
	public void test_hashCode2() {
	FootballPlayer c1 = new FootballPlayer(69,"Cringle McDingleberry");
	FootballPlayer c3 = new FootballPlayer(33,"Cringle McDingleberry");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
