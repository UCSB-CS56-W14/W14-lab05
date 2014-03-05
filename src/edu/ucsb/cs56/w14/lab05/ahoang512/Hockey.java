package edu.ucsb.cs56.w14.lab05.ahoang512;

public class Hockey {
    private String ZipCode; // Home zipcode where team plays.

    private String Mascot; // mascot for the team
    
    /**
       Two-arg constructor
       @param Zip  ZipCode, e.g. 00127288
       @param masc   Hockey team mascot, e.g "Trader Joe's Raisin Bran"
    */

    public Hockey(String Zip, String masc) {
      ZipCode = Zip;
      Mascot = masc;
    }

    /** 
	Getter for ZipCode
	@return ZipCode, zipcode for where team plays. eg. "94085"
    */

    public String getZipCode () { return ZipCode; }

    /** 
	Getter for Mascot
	@return Mascot, e.g "Sharks"
    */
    public String getMascot () {return Mascot; }

    /**
       convert to String representation in format [zipcode,mascot]
       e.g. ["00127288","Trader Joe's Raisin Bran"]

       @return formatted string, [zipcode,mascot]
    */

    @Override
    public String toString() {
	return "[" + ZipCode + "," + Mascot + "]";    
    }


    /** hashcode to be used for hash tables, etc.
	based only on the zipcode value.
     */

    @Override
    public int hashCode() {
        return ZipCode.hashCode(); 
    }

    /** compare for equality based on zipcode     
    
	@return true if parameter is a Hockey with same zipcode, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o == null){
	    return false;
	}
	if (!(o instanceof Hockey)){
	    return false;
	}
	Hockey h = (Hockey)o;
	return (h.getZipCode() == this.getZipCode());
 // as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

    public static void main(String [] args){
	Hockey SjSharks= new Hockey("94085", "Sharks");
	System.out.println("SjSharks= " + SjSharks.toString());
	return;
    }

}
