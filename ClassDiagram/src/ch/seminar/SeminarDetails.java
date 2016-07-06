package ch.seminar;

public class SeminarDetails {

	
	public static void main(String[] args){
		
		Seminar seminar = new Seminar();
		
		System.out.println(
				seminar.getName() + ": " + seminar.getDescription() + System.getProperty("line.separator") +
				"location: " + seminar.getLocation() + System.getProperty("line.separator") +
				"seats left: " + seminar.getSeatsLeft() + System.getProperty("line.separator") +
				System.getProperty("line.separator") +
				"Enrollment: " + System.getProperty("line.separator") +
				seminar.getStudentList()
			);
	}
}
