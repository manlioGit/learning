package ch.seminar.view;

import ch.seminar.Course;
import ch.seminar.Student;

public class Html extends View {

	@Override
	public String courseInformation(Course course) {
		return 
			    "<html>" + 
				"<head>" +
			    	"<title>" + course.getName() + "</title>" +
				"</head>" + 
				"<body>" +
				    "<div>" + course.getName() + ":</div>" +
				    "<ul>" +
				          "<li>" + course.getDescription() + "</li>" +
				          "<li>" + course.getLocation() + "</li>" +
				          "<li>" + course.getSeatsLeft() + "</li>" +
				    "</ul>";
	}
	
	@Override
	public String studentList(Course course){
		
		String studentList = "<div>partecipanti:</div><ul>";
		for (Student student : course.getStudents()) {
			studentList += "<li>" + student.getFullName() + "</li>";
		}
		studentList += "</ul>";
		
		return 	   studentList + 
				"</body>" +
			"</html>";
	}
}
