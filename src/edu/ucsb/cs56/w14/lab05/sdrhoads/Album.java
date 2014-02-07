package edu.ucsb.cs56.w14.lab05.sdrhoads;

/** <p>Class Album<p>
	Represents a Full-length Vinyl Record. An Album has a name of type String, albumName, and a unique album identification number, albumID. Note: albumID is type String because it mimics a serial-style number where leading zeros may be significant.  
    @author P. Conrad
    @author Tom Craig, Sidney Rhoads
    @version UCSB, CS56, W14
*/
public class Album
{
    private String albumID; // Unique ID number for the album: e.g. 123456789
    // note: String because leading zeros may be significant

    private String albumName; // name of the Album, e.g "Boston"

    /**
       Two-arg constructor
       @param id  ID number for the album: e.g. 123456789
       @param name name of the Album, e.g "Boston"
    */

    public Album(String id, String name)
    {
      albumID = id; 
      albumName = name;
    }

    /**
	Getter for albumID
	@return albumID, ID number for the album: e.g. 123456789
    */

    public String getAlbumID ()
    { 
    	return albumID;
    }

    /**
	Getter for albumName
	@return name of the Album, e.g "Boston"
    */
    public String getAlbumName () 
    {
    	return albumName; 
    }

    /**
       convert to String representation in format [albumID,ablumName]
       e.g. <code>["123456789","Boston"]</code>

       @return formatted string, [albumID,albumName]
    */

    @Override
    public String toString() 
    {
    	String result = "[" + albumID + "," + albumName + "]";
		return result;
    }


    /** hashcode to be used for hash tables, etc.
	based only on the albumID value.
	@return hashCode of the albumID
     */

    @Override
    public int hashCode() 
    {
        return this.getAlbumID().hashCode(); 
    }

    /** compare for equality based on albumID
	@return true if parameter is a Album with same albumID, otherwise false
     */

    @Override
    public boolean equals(Object o) 
    {	//boiler plate
    	if(o == null)
    	{
	    	return false;
    	}
    	if(this == o)
    	{
	    	return true;
    	}
    	if(!(o instanceof Album))
    	{
	    	return false;
    	}
    	Album a = (Album) o;
    	
    	if(this.getAlbumID() == a.getAlbumID())
    	{
	    	return true;
    	}
        return false;
    }
    /** main for class Album
    Instantiates and then prints an Album a
	@return void
     */
    public static void main(String [] args)
    {
    	Album a = new Album("12345", "Boston");
    	
    	System.out.println(a);
    }

}