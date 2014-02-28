package edu.ucsb.cs56.w14.lab05.sososohan;

public class Hat {
    private String serialNum; //unique identifier (String because leading zeros significant)
  
    private String brand; // name of the hat's brand
    
    /**
       Two-arg constructor
       @param serialNum  numbers under the bar code, e.g. 00127288
       @param brand brand of the hat, e.g "UNDFTD"
    */

    public Hat (String serialNum, String brand) {
      this.serialNum = serialNum;
      this.brand = brand;
    }

    /** 
	Getter for serialNum
	@return serialNum, numbers under the bar code, e.g. 00127288
    */

    public String getSerialNum () { return this.serialNum; }

    /** 
	Getter for brand
	@return brand of the hat, e.g "UNDFTD"
    */
    public String getBrand () {return this.brand; }

    /**
       convert to String representation in format [serialNum, brand]
       e.g. <code>["00127288","UNDFTD"]</code>

       @return formatted string, [serialNum, brand]
    */

    @Override
    public String toString() {
	return "[" + this.serialNum + "," + this.brand + "]";    
    }


    /** hashcode to be used for hash tables, etc.
	based only on the serialNum value.
     */

    @Override
    public int hashCode() {
        int hash = 1;
	hash = hash * 6 + Integer.parseInt(this.serialNum);
	hash = hash * 2 + Integer.parseInt(this.serialNum);
	return hash;
    }

    /** compare for equality based on serialNum
	@return true if parameter is a Hat with same serial number, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o==null) {return false;}
	if (!(o instanceof Hat)) {return false;}
	Hat h = (Hat) o;

	if (this.hashCode() != h.hashCode()) {return false;}
	if (this.getSerialNum() != h.getSerialNum()) {return false;}

	return true;
    }

    /**creates a hat object and prints its serial number and brand as a string*/
    
    public static void main(String args[]) {
	Hat h= new Hat("23232322","Warriors");
	String s= h.toString();
	System.out.println(s);
    }
}
