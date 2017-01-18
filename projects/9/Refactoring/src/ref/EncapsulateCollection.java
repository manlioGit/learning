package ref;

import java.util.HashSet;
import java.util.Set;

public class EncapsulateCollection {

	/*START
	  class Course{
	    private final String _name;
		private final boolean _isAdvanced;
		public Course (String name, boolean isAdvanced) {
			_name = name;
			_isAdvanced = isAdvanced;
	    	
	    };
	    public boolean isAdvanced() { return _isAdvanced; };
	  }
	  
	  class Person {
	    public Set getCourses() {
	        return _courses;
	    }
	    public void setCourses(Set arg) {
	        _courses = arg;
	    }
	    private Set _courses;
	  }
	  */
	
	class Course{
	    private final String _name;
		private final boolean _isAdvanced;
		public Course (String name, boolean isAdvanced) {
			_name = name;
			_isAdvanced = isAdvanced;
	    	
	    };
	    public boolean isAdvanced() { return _isAdvanced; };
	  }
	  
	  class Person {
		
		public Person() {
			_courses = new HashSet<>();
		}
		  
		void add (Course course){
			_courses.add(course);
		}
	    private final Set _courses;
	  }
}
