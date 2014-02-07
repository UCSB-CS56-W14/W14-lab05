package edu.ucsb.cs56.w14.lab05.zhansaya19;


/**
  
   @author P. Conrad
   @author Zhansaya Abdikarimova
   @version UCSB, CS56, W14, lab04
*/

public class Country {
    
    private String name; // NAME: is a name of a county, e.g. "Sweden"
    
    private String capital; // capital of a country, e.g "Stockholm"
    
     
    /**
       Two-arg constructor
       @param name name of a country, e.g. "Kazakhstan"
       @param capital name of a capital of a country, e.g "Astana"
      
    */

    public Country(String n, String c) {
        this.name = n;
	this.capital = c;

    }

    /** 
	Getter for name
	@return name of a country, e.g. "Kazakhstan"
    */

    public String getName () { return this.name; }

    /** 
	Getter for capital
	@return name of a capital of a country, e.g "Astana"
    */
    public String getCapital () {return this.capital; }

    /**
       convert to String representation in format [name,capital]
       e.g. <code>["Kazakhstan","Astana"]</code>

       @return formatted string, [name,capital]
    */

    @Override
    public String toString() {
	return "[" + this.getName() + "," + this.getCapital() + "]";    
    }


    /** hashcode to be used for hash tables, etc.
	based only on the country's name.
     */

    @Override
    public int hashCode() {
	final int prime = 89;
	int result = 1;
	result = (prime * result) + this.getName().hashCode();
	
	return result;

        //return super.hashCode(); 
	// in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    }

    /** compare for equality based on name
	@return true if parameter is a Country with same name, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if(o == null) return false;
	if(o == this) return true;
	if(!(o instanceof Country)) return false;
	Country c = (Country)o;
	
        return (c.getName() == this.getName()); // as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

}
