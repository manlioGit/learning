package ch.seminar.view;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ch.seminar.Course;
import ch.seminar.Student;

public class HtmlRawTest {

	private Course _course = new Course("course", "desc", "a101b", "here", 5);

	@Test
	public void courseRenderItSelf() {
		
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
	
}
