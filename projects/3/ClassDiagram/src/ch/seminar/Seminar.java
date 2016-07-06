package ch.seminar;

import static java.util.Arrays.*;

import java.util.List;

public class Seminar {

	private final Course _course = new Course("Company Learning", "A way to improve ourself", "1");
	
	private final List<Enrollment> _enrollment = asList(
			new Enrollment(new Student("Manlio", "Modugno")), 
			new Enrollment(new Student("Mattia", "Cattaneo"))
		);
	
	public String getName() {
		return _course.getName() + " " + _course.getNumber();
	}
	
	public String getDescription() {
		return _course.getDescription();
	}

	public String getLocation() {
		return "Manno";
	}
	
	public Integer getSeatsLeft(){
		return 0;
	}
	
	public String getStudentList(){
		
		String list = "";
		
		for (Enrollment  enrolled : _enrollment) {
			list += enrolled.getInfo() + System.getProperty("line.separator");
		}
		
		return list;
	}
}
