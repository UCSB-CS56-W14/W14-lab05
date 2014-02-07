package edu.ucsb.cs56.w14.lab05.mliou;
public class Dog {
    private String name; // The dog's name, e.g. "Rigby"
    

    private String breed; // The dog's breed e.g "Dachsund"
    
    private String microchipID; // The dog's michrochipID; e.g. "9696996996"
    /**
       Three-arg constructor
       @param name  the dog's name, e.g. "Rigby"
       @param breed the dog's breed, e.g. "Dachsund"
       @param breed the dog's michrochipID, e.g. "969699696969"
    */

    public Dog(String name, String breed, String  microchipID) {
      this.name = name; this.breed = breed; this.microchipID = microchipID;
    }

    /** 
	Getter for name
	@return name of the dog, e.g. "Dongo"
    */

    public String getName () { return this.name; }

    /** 
	Getter for breed
	@return breed of the dog, e.g. "Hellhound"
    */
    public String getBreed () {return this.breed; }

    /** 
    	Getter for microchipID
	@return the dog's microchipID, e.g. "96969999699"
    */
    public String getMicrochipID () {return this.microchipID; }
    /**
       convert to String representation in format [name,breed,microchipID]
       e.g. <code>["Dongo","Hellhound","96969999699"]</code>

       @return formatted string, [name,breed,microchipID]
    */

    @Override
    public String toString() {
	return "[" + getName() + "," + getBreed() + "," + getMicrochipID() + "]";
	
    }


    /** hashcode to be used for hash tables, etc.
	based only on the microchipID value.
     */

    @Override
    public int hashCode() {
        final int prime = 31;
	int result = 1;
	result = (prime * result) + this.microchipID.hashCode(); 
	return result;
    }

    /** compare for equality based on microchipID
	@return true if parameter is a Dog with same microchipID, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o==null) return false;
	if(!(o instanceof Dog)) return false;
	Dog d = (Dog) o;
	return (d.getMicrochipID() == this.getMicrochipID());
    }
    /** creates an instance of dog and prints it using the 
	overidden toString()
    */

    public static void main(String[] args) {
	Dog rigby = new Dog("Rigby","Dachsund-Beagle", "133221333123111");
	System.out.println("rigby = " + rigby);	
    }
}
