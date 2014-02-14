package edu.ucsb.cs56.w14.lab05.davidacevedo;
/**
 * A Cell Phone identified by it's model and code name
 * 
 * @author David Acevedo
 * @version 2/11/2014 for lab04, cs56, W14
 */
public class CellPhone {
    private String model; // Model: the name of the phone e.g. Nexus 5

    private String codeName; //Code Name: the code name of the phone e.g. hammerhead
    
    /**	
       Two-arg constructor
       @param model - public name of the phone, e.g. Nexus 5
       @param codeName - code name of the phone, e.g "hammerhead"
    */

    public CellPhone(String codeName, String model) {
		this.model = model;
		this.codeName = codeName;
    }

    /** 
	* Get the model
	*
	* @return model, public name of the phone, e.g. Nexus 5
    */

    public String getModel () { return this.model; }

    /** 
	* Get the code name
	* 
	* @return codeName of the phone, e.g "hammerhead"
    */
    public String getCodeName () {return this.codeName; }

    /**
     * convert to String representation in format [codeName,model]
     * e.g. <code>["hammerhead","Nexus 5"]</code>
	 *
     * @return formatted string, [codeName,model]
    */

    @Override
    public String toString() {
	return "[" + getCodeName() + "," + getModel() + "]";      
    }


    /**
	 * hashcode to be used for hash tables, etc.
	 * based only on the codeName value.
     */

    @Override
    public int hashCode() {
        return codeName.hashCode();
    }

    /** 
	 * compare for equality based on codeName
	 *
	 * @return true if parameter is a CellPhone with same codeName, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o==null) return false;
		if (! (o instanceof CellPhone) ) return false;
		CellPhone c = (CellPhone) o;
		return (c.getCodeName() == this.getCodeName());
    }

    public static void main(String [] args){
	CellPhone cell = new CellPhone("hammerhead", "Nexus 5");
	System.out.println(cell.toString());
    }
	
}
