package edu.ucsb.cs56.w14.lab05.alanbuzdar;

public class CreditCard {

    private String cardName; // name of the credit card company, e.g "Amex, Discover, Visa, etc"
    private int lastFour; // last four digits of the card number, e.g. 3692, 4217, 3141, 7777, etc
    /**
       Two-arg constructor
       @param cName credit card company name
       @param lastFour last four digits of credit card number
    */

    public CreditCard(String cName, int lastFour) {
	this.cardName = cName;
	if(lastFour<0)
	    this.lastFour = -1*lastFour;
	else
	    this.lastFour = lastFour;
    }

    public static void main(String[] args){
	CreditCard x = new CreditCard("Visa", 4569);
	System.out.println(x);
    }

    /** 
	Getter for lastFour attribute
	@return last four digits of credit card, e.g. 8796, 5566, 4242, 9999, etc...
    */

    public int getLastFour () { return this.lastFour; }

    /** 
	Getter for cardName attribute
	@return name of the card company, e.g "Amex", "Discover", etc...
    */
    public String getName () {return this.cardName; }

    /**
       convert to String representation in format [card name, card number]
       e.g. <code>"Amex,4569"</code>

       @return formatted string, (cardName,lastFour), e.g "Amex,6969", "Visa 0420"
    */

    @Override
    public String toString() {
	String result = "";
	result += this.cardName + "," + this.lastFour;
	return result;
    }


    /** hashcode to be used for hash tables, etc.
	based only on the lastFour value.
     */

    @Override
    public int hashCode() {
	int bucket = this.lastFour%997;
	return bucket;
        // in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    }

    /** compare for equality based on lastFour
	@return true if parameter is a CreditCard with same lastFour, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if(o == null)
	    return false;
	if(!(o instanceof CreditCard))
	    return false;

	CreditCard x = (CreditCard) o;
        if(this.lastFour == x.lastFour)
	    return true;
	else
	    return false;
	
	// as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

}
