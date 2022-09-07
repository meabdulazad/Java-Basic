package com.java.collection;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CloneableProduct implements Cloneable {
	int prdid;
	String pname;
	double pcost;

	// Product class constructor
	public CloneableProduct(int prdid, String pname, double pcost) {
		this.prdid = prdid;
		this.pname = pname;
		this.pcost = pcost;
	}

	// method that prints the detail on the console
	public void showDetail() {
		Currency us = Currency.getInstance(Locale.US);
		System.out.println("Product ID: " + prdid);
		System.out.println("Product Name: " + pname);
		System.out.println("Product Cost: " + us.getSymbol() + pcost);
	}

	public static void main(String args[]) throws CloneNotSupportedException {
		// reading values of the product from the user
		Scanner sc = new Scanner(System.in);
		Currency us = Currency.getInstance(Locale.US);
		System.out.print("Enter product ID: ");
		int prdid = sc.nextInt();
		System.out.print("Enter product name: ");
		String pname = sc.next();
		System.out.print("Enter product Cost: " + us.getSymbol());
		double pcost = sc.nextDouble();
		
		System.out.println("\n-------Product Detail--------");
		CloneableProduct p1 = new CloneableProduct(prdid, pname, pcost);
		
		// cloning the object of the Product class using the clone() method
		CloneableProduct p2 = (CloneableProduct) p1.clone();
		
		// invoking the method to print detail
		p2.showDetail();
		sc.close();
	}
}