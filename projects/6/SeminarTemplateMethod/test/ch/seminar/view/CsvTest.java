package ch.seminar.view;

import static ch.seminar.util.Format.newLine;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ch.seminar.Course;
import ch.seminar.Student;

public class CsvTest {

	private Course _course = new Course("course", "desc", "a101b", "here", 5);

	@Test
	public void courseRenderItSelf() {
		
		_course.enroll(new Student("xxx", "yyy"));
		
		assertThat(_course.csv(), 
						is(
						newLine("\"a101b\";\"desc\";\"here\";\"4\";") +
						newLine("\"xxx\";\"yyy\";")
					)
				);
	}
	
}
