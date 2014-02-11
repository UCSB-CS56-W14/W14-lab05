package edu.ucsb.cs56.w14.lab05.rkjha7;
public class Star {
    private String star; // name of the star
    private double luminosity; // how bright the star is based on a number
    
    /**
       Two-arg constructor
       @param star string name of star
       @param luminosity double value of star's brightness
    */

    public Star(String star, double luminosity) {
      this.star = star;
      this.luminosity = luminosity;
    }

    /** 
	Getter for star
	@return star name
    */

    public String getStar () { return this.star; }

    /** 
	Getter for luminosity
	@return luminosity value
    */
    public double getLuminosity () {return this.luminosity; }

    /**
       convert to String representation in format [star,luminosity]
       e.g. <code>["Alpha Centauri","1.519"]</code>

       @return formatted string, [star,luminosity]
    */

    @Override
    public String toString() {
     return "[" + this.star + "," + this.luminosity + "]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the luminosity value.
     */

    @Override
    public int hashCode() {
        return ((int)(this.luminosity*1000));
    }

    /** compare for equality based on luminosity
	@return true if parameter is a star with same luminosity, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o == null) return false;
	if (o == this) return true;
	if (!(o instanceof Star)) return false;
	Star newStar = (Star) o;
	return (this.luminosity == newStar.luminosity);
    }

}
