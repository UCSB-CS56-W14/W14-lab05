package edu.ucsb.cs56.w14.lab05.dcoffill;

public class RadioStation {

	public static void main(String[] args) {
		RadioStation kcsb = new RadioStation(69081, "KCSB-FM");
		System.out.println("r=" + kcsb);
	}


    private int facilityID; // Unique ID assigned by FCC for a particular station
    // note: int because leading zeroes don't seem to appear in FCC Facility IDs

    private String callSign; // Call sign, such as "KCSB-FM" or "KCCL"
    
    /**
       Two-arg constructor
       @param facilityID FCC Facility ID, unique station ID
       @param callSign Station call sign, such as "KCSB-FM" or "KCCL"
    */

    public RadioStation(int facilityID, String callSign) {
		this.facilityID = facilityID;
		this.callSign = callSign;
    }

    /** 
	Getter for facilityID
	@return FCC Facility ID, unique station ID
    */

    public int getFacilityID () {
		return this.facilityID;
	}

    /** 
	Getter for CallSign
    @return callSign Station call sign, such as "KCSB-FM" or "KCCL"
    */
    public String getCallSign () {
		return this.callSign;
   	}

    /**
       convert to String representation in format [facilityID,callSign]
       e.g. <code>["69081","KCSB-FM"]</code>

       @return formatted string, [facilityID,callSign]
    */

    @Override
    public String toString() {
	//return super.toString(); // in stub, return super class (as if not overridden)
	// OR: return "[STUB]";     
		String result = "[" + this.facilityID + "," + this.callSign + "]";
		return result;
    }


    /** hashcode to be used for hash tables, etc.
	based only on the facilityID value.
     */

    @Override
    public int hashCode() {
		return (this.facilityID % 9941);
    }

    /** compare for equality based on facilityID
	@return true if parameter is a RadioStation with same facilityID, otherwise false
     */

    @Override
    public boolean equals(Object o) {
    //    return super.equals(o); // as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
		if (o == null)
		    return false;
		if (!(o instanceof RadioStation))
		    return false;
	
		RadioStation r = (RadioStation) o;
	
		// If  the Facility IDs differ, return false
		if (this.facilityID != r.facilityID) {
			return false;
		}
		
		return true;
    }

}
