package com.java.oops;

class AbstractionTest {

	// Abstraction: hide implementation (essential) details and show only functionality to the user
		//eg: dailing numbers, shows only call is going but don't show how that is going or working
	//	Abstract: eg: abstract class A{} --- method body example
				// eg: abstract void printStatus(); --- no method body and abstract example
		
		// declared with abstract keyword
		// can have abstract and non-abstract methods
		// cannot be instantiated i.e. cannot create a object of abstract class
		// can have constructors and static methods
		// can have final methods
	
	// Creating a Test class which calls abstract and non-abstract methods
	public static void main(String args[]) {
		AbstractBike obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}
