package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	UUID CourseID;
	UUID SemesterID;
	UUID SectionID;
	int RoomID;
	
	public Section(UUID courseid, UUID semid,int room){
		this.CourseID=courseid;
		this.SemesterID=semid;
		this.SectionID=UUID.randomUUID();
		this.RoomID=room;
	}
}
