package edu.ucsb.cs56.w14.lab05.rick-lee;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Employee

    @author Phill Conrad
    @author Rick Lee
    @version 2014/01/30 for lab04, cs56, W14
    @see Employee

*/

public class EmployeeTest {

    /** Test case for getSSN method of Employee
     @see Employee#getSSN
    */

    @Test
	public void test_getSSN() {
	Employee e1 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	assertEquals(123456789,e1.getSSN());
    }


    /** Test case for getName method of Employee
     @see Employee#getName
    */

    @Test
	public void test_getName() {
	Employee e1 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	assertEquals("Foo Bar",e1.getName());
    }

    /** Test case for getCompany of Employee
	@see Employee#getCompany
    */

    @Test
    public void test_getCompany() {
	Employee e1 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	assertEquals("Foo Inc",e1.getCompany());
    }

    /** Test case for getPosition of Employee
	@see Employee#getPosition
    */
    
    @Test
    public void test_getPosition() {
	Employee e1 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	assertEquals("Manager",e1.getPosition());
    }

    /** Test case for toString
     @see Employee#toString
    */

    @Test
	public void test_toString() {
	Employee e1 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	assertEquals("[Foo Bar,Foo Inc,Manager,123456789]",e1.toString());
    }

    /** Test case 1 for .equals
     @see Employee#equals
    */

    @Test
	public void test_equals1() {
	Employee e1 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	Employee e2 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	assertTrue(e1.equals(e2));
    }

    /** Test case 2 for .equals
     @see Employee#equals
    */

    @Test
	public void test_equals2() {
	Employee e1 = new Employee("John Dou","SDGE","Sales Representitive",987654321);
        Employee e2 = new Employee("Foo Bar","Foo Inc","Maager",654987321);
	assertFalse(e1.equals(e2));
    }

    /** Test case 1 for .hashCode
     @see Employee#hashCode
    */

    @Test
	public void test_hashCode1() {
	Employee e1 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	Employee e2 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	assertTrue(e1.hashCode()==e2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Employee#hashCode
    */

    @Test
	public void test_hashCode2() {
	Employee e1 = new Employee("Foo Bar","Foo Inc","Manager",123456789);
	Employee e3 = new Employee("John Dou","SDGE","Sales Representitive",987654321);
	assertTrue(e1.hashCode()!=e3.hashCode());
    }

}
