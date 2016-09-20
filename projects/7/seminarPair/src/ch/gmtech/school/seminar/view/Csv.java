package ch.gmtech.school.seminar.view;

import ch.gmtech.school.seminar.Seminar;
import ch.gmtech.school.seminar.Student;

public class Csv extends OutputFormat {

	@Override
	public String render(Seminar seminar) {
		String csv = seminar.getName() + ";" + seminar.getDescription() + ";" + seminar.getLocation() + ";" + seminar.getSeatsLeft() + ";";
		for(Student student : seminar.getStudentList()){
			csv += student.getFullName() + "," + student.getInfo();
		}
		return csv;
	}

}
