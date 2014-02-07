package edu.ucsb.cs56.w14.lab05.kmai12;

/** Class Inmate
@author Kevin Mai
@version 01/29/2014 for lab04, cs56, W14
*/
public class Inmate {
    private String name; // name of the Inmate, e.g Mike Hunt

    private int number; // number of the Inmate, e.g 239
    
    /**
       Two-arg constructor
       @param name  name of the Inmate, e.g Mike Hunt 
       @param number the number of Inmate, e.g 239
    */

    public Inmate(String name, int number) {
	this.name = name;
	this.number = number;
    }

    /** 
	Getter for name
	@return name, name of the Inmate, e.g Mike Hunt 

    */

    public String getName () { return name; }
    
    /** 
	Getter for number
	@return the number of Inmate, e.g 239
    */
    public int getNumber () {return number; }

    /**
       convert to String representation in format [name,number]
       e.g. <code>["Mike Hunt",239]</code>.

       @return formatted string, [name,number]
    */

    @Override
    public String toString() {
	return "[" + name + "," + number +"]";
    }


    /** hashcode to be used for hash tables, etc.
	based only on the number value.
     */

    @Override
    public int hashCode() {
	return number;
    }

    /** compare for equality based on number
	@return true if parameter is an Inmate with same number, otherwise false.
     */

    @Override
    public boolean equals(Object o) {
	if(o == null)
	    return false;
	if(!(o instanceof Inmate))
	    return false;
	Inmate inm = (Inmate) o;
	if(number != inm.getNumber())
	    return false;
	return true;
    }

}
