package ch.seminar;

import static ch.seminar.util.Format.line;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {

	private Course _course; 

	@Before
	public void setUp(){
		_course = new Course("name", "description", "1", "somewhere", 1);
	}
	
	@Test
	public void enrollingAStudentDecreaseSeatsLeft() {
		
		_course.enroll(new Student("a", "b"));
		
		assertThat(_course.getSeatsLeft(), is(0));
	}

	@Test
	public void cantEnrollStudentOverTotal() {
		try {
			_course.enroll(new Student("a", "b"));
			_course.enroll(new Student("c", "d"));
	        
			fail("Expected an RuntimeException to be thrown");
	    } catch (RuntimeException rte) {
	        assertThat(rte.getMessage(), is("Student: c d can't be enrolled. Seats terminated"));
	    }
	}
	
	@Test
	public void courseRenderItSelf() {
		
		_course.enroll(new Student("xxx", "yyy"));
		
		assertThat(_course.render(), 
						is(
							line("name 1: description") +
							line("location: somewhere") +
							line("seats left: 0") +
							line("") +
							line("Enrollment:") +
							line("xxx yyy") 
						)
				);
	}

}
