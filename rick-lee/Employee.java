package edu.ucsb.cs56.W14.lab05.rick-lee;

public class Employee {

       private String name;	//Name of the employee

       private String company; 	//Name of the company they are working at

       private String position;	//The position the employee has in the company

       private int ssn;	       	//Social Security Number. THIS DOES NOT CHANGE
    
    /**
       Four-arg constructor
       @param name : name of the employee, e.g. "Tom"
       @param company : name of the company, e.g. "Tom's Bakery"
       @param position : the employee's position in the company, e.g. "Manager"
       @param SSN : social security number of the employee, e.g. 123456789
    */
    public Employee(String name, String company, String position, int ssn) {
	this.name = name;
	this.company = company;
	this.position = position;
	this.ssn = ssn;
    }


    //Getters
    /** 
	Getter for name
	@return name : name of the employee
    */
    public String getName () { return this.name; }

    /** 
	Getter for company
	@return name of the company the employee is working at
    */
    public String getCompany () { return this.company; }

    /** 
	Getter for position
	@return name of the position of the employee
    */
    public String getPosition () { return this.position; }

    /** 
	Getter for ssn
	@return social security number
    */
    public int getSSN () { return this.ssn; }



    /**
       convert to String representation in format [name,company,position,ssn]
       e.g. <code>["Foo Bar","Foo's Inc.","Manager","123456789"]</code>

       @return formatted string, [name,company,position,ssn]
    */

    @Override
    public String toString() {
        return "["+name+","+company+","+position+","+ssn+"]";
    }


    /** hashcode to be used for hash tables, etc.
	based only on the upc value.
     */

    @Override
    public int hashCode() {

	final int prime = 31;
	int result = 1;
	result = (prime * result) + ssn;
	result = (prime * result) + name.hashCode();
	result = (prime * result) + company.hashCode();
	result = (prime * result) + position.hashCode();

	return result;
    }

    /** compare for equality based on ssn
	@return true if parameter is an Employee with the same ssn, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if(o == null)
	    return false;
	if( !(o instanceof Employee) )
	    return false;
	Employee e = (Employee)o;
	return (this.getSSN() == e.getSSN());
    }

}
