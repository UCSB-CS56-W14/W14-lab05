package edu.ucsb.cs56.w14.lab05.dwang68;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Song

    @author Phill Conrad
    @author Dalin Wang
   
    @version 2014/02/03 for lab04, cs56, W14
    @see Song

*/

public class SongTest {

    /** Test case for getName method of Song
     @see Song#getName
    */

    @Test
	public void test_getSong() {
	Song s1 = new Song("Roar","Katy Perry");
	assertEquals("Roar",s1.getName());
    }


    /** Test case for getSinger method of Song
     @see Song#getSinger
    */

    @Test
	public void test_getSinger() {
	Song s1 = new Song("Roar","Katy Perry");
	assertEquals("Katy Perry",s1.getSinger());
    }

    /** Test case for toString
     @see Song#toString
    */

    @Test
	public void test_toString() {
	Song s1 = new Song("Roar","Katy Perry");
	assertEquals("[Roar,Katy Perry]",s1.toString());
    }

    /** Test case 1 for .equals
     @see Song#equals
    */

    @Test
	public void test_equals1() {
	Song s1 = new Song("Roar","Katy Perry");
	Song s2 = new Song("Roar","Katy Perry");
	assertTrue(s1.equals(s2));
    }

    /** Test case 2 for .equals
     @see Song#equals
    */

    @Test
	public void test_equals2() {
	Song s1 = new Song("Roar","Katy Perry");
	Song s2 = new Song("Firework","Katy Perry");
	assertFalse(s1.equals(s2));
    }

    /** Test case 1 for .hashCode
     @see Song#hashCode
    */

    @Test
	public void test_hashCode1() {
	Song s1 = new Song("Roar","Katy Perry");
	Song s2 = new Song("Roar","Katy Perry");
	assertTrue(s1.hashCode()==s2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Song#hashCode
    */

    @Test
	public void test_hashCode2() {
	Song s1 = new Song("Roar","Katy Perry");
	Song s3 = new Song("Firework","Katy Perry");
	assertTrue(s1.hashCode()!=s3.hashCode());
    }

}
