package edu.ucsb.cs56.w14.lab05.jrcryan;
public class Car {
    private String vin; // VIN: series of numbers and letters i.e. "1GNCS18Z30115561"
    private String makeModel; // name of the car make and model, i.e. "Nissan Altima"
    
    /**
       Two-arg constructor
       @param vin series of numbers and letters i.e. "1GNCS18Z30115561"
       @param make name of the car make and model, i.e. "Nissan Altima"
    */

    public Car(String vin, String makeModel) {
	this.vin = vin;
	this.makeModel = makeModel;
    }

    /** 
	Getter for vin
	@return vin, sequence under the windshield, i.e. "1GNCS18Z30115561"
    */

    public String getVin () { return this.vin; }

    /** 
	Getter for makeModel
	@return make and model of the car, i.e. "Nissan Altima"
    */
    public String getMakeModel () {return this.makeModel; }

    /**
       convert to String representation in format [vin,makeModel]
       e.g. <code>["1GNCS18Z30115561","Nissan Altima"]</code>

       @return formatted string, [vin,makeModel]
    */

    @Override
    public String toString() {
	return "[" + getVin() + "," + getMakeModel() + "]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the vin value.
     */

    @Override
    public int hashCode() {
        return vin.hashCode();
    }

    /** compare for equality based on vin
	@return true if parameter is a Car with same vin, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o == null) return false;
	if (!(o instanceof Car)) return false;
	Car c = (Car) o;
	return(c.getVin() == this.getVin());
    }

    public static void main(String [] args) {
	Car c = new Car("1GNCS18Z30115561", "Nissan Altima");
	System.out.println(c);
    }

}


