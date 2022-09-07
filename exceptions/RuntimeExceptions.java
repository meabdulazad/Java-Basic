package com.java.exceptions;

public class RuntimeExceptions {

	
	/* Runtime Exception are never checked, called as unchecked exception.
	 * Expected to crash or break down the program or application at runtime.
	  
	 * Common RuntimeExceptions:
		 * ArithmeticException
		 * NullPointerException
		 * ClassCastException
		 * StringIndexOutOfBoundsException
		 * NumberFormatException
		 * NegativeArraySizeException
		 * ArrayStoreException
		 * UnsupportedOperationException
		 * DateTimeException
		 * ConcurrentModificationException
	  */

	public static void main(String[] args) {
		System.out.println("Line 24: You're in main method."); // before any exception.
		
		try {
			int a=10/0; // can't divide any number by zero so ArithmeticException occurs.
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Line 29: ArithmeticException. ");
		}

		try {
			String a=null; //null value means no any value to the String.
			System.out.println(a.length()); // as null value has no length so NullPointerException occurs.
			
		} catch (NullPointerException e) {
			System.out.println("Line 37: NullPointerException. ");
		}
		try {
			Object o1 = new Object();	// Creating an Object. Object is Parent class.
			/*
			 * type casting the object o1 to string which give the ClassCastException as
			 * we have casted here a parent type to a child type.
			 */	
			String s1 = (String) o1;
			System.out.println(s1);

		} catch (ClassCastException e) {
			System.out.println("Line 49: ClassCastException. "); // To track/print what error occurs.
		}
		try {
			String s2 = "Java for Beginners.";		// String is child class of Object class.
			Object o2 = (Object)s2; 	// Object is parent class.
			System.out.println("Line 54: " + o2);
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		try {
			String a = "Abdul";
			char b = a.charAt(2);
			System.out.println("Line 61: Character at 2nd place: " + b);
			char c = a.charAt(8);

			/*
			 * as there is no character at 8th place, so StringIndexOutOfBoundsException
			 * occurs.
			 */	
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Line 69: StringIndexOutOfBoundsException.");
		}
		try {
			int n=Integer.parseInt ("Abdul");
			System.out.println(n);
		}catch (NumberFormatException e) {
			System.out.println("Line 77: NumberFormatException.");
			
		}

	}
}

		
		
	
