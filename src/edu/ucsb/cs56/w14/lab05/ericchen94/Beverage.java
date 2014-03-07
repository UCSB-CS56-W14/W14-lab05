package edu.ucsb.cs56.w14.lab05.ericchen94;

public class Beverage {
    private String brand; // brand of alcoholic beverage, e.g. "Jack Daniel's Tennessee Whiskey"
    private String barcode; // numbers located under the bar code, e.g. 8218409046
    
    /**
       Two-arg constructor
       @param brand  brand of alcoholic beverage, e.g. "Jack Daniel's Tennessee Whiskey"
       @param barcode  numbers located under the bar code, e.g. 8218409046

    */

    public Beverage(String brand, String barcode) {
	this.brand = brand;
	this.barcode = barcode;
    }

    /** 
	Getter for brand
	@return brand of alcoholic beverage, e.g. "Jack Daniel's Tennessee Whiskey"

    */

    public String getBrand () { return this.brand; }

    /** 
	Getter for barcode
	@return numbers located under the bar code, e.g. 8218409046
    */
    public String getBarcode () {return this.barcode; }

    /**
       convert to String representation in format [brand,barcode]
       e.g. <code>["Jack Daniel's Tennessee Whiskey",8218409046]</code>

       @return formatted string, [brand,barcode]
    */

    @Override
    public String toString() {
	String result = "[";
	result += getBrand() + "," + getBarcode() + "]"; 
	return result;
    }


    /** hashcode to be used for hash tables, etc.
	based only on the barcode value.
     */

    @Override
    public int hashCode() {
	final int prime = 31;
        int result = 1;
        result = (prime * result) + this.barcode.hashCode();
	return result;
    }

    /** compare for equality based on barcode
	@return true if parameter is a beverage with the same barcode, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o==null) return false;
        if (! (o instanceof Beverage) ) return false;
        Beverage b = (Beverage) o;
        return (b.getBarcode() == this.getBarcode());
    }
    
    public static void main(String[] args) {
	
	Beverage b = new Beverage("Skyy Vodka","123456789");
	String s = b.toString();
	System.out.println("s=" + s);
	
    }
    
}
