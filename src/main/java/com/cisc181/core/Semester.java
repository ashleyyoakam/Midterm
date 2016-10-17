package com.cisc181.core;

import java.util.Calendar;
import java.util.UUID;

public class Semester {

	UUID SemesterID;
	Calendar StartDate;
	Calendar EndDate;
	
	public Semester(Calendar Start, Calendar End){
		this.SemesterID=UUID.randomUUID();
		this.StartDate=Start;
		this.EndDate=End;
	}
	
}
