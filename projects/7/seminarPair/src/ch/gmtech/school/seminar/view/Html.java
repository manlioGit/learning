package ch.gmtech.school.seminar.view;

import ch.gmtech.school.seminar.Seminar;
import ch.gmtech.school.seminar.Student;

public class Html extends OutputFormat {

	@Override
	public String render(Seminar seminar) {
		String html_header = "<html><head><title>" + seminar.getName() + "</title></head>" +
				"<body>" + 
				"<div>Seminar name:" + seminar.getName() + "</div>" +
				"<div>Seminar description:" + seminar.getDescription() + "</div>" +
				"<div>Seminar location:" + seminar.getLocation() + "</div>" +
				"<div>Seminar seats left:" + seminar.getSeatsLeft() + "</div>" +
				"<h3>Students:</h3>";
		
		String html_body = "<ul>";
		for(Student student : seminar.getStudentList()){
			html_body += "<div>Name:" + student.getFullName() + "</div>" +
						 "<div>Info:" + student.getInfo() + "</div>";
		}
		html_body += "</ul>";
		
		String html_footer = "</body></html>";
		
		return html_header + html_body + html_footer;
	}

}
