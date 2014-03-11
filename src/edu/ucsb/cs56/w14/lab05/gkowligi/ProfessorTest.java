package edu.ucsb.cs56.w14.lab05.gkowligi;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** Test class for Professor

    @author Phill Conrad
    @author Girish Kowligi   
    @version 2014/02/14 for lab05, cs56, W14
    @see Professor 

*/

public class ProfessorTest {

    /** Test case for getId method of Professor
     @see Professor#getId
    */

    @Test
	public void test_getId() {
	Professor p1 = new Professor(1234567,"Economics");
	assertEquals(1234567,p1.getId(), 0.0000);
    }


    /** Test case for getDept method of Professor
     @see Professor#getDept
    */

    @Test
	public void test_getDept() {
	Professor c1 = new Professor(1234567,"Economics");
	assertEquals("Economics",c1.getDept());
    }

    /** Test case for toString
     @see Professor#toString
    */

    @Test
	public void test_toString() {
	Professor c1 = new Professor(1234567,"Economics");
	assertEquals("[1234567.0,Economics]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Professor#equals
    */

    @Test
	public void test_equals1() {
	Professor c1 = new Professor(1234567,"Economics");
	Professor c2 = new Professor(1234567,"Economics");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Professor#equals
    */

    @Test
	public void test_equals2() {
	Professor c1 = new Professor(1234567,"Economics");
	Professor c2 = new Professor(7654321,"Economics");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Professor#hashCode
    */

    @Test
	public void test_hashCode1() {
	Professor c1 = new Professor(1234567,"Economics");
	Professor c2 = new Professor(1234567,"Economics");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Professor#hashCode
    */

    @Test
	public void test_hashCode2() {
	Professor c1 = new Professor(1234567,"Economics");
	Professor c3 = new Professor(7654321,"Economics");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
