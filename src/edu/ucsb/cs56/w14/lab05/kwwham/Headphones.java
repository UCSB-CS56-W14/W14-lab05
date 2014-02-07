package edu.ucsb.cs56.w14.lab05.kwwham;

public class Headphones {
    private String serialNumber; // serial number of the headphones
    // note: String because leading zeros may be significant

    private String brand; // brand of the headphones, e.g "Audio Technica"
    
    /**
       Two-arg constructor
       @param serial Number, numbers under the bar code, e.g. 00127288
       @param brand of the headphones, e.g. "Audio Technica", or "Sennheiser"
    */

    public Headphones(String serialNumber, String brand) {
      // Fix'd
      this.serialNumber = serialNumber;
      this.brand = brand;
      
    }

    /** 
	Getter for serial number
	@return serial Number, numbers under the bar code, e.g. 00127288
    */

    public String getSerialNumber () { return this.serialNumber; }

    /** 
	Getter for brand
	@return brand of the headphones
    */
    public String getBrand () {return this.brand; }

    /**
       convert to String representation in format [serial,brand]
       e.g. <code>["00127288","Audio Technica"]</code>

       @return formatted string, [serialNumber,brand]
    */

    @Override
    public String toString() {
	//return super.toString(); // in stub, return super class (as if not overridden)
	// OR: return "[STUB]";

	return "[" + this.serialNumber + "," + this.brand + "]";
	     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the upc value.
     */

    @Override
    public int hashCode() {
        
	final int prime = 17;
	int result = 1;
	result = (prime * result) + this.serialNumber.hashCode();
	return result;
	
    }

    /** compare for equality based on serialNumber
	@return true if parameter are Headphones with same serialNumber, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        //return super.equals(o); // as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    	

	if (o==null) return false;
	if (! (o instanceof Headphones) ) return false;
	Headphones j = (Headphones) o;
	if(this.serialNumber == j.serialNumber)
	{
		return true;
	}
	else{
		return false;
	}

    }


    public static void main(String [] args){

	Headphones h = new Headphones("12345", "Audio Technica");
	System.out.println(h);


    }


}

