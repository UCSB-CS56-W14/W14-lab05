import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



/** Test class for CreditCard

    @author Phill Conrad
    @author Alan Buzdar
    @author Yantsey Tsai
    @version 2014/01/30 for lab04, cs56, W14
    @see CreditCard

*/

public class CreditCardTest {

    /** Test case for getLastFour method of CreditCard
     @see CreditCard#getLastFour
    */

    @Test
	public void test_getLastFour() {
	CreditCard c1 = new CreditCard("Amex",6969);
	assertEquals(6969,c1.getLastFour());
    }


    /** Test case for getName method of CreditCard
     @see CreditCard#getName
    */

    @Test
	public void test_getName() {
	CreditCard c1 = new CreditCard("Amex",6969);
	assertEquals("Amex",c1.getName());
    }

    /** Test case for toString
     @see CreditCard#toString
    */

    @Test
	public void test_toString() {
	CreditCard c1 = new CreditCard("Amex",6969);
	assertEquals("Amex,6969",c1.toString());
    }

    /** Test case 1 for .equals
     @see CreditCard#toString
    */

    @Test
	public void test_equals1() {
	CreditCard c1 = new CreditCard("Amex",6969);
	CreditCard c2 = new CreditCard("Amex",6969);
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see CreditCard#toString
    */

    @Test
	public void test_equals2() {
	CreditCard c1 = new CreditCard("Amex",6969);
	CreditCard c2 = new CreditCard("Visa",0420);
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see CreditCard#hashCode
    */

    @Test
	public void test_hashCode1() {
	CreditCard c1 = new CreditCard("Amex",6969);
	CreditCard c2 = new CreditCard("Amex",6969);
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see CreditCard#hashCode
    */

    @Test
	public void test_hashCode2() {
	CreditCard c1 = new CreditCard("Amex",6969);
	CreditCard c3 = new CreditCard("Visa",0420);
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
