package ch.seminar;

import static ch.seminar.util.Format.line;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private final String _name;
	private final String _description;
	private final String _number;
	private final String _location;
	private final int _totalSeats;

	private final List<Student> _students;
	
	public Course(String name, String description, String number, String location, int totalSeats) {
		_name = name;
		_description = description;
		_number = number;
		_location = location;
		_totalSeats = totalSeats;
		_students = new ArrayList<>();
	}
	
	public String getName() {
		return _name;
	}
	
	public String getDescription() {
		return _description;
	}
	
	public String getNumber() {
		return _number;
	}
	
	public String getLocation() {
		return _location;
	}
	
	public Integer getSeatsLeft(){
		return _totalSeats - _students.size();
	}
	
	public void enroll(Student student) {
		if(_students.size()  < getSeatsLeft()) {
			_students.add(student); 
		} else {
			throw new RuntimeException("Student: " + student.getFullName() + " can't be enrolled. Seats terminated");
		}
	}

	public String render() {
		String studentList = "";
		for (Student student : _students) {
			studentList += line(student.getFullName());
		}
		return line(getName() + " " + getNumber() + ": " + getDescription()) +
			   line("location: " + getLocation()) +
			   line("seats left: " + getSeatsLeft()) +
			   line("") +
			   line("Enrollment:") +
			   studentList;
	}
}
