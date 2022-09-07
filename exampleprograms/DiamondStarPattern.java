package com.java.exampleprograms;
import java.util.Scanner;  

public class DiamondStarPattern {
 
	public static void main(String args[])  {  
		int row, a, b, space = 1;  
				System.out.print("Enter the number of rows you want to print: ");  
				Scanner sc = new Scanner(System.in);  
			
			row = sc.nextInt();  
			
			space = row - 1;  
				for (b = 1; b<= row; b++) 		{  
					for (a = 1; a<= space; a++) {  //nested for loop
						System.out.print(" ");  }  
			space--;  
				for (a = 1; a <= 2 * b - 1; a++) 	{  
					System.out.print("*");  		}  
						System.out.println(" ");	}
			
			space = 1;  
				for (b = 1; b<= row - 1; b++) 	{  
					for (a = 1; a<= space; a++) {  //nested for loop
						System.out.print(" ");  }  
			space++;  
				for (a = 1; a<= 2 * (row - b) - 1; a++) 	{  
					System.out.print("*");  				}  
						System.out.println(" ");  			}  
	}  
}
  
