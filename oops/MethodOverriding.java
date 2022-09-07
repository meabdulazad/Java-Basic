package com.java.oops;

abstract class MethodOverriding {

	/*
	 * method overriding means defining a method in a child class that is already
	 * defined in the parent class with the same method signature — same name,
	 * arguments, and return type. After after Java 5, can also use a Covariant Type
	 * as the return type. 
	 
	 * Also called as Runtime Polymorphism and Dynamic Method Dispatch, 
	 * because the method that is going to be called is decided at runtime by the JVM.
	 
	 Rules:
	 * same method name.
	 * same arguments or parameters.
	 * same return type.
	 * must not have more restrictive access modifier. i.e. Access specifier needs to be same or more visible.
	 * must not throw new or broader checked (compile time) exceptions.
	 * only inherited methods can be overridden.
	 * i.e. child classes are overriding and parent classes are overridden.
	 * constructors and private methods can not be  overridden as are not inherited.
	 * abstract methods must be overridden by the  immediate subclass.
	 * final method can not be overridden. 
	 * 
	 */

	  public static void main(String[] args) {
		OverridingHuman h=new OverridingHuman ();
		  h.speak();
	}	
}