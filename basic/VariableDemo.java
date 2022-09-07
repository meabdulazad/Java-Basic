package com.java.basic;

public class VariableDemo {
	
	// Variable is assigned with data type
    // Variable is name of memory location 
	
	int x = 100; 		// instance variable (variable declare inside class and outside method)
	static int a=400;	// static variable (declared as static and is not local variable)
	
	// Local: inside the body of method, cannot be defined with static keyword
	// Instance: inside the class but outside the method
	// Static: declared as static, can not be local variable

	static public void main(String... args) {
		int y = 600; 	// local variable (within main method)
		// System.out.println(x); // as x is not static variable so can not be called here as a, however, by creating new object/constructor it can be called.
		System.out.println(VariableDemo.a);
		System.out.println(y);
	}
}