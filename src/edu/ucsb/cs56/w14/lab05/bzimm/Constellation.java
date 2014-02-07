package edu.ucsb.cs56.w14.lab05.bzimm;

/** A constellation with a name, symbol, quadrant, and number of main stars
 @author Phill Conrad
 @author Blake Zimmerman
 @version UCSB, CS56, W14 
*/


public class Constellation {
    private String name; // name of the constellation, e.g "Orion" or "Draco"

    private String symbol; // the symbol for the constellation e.g "the Hunter" for Orion

    private String quadrant; // the galactic quadrant based on the galactic coordinate system
    // e.g "NQ1" for Orion and Andromeda

    private int mainStars; // number of main stars in the constellation e.g 7
    
    /**
       Four-arg constructor
       @param name name of the constellation, e.g "Orion" or "Draco"  
       @param symbol the symbol for the constellation, e.g "the Hunter"
       @param quadrant the galactic quadrant based on the galactic coordinte system, e.g "NQ1"
       @param mainStars the number of main stars in the constellation
    */

    public Constellation(String theName, String theSymbol, String theQuadrant, int numMainStars) {
    	name = theName;
        symbol = theSymbol;
        quadrant = theQuadrant;
        mainStars = numMainStars;
    }

    /** 
	Getter for name
	@return name of the constellation e.g. "Orion"
    */

    public String getName () { return name; }

    /** 
	Getter for symbol
	@return symbol for the constellation, e.g "the Hunter"
    */
    public String getSymbol () {return symbol; }

    /** 
    	Getter for quadrant
	@return qalactic quadrant of the constellation, e.g "NQ1"
    */
    public String getQuadrant () {return quadrant; }

    /** 
    	Getter for mainStars	
	@return number of main stars in the constellation, e.g 7
    */
    public int getMainStars () {return mainStars; }

    /**
       convert to String representation in format [name,symbol,quadrant,mainStars]
       e.g. <code>["Orion","the Hunter","NQ1","7"]</code>

       @return formatted string, [name,symbol,quadrant,mainStars]
    */

    @Override
    public String toString() {
	   return "[" + name + "," + symbol + "," + quadrant + "," + mainStars + "]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the name value.
     */

    @Override
    public int hashCode() {
        int hash = 7;
	hash = 17*hash + this.name.hashCode();
	return hash;
    }


    /** compare for equality based on name
	@return true if parameter is a Constellation with the same name, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o == null) 
	   return false;
	if (!(o instanceof Constellation))
	   return false;

	Constellation c = (Constellation) o;
	if (this.name != c.name)
	   return false;
	else {
	   return true;
	   }

    }

}
