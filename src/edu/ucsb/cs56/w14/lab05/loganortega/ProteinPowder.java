package edu.ucsb.cs56.w14.lab05.loganortega;
public class ProteinPowder {
    private String flavor; // describes flavor of powder, e.g. "chocolate"

    private int amountProtein; // amount of protein per serving

    private int serialNumber; // directly identifies brand and flavor of protein, 8-digit number
    
    /**
       Three-arg constructor
       @param serialNumber numbers by the bar code, e.g. 86028807
       @param amountProtein protein per serving, e.g 15 (g)
       @param flavor flavor of protein powder, e.g. "chocolate"
    */

    public ProteinPowder(int serialNumber, int amountProtein, String flavor) {
	this.flavor = flavor;
	this.amountProtein = amountProtein;
	this.serialNumber = serialNumber;
    }

    /** 
	Getter for serialNumber
	@return serial number, numbers under the bar code, e.g. 86028807
    */

    public int getSerialNumber () { 
	return this.serialNumber;
    }

    /** 
	Getter for amountProtein
	@return amount of protein per serving, e.g 15 (g)
    */
    public int getAmountProtein () {
	return this.amountProtein; 
    }

    /**
	Getter for flavor
	@return the flavor of the protein powder, e.g. "chocolate"
    */
    public String getFlavor () {
	return this.flavor;
    }

    /**
       convert to String representation in format [serialNumber, amountProtein, flavor]
       e.g. <code>[86028807, 15, "chocolate"]</code>

       @return formatted string, [serialNumber, amountProtein, flavor]
    */

    @Override
    public String toString() {
	return "[" + getSerialNumber() + ", " + getAmountProtein() + ", " + getFlavor() + "]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the serialNumber.
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        return this.getSerialNumber() % prime;
    }

    /** compare for equality based on serialNumber
	@return true if parameter is a ProteinPowder with same serialNumber, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o==null) return false;
	if (! (o instanceof ProteinPowder) ) return false;
	ProteinPowder c = (ProteinPowder) o;
	return (c.getSerialNumber() == this.getSerialNumber());
    }

    public static void main (String [] args) {
	ProteinPowder p = new ProteinPowder(86028807, 30, "cookies and cream");
	System.out.println("p=" + p.toString());
    }
}
