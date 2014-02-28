package edu.ucsb.cs56.w14.lab05.moniker85;

public class Colour {
    private String RGB; // RGB: Red, Green, Blue values of the colour concatenated as one string
    // eg: 255000153
    // note: String because leading zeros may be significant

    private String name; // name of the colour, e.g "Orange"
    
    /**
       Two-arg constructor
       @param RGB  RGB values of the colour concatenated to one string, eg. 255000153
       @param name name of the colour, e.g "Colour"
    */

    public Colour(String RGB, String name) {
	this.RGB = RGB;
	this.name = name;
    }

    /** 
	Getter for RGB
	@return RGB, RGB values of the colour concatenated to one string, eg. 255000153
    */

    public String getRGB () { return this.RGB; }

    /** 
	Getter for name
	@return name of the colour, e.g "Colour"
    */
    public String getName () {return this.name; }

    /**
       convert to String representation in format [RGB,name]
       e.g. <code>["00127288","Trader Joe's Raisin Bran"]</code>

       @return formatted string, [RGB,name]
    */

    @Override
    public String toString() {
	String result = "["+this.RGB+","+this.name+"]";
	return result;
    }


    /** hashcode to be used for hash tables, etc.
	based only on the RGB value.
     */

    @Override
    public int hashCode() {
        return this.RGB.hashCode();
    }

    /** compare for equality based on RGB
	@return true if parameter is a Colur with same RGB, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o == null) { return false; }
	if (o == this) { return true; }
	if (!(o instanceof Colour)) { return false; }
	Colour temp = (Colour)o;

	if (this.RGB.equals(temp.RGB)) {
	    return true;
	}
	else
	    return false;
    }

    public static void main(String [] args) {
	Colour red = new Colour("255000000","Red");
	System.out.println("red=" + red);
    }
}
