package ch.gmtech.school.seminar;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SeminarTest {

	private Seminar seminar;
	
	@Before
	public void setUp() throws Exception {
		seminar = new Seminar("Online Marketing", "Quick introduction", "Aula magna", 15);
	}

	@Test
	public void testGetName() {
		assertEquals(seminar.getName(), "Online Marketing");
	}

	@Test
	public void testGetDescription() {
		assertEquals(seminar.getDescription(), "Quick introduction");
	}

	@Test
	public void testGetLocation() {
		assertEquals(seminar.getLocation(), "Aula magna");
	}

	@Test
	public void testGetSeatsLeft() {
		assertEquals(seminar.getSeatsLeft(), 15);
	}

	@Test
	public void testGetStudentList() {
		Student student1 = new Student("Pinco", "Pallino", "uno qualunque");
		seminar.addEnrollment(student1, "marketing junior operator");
		Student student2 = new Student("Jorge", "Camacho", "olé");
		seminar.addEnrollment(student2, "marketing advisor");
		
		List<Student> students = asList(student1, student2);
		
		assertEquals(seminar.getStudentList(), students);
	}

}
