package com.java.exampleprograms;

import java.util.Scanner;

public class FibonacciSeries {

	// 0 1 1 2 3 5 8 13 21 ... fibonanci series
	// Function to print N Fibonacci Number
	static void Fibonacci(int n) {
		int num1 = 0, num2 = 1;

		int counter = 0;

		// Iterate till counter is N
		while (counter < n) {

			// Print the number
			System.out.print(num1 + " ");

			// Swap
			int num3 = num1 + num2; // 0 + 1
			num1 = num2; // num1 = 1
			num2 = num3; // num2 = 1
			counter = counter + 1;
		}
	}

	// Driver Code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");

		// Given Number
		int n = sc.nextInt();

		// Function Call
		System.out.println();
		Fibonacci(n);
		sc.close();
	}
}