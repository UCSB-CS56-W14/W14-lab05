package edu.ucsb.cs56.w14.lab05.menaiskander;
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
       @param serialNumber serial number of the handgun, e.g. 123456
       @param model of handgun, e.g "Glock"
    */

    public Handgun(int serialNumber, String model) {
	this.serialNumber=serialNumber;
	this.model=model;
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
    public String getModel () {return this.model; }

    /**
       convert to String representation in format [serialNumber,model]
       e.g. <code>["123456","Glock"]</code>

       @return formatted string, [serialNumber,model]
    */

    @Override
    public String toString() {
	return "["+this.getserialNumber()+","+this.getModel()+"]";
	// OR: return "[STUB]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the upc value.
     */

    @Override
    public int hashCode() {
        int result=0;
	result=this.serialNumber/100;
	return result;
    }

    /** compare for equality based on upc
	@return true if parameter is a Cereal with same upc, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if(o ==  null)
	    return false;
        if (o == this)
            return true;
	if (!(o instanceof Handgun))
	    return false;
	
	if(this.serialNumber==((Handgun) o).getserialNumber())
	    return true;
	else 
	return false;

	//	return super.equals(o); // as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }
}


