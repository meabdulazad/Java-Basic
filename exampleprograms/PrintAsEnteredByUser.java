package com.java.exampleprograms;

import java.util.Scanner;

public class PrintAsEnteredByUser {
	public static void main(String[] args) {

		// Creates a reader instance which takes
		// input from standard input - keyboard
		Scanner reader1 = new Scanner(System.in);
		Scanner reader2 = new Scanner(System.in);
		System.out.print("Enter a number: "+"\n");
		System.out.print("\n"+"Enter your name: ");

		// nextInt() reads the next integer from the keyboard
		int number = reader1.nextInt();
		// next() reads the next name from the keyboard
		String name = reader2.next();

		// println() prints the following line to the output screen
		System.out.println("Your name is: " + name);
		System.out.println("Your number is: " + number);
		
		reader1.close();
		reader2.close();
	}
}