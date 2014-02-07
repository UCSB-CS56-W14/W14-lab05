import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Cereal

    @author Phill Conrad
    @author Zhe Liu
    @version 2014/01/30 for lab04, cs56, W14
    @see Computer 

*/

public class ComputerTest {

    /** Test case for getSerialNum method of Computer
     @see Computer#getSerialNum
    */

    @Test
	public void test_getSerialNum() {
	Computer c1 = new Computer("00127288","Trader Joe's Raisin Bran");
	assertEquals("00127288",c1.getSerialNum());
    }


    /** Test case for getBrand method of Computer
     @see Computer#getBrand
    */

    @Test
	public void test_getBrand() {
	Computer c1 = new Computer("00127288","Trader Joe's Raisin Bran");
	assertEquals("Trader Joe's Raisin Bran",c1.getBrand());
    }

    /** Test case for toString
     @see Computer#toString
    */

    @Test
	public void test_toString() {
	Computer c1 = new Computer("00127288","Trader Joe's Raisin Bran");
	assertEquals("[00127288,Trader Joe's Raisin Bran]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Computer#toString
    */

    @Test
	public void test_equals1() {
	Computer c1 = new Computer("00127288","Trader Joe's Raisin Bran");
	Computer c2 = new Computer("00127288","Trader Joe's Raisin Bran");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Computer#toString
    */

    @Test
	public void test_equals2() {
	Computer c1 = new Computer("00127288","Trader Joe's Raisin Bran");
	Computer c2 = new Computer("99999999","Trader Joe's Raisin Bran");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Computer#hashCode
    */

    @Test
	public void test_hashCode1() {
	Computer c1 = new Computer("00127288","Trader Joe's Raisin Bran");
	Computer c2 = new Computer("00127288","Trader Joe's Raisin Bran");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Computer#hashCode
    */

    @Test
	public void test_hashCode2() {
	Computer c1 = new Computer("00127288","Trader Joe's Raisin Bran");
	Computer c3 = new Computer("99999999","Trader Joe's Raisin Bran");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
