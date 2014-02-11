package edu.ucsb.cs56.w14.lab05.rtwaltman;
/**
   <p> TriBike represents a triathlon bike, including the model and registered number.

   @author P.Conrad
   @author Richard Waltman
   @version 02/10/2014 Lab05, UCSB, CS56, W14
*/

public class TriBike {
    private String model; // Make and model of the bike

    private int regNumber; // Registration number of the bike
    
    /**
       Two-arg constructor
       @param model model of the bike, e.g "Specialized SHIV"
       @param regNumber regNumber of the bike, e.g "54321"
    */

    public TriBike(String model, int regNumber) {
      this.model = model;
	  this.regNumber = regNumber;
    }

    /** 
	Getter for model
	@return model -or- make and model of the Tri Bike, e.g "Specialized SHIV"
    */
    public String getModel () { return this.model; }


    /** 
	Getter for regNumber
	@return regNumber of the bike, e.g "54321"
    */
    public int getRegNumber () {return this.regNumber; }


    /**
       Return for model of bike and registration number
       @return formatted string, [model, regNumber]
    */
    @Override
    public String toString() {
	return "[" + this.model + "," + this.regNumber + "]"; // in stub, return super class (as if not overridden)
	// OR: return "[STUB]";     
    }


    /** Hashcode to be used for hash tables, etc.
		@return hashed registered number - based ONLY on the registered number value.
     */

    @Override
    public int hashCode() {
        return this.regNumber; //Could be modded with any table size later if needed 
	// in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    }

    /** compare for equality based on model
	@return true if parameter is a TriBike with same registered number, otherwise false
     */

    @Override
    public boolean equals(Object o) {
    	if(o == null)
			return false;
		if(!(o instanceof TriBike))
			return false;

		TriBike p = (TriBike) o;
		if(this.regNumber == p.regNumber)
			return true;
		else
			return false;
	// as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

	public static void main(String [] args)
	{
		TriBike t = new TriBike("Specialized SHIV", 54321);
		System.out.println(t.toString());
	}
}


