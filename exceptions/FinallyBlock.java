package com.java.exceptions;

public class FinallyBlock {

	/*
	 * finally block is used to execute codes, regardless of the results.
	 * used for closing the file or closing the connection.
	 * must use try block, to use finally block.
	 * i.e. can be try-finally block or try-catch-finally block.
	 * always defined at end of the last catch block.
	 * executes whether exception rise or not.
	 * executes whether exception handled or not.
	 
	 * finally block: Always executes except:
	 * when System.exit() method is called before finally block.
	 * when exception occurs in finally block.
	 * when the return statement is declared in the finally block, the control is
	 * transferred to the calling routine, and statements after return
	 * statement inside finally block will not be executed.
	 
	 * Some finally block execution cases:
	 * Case 1: When an exception does not rise.
	 * Case 2: When exception rises and handled by catch block.
	 * Case 3: When exception rises and not handled by catch block.
	 * 
	 */
	
	public static void main(String[] args) {
		try {
			System.out.println("Line 20: Inside try block.");

			// Case 1: Not throw any exception.
			System.out.println("Line 23: Arithmetic expression results: "+30 / 2);

			// Case 2: Throw an Arithmetic exception and handled by catch block.
			System.out.println(3 / 0);
		}
		catch (ArithmeticException e) {
			System.out.println("Line 29: Catched: Arithmetic Exception.");
		}

		try {
			// Case 3: Throw an Arithmetic exception and not handled by catch block.
			System.out.println(5 / 0);
			
			/*
			 * Can not accept Arithmetic type exception.
			 * Only accept Null Pointer type exception.
			 */
		} catch (NullPointerException e) {
			System.out.println("Catch: Exception not handled.");
		}
				
		// Always executed.
		finally {
			System.out.println("finally block : Always executed.");
		}
	}
}
