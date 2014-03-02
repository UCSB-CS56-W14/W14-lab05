package edu.ucsb.cs56.w14.lab05.Nazgugu;

public class Computer{
    private String serialNum; // serial number associated with each computer, e.g. KJHM55667
    // note: String because it contains letters and numbers

    private String brand; //the brand of the computer
    
    /**
       Two-arg constructor
       @param serialNum the unique id for every computer, e.g. KJHM55667
       @param  brand the brand of computer eg: "Apple"
    */

    public Computer(String serialNum, String brand) {
      // @@@ STUB so do nothing
	this.serialNum = serialNum;
	this.brand = brand;
    }

    /** 
	Getter for serialNum
	@return serialNum, the unique id for every computer, e.g. KJHM55667
    */

    public String getSerialNum () { return serialNum; }

    /** 
	Getter for brand
	@return brand of the computer, e.g "Apple"
    */
    public String getBrand () {return brand; }

    /**
       convert to String representation in format [upc,name]
       e.g. <code>["00127288","Trader Joe's Raisin Bran"]</code>

       @return formatted string, [upc,name]
    */

    @Override
    public String toString() {
	return "[" + this.serialNum + "," + this.brand + "]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the upc value.
     */

    @Override
    public int hashCode() {
        return Integer.parseInt(this.serialNum);
    }

    /** compare for equality based on upc
	@return true if parameter is a Cereal with same upc, otherwise false
     */

    @Override
    public boolean equals(Object o) {
       if (! (o instanceof Computer))
		return false;
	Computer temp = (Computer)o;
	return (temp.getSerialNum().equals(this.getSerialNum()) & temp.getBrand().equals(this.getBrand()));
    }

   /** main function */
   public static void main(String [] args)
	{
		Computer apple = new Computer("KJHM55667","Apple");
		System.out.println(apple);
	}
}
