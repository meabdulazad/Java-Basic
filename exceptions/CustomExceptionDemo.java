package com.java.exceptions;

public class CustomExceptionDemo {

	// method to check the age
	static void validate(double a, double b) throws CustomException {    // throws CustomException
		if (a < 18) {

			// throw an object of user defined exception
			throw new CustomException("You are not eligible to vote");
		} else {
			System.out.println("You're eligible to vote");
		}
	}

	// main method
	public static void main(String args[]) {
		try {
			// calling the method
			double a=21; // providing age
			validate(a, 0); // checking if age is less than 18.
			
			double b=16; //providing age.
			validate(b, 0); // checking if age is less than 18.
		} catch (CustomException ce) {
			System.out.println("Caught the CustomException. ");

			// printing the message from InvalidAgeException object
			System.out.println("Custom Exception occured: " + ce);
		}

		System.out.println("All above 18 years old are eligible to vote.");
	}
}
