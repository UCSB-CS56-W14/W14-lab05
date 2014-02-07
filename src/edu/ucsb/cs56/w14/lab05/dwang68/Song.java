package edu.ucsb.cs56.w14.lab05.dwang68;

public class Song {
   

    private String name; // name of the song, e.g "Roar or Wake me up"
    
    private String singer; //name of the singer, e.g "Katy Perry"

     
 
    /**
       Two-arg constructor
       @param name name of the song, e.g "Roar or Wake me up"
       @param singer  name of the singer, e.g "Katy Perry"
    */

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    /** 
	Getter for name
	@return name, name of the song, e.g "Roar or Wake me up"
    */

    public String getName () { return name; }

    /** 
	Getter for singer
	@return name of the singer, e.g "Katy Perry"
    */
    public String getSinger () {return singer; }

    /**
       convert to String representation in format [name,singer]
       e.g. <code>["Roar","Katy Perry"]</code>

       @return formatted string, [name,singer]
    */

    @Override
    public String toString() {
	//return super.toString();
    // in stub, return super class (as if not overridden)
	// OR: return "[STUB]";
        String aString =  "[" + this.name + "," + this.singer + "]" ;
        return aString;
    }


    /** hashcode to be used for hash tables, etc.
	based only on the name value.
     */

    @Override
    public int hashCode() {
        return this.name.hashCode();
        //return super.hashCode();
        // in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    }

    /** compare for equality based on name
	@return true if parameter is a Song with same name, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if ( o == null)
            return false;
        if(!(o instanceof Song))
            return false;
            
            Song s = (Song) o;
        if(this.name == s.name)
            return true;
        else return false;
        
        //return super.equals(o);
        // as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }


    public static void main(String []args){
	Song song1 = new Song("Roar" , "Katy Perry");
        System.out.println(song1);
 
    }

}
