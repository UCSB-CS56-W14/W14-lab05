package edu.ucsb.cs56.w14.lab05.maxsorenson;

public class Planet {
    private String name; // Name: identity of the planet, e.g. "Earth"
    // note: String because... well its a name (composed of characters(letters) )

    private double mass; // mass of the planet, e.g 5.9e24
    
    /**
       Two-arg constructor
       @param name name of the planet, e.g. "Earth"
       @param mass mass of the planet, e.g 5.9e24
    */

    public Planet(String name, double mass) {
this.name = name;
this.mass = mass;
    }

    /**
Getter for name
@return name, name of the planet, e.g. "Earth"
    */

    public String getName () { return name; }

    /**
Getter for mass
@return mass of the planet, e.g 5.9e24
    */
    public double getMass () {return mass; }

    /**
       convert to String representation in format [name,mass]
       e.g. <code>["Earth",5.9E24]</code>

       @return formatted string, [name, mass]
    */

    @Override
    public String toString() {

String temp1;
temp1 = ("[" + name + "," + mass +"]");
return temp1;
    }


    /** hashcode to be used for hash tables, etc.
based only on the name value.
     */

    @Override
    public int hashCode() {
        int myHash;
myHash = name.hashCode();
return myHash;

        // in stub, return super class (as if not overridden)
// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    }

    /** compare for equality based on upc
@return true if parameter is a Planet with same name, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        
if (o==null) {return false;}
if (! (o instanceof Planet) ) {return false;}
Planet cb = (Planet) o;
if (cb.getName().equals(this.name)) return true;
else return false;

//return super.equals(o); // as if not overridden
// OR: return false;
// OR: return true;
// Note: there is not good "always wrong" stub value for a boolean method
// It will be "correct" half the time by accident.
    }

    public static void main (String[] args) {
	Planet p = new Planet("Jupiter",1.89e27);
	System.out.println(p);
	
    }


}
