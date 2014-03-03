package edu.ucsb.cs56.w14.lab05.ShadowAries;

public class Subwoofers {

    /** Class for Subwoofers

    @author Phill Conrad
    @author Wei-Chieh George Shih
    @version 02/13/2014 for lab04, cs56, W14
    @see SubwoofersTest

    */

    private int serialNumber; // serialNumber: Unique ID given to each subwoofer e.g. "123456"
    // note: int because leading zeros will not be significant

    private float sensitivity; // Efficiency of the subwoofer, e.g "96.5"
    
    /**
       Two-arg constructor
       @param serialNumber  Unique ID given to each subwoofer, e.g. "123456"
       @param sensitivity  Efficiency of the subwoofer, e.g "96.5"
    */

    public Subwoofers(int serialNumber, float sensitivity) {
    	   this.serialNumber = serialNumber;
	   this.sensitivity = sensitivity;
    }

    /** 
	Getter for serialNumber
	@return serialNumber, Unique ID given to each subwoofer, e.g. "123456"
    */

    public int getSerialNumber () { return this.serialNumber; }

    /** 
	Getter for sensitivity
	@return Efficiency of the subwoofer, e.g "96.5"
    */

    public float getSensitivity () {return this.sensitivity; }

    /**
       convert to String representation in format [serialNumber,sensitivity]
       e.g. <code>["123456","96.5"]</code>

       @return formatted string, [serialNumber,sensitivity]
    */

    @Override
    public String toString() {
	return "[" + getSerialNumber() + "," + getSensitivity() + "]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the serialNumber value.
     */

    @Override
    public int hashCode() {
        final int prime = 91;
	int result = 1;
	result = (prime * result) + serialNumber;
	return result;
    }

    /** compare for equality based on serialNumber
	@return true if parameter is a Subwoofer with same serialNumber, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o == null)
	   return false;
	if (! (o instanceof Subwoofers) )
	   return false;
	Subwoofers s = (Subwoofers) o;
	return (s.getSerialNumber() == this.getSerialNumber());
    }

    public static void main(String[] args) {

	Subwoofers s = new Subwoofers(123456,96.5f);
	System.out.println(s);

    }

}
