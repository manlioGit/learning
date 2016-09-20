package ch.gmtech.school.seminar;

import java.util.ArrayList;
import java.util.List;

public class Seminar {

	private String name;
	private String description;
	private String location;
	private int seats;
	
	private ArrayList<Enrollment> enrollments;
	private ArrayList<Course> courses;

	public Seminar(String name, String description, String location, int seats) {
		this.name = name;
		this.description = description;
		this.location = location;
		this.seats = seats;
	}
	
	public String getName() {
		return this.name; 
	}	

	public String getDescription() {
		return this.description; 
	}
	
	public String getLocation() {
		return this.location; 
	}
	
	public int getSeatsLeft() {
		return this.seats - this.enrollments.size();
	}
	
	public void addEnrollment(Student student, String info){
		Enrollment enrollment = new Enrollment(student, info);
		this.enrollments.add(enrollment);
	}
	
	public List<Student> getStudentList(){
		ArrayList<Student> list = new ArrayList<Student>();
		for(Enrollment enrollment : enrollments){
			list.add(enrollment.student);
		}
		return list;
	}

	public void addCourse(Course course){
		this.courses.add(course);
	}
	
	public ArrayList<Course> getCourseList(){
		return courses;
	}
}
