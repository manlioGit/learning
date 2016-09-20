package ch.gmtech.school.seminar;

public class Student {

	private String firstName;
	private String lastName;
	private String info;
	
	public Student(String firstName, String lastName, String info) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.info = info;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public String getInfo(){
		return this.info;
	}
}
