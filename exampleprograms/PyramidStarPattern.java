package com.java.exampleprograms;

import java.util.Scanner;

public class PyramidStarPattern {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of rows you want to print: ");
		int a,b,row=sc.nextInt();
		
		for(a=0;a<row;a++)							//outer loop for rows
		{	for(b=row-a;b>0;b--)					//loop for space
				System.out.print(" ");				//print space
		
		{	for(b=0;b<=a;b++)						//inner loop for column
		{		System.out.print("* ");				//print stars
		
		}		System.out.println();				//move cursor to next line
		
		}
		}
}
}

