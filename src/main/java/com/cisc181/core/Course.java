package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	UUID CourseID;
	String CourseName;
	int GradePoints;
	eMajor Major;
	
	public Course(String CourseName, int GradePoints, eMajor Major){
		CourseID= UUID.randomUUID();
		this.CourseName=CourseName;
		this.GradePoints=GradePoints;
		this.Major=Major;
	}
}
