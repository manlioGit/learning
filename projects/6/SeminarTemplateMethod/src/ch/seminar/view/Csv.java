package ch.seminar.view;

import static ch.seminar.util.Format.component;
import static ch.seminar.util.Format.newLine;
import ch.seminar.Course;
import ch.seminar.Student;

public class Csv extends View {

	@Override
	public String courseInformation(Course course) {
		return newLine(
				component(course.getNumber()) + component(course.getDescription()) + component(course.getLocation()) + component(course.getSeatsLeft())
			);
	}
	
	@Override
	public String studentList(Course course){
		
		String studentList = "";
		for (Student student : course.getStudents()) {
			studentList += newLine(component(student.getFirstName()) + component(student.getLastName()));
		}
		
		return studentList;
	}
}
