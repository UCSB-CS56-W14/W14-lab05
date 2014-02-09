package edu.ucsb.cs56.w14.lab05.benjaminhartl;

public class Ipod {
    private String serialNumber; //unique ID number
    

    private String color; //color of the Ipod
    
    /**
       Two-arg constructor
       @param serialNumber, unique ID number e.g. 00127288
       @param color, color of the Ipod e.g "blue"
    */

    public Ipod (String sN, String clr) {
      // @@@ STUB so do nothing
    }

    /** 
	Getter for serialNumber
	@return serialNumber, unique ID number, e.g. 00127288
    */

    public String getserialNumber () { return "STUB"; }

    /** 
	Getter for color
	@return color of the Ipod, e.g "blue"
    */
    public String getColor () {return "STUB"; }

    /**
       convert to String representation in format [serialNumber, color]
       e.g. <code>["00127288","blue"]</code>

       @return formatted string, [serialNumber, color]
    */

    @Override
    public String toString() {
	return super.toString(); // in stub, return super class (as if not overridden)
	// OR: return "[STUB]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the serialNumber value.
     */

    @Override
    public int hashCode() {
        return super.hashCode(); // in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    }

    /** compare for equality based on serialNumber
	@return true if parameter is a Ipod with same serialNumber, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        return super.equals(o); // as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

}
