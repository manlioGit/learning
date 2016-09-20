package ch.gmtech.school.seminar;

public class Enrollment {
	public Student student;
	private String info;
	
	public Enrollment(Student student, String info){
		this.student = student;
		this.info = info;
	}
	
	public String getInfo(){
		return this.info;
	}
}
