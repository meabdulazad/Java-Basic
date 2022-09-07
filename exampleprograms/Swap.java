package com.java.exampleprograms;

import java.util.Scanner;

class Swap {

	public static void main(String a[]) {
		System.out.println("Enter the value of x: ");
		System.out.println("Enter the value of y: ");
		Scanner sc = new Scanner(System.in);
		
		// Defining variables 
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("before swapping numbers: " + x + " " + y);
		
		// Swapping
		x = x + y; // 30=10+20
		y = x - y; // 10=30-20
		x = x - y; // 20=30-10
		System.out.println("After swapping: " + x + "  " + y);
		sc.close();
	}
}