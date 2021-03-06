package ch.seminar.view;

import static ch.seminar.util.Format.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import ch.seminar.Course;
import ch.seminar.Student;
import ch.seminar.util.Time;

public class RenderTest {

	private Course _course = new Course("course", "desc", "a101b", "here", 5, new Time("10.10.2015"));

	@Test
	public void csv() {
		
		_course.enroll(new Student("xxx", "yyy"));
		
		assertThat(new Csv(_course).render(), 
						is(
						newLine("\"a101b\";\"desc\";\"here\";\"4\";\"10.10.2015\";") +
						newLine("\"xxx\";\"yyy\";")
					)
				);
	}
	
	@Test
	public void html() {
		
		_course.enroll(new Student("xxx", "yyy"));
		
		assertThat(new Html(_course).render(), 
						is(
							"<html>"
								+ "<head>"
									+ "<title>course</title>"
								+ "</head>"
								+ "<body>"
									+ "<div>course:</div>"
									+ "<ul>"
										+ "<li>desc</li>"
										+ "<li>here</li>"
										+ "<li>4</li>"
										+ "<li>10.10.2015</li>"
									+ "</ul>"
									+ "<div>partecipanti:</div>"
									+ "<ul>"
										+ "<li>xxx yyy</li>"
									+ "</ul>"
								+ "</body>"
							+ "</html>"
						)
				);
	}
	
	@Test
	public void raw() {
		
		_course.enroll(new Student("xxx", "yyy"));
		
		assertThat(new Raw(_course).render(), 
						is(
							newLine("course a101b: desc") +
							newLine("location: here") +
							newLine("seats left: 4") +
							newLine("start: 10.10.2015") +
							newLine("") +
							newLine("Enrollment:") +
							newLine("xxx yyy") 
						)
				);
	}
	
}
