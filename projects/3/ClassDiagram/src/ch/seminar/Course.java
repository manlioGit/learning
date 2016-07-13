package ch.seminar;

public class Course {

	private final String _name;
	private final String _description;
	private final String _number;
	
	public Course(String name, String description, String number) {
		_name = name;
		_description = description;
		_number = number;
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
}
