package com.java.oops;

//Main Class
public class MultithreadingExtendingThreadClassDemo {

	public static void main(String[] args) {
		int n = 5; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingExtendingThreadClass object = new MultithreadingExtendingThreadClass();
			object.start();
		}
	}
}