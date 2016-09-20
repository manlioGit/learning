package ch.seminar.view;

import static ch.seminar.util.Format.*;
import ch.seminar.Course;
import ch.seminar.Student;

public class Csv implements View{

	private Course _course;

	public Csv(Course course) {
		_course = course;
	}

	@Override
	public String render() {
		
		String studentList = "";
		for (Student student : _course.getStudents()) {
			studentList += newLine(component(student.getFirstName()) + component(student.getLastName()));
		}
		
		return 
			newLine(component(_course.getNumber()) + component(_course.getDescription()) + component(_course.getLocation()) 
					+ component(_course.getSeatsLeft()) + component(_course.getTime())) +
			studentList;
	}

}
