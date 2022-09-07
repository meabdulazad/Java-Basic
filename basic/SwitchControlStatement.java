package com.java.basic;

import java.util.Scanner;

public class SwitchControlStatement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter switch name :");
		String switching = sc.next();
		
		switch(switching) {
		
		case "Light":System.out.println("Light");
		break;
		case "Fan":System.out.println("Fan");
		break;
		case "Light1":System.out.println("Light1");
		break;
		case "AC":System.out.println("AC");
		break;
		default:System.out.println("Light");
			
		}
		
		sc.close();
		
	}
	
	
}
