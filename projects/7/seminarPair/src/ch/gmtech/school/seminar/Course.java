package ch.gmtech.school.seminar;

import java.util.Date;

public class Course {

	private String name;
	private int number;

	public Course(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return this.name; 
	}
	
	public int getNumber() {
		return this.number; 
	}

}
