package edu.ucsb.cs56.w14.lab05.vinlara;

public class Watch {
    private String model; // model: model of watch, e.g. T49905
    // note: String because of the combination of letters and numbers.

    private String brand; // brand of the watch, e.g "Casio"
    
    public static void main (String[] args) {
        Watch w = new Watch("T2536", "Timex");

        System.out.println("w = " + w);
    }
    
    /**
       Two-arg constructor
       @param model  type of watch e.g "T49905"
       @param brand  brand of the watch e.g "Casio"
    */

    public Watch(String model, String brand) {
        this.model = model; this.brand = brand;
    }

    /** 
	Getter for model
	@return model, type of watch, e.g. "T49905"
    */

    public String getModel () { return this.model; }

    /** 
	Getter for brand
	@return brand of the watch, e.g "Casio"
    */
    public String getBrand () {return this.brand; }

    /**
       convert to String representation in format [model,brand]
       e.g. <code>["T49905","Casio"]</code>

       @return formatted string, [T49905,Casio]
    */

    @Override
    public String toString() {
	return "[" + getModel() + "," + getBrand() + "]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the model value.
     */

    @Override
    public int hashCode() {
       return model.hashCode(); 
       // final int prime = 31;
	//int result = 1;
	//result = (prime * result) + this.model.hashCode();   
    }

    /** compare for equality based on model
	@return true if parameter is a Watch with same model number, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o==null) return false;
	if (! (o instanceof Watch) ) return false;
	Watch w = (Watch) o;
	return (w.getModel() == this.getModel());
        //return super.equals(o);  as if not overridden
    }

}
