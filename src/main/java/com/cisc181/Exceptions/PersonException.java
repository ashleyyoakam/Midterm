package com.cisc181.Exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception{

	
	private Person person;
	
	public PersonException(Person pers){
		super();
		this.person = pers;
	}
	
	public void ageException(){
		System.out.print("DOB must be within 100 years of current date. ");
	}
	
	public void phoneException(){
		System.out.print("Phone number must be formatted as (###)-###-####. ");
	}
	
}
