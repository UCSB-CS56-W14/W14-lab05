package edu.ucsb.cs56.w14.lab05.sumersinha;
//Sumer Sinha

public class TennisPlayer {
    private int atpRank; // ATP ranking of player

    private String name; // name of the player e.g "Roger Federer"
    
    /**
       Two-arg constructor
       @param atpRank
       @param name
    */

    public TennisPlayer(int atpRank, String name) {
        this.atpRank = atpRank;
	this.name = name;
    }

    /** 
	Getter for atpRank of the player
	@return atpRank
    */

    public int getatpRank () { return this.atpRank; }

    /** 
	Getter for name of the player
	@return name of the player
    */
    public String getName () {return this.name; }

    /**
       convert to String representation in format [atpRank,name]
       e.g. <code>[5,David Ferrer]</code>

       @return formatted string, [atpRank,name]
    */

    @Override
    public String toString() {
	String x = "[" + getatpRank() + "," + getName() + "]";
	return x;
    }


    /** hashcode to be used for hash tables, etc.
	based only on the atpRank value.
     */

    @Override
    public int hashCode() {
        return atpRank; 
    }

    /** compare for equality based on atpRank
	@return true if parameter is a TennisPlayer with same atpRank, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o==null) 
	    return false;
	if (! (o instanceof TennisPlayer) ) 
	    return false;
	TennisPlayer c = (TennisPlayer) o;
   	return (c.getatpRank() == this.getatpRank());
    }

    public static void main(String[] args) {
	TennisPlayer x = new TennisPlayer(25,"Gael Monfils");
	x.toString();
	System.out.println(x);
    }

}

    
