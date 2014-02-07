package edu.ucsb.cs56.w14.lab05.paranoia1120;
/** class Usps

    @author Phill Conrad
    @author Yue Xin
    @author Ziping He
    @version 2014/02/06 for lab04, cs56, W14
    @see Usps

*/

public class Usps {
    private String trackingNum; // tracking number, e.g "9405509" 
    // note: String because leading zeros may be significant, or value may exceed range of an int

    private String name; // name of the receiver, e.g "Ariel"
    
    /**
       Two-arg constructor
       @param trackingNum tracking number, e.g	"9405509"
       @param name name of the receiver, e.g "Ariel"
    */

    public Usps(String trackingNum, String name) {
      this.trackingNum=trackingNum;
      this.name=name;
    }

    /** 
	Getter for trackingNum
	@return tracking number, e.g "9405509"
    */

    public String getTrackingNum () { return this.trackingNum; }

    /** 
	Getter for name
	@return name of the receiver, e.g "Ariel"
    */
    public String getName () {return this.name; }

    /**
       convert to String representation in format [trackingNum,name]
       e.g. <code>["9405509","Ariel"]</code>

       @return formatted string, [trackingNum,name]
    */

    @Override
    public String toString() {
	return "[" + this.trackingNum + "," + this.name + "]";
    }


    /** hashcode to be used for hash tables, etc.
	based only on the trackingNum value.
     */

    @Override
    public int hashCode() {
	final int prime=31;
	int result=1;
	result=prime * result + trackingNum.hashCode();
	return result;
    }

    /** compare for equality based on trackingNum
	@return true if parameter is a Usps with same trackingNum, otherwise false
     */

    @Override
    public boolean equals(Object o) {
       if (o==null) {return false; }
       if (! (o instanceof Usps) ) {return false;}
       Usps p = (Usps) o;
       if(this.trackingNum==p.trackingNum)
	return true;
       else
        return false;
    }
}
