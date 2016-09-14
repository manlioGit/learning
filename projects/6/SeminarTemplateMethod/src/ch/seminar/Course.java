package ch.seminar;

import java.util.ArrayList;
import java.util.List;

import ch.seminar.view.Csv;
import ch.seminar.view.Html;
import ch.seminar.view.Raw;

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
		_students = new ArrayList<Student>();
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

	public Iterable<Student> getStudents() {
		return _students;
	}
	
	public String raw() {
		return new Raw().value(this);
	}
	
	public String csv() {
		return new Csv().value(this);
	}
	
	public String html() {
		return new Html().value(this);
	}
}
