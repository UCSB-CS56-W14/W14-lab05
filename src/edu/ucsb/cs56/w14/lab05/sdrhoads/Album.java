package edu.ucsb.cs56.w14.lab05.sdrhoads;

/** <p>Album Class</p>

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

}