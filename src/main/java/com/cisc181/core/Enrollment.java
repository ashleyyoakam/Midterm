package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	double GPA;
	
	private Enrollment(){
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();
	}

	public static void setGrade(double grade) {
		Grade = grade;
	}
	
	public static double calculateGPA(){
		return this.GPA=this.Grade/25;
	}
	
}
