package com.java.exceptions;

import java.io.*;

public class CompileTimeException {

	/*
	 * Compile-time exception called as Checked exception. 
	 * other than RunTimeException are CompileTimeException.
	 * 
	 * Common Checked Exceptions: 
		 * ReflectiveOperationException
		 * IllegalAccessException 
		 * NoSuchMethodException 
		 * CloneNotSupportedException
		 * InterruptedException 
		 * IOException 
		 * FileNotFoundException 
		 * ClassNotFoundException
	 * 
	 */

	public static void main(String[] args) throws FileNotFoundException{

	/*
	 * Reading content from file by passing local directory path where file should
	 * exist.
	 */
	FileInputStream a = null;
	
		/*
		 * This file does not exist in the location. This constructor FileInputStream
		 * throws FileNotFoundException which is a checked exception.
		 */
		try {
			a = new FileInputStream("/Desktop/Abdul.txt");
		}

		/* Catch block to handle the exception. */
		catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
		}
	}
}