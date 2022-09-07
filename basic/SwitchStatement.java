package com.java.basic;

import java.util.Scanner;

public class SwitchStatement {

	//scanner
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day number from 1 thru 7: ");
		int day = sc.nextInt();
		
				//define variable value or for to input value 
		switch (day) {		//switch  expression
		
		case 1: System.out.println("1 = Monday");
		break;				//use break to stop here i.e. not to execute further from here
		
		case 2: System.out.println("2 = Tuesday");
		break;
		
		case 3: System.out.println("3 = Wednesday");
		break;
		
		case 4: System.out.println("4 = Thursday");
		break;
		
		case 5: System.out.println("5 = Friday");
		break;
		
		case 6: System.out.println("6 = Saturday");
		break;
		
		case 7: System.out.println("7 = Sunday");
		break;
		
		default: System.out.println("Invalid Input");
		
		}
		sc.close();
	}
}
