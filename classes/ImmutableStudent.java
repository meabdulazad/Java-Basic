package com.java.classes;

public final class ImmutableStudent { // class is final so cannot create subclass
	
	/*
	 * All wrapper classes and String class is immutable.
	 * Using Private and final keyword.
	 * Don't expose setter methods.
	 * must always return a new instance of the class when exposing methods.
	 *  
	 */
	
	private final String IdNumber; // instance variable is final so cannot change value after creating object 
	private final String StudentName; 

	public ImmutableStudent(String IdNumber, String StudentName)  // create constructor.
	{    
	this.IdNumber=IdNumber; 
	this.StudentName=StudentName;
	}

	public String getIdNumber() {
		return IdNumber;
	}
	public String getStudentName() {
		return StudentName;
	}
}

