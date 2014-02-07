package edu.ucsb.cs56.w14.lab05.sdrhoads;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Album

    @author Phill Conrad
    @author Tom Craig
    @author Sidney Rhoads
    @version 2014/01/30 for lab04, cs56, W14
    @see Album
*/

public class AlbumTest {

    /** Test case for getAlbumID method of Album
     @see Album#getAlbumID
    */

    @Test
	public void test_getAlbumID() {
	Album c1 = new Album("00127288","Pinkerton");
	assertEquals("00127288",c1.getAlbumID());
    }


    /** Test case for getAlbumName method of Album
     @see Album#getAlbumName
    */

    @Test
	public void test_getAlbumName() {
	Album c1 = new Album("00127288","Revolver");
	assertEquals("Revolver",c1.getAlbumName());
    }

    /** Test case for toString
     @see Album#toString
    */

    @Test
	public void test_toString() {
	Album c1 = new Album("00127288","Mutations");
	assertEquals("[00127288,Mutations]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Album#toString
    */

    @Test
	public void test_equals1() {
	Album c1 = new Album("00127288","Parachutes");
	Album c2 = new Album("00127288","Parachutes");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Album#toString
    */

    @Test
	public void test_equals2() {
	Album c1 = new Album("00127288","A Love Supreme");
	Album c2 = new Album("99999999","A Love Supreme");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Album#hashCode
    */

    @Test
	public void test_hashCode1() {
	Album c1 = new Album("00127288","Late Registration");
	Album c2 = new Album("00127288","Late Registration");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Album#hashCode
    */

    @Test
	public void test_hashCode2() {
	Album c1 = new Album("00127288","Exit... Stage Left");
	Album c3 = new Album("99999999","Exit... Stage Left");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
