package ch.seminar;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ch.seminar.util.Time;

public class CourseTest {

	private Course _course; 

	@Before
	public void setUp(){
		_course = new Course("name", "description", "1", "somewhere", 1, new Time("20.09.2016"));
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
	public void courseHasStartDate() throws Exception {
		assertThat(_course.getTime(), is(new Time("20.09.2016")));
	}
	
}
