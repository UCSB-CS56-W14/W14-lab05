package edu.ucsb.cs56.w14.lab05.derek_x_wang;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Course

    @author Phill Conrad
    @author Shuai Lang, Xinzhe Wang
    @version 2014/02/11 for lab04, cs56, W14
    @see Course 

*/

public class CourseTest {

    /** Test case for getCourseId method of Course
     @see Course#getCourseId
    */

    @Test
	public void test_getCourseId() {
	Course c1 = new Course("1234567","CS56");
	assertEquals("1234567",c1.getCourseId());
    }


    /** Test case for getCourseName method of Course
     @see Course#getCourseName
    */

    @Test
	public void test_getCourseName() {
	Course c1 = new Course("1234567","CS56");
	assertEquals("CS56",c1.getCourseName());
    }

    /** Test case for toString
     @see Course#toString
    */

    @Test
	public void test_toString() {
	Course c1 = new Course("1234567","CS56");
	assertEquals("[1234567,CS56]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Course#toString
    */

    @Test
	public void test_equals1() {
	Course c1 = new Course("1234567","CS56");
	Course c2 = new Course("1234567","CS56");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Course#toString
    */

    @Test
	public void test_equals2() {
	Course c1 = new Course("1234567","CS56");
	Course c2 = new Course("1234568","CS56");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Course#hashCode
    */


    @Test
	public void test_hashCode1() {
	Course c1 = new Course("1234567","CS56");
	Course c2 = new Course("1234567","CS56");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Course#hashCode
    */

    @Test
	public void test_hashCode2() {
	Course c1 = new Course("1234567","CS56");
	Course c3 = new Course("1234568","CS56");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
