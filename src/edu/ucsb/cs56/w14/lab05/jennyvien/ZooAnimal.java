package edu.ucsb.cs56.w14.lab05.jennyvien;
/** ZooAnimal represents an animal that you would find at a zoo, such as a polar bear or giraffe. A ZooAnimal is represented by its name and animal identification number.
    @author Jenny Vien
    @version 2014/02/06 for lab04, cs56, W14
*/


public class ZooAnimal {
    private String name; // name of the zoo animal, e.g "Polar Bear"
    private String ain; //animal identification number, e.g 1234    
    /**
       Two-arg constructor
       @param name name of the zoo animal, e.g "Polar Bear"
       @param ain animal identification number, e.g 1234
    */

    public ZooAnimal(String name, String ain) {
	this.name=name;
	this.ain=ain;
    }

    /** 
	Getter for ain
	@return ain, animal identification number, e.g 1234
    */

    public String getAin () { return this.ain; }

    /** 
	Getter for name
	@return name of the zoo animal, e.g "Polar Bear"
    */
    public String getName () { return this.name; }

    /**
       convert to String representation in format [ain,name]
       e.g. <code>[1234,Polar Bear]</code>

       @return formatted string, [ain,name]
    */

    @Override
    public String toString() {
	return "[" + getAin() + "," + getName() + "]";  }


    /** hashcode to be used for hash tables, etc.
	based only on the ain value.
     */

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = (prime * result) + this.ain.hashCode();
	return result;
    }

    /** compare for equality based on ain
	@return true if parameter is a ZooAnimal with same ain, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
	if (o == this) return true;
	if (! (o instanceof ZooAnimal) ) return false;
	ZooAnimal z = (ZooAnimal)o;
	return this.getAin() == z.getAin();
    }

}
