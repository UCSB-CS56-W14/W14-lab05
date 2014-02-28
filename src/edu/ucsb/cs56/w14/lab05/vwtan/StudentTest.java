package edu.ucsb.cs56.w14.lab05.vwtan;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Student

    @author Phill Conrad
    @author Vincent Tan
    @version 2014/01/30 for lab04, cs56, W14
    @see Student

*/

public class StudentTest {

    /** Test case for getPerm method of Student
     @see Students#getPerm
    */

    @Test
	public void test_getPerm() {
	Student s1 = new Student(6542548,"Brian Smith");
	assertEquals(6542548,s1.getPerm());
    }


    /** Test case for getName method of Student
     @see Student#getName
    */

    @Test
	public void test_getName() {
	Student s1 = new Student(6542548,"Brian Smith");
	assertEquals("Brian Smith",s1.getName());
    }

    /** Test case for toString
     @see Student#toString
    */

    @Test
	public void test_toString() {
	Student s1 = new Student(6542548,"Brian Smith");
	assertEquals("[6542548,Brian Smith]",s1.toString());
    }

    /** Test case 1 for .equals
     @see Student#toString
    */

    @Test
	public void test_equals1() {
        Student s1 = new Student(6542548,"Brian Smith");
	Student s2 = new Student(6542548,"Brian Smith");
	assertTrue(s1.equals(s2));
    }

    /** Test case 2 for .equals
     @see Student#toString
    */

    @Test
	public void test_equals2() {
	Student s1 = new Student(6542548,"Brian Smith");
	Student s2 = new Student(9999999,"Trader Joe's Raisin Bran");
	assertFalse(s1.equals(s2));
    }

    /** Test case 1 for .hashCode
     @see Student#hashCode
    */

    @Test
	public void test_hashCode1() {
	Student s1 = new Student(6542548,"Brian Smith");
        Student s2 = new Student(6542548,"Brian Smith");
	assertTrue(s1.hashCode()==s2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Cereal#hashCode
    */

    @Test
	public void test_hashCode2() {
	Student s1 = new Student(6542548,"Brian Smith");
        Student s2 = new Student(9999999,"Brianasdfasd Smith");
	assertTrue(s1.hashCode()!=s2.hashCode());
    }

}
