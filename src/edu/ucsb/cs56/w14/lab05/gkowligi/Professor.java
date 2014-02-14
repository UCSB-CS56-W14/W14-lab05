package edu.ucsb.cs56.w14.lab05.gkowligi;
public class Professor {

    /*    public static void main{

	Professor p = new Professor(1234567, Economics);

	System.out.println(p.toString());
	}*/

    private double id; //ID: identification number, e.g. 1234567
    
    private String dept; // Department name, e.g "Economics"
    
    /**
       Two-arg constructor
       @param id  identification number, e.g. 1234567
       @param dept department name, e.g "Economics"
    */

    public Professor(double id_in, String dept_in) {
      	id = id_in;
	dept = dept_in;
    }

    /** 
	Getter for id
	@return id identification number, e.g. 1234567

    */

    public double getId () { return this.id; }

    /** 
	Getter for dept
	@return dept department name, e.g "Economics"
    */
    public String getDept () {return this.dept; }

    /**
       convert to String representation in format [id, dept]
       e.g. <code>["1234567","Economics"]</code>

       @return formatted string, [id,dept]
    */

    @Override
    public String toString() {
	return ("[" + this.id + "," + this.dept + "]"); 
    }


    /** hashcode to be used for hash tables, etc.
	based only on the id value.
     */

    @Override
    public int hashCode() {
	int num = 79, num2 = 1;
	num2 = (num * num2) + (int)this.id;
	return num2;
    }

    /** compare for equality based on id
	@return true if parameter is a Professor with same id, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o == null)
	    return false;
	if (!(o instanceof Professor))
	    return false;

	Professor p = (Professor) o;

	if(this.id == p.id)
		return true;

	return false;
    }

}
