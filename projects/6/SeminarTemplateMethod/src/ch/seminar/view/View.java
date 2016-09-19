package ch.seminar.view;

import ch.seminar.Course;

public abstract class View {
	
	public String value(Course course){
		return courseInformation(course) + studentList(course);
	}
	
	public abstract String courseInformation(Course course);
	public abstract String studentList(Course course);
}
