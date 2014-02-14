package edu.ucsb.cs56.w14.lab05.barasuishou;
public class Shoe {
    private String serialNumber; // the serial number, e.g. 001272

    private String brand; // the brand of the shoe, e.g "Nike"
    
    /**
       Two-arg constructor
       @param serialNumber
       @param brand
    */

    public Shoe(String serialNumber, String brand) {
      this.serialNumber = serialNumber;
      this.brand = brand;
    }

    /** 
	Getter for serialNumber
	@return serialNumber
    */

    public String getSerialNumber () { return this.serialNumber; }

    /** 
	Getter for brand
	@return brand of the shoe
    */
    public String getBrand () {return this.brand; }

    /**
       convert to String representation in format [serialNumber,brand]
       e.g. <code>["00127288","Nike"]</code>

       @return formatted string, [serialNumber,brand]
    */

    @Override
    public String toString() {
	String result = "["+this.serialNumber+","+this.brand+"]";
	return result; // in stub, return super class (as if not overridden)
	// OR: return "[STUB]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the serialNumber.
     */

    @Override
    public int hashCode() {
	int number = Integer.parseInt(this.getSerialNumber());
	return number;
    }

    /** compare for equality based on upc
	@return true if parameter is a Shoe with the same serialNumber, otherwise false
     */

    @Override
    public boolean equals(Object o) {
       	if (o == null)
		return false;

	if(!(o instanceof Shoe))
		return false;

	Shoe p = (Shoe)o;
	
	if(this.getSerialNumber().equals(p.getSerialNumber()))
		return true;

	return false;
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

   public static void main(String[] args) {
	Shoe s = new Shoe("123456", "Nike");
	System.out.println("s = " + s);
   }

}
