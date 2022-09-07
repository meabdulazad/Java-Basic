package com.java.oops;

// inherited class i.e child class
class Child extends Parent {

	// This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}