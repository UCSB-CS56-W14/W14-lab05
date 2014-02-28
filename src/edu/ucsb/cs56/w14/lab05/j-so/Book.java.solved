public class Book {
    private String title; // official name of the book (eg. "Brave New World")

    private String author; // name of the author of the book (eg. "Aldous Huxley")
    
    /**
       Two-arg constructor
       @param name of the book, eg "Brave New World"
       @param name of the author, eg "Aldous Huxley"
    */

    public Book(String title, String author) {
	this.title = title;
	this.author = author;
    }

    /** 
	Getter for title
	@return title, name of the book
    */

    public String getTitle () { return this.title; }

    /** 
	Getter for author
	@return author, name of the author of book
    */
    public String getAuthor () {return this.author; }

    /**
       convert to String representation in format [title,author]
       e.g. <code>["Brave New World","Aldous Huxley"]</code>

       @return formatted string, [title,author]
    */

    @Override
    public String toString() {
	return "[" + this.title + "," + this.author + "]";   
    }


    /** hashcode to be used for hash tables, etc.
	based on the title and author values.
     */

    @Override
    public int hashCode() {
	final int prime = 41; //any prime
	int result = 1;
	result = (prime * result) + this.title.hashCode(); //depends on title
	result = (prime * result) + this.author.hashCode(); //depends on author

        return result;
    }

    /** compare for equality based on title and author
	@return true if parameter is a Book with same title and author, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if(o == null)
	    return false;
	if(!(o instanceof Book))
	    return false;
	Book b = (Book) o;
	if(this.getTitle() == b.getTitle() && this.getAuthor() == b.getAuthor())
	    return true;
	return false;
        
    }

}
