package edu.ucsb.cs56.w14.lab05.vwtan;


public class Student {
    private int perm; // perm: student identification number  e.g. 6542548
    

    private String name; // name of the Student, e.g "Brian Smith"
    
    /**
       Two-arg constructor
       @param perm  Student Identification Number, e.g. 6542548
       @param name of the Student, e.g "Brian Smith"
    */

    public Student(int perm, String name) {
	this.perm = perm;
	this.name = name;
    }

    /** 
	Getter for perm
	@return perm, Student Identification Number, e.g. 6542548
    */

    public int getPerm () { 
	return this.perm; 
    }

    /** 
	Getter for name
	@return name of the Student, e.g "Brian Smith"
    */
    public String getName () {
	return this.name; 
    }

    /**
       convert to String representation in format [perm,name]
       e.g. <code>["6542548","Brian Smith"]</code>

       @return formatted string, [perm,name]
    */

    @Override
    public String toString() {
	return "[" + this.perm + "," + this.name + "]";
     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the perm value.
     */

    @Override
    public int hashCode() {
        return this.perm; // in stub, return super class (as if not overridden)	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    }

    /** compare for equality based on perm
	@return true if parameter is a Student with same perm, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o == null)
	    return false;
	if (!(o instanceof Student))
	    return false;
	Student s1 = (Student) o;
	if (s1.getPerm() == this.perm)
	    return true;
	return false;

	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

}
