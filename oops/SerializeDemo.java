package com.java.oops;

import java.io.*;

public class SerializeDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	public int i;
	public String s;

	public SerializeDemo(int i, String s) // default constructor
	{
		this.i = i;
		this.s = s;
	}

	public class DeserializationExample {
	}

	public static void main(String[] args) {
		SerializeDemo object = new SerializeDemo(8, "javatpoint");
		String filename = "Demofile.ser"; // specified file name (must have extension .ser)
		/*-----------------Serialization----------*/
		try {
			FileOutputStream file = new FileOutputStream(filename); // Saving of object in the file
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object); // serialize object
			out.close(); // closes the ObjectOutputStream
			file.close(); // closes the file
			System.out.println("Object serialized");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SerializeDemo obj = null;
		/*-----------------Deserialization--------*/
		try {
			FileInputStream file = new FileInputStream(filename); // reading an object from a file
			ObjectInputStream is = new ObjectInputStream(file);
			obj = (SerializeDemo) is.readObject(); // deserialize object
			is.close(); // closes the ObjectInputStream
			file.close(); // closes the file
			System.out.println("Object deserialized ");
			System.out.println("number = " + obj.i);
			System.out.println("string = " + obj.s);
		} catch (IOException e) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
