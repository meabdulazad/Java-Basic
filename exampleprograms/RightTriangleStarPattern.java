package com.java.exampleprograms;

import java.util.Scanner;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
				System.out.println("Enter number of row or column: ");
		int row=sc.nextInt();
		
		// a is row, b is column and x is how many either row or column you want to print
		
		for (int a = 0; a<row; a++)	//outer loop for rows
		
			{	for (int b=0; b<a; b++)	//inner loop for columns
			{		
				System.out.print("* ");	//print stars
			}
		 System.out.println();	//throws the cursor in a new line after printing each line
	}
		sc.close();
	}
	
	
}
