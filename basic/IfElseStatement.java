package com.java.basic;

public class IfElseStatement {

	public static void main(String[] args) {
		
	int a = 10, b = 50, c=200;
	
	//if-else statement
	
	if (a < c) {
		if (c>b) {
			System.out.println("Multiplication of a and b is: "+(a*b+"\n"));
			}
		System.out.println("a is less than c. The value of a is " +a);
		System.out.println("The value of b is " +b );
	} else {	
		System.out.println("a is greater than c. The value of a is " +a);
		System.out.println("The value of b is " +b);
	}
}
}
