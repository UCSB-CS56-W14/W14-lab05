package edu.ucsb.cs56.w14.lab05.OliverHKU;
/** RealMadridPlayer

    @author Phill Conrad
    @author Wenjian Li
    @version 2014/02/06 for lab04, cs56, W14

*/

public class RealMadridPlayer {
    private int number; // number: team number of the player in the squad, e.g. 7

    private String name; // name of the player, e.g "Cristiano Ronaldo"

    private String position; //position of the player, e.g. "CF"
    
    /**
       Three-arg constructor
       @param number team number of the player in the squad, e.g. 7
       @param name name of the player, e.g "Cristiano Ronaldo"
       @param position position of the player, e.g. "CF"
    */

    public RealMadridPlayer(int number, String name, String position) {
      this.number = number;
      this.name = name;
      this.position = position;
    }

    /** 
	Getter for number
	@return number, team number of the player in the squad, e.g. 7
    */

    public int getNumber () { return this.number; }

    /** 
	Getter for name
	@return name of the player, e.g "Cristiano Ronaldo"
    */
    public String getName () {return this.name; }

    /** 
	Getter for position
	@return position of the player, e.g. "CF"
    */
    public String getPosition () { return this.position; }

    /**
       convert to String representation in format [number,name,position]
       e.g. <code>["7","Cristiano Ronaldo","CF"]</code>

       @return formatted string, [number,name,position]
    */

    @Override
    public String toString() {
	return "[" + this.getNumber() + "," + this.getName() + "," + this.getPosition() + "]";    
    }


    /** hashcode to be used for hash tables, etc.
	based only on the number value.
     */

    @Override
    public int hashCode() {
        final int prime = 101;
	int result = 37;
	result = prime * result + this.getNumber();
	return result;
    }

    /** compare for equality based on number
	@return true if parameter is a Player with same team number, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
	if (o == this) return true;
	if (!(o instanceof RealMadridPlayer)) return false;
	RealMadridPlayer myPlayer = (RealMadridPlayer)o;
	if (myPlayer.getNumber()==this.getNumber()) return true;
	return false;
    }

    public static void main(String [] args){
	RealMadridPlayer player1 = new RealMadridPlayer(99, "Oliver Li", "RMF");
	System.out.println(player1.toString());
    }

}
