package edu.ucsb.cs56.w14.lab05.xgmak94;

public class Drinker {

    private double BAC; // BAC as a double
    private int SSN; // SSN number as an int
    
    /**
       Two-arg constructor
       @param newBAC blood alcohol content, e.g. 0.13
       @param newSSN drinker's social security number, e.g. 123456789
    */

    public Drinker(double newBAC, int newSSN) {
	   BAC = newBAC;
	   SSN = newSSN;
    }

    /** 
	Getter for BAC
	@return BAC
    */

    public double getBAC() { 
	   return BAC; 
    }

    /** 
	Getter for SSN
	@return SSN
    */

    public int getSSN() {
	   return SSN;
    }

    /**
       convert to String representation in format [BAC,SSN]
       e.g, <code>[0.13,123456789]</code>

       @return formatted string, [BAC,SSN]
    */

    @Override
    public String toString() {
        return "[" + getBAC() + "," + getSSN() + "]";
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
	@return true if parameter is a Drinker with same SSN, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (! (o instanceof Drinker) )
            return false;
	   Drinker d = (Drinker) o;
	   return (d.getSSN() == this.getSSN());
    }

    public static void main(String [] args){
	Drinker Bob = new Drinker(.01, 123456789);
	System.out.println(Bob);
    }


}
