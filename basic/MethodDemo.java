package com.java.basic;

public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo md = new MethodDemo(); // creating Object
		int speed = md.calculateSpeed("Toyota");
		System.out.println(speed);
	}

	// Access specifier: Public,Private,default,protected
	// return type: void or anything to return value
	// name: anything we can put
	// Parameters: anything we can put

	public int calculateSpeed(String carName) {
		int speed = 0;

		if (carName.equals("Honda")) {
			speed = 180;
		} else if (carName.equals("Toyota")) {
			speed = 200;
		} else {
			speed = 100;
		}

		return speed;
	}

}
