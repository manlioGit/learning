package ch.seminar.view;

import static ch.seminar.util.Format.newLine;
import ch.seminar.Course;
import ch.seminar.Student;

public class Raw extends View {

	@Override
	public String courseInformation(Course course) {
		return newLine(course.getName() + " " + course.getNumber() + ": " + course.getDescription()) +
				   newLine("location: " + course.getLocation()) +
				   newLine("seats left: " + course.getSeatsLeft()) +
				   newLine("") +
				   newLine("Enrollment:");
	}
	
	@Override
	public String studentList(Course course){
		
		String studentList = "";
		for (Student student : course.getStudents()) {
			studentList += newLine(student.getFullName());
		}
		
		return studentList;
	}
}
