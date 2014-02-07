package edu.ucsb.cs56.w14.lab05.nissayeva;

public class Pickle {
    private String upc; // UPC: numbers under the bar code, e.g. 5410000030
    // note: String because leading zeros may be significant

    private String brand; // pickle brand name, e.g. "Vlasic"
    private String type; // pickle type, e.g. "kosher dill"
    
    /**
       Three-arg constructor
       @param upc  numbers under the bar code, e.g. 5410000030
       @param brand  pickle name brand e.g. "Vlasic"
       @param type  pickle type e.g. "kosher dill"
    */

    public Pickle(String pUpc, String pBrand, String pType) {
	this.upc = pUpc;
	this.brand = pBrand;
	this.type = pType;
    }

    /** 
	Getter for upc
	@return upc, numbers under the bar code, e.g. 5410000030
    */

    public String getUpc () { return this.upc; }

    /** 
	Getter for brand
	@return pickle brand name, e.g "Vlasic"
    */
    public String getBrand () { return this.brand; }

    /** 
	Getter for type
	@return pickle type, e.g "kosher dill"
    */
    public String getType () { return this.type; }

    /**
       convert to String representation in format [upc,brand,type]
       e.g. <code>["5410000030","Vlasic","kosher dill"]</code>

       @return formatted string, [upc,brand,type]
    */

    @Override
    public String toString() {
	return "[" + getUpc() + "," + getBrand() + "," + getType() + "]";
    }


    /** hashcode to be used for hash tables, etc.
	based only on the upc value.
     */

    @Override
    public int hashCode() {
        return (int) Long.parseLong(upc)%2097593;
    }

    /** compare for equality based on upc
	@return true if parameter is a Pickle with same upc, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o == null){
	    return false;
	}

	if (! (o instanceof Pickle)){
	    return false;
	}

	Pickle p = (Pickle) o;
 
	if (this.upc != p.upc){
	    return false;
	}

	return true;
    }
    
    public static void main (String[] args) {
	Pickle p = new Pickle("5410000030","Vlasic","kosher dill");
	System.out.println("p=" + p.toString());
    }
}
