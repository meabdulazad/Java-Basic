package com.java.exampleprograms;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class ATM_Transaction {
	public static void main(String args[]) {
		try {
			String userName = "Abdul Azad";
			String password = "1234";
			String bankName = "AA Bank Limited";
			double balance = 50000.00, withdraw, deposit;
			Currency us = Currency.getInstance(Locale.US);  
			
			Scanner bankScanner = new Scanner(System.in);
			System.out.println("Welcome to " + bankName);

			System.out.println("Please Enter Your PIN Number: ");
			String enteredPassword = bankScanner.nextLine();

			if (enteredPassword.equals(password)) {
				System.out.println("Account Name Holder : " + userName + "\n");
				System.out.println("Please choose the following options: " + "\n");
			} else {
				System.out.println("Incorrect PIN Number. Try Agian!\n");
				System.exit(0);
			}

			while (true) {
				System.out.println("Automated Teller Machine");
				System.out.println("Choose 1 for Withdraw");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 0 for EXIT");
				System.out.print("Choose the operation you want to perform: ");
				int n = bankScanner.nextInt();
				switch (n) {
				case 1:
					System.out.print("\nEnter money to be withdrawn: "+us.getSymbol());
					withdraw = bankScanner.nextInt();
					if (balance >= withdraw) {
						balance = balance - withdraw;
						System.out.println("\nPlease collect your money.");
					} else {
						System.out.println("\nInsufficient Balance");
					}
					System.out.println("");
					break;

				case 2:
					System.out.print("\nEnter money to be deposited: "+us.getSymbol());
					deposit = bankScanner.nextInt();
					balance = balance + deposit;
					System.out.println("\nYour Money has been successfully deposited");
					System.out.println("New Balance: "+us.getSymbol()+balance);
					break;

				case 3:
					System.out.println("\nBalance : " +us.getSymbol()+balance);
					System.out.println("");
					break;

				case 0:
					System.exit(0);
					bankScanner.close();

				default:
					System.out.println("\nInvalid Entry. Try Again!\n");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}