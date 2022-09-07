package com.java.oops;

public class AccessSpecifier {

		// public .. Everywhere 3
		// protected .. Within the package and outside package with child class 2
		// default .. Within the package only 1
		// private .. Only within the class 0
		
		// How protected variable is accessible outside package
		// through inheritance only
		
		private int x = 100;
		int y = 200;
		protected int z = 400;
		public int a = 500;
		
		public void main(String[] args) {
			System.out.println("Value of x: " +x);
			
		} 
}
