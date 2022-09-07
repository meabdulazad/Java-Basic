package com.java.basic;

public class MethodDemo1 {
	
	// Method of this class
	void hello() {
		// Print statement whenever this method s called
		System.out.println("This is the userDefinedMethod");
	}
	static void hello1() { //static method hello1()
		System.out.println("Hello! Abdul");
	}
	// Main driver method
	public static void main(String[] args) {
		// Creating instance of the class inside the main() method
		MethodDemo1 ob = new MethodDemo1();

		ob.hello(); // Calling method hello() 
		System.out.println("\n"+ob.hashCode()); // calling predefined method
		System.out.println(); // using to put the cursor in next line
		hello1(); // calling static method hello1()
	}
}