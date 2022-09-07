package com.java.oops;

//Example of an abstract class that has abstract and non-abstract methods  
abstract class AbstractBike {	
	AbstractBike() {
		System.out.println("bike is created");
	}

	abstract void run();
	void changeGear() {		
		System.out.println("gear changed");
	}

}
