package com.cisc181.core;
import com.cisc181.eNums.eMajor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {
	
	static ArrayList<Course> CourseList = new ArrayList<Course>();
	static ArrayList<Semester> SemesterList = new ArrayList<Semester>();
	static ArrayList<Section> SectionList = new ArrayList<Section>();
	static ArrayList<Student> StudentList = new ArrayList<Student>();
	
	@BeforeClass
	public static void setup() {
	Course course1 = new Course("ECON426",3,eMajor.BUSINESS);
	Course course2 = new Course("CHEM108",3,eMajor.CHEM);
	Course course3 = new Course("CISC181",3,eMajor.COMPSI);
	CourseList.add(course1);
	CourseList.add(course2);
	CourseList.add(course3);

	Calendar startdatespring = new GregorianCalendar(2016,1,10);
	Calendar enddatespring = new GregorianCalendar(2016,4,27);
	Calendar startdatefall = new GregorianCalendar(2016,7,20);
	Calendar enddatefall = new GregorianCalendar(2016,11,20);
	Semester springsem = new Semester(startdatespring,enddatespring);
	Semester fallsem = new Semester(startdatefall,enddatefall);
	SemesterList.add(springsem);
	SemesterList.add(fallsem);
	
	Section econspring = new Section(course1.CourseID,springsem.SemesterID,4);
	Section econfall = new Section(course1.CourseID,fallsem.SemesterID,4);
	Section chemspring = new Section(course2.CourseID,springsem.SemesterID,5);
	Section chemfall = new Section(course2.CourseID,fallsem.SemesterID,5);
	Section ciscspring = new Section(course3.CourseID,springsem.SemesterID,6);
	Section ciscfall = new Section(course3.CourseID,fallsem.SemesterID,6);
	SectionList.add(econspring);
	SectionList.add(econfall);
	SectionList.add(chemspring);
	SectionList.add(chemfall);
	SectionList.add(ciscspring);
	SectionList.add(ciscfall);

	Calendar birthday = new GregorianCalendar(1990,11,11);
	Student student1 = new Student("A","B","C",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	Student student2 = new Student("person","number","two",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	Student student3 = new Student("person","number","three",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	Student student4 = new Student("person","number","4",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	Student student5 = new Student("person","number","5",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	Student student6 = new Student("person","number","6",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	Student student7 = new Student("person","number","7",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	Student student8 = new Student("person","number","8",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	Student student9 = new Student("person","number","9",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	Student student10 = new Student("person","number","10",birthday,eMajor.CHEM,"sample address","(456)-234-9802","email@email.email");
	StudentList.add(student1);
	StudentList.add(student2);
	StudentList.add(student3);
	StudentList.add(student4);
	StudentList.add(student5);
	StudentList.add(student6);
	StudentList.add(student7);
	StudentList.add(student8);
	StudentList.add(student9);
	StudentList.add(student10);

	}

	@Test
	public void EnrollmentTest() {
		for (Section sec:SectionList){
			for (Student stud:StudentList){
				Enrollment(stud.StudentID,sec.SectionID);
				Enrollment.setGrade(95);
				assertEquals(Enrollment.calculateGPA(),3.8);
				
			}
		}
		
		
	}
	
	//changing major
	student3.setMajor(eMajor.COMPSI);

}