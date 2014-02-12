package edu.ucsb.cs56.w14.lab05.acantor;

/** USDollarBills
	
    USDollarBills is a class to represent a US dollar bill using the value and the name of the person on the bill
    @author Phill Conrad
    @author Antonio Cantor
    @version 2014/02/11 for lab04, cs56, W14

*/

public class USDollarBills {

    private String name; // name of the person on the dollar bill, e.g "Thomas Jefferson"

    private int value; // value: the value of the dollar bill, e.g. 2
    
    /**
       Two-arg constructor
	   @param name name of the person on the dollar bill, e.g "Thomas Jefferson"
       @param value  the value of the dollar bill, e.g. 2
    */

    public USDollarBills(String name, int value) {
      this.name=name;
	  this.value=value;
    }

    /** 
	Getter for name
	@return name, the name of the person on the dollar bill, e.g. "Thomas Jefferson"
    */

    public String getName () { return this.name; }

    /** 
	Getter for value
	@return value of the dollar bill, e.g 2
    */
    public int getValue () {return this.value; }

    /**
       convert to String representation in format [name,value]
       e.g. <code>"[Thomas Jefferson,2]"</code>

       @return formatted string, [name,value]
    */

    @Override
    public String toString() {
	return "[" + getName() + "," + getValue() + "]";
    }


    /** hashcode to be used for hash tables, etc.
	based only on the name.
     */

    @Override
    public int hashCode() {
		final int prime = 31;
        int result = 1;
        result = (prime * result) + this.name.hashCode();       
        return result;
    }

    /** compare for equality based on name
	@return true if parameter is a USDollarBill with same name, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o==null) return false;
	if (! (o instanceof USDollarBills) ) return false;
	USDollarBills c = (USDollarBills) o;
	return (c.getName() == this.getName());
    }

}
