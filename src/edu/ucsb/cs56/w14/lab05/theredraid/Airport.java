package edu.ucsb.cs56.w14.lab05.theredraid;

public class Airport {
    private String name; // official name of the airport

    private String city; // city the airport is located
    
    private String IATAcode; //Unique code that identifies the airport
    
    /**
       Three-arg constructor
       @param IATAcode unique airport code
       @param name name of the airport
       @param city location of the airport
    */

    public Airport(String IATAcode, String name, String city) {
    	   this.IATAcode = IATAcode;
	   this.name = name;
	   this.city = city;
    }

    /** 
	Getter for name
	@return name, name of the airport, e.g. "Denver International Airport"
    */

    public String getName () { return name; }

    /** 
	Getter for city
	@return city that airport is located in, e.g "Denver"
    */
    public String getCity () {return city; }

    /**
	Getter for IATAcode
	@return IATAcode, unique airport code, e.g. "DEN"
    */
    
    public String getIATA () {return IATAcode;}	

    /**
       convert to String representation in format [IATAcode,name,city]
       e.g. <code>["DEN","Denver International Airport","Denver"]</code>

       @return formatted string, [IATAcode,name,city]
    */

    @Override
    public String toString() {
	return "[" + IATAcode + "," + name + "," + city + "]"; // in stub, return super class (as if not overridden)
	// OR: return "[STUB]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the IATAcode value.
     */

    @Override
    public int hashCode() {
        return IATAcode.hashCode(); // in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    }

    /** compare for equality based on IATAcode
	@return true if parameter is a Airport with same IATAcode, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if(this.hashCode() == o.hashCode())
	    return true;
	else
	    return false;
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }
    /** creates an instance of Airport and prints that instance to the screen
     */
    public static void main(String[] args) {
	Airport DIA = new Airport("Denver International Airport","Denver","DIA");
	DIA.toString();
	System.out.println(DIA);
    }

}
