package edu.ucsb.cs56.w14.lab05.krbriggs;

public class Burrito {
    private int length; //how long the burrito is in inches
    private int girth; //how girthy the burrito is in inches
    // note: String because leading zeros may be significant

    private String restaurant; // name of the restaurant the burrito hails from, e.g "Chuck E Cheese". Unique identifier
    
    /**
       Three-arg constructor
       @param length  length in inches, e.g. 11
       @param girth girth in inches, e.g 7
       @param restaurant name of the restaurant. This will be the unique identifier to compare burritos.
    */

    public Burrito(int l, int g, String r) {
	restaurant = r;
	length = l;
	girth = g; 

    }

    /** 
	Getter for length of burrito
	@return inches, length of burrito
    */

    public int getGirth () { return girth; }

 /** 
	Getter for girth of burrito
	@return inches, girth of burrito
    */

    public int getLength () { return length; }

    /** 
	Getter for restaurant
	@return name of the restaurant, e.g "Freebirds"
    */
    public String getRestaurant () {return restaurant; }

    /**
       convert to String representation in format [length, girth, restaurant]
       e.g. <code>[12,12,"Freebirds"]</code>

       @return formatted string, [length,girth,restaurant]
    */

    @Override
    public String toString() {

	return "[" + getLength() + "," + getGirth() + "," + getRestaurant() + "]";
    }


    /** hashcode to be used for hash tables, etc.
	based only on the restaurant value.
     */

    @Override
    public int hashCode() {
       	final int prime = 131; 
        int result = 1;
        result = (prime * result) + this.restaurant.hashCode();

       
        return result;
    }

    /** compare for equality based on restaurant
	@return true if parameter is a Burrito with same restaurant, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o==null) return false;
	if (! (o instanceof Burrito) ) return false;
	Burrito c = (Burrito) o;
	return (c.getRestaurant() == this.getRestaurant());

    }

}
