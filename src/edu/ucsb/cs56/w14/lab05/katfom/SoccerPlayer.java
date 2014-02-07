package edu.ucsb.cs56.w14.lab05.katfom;

public class SoccerPlayer {
    private int jerseyNum; // Player's jersey number

    private String name; // name of the SoccerPlayer, e.g "David Beckham"
    
    /**
       Two-arg constructor
       @param jerseyNum  Player's jersey number, e.g. 23
       @param name name of the SoccerPlayer, e.g "David Beckham"
    */

    public SoccerPlayer(int jerseyNum, String name) {
	this.jerseyNum = jerseyNum;
	this.name = name;
    }

    /** 
	Getter for jerseyNum
	@return jerseyNum, e.g. 23
    */

    public int getJerseyNum () { return this.jerseyNum; }

    /** 
	Getter for name
	@return name of the SoccerPlayer, e.g "David Beckham"
    */
    public String getName () {return this.name; }

    /**
       convert to String representation in format name, jerseyNum
       e.g. <code>"David Beckham", 23</code>

       @return formatted string, name, jerseyNum
    */

    @Override
    public String toString() {
        return  this.name + ", " + this.jerseyNum;
    }


    /** hashcode to be used for hash tables, etc.
	based only on the jerseyNum value.
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.jerseyNum);
        return hash;
    }

    /** compare for equality based on jerseyNum
	@return true if parameter is a SoccerPlayer with same jerseyNum, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o==null) {return false;}
        if (! (o instanceof SoccerPlayer) ) {return false;}
        SoccerPlayer s = (SoccerPlayer) o;
        return (this.jerseyNum == s.jerseyNum);
    }
}
