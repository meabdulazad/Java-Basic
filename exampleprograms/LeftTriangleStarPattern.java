package com.java.exampleprograms;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {

		int a, b, row = 7;

		for (a = 0; a < row; a++) { // outer loop work for rows
			for (b = 2 * (row - a); b > 0; b--) // inner loop work for space
			{
				System.out.print(" "); // print space

			}
			for (b = 0; b <= a; b++) // inner loop work for column
			{
				System.out.print("* "); // print stars
			}
			System.out.println(); // move to next line
		}

	}

}
