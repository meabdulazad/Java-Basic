package com.java.oops;

import java.util.Currency;
import java.util.Locale;

public class EncapsulationTest {

	// Encapsulation: wrapping code and data together into a single unit
		// setter and getter methods are used to set and get the data
		// Advantages:
			// read-only or write-only class
			// control over data
			// hide data
			// easy to test
	
	// A Java class to test the encapsulated class Account.
	public static void main(String[] args) {
		// creating instance of Account class
		Encapsulation acc = new Encapsulation();
		Currency us = Currency.getInstance(Locale.US);
		
		// setting values through setter methods
		acc.setAcc_no(123015346000001548L);
		acc.setName("Abdul Azad");
		acc.setPhone_num("713-456-1234");
		acc.setEmail("aa.java@gmail.com");
		acc.setAmount(500000f);
		
		// getting values through getter methods
		System.out.println("Account No: "+acc.getAcc_no());
		System.out.println("Account Holder's Name: "+acc.getName());
		System.out.println("Phone No: "+acc.getPhone_num());
		System.out.println("Email Id: "+acc.getEmail());
		System.out.println("Balance Amount: "+us.getSymbol()+acc.getAmount());
	}
}