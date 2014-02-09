package edu.ucsb.cs56.w14.lab05.jovo123;

public class SeaMammal {
    private String tagNumber; // tag number: numbers under on the animals tag, e.g. 123456

    private String species; // species of the sea mammal, e.g "Dolphin"
    
    /**
       Two-arg constructor
       @param tagNumber numbers on the animals tag, e.g. "123456"
       @param species species of the species sea mammal, e.g "Dolphin"
    */

    public SeaMammal(String tagNumber, String species) {
	this.tagNumber = tagNumber;
	this.species = species;
    }

    /** 
	Getter for tagNumber
	@return tag number, numbers on animals tag, e.g. "123456"
    */

    public String getTagNumber () { 
	return this.tagNumber;
    }

    /** 
	Getter for species
	@return species of the sea mammal, e.g "Dolphin"
    */
    public String getSpecies () {
	return this.species;
    }

    /**
       convert to String representation in format [tagNumber,species]
       e.g. <code>["123456","Dolphin"]</code>

       @return formatted string, [tagNumber,species]
    */

    @Override
    public String toString() {
        return "[" + this.tagNumber + "," + this.species + "]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the tagNumber value.

	@return Hashcode int, with value of the tagNumber, e.g. "123456"
     */

    @Override
    public int hashCode() {
        return tagNumber.hashCode();
    }

    /** compare for equality based on tagNumber
	@return true if parameter is a SeaMammal with same tagNumber, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o == null) return false;
	if (! (o instanceof SeaMammal) ) return false;
	SeaMammal otter = (SeaMammal) o;
	return (otter.getTagNumber() == this.getTagNumber());
    }

}
