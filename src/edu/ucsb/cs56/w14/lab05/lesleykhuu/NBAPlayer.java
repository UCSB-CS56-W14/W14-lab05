package edu.ucsb.cs56.w14.lab05.lesleykhuu;
public class NBAPlayer {
    private int jerseyNum; // jerseyNum: numbers under the bar code, e.g. 3
    // //note: String because leading zeros may be significant

    private String name; // name of the NBA Player, e.g "Chris Paul"
    
    /**
       Two-arg constructor
       @param jerseyNum  player's jersey number, e.g. 3
       @param name name of the NBA Player, e.g "Chris Paul"
    */

    public NBAPlayer(int jerseyNum, String name) {
      // @@@ STUB so do nothing
        this.jerseyNum = jerseyNum;
        this.name = name;
    }

    /** 
	Getter for jerseyNum
	@return jerseyNum, player's jersey number, e.g. 3
    */

    public int getJerseyNum () { 

        return this.jerseyNum; 
    }

    /** 
	Getter for name
	@return name of the NBA Player, e.g "Chris Paul"
    */
    public String getName () {
        return "Chris Paul"; 
    }


    /**
       convert to String representation in format [jerseyNum,name]
       e.g. <code>[3,"Chris Paul"]</code>

       @return formatted string, [jerseyNum,name]
    */

    @Override
    public String toString() {
	//return super.toString(); // in stub, return super class (as if not overridden)
	// OR: return "[STUB]";     
        return "[" + this.jerseyNum + "," + this.name + "]";

    }


    /** hashcode to be used for hash tables, etc.
	based only on the jerseyNum value.
     */

    @Override
    public int hashCode() {
    //    return super.hashCode(); // in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    //    return (this.getJerseyNum()).hashCode();
        Integer i = new Integer(this.getJerseyNum());
        int retval = i.hashCode();
        return retval;

    }

    /** compare for equality based on jerseyNum
	@return true if parameter is a NBA Player with same jerseyNum, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        //return super.equals(o); // as if not overridden
        
    // OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
        if (! (o instanceof NBAPlayer))
            return false;
        NBAPlayer x = (NBAPlayer) o;
        return ( this.getJerseyNum() == (x.getJerseyNum()) && this.getName().equals(x.getName()));
    }
    
    public static void main(String [] args){
        NBAPlayer player = new NBAPlayer(3,"Chris Paul");
        System.out.println(player.toString());

    }

}