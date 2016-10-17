package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.Exceptions.PersonException;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	public static ArrayList<Staff> StaffList = new ArrayList<Staff>();

	
	
	@BeforeClass
	public static void setup() {
		Calendar DOBone = new GregorianCalendar(1990,2,14);
		Calendar HireDateone = new GregorianCalendar(2010,5,24);
		Staff one = new Staff("Ashley","Marie","Yoakam",DOBone,"133 Haines St, Newark DE","(609)-678-7814","ayoakam@udel.edu","9-10AM",2,40000,HireDateone,eTitle.MS);
		
		Calendar DOBtwo = new GregorianCalendar(1985,5,14);
		Calendar HireDatetwo = new GregorianCalendar(2009,7,30);
		Staff two = new Staff("Jocelyn","Nicole","Creeron",DOBtwo,"133 Haines St, Newark DE","(123)-462-9993","emailtwo@udel.edu","10-11AM",3,50000,HireDatetwo,eTitle.MS);
		
		Calendar DOBthree = new GregorianCalendar(1980,2,17);
		Calendar HireDatethree = new GregorianCalendar(2010,9,23);
		Staff three = new Staff("KerryAnn","Margaret","Pini",DOBthree,"138 Haines St, Newark DE","(666)-666-6666","personthree@udel.edu","6-7AM",4,50000,HireDatethree,eTitle.MS);
		
		Calendar DOBfour = new GregorianCalendar(1970,6,20);
		Calendar HireDatefour = new GregorianCalendar(2012,5,27);
		Staff four = new Staff("Grace","Sophia","Hanoian",DOBfour,"131 Haines St, Newark DE","(555)-827-7824","grace@udel.edu","11:30-11:45AM",5,40000,HireDatefour,eTitle.MRS);
		
		Calendar DOBfive = new GregorianCalendar(1991,6,19);
		Calendar HireDatefive = new GregorianCalendar(2015,7,15);
		Staff five = new Staff("Bert","RSomething","Gibbons",DOBone,"somewhere in DE","(123)-456-7890","bertsemail@udel.edu","smith 201 9-11AM",6,100000,HireDatefive,eTitle.MR);
		StaffList.add(one);
		StaffList.add(two);
		StaffList.add(three);
		StaffList.add(four);
		StaffList.add(five);
	}
	
	
	@Test
	public void salaryAverageTest() {
		double salarysum = 0;
		for (Staff p:Staff_Test.StaffList){
			
			salarysum += p.getSalary();
		}
		double avgsalary = salarysum/5;
		double realsalaryavg = ((40000+50000+40000+50000+100000)/5);
		assertTrue(realsalaryavg==avgsalary);
	}
	

	@Test
	public void DOBPhoneExceptionTest() {
		boolean thrown = false;
				
		Calendar DOB = new GregorianCalendar(1600,6,13);
		Calendar hiredate = new GregorianCalendar(2004,3,26);
		try{
			Staff DateException = new Staff("Rly","Old","Person",DOB,"Old Person Address","(999)-903-4823","oldperson@udel.edu","old person OH",1,40000,hiredate,eTitle.MR);
			}
		catch (PersonException e){
			thrown=true;
		}
		
		assertTrue(thrown=true);
		
		boolean thrown2 = false;
		
		Calendar DOB2 = new GregorianCalendar(1990,6,13);
		Calendar hiredate2 = new GregorianCalendar(2004,3,26);
		try{
			Staff DateException = new Staff("Bad","Number","Person",DOB2,"Bad number Address","911","police@udel.edu","OH",1,1000,hiredate2,eTitle.MR);
			}
		catch (PersonException e){
		}
		
		assertTrue(thrown=true);
	}


}
