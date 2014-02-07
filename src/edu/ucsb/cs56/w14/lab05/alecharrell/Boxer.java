package edu.ucsb.cs56.w14.lab05.alecharrell;


public class Boxer {

    private int SSN; // SSN: Social security number, Boxer's unique
//identification number	
    
    private String name;//stores the last name of the Boxerr
    /**
       Two-arg constructor
       @param SSN social security number of boxer, e.g. 123456789
       @param name last name of the boxer, e.g. "Foreman"
    */

    public Boxer(int SSN, String name) {
    this.SSN = SSN;
    this.name = name;	    
    }

    /** 
	Getter for SSN
	@return SSN, boxer's unique identification number, e.g. 123456789
    */

    public int getSSN () { return this.SSN; }

    /** 
	Getter for name
	@return name of the Boxer, e.g "Ali"
    */
    public String getName () {return this.name; }

    /**
       convert to String representation in format [SSN,name]
       e.g. <code>[123456789,"Ali"]</code>

       @return formatted string, [SSN,name]
    */

    @Override
    public String toString() {
	return "[" + getSSN() + "," + getName() + "]"; 
    }


    /** hashcode to be used for hash tables, etc.
	based only on the SSN value.
     */

    @Override
    public int hashCode() {
    	   final int prime = 31; /* could use any prime number */
           int result = 1;
           result = (prime * result) + this.SSN;
           return result;
    }

    /** compare for equality based on SSN
	@return true if parameter is a Boxer with same SSN, otherwise false
     */

    @Override
    public boolean equals(Object o) {
    if (o==null) return false;	 
        if (! (o instanceof Boxer) ) return false;
        Boxer b = (Boxer) o;
        return (b.getSSN() == this.getSSN());
    }

}
