package com.java.basic;

public class MethodsWays {

	// how many ways we can write main() method so that compiler can recognize it
	// main() always written as public static void main(String Args[])
	// can interchange like static public void main(String[] arg)
	// or public static void main(String Arg[])
	// or public static void main(String...args)
	// or public static void main(String...arg)
	// or static public int main(x)
	
	public static void main(String[] x) {
		System.out.println("Second JAVA class: Diffenrent ways of writing main() method:");
		System.out.println("1. public static void main(String...arg)");
		
		System.out.println("2. static public void main(String[] arg)");
			
		System.out.println("3. public static void main(String Args[])");
		System.out.println("4. static public void main(String Arg[])");
		System.out.println("5. public static void main(String...args)");
		
		System.out.println("6. Static public int main(x)");
		
	}
	
}
