package edu.ucsb.cs56.w14.lab05.sarahdarwiche;

import java.lang.Integer;
public class Ipod {
    private String serialNumber; //unique ID number
    

    private String color; //color of the Ipod
    
    /**
       Two-arg constructor
       @param serialNumber, unique ID number e.g. 00127288
       @param color, color of the Ipod e.g "blue"
    */

    public Ipod (String sN, String clr) {
	serialNumber = sN;
	color = clr;
    }

    /** 
	Getter for serialNumber
	@return serialNumber, unique ID number, e.g. 00127288
    */

    public String getserialNumber () { return serialNumber; }

    /** 
	Getter for color
	@return color of the Ipod, e.g "blue"
    */
    public String getColor () {return color; }

    /**
       convert to String representation in format [serialNumber, color]
       e.g. <code>["00127288","blue"]</code>

       @return formatted string, [serialNumber, color]
    */

    @Override
    public String toString() {
	return "[" + serialNumber + "," + color + "]";
    }


    /** hashcode to be used for hash tables, etc.
	based only on the serialNumber value.
     */

    @Override
    public int hashCode() {
        return  Integer.parseInt(this.getserialNumber()) % 9999;
    }

    /** compare for equality based on serialNumber
	@return true if parameter is a Ipod with same serialNumber, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if(this.hashCode() == o.hashCode())
	    return true;
	return false;
    }

}
