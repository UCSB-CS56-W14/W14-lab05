package edu.ucsb.cs56.w14.lab05.jgee67;

public class FootballPlayer {
    
    private int jerseynumber; // number on jersey

    private String name; // name of the player, e.g "Cringle McDingleberry"
    
    /**
       Two-arg constructor
       @param jerseynumber  number on jersey eg 69
       @param name name of the player, e.g "Cringle McDingleberry"
    */

    public FootballPlayer(int jerseynumber, String name) {
	this.jerseynumber = jerseynumber;
	this.name = name;
    }

    /** 
	Getter for jersey number
	@return jersey number, number on jersey e.g "69"
    */

    public int getJerseyNumber () { return this.jerseynumber; }

    /** 
	Getter for name
	@return name of the player, e.g "Cringle McDingleberry"
    */
    public String getName () {return this.name; }

    /**
       convert to String representation in format [jersey number, name]

       @return formatted string, [jersey number,name]
    */

    @Override
    public String toString() {
	String result = "["+this.getJerseyNumber()+","+this.getName()+"]";
	return result;
    }


    /** hashcode to be used for hash tables, etc.
	based only on the jerseynumber value.
     */

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = (this.getJerseyNumber()*prime)%7;
	return result;
    }

    /** compare for equality based on jerseynumber
	@return true if parameter is a FootballPlayer with same jerseynumber, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if(o==null)
	    return false;
	if(o==this)
	    return true;
	if(!(o instanceof FootballPlayer))
	    return false;
	FootballPlayer other = (FootballPlayer)o;
	if(this.getJerseyNumber()!=other.getJerseyNumber())
	    return false;
	else
	    return true;
    }

    public static void main(String [] args){
	FootballPlayer cringle = new FootballPlayer(69,"Cringle McDingleberry");
	System.out.println(cringle.toString());
    }
}
