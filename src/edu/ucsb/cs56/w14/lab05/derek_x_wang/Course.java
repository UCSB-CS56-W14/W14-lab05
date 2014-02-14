package edu.ucsb.cs56.w14.lab05.derek_x_wang;
public class Course {
    private String courseId; // the name of a course, e.g "cs56"
    // note: String because leading zeros may be significant

    private String courseName; //the number of students in that course                            //e.g 80
    
    /**
       Two-arg constructor
       @param courseId  numbers under the bar code, e.g. 1234567
       @param name name of the course, e.g "CS56"
    */

    public Course(String id, String name) {
      // @@@ STUB so do nothing
	courseId = id;
	courseName = name;
	
    }

    /** 
	Getter for courseId
	@return courseId, numbers under the bar code, e.g. 1234567
    */

    public String getCourseId () { return this.courseId; }
    
    /** 
	Getter for Name
	@return name of the course, e.g "CS56"
    */
    public String getCourseName () {return this.courseName; }

    /**
       convert to String representation in format [Id,name]
       e.g. <code>["1234567","CS56"]</code>

       @return formatted string, [Id,name]
    */

    @Override
    public String toString() {
	//return super.toString(); // in stub, return super class (as if not overridden)
	// OR: return "[STUB]";     
	String m;
	m = "["+this.courseId+","+this.courseName+"]";
	return m;

    }


    /** hashcode to be used for hash tables, etc.
	based only on the id value.
     */

    @Override
    public int hashCode() {
        //return super.hashCode(); // in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
	final int prime = 31; /* could use any prime number */
        int result = 1;
        result = (prime * result) + this.courseId.hashCode();
	return result;
    }

    /** compare for equality based on id
	@return true if parameter is a Course with same id, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	// return super.equals(o); // as if not overridden
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
       
        if (!(o instanceof Course))
            return false;
	Course p = (Course) o;
	if (!((this.getCourseId()).equals(p.getCourseId()))||!((this.getCourseName()).equals(p.getCourseName())))
	    return false;
	return true;
	

    }

}
