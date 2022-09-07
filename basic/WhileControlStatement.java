package com.java.basic;

import java.util.Scanner;

public class WhileControlStatement {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed :");
		int speed = sc.nextInt();
		
		while (speed > 100) {
			int decreasedSpeed = speed -10;
			System.out.println("Current speed is " + decreasedSpeed);
			speed = decreasedSpeed;
		
		} 
		sc.close();
	} 

}

