package edu.ucsb.cs56.w14.lab05.migueld37;
/** 
@author Phill Conrad
@author @@@ Mena Iskander
@author @@@ Miguel Delgado
@version 02/07/2014 for lab04, cs56, W14
*/
public class Handgun {
    private int serialNumber; // serialNumber: the gun's serial number
    

    private String model; // brand of the handgun, e.g "Smith & Wesson"
    
    /**
       Two-arg constructor
       @param AserialNumber serial number of the handgun, e.g. 123456
       @param Amodel of handgun, e.g "Glock"
    */


    public Handgun(int AserialNumber, String Amodel) {
      serialNumber = AserialNumber; 
      model = Amodel;

    }

    /** 
	Getter for serialNumber
	@return serialNumber, the handgun's serial number, e.g. 123456
    */

    public int getserialNumber () { return this.serialNumber; }

    /** 
	Getter for model
	@return model of the handgun, e.g "Glock"
    */

    public String getModel () {
	return model; }

    /**
       convert to String representation in format [serialNumber,model]
       e.g. <code>["123456","Glock"]</code>

       @return formatted string, [serialNumber,model]
    */

    @Override
    public String toString() {

	return "[" + this.getserialNumber() + "," + this.getModel() + "]";

//	return super.toString(); // in stub, return super class (as if not overridden)

	// OR: return "[STUB]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the serialNumber value.
     */

    @Override
    public int hashCode() {

    	int hash = 3;
   	hash = 7 * hash + this.model.hashCode();
	hash = 7 * hash + (int)this.serialNumber;
	return hash;

//    return super.hashCode(); // in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests

      
    }

    /** compare for equality based on upc
	@return true if parameter is a Handgun with same serialNumber, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if(o ==  null)

		return false;
	if(!(o instanceof Handgun))
		return false;
	if(this.getserialNumber() == ((Handgun)o).getserialNumber())
		return true;
	else
		return false;


	//	return super.equals(o); // as if not overridden

	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

	public static void main(String[] args) {
		Handgun gun1 = new Handgun(123456, "Glock");
		System.out.println("gun1=" + gun1.toString());
		}
}


