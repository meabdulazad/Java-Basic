package com.java.oops;

//Main Class
public class MultithreadingImplementingRunnableInterfaceDemo {

	public static void main(String[] args) {
		int n = 5; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new MultithreadingImplementingRunnableInterface());
			object.start();
		}
	}
}