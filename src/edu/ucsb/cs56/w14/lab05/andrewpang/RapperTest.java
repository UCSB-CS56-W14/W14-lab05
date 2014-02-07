package edu.ucsb.cs56.w14.lab05.andrewpang;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for Rapper

    @author Phill Conrad
    @author Andrew Pang
    @version 2014/02/06 for lab05, cs56, W14
    @see Rapper

*/

public class RapperTest {

    /** Test case for getRapName method of Rapper
     @see Rapper#getRapName
    */

    @Test
	public void test_getRapName() {
	Rapper c1 = new Rapper("Childish Gambino", "Donald Glover");
	assertEquals("Childish Gambino",c1.getRapName());
    }


    /** Test case for getRealName method of Rapper
     @see Rapper#getRealName
    */

    @Test
	public void test_getRealName() {
        Rapper c1 = new Rapper("Childish Gambino", "Donald Glover");
	assertEquals("Donald Glover",c1.getRealName());
    }

    /** Test case for toString
     @see Rapper#toString
    */

    @Test
	public void test_toString() {
	Rapper c1 = new Rapper("Childish Gambino", "Donald Glover");
	assertEquals("[Childish Gambino,Donald Glover]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Rapper#toString
    */

    @Test
	public void test_equals1() {
      	Rapper c1 = new Rapper("Childish Gambino", "Donald Glover");
       	Rapper c2 = new Rapper("Childish Gambino", "Donald Glover");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Rapper#toString
    */

    @Test
	public void test_equals2() {
	Rapper c1 = new Rapper("Childish Gambino", "Donald Glover");
       	Rapper c2 = new Rapper("Childish Gambino", "Danny Glover");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Rapper#hashCode
    */

    @Test
	public void test_hashCode1() {
      	Rapper c1 = new Rapper("Childish Gambino", "Donald Glover");
       	Rapper c2 = new Rapper("Childish Gambino", "Donald Glover");    
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Rapper#hashCode
    */

    @Test
	public void test_hashCode2() {
	Rapper c1 = new Rapper("Childish Gambino", "Donald Glover");
       	Rapper c3 = new Rapper("Childish Gambino", "Danny Glover");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
