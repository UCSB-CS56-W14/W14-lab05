package edu.ucsb.cs56.w14.lab05.amwexler;

public class Lego {

    private String name; // name of the Lego, e.g "Spaceship"
    int pieces;//number of pieces in this Lego set   


	public static void main(String[] args){
		Lego l = new Lego(460, "Castle");
		System.out.println(l);
	}	

    /**
       Two-arg constructor
       @param pieces  numbers of pieces, e.g. 88
       @param name name of the Lego, e.g "Spaceship"
    */

    public Lego(int pieces, String name) {
      this.pieces=pieces;
	this.name=name;
    }

    /** 
	Getter for pieces
	@return pieces, number of pieces, e.g. 88
    */

    public int getPieces () { return pieces; }

    /** 
	Getter for name
	@return name of the Lego, e.g "Spaceship"
    */
    public String getName () {return name; }

    /**
       convert to String representation in format [pieces,name]
       e.g. <code>[88,"Spaceship]</code>

       @return formatted string, [pieces,name]
    */

    @Override
    public String toString() {
	return ("[" + pieces+ "," + name + "]");  
    }


    /** hashcode to be used for hash tables, etc.
	based only on the pieces and name's first character.
     */

    @Override
    public int hashCode() {
        return (pieces*1000) + (int)name.charAt(0);//Uses pieces and first character of name as hashcode
    }

    /** compare for equality based on pieces and name
	@return true if parameter is a Lego with same name and pieces, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Lego)){return false;}
	Lego l = (Lego)o;
	if(pieces==l.getPieces() && name.equals(l.getName())){return true;}
	return false;
    }

}
