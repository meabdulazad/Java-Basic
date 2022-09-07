package com.java.exceptions;

@SuppressWarnings("serial")
public class CustomException extends Exception {

	/*
	 * Custom exception is derived class of parent Exception Class.
	 * it is user-defined exception per user need.
	 
	 * Reasons to use custom exceptions:
	 	* to catch and provide specific treatment to a subset of existing Java exceptions.
	 	* business logic exceptions. 
	 	
	 * Rules to create CustomException:
	 	* CustomeException is extended Exception class of java.lang.package.
	 	* need to create Constructor that tales the String and called as parent class constructor. 
	 	* 
	 */	
	
	public CustomException(String noValidAge) {
		super(noValidAge);
	}
}