package edu.ucsb.cs56.w14.lab05.lesleykhuu;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



/** Test class for NBAPlayer

    @author Phill Conrad
    @author Lesley Khuu
    @version 2014/02/11 for lab04, cs56, W14
    @see NBAPlayer 

*/

public class NBAPlayerTest {

    /** Test case for getJerseyNum method of NBAPlayer
     @see NBAPlayer#getJerseyNum
    */

    @Test
	public void test_getJerseyNum() {
	NBAPlayer c1 = new NBAPlayer(3,"Chris Paul");
	assertEquals(3,c1.getJerseyNum());
    }


    /** Test case for getName method of NBAPlayer
     @see NBAPlayer#getName
    */

    @Test
	public void test_getName() {
	NBAPlayer c1 = new NBAPlayer(3,"Chris Paul");
	assertEquals("Chris Paul",c1.getName());
    }

    /** Test case for toString
     @see NBAPlayer#toString
    */

    @Test
	public void test_toString() {
	NBAPlayer c1 = new NBAPlayer(3,"Chris Paul");
	assertEquals("[3,Chris Paul]",c1.toString());
    }

    /** Test case 1 for .equals
     @see NBAPlayer#toString
    */

    @Test
	public void test_equals1() {
	NBAPlayer c1 = new NBAPlayer(3,"Chris Paul");
	NBAPlayer c2 = new NBAPlayer(3,"Chris Paul");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see NBAPlayer#toString
    */

    @Test
	public void test_equals2() {
	NBAPlayer c1 = new NBAPlayer(3,"Chris Paul");
	NBAPlayer c2 = new NBAPlayer(42,"Chris Paul");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see NBAPlayer#hashCode
    */

    @Test
	public void test_hashCode1() {
	NBAPlayer c1 = new NBAPlayer(3,"Chris Paul");
	NBAPlayer c2 = new NBAPlayer(3,"Chris Paul");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see NBAPlayer#hashCode
    */

    @Test
	public void test_hashCode2() {
	NBAPlayer c1 = new NBAPlayer(3,"Chris Paul");
	NBAPlayer c3 = new NBAPlayer(42,"Chris Paul");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
