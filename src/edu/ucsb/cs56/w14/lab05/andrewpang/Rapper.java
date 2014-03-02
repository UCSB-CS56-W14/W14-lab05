package edu.ucsb.cs56.w14.lab05.andrewpang;
public class Rapper {
    private String rapName; // The rap name of the artist, e.g "Childish Gambino"  

    private String realName; // The real legal name of the artist, e.g "Donald Glover"
    	    // Note: Must be a unique identifier
    
    /**
       Two-arg constructor
       @param rapName The rap name of the artist, e.g "Childish Gambino"
       @param realName The real legal name of the artist, e.g "Donald Glover". Note: Must be a unique identifier
    */

    public Rapper(String rapName, String realName) {
      this.rapName = rapName; this.realName = realName;
    }

    /** 
	Getter for rapName
	@return rapName, rap name of the artist, e.g "Childish Gambino"
    */

    public String getRapName () { return this.rapName; }

    /** 
	Getter for realName
	@return  real legal name of the artist, e.g "Donald Glover"
    */
    public String getRealName () {return this.realName; }

    /**
       convert to String representation in format [rapName,realName]
       e.g. <code>["Childish Gambino","Donald Glover"]</code>

       @return formatted string, [rapName,realName]
    */

    @Override
    public String toString() {
        return "[" + getRapName() + "," + getRealName() + "]";    
    }


    /** hashcode to be used for hash tables, etc.
	based only on the realName value.
     */

    @Override
    public int hashCode() {
        final int prime = 31; 
        int result = 1;
        result = (prime * result) + this.realName.hashCode();
        return result;
    }

    /** compare for equality based on realName
	@return true if parameter is a Rapper with same realName, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o==null) return false;
        if (! (o instanceof Rapper) ) return false;
        Rapper c = (Rapper) o;
        return (c.getRealName() == this.getRealName());
    }

    public static void main (String[] args){
	Rapper rapper = new Rapper("Childish Gambino", "Donald Glover");
	System.out.println(rapper.toString());
    }

}
