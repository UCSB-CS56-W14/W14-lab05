package edu.ucsb.cs56.w14.lab05.thetomcraig;

/**  <p>Album represents a Full-length Vinyl Record. An Album has a name and a unique album identification number</p>
<p>albumName corresponds to the album's name; for example, "Boston." The albumName does not have to be unique. albumID corresponds to the album's unique identification number; for example, "01234." Note: albumID is type String because it mimics a serial-style number where leading zeros may be significant.</p>


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
       convert to String representation in format [albumID,albumName]
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
	@return hashCode of albumID
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

    /**
   main function
   Create an album object with the 2 arg constructor
   Test the toString function
    */

    public static void main(String[] args)
    {
        Album darkSideOfTheMoon = new Album("548230457", "Dark Side of the Moon");
        System.out.println(darkSideOfTheMoon);
    }

}