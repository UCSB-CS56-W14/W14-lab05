package edu.ucsb.cs56.w14.lab05.bernardyan;

public class Months {
    private int Number; // the number that is associated with the month, eg."4' for "April"

    private String Name; // name of the Month, e.g "April"
    
    /**
       Two-arg constructor
       @param number  numbers of the month, e.g. 5
       @param name name of the Month, e.g "May"
    */

    public Months(int number,String name) {
	this.Name = name;
        this.Number = number;
    }

    /** 
	Getter for name
	@return name of the Month, e.g "April"
    */

    public String getName () { return Name; }

    /** 
	Getter for number
	@return the number that is associated with the month, eg."4' for "April"
    */
    public int getNumber () {return Number; }

    /**
       convert to String representation in format [4,April]
       e.g. <code>[4,April]</code>

       @return formatted string, [number,name]
    */

    @Override
    public String toString() {
	return "[" + this.Number + "," + this.Name + "]"; 
    }


    /** hashcode to be used for hash tables, etc.
	based on the name and number of the month.
     */

    @Override
    public int hashCode() {
        final int prime =31;
                   int result =1;
                  result =prime * result + Name.hashCode();
                  result =prime * result + Number;// in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
        return result;
    }

    /** compare for equality based on month
	@return true if parameter is a month with same name and number, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o == null){return false;}
	if (!(o instanceof Months)){ return false;}
	Months p = (Months) o;
	if (this.hashCode() == p.hashCode()){
	    return true;
	}else{
	    return false;
	}
	//if (this.getNumber() == p.getNumber() && (this.getName()).equals(p.getName())){
	//  return true;
	//}else{
	//  return false;
	//}
	//return super.equals(o); // as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

}
