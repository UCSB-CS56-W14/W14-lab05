package edu.ucsb.cs56.w14.lab05.kjih;

public class Patient {
       private String SSN;
       private String name;
       private String sickness;
    
    /**
       Three-arg constructor
       @param SSN SSN of patient, e.g. 123456789
       @param name name of patient, e.g. "Jack Chen"
       @param sicness sickness of patient, e.g. "fever"
    */

    public Patient(String SSN, String name, String sickness) {
	this.SSN=SSN; this.name=name; this.sickness=sickness;
    }

    /** 
	Getter for SSN
	@return SSN, SSN of patient, e.g. 123456789
    */

    public String getSSN () { return this.SSN; }

    /** 
	Getter for name
	@return name of patient, e.g. "Jack Chen"
    */
    public String getName () {return this.name; }

    /**
       Getter for sickness
       @return sickness of patient, e.g. "fever"
    */

    public String getSickness () {return this.sickness;}

    /**
       convert to String representation in format [SSN,name,sickness]
       e.g. <code>["123456789","Jack Chen","fever"]</code>

       @return formatted string, [SSN,name,sickness]
    */

    @Override
    public String toString() {
	return "[" + getSSN() + "," + getName() + "," + getSickness() + "]";
    }


    /** hashcode to be used for hash tables, etc.
	based only on the SSN value.
     */

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = (prime*result) + this.SSN.hashCode();

	return result;
    }

    /** compare for equality based on SSN
	@return true if parameter is a Patient with same SSN, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o==null) return false;
	if (! (o instanceof Patient) ) return false;
	Patient p = (Patient) o;
	return (p.getSSN() == this.getSSN());
    }

    public static void main(String [] args) {
	Patient p = new Patient("123456789","Bob","flu");
	String pstring = p.toString();
	System.out.println("p=" + pstring);
    }

}
