package com.java.collection;

import java.io.*;

public class SerializationDemo {

	public static void main(String args[]) {
		try {
			// Creating the object
			SerializationEmployee emp = new SerializationEmployee(11453, "Abdul Azad");
			
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("employee data.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(emp);
			out.flush();
			
			// closing the stream
			out.close();
			System.out.println("Data has been read from the file.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}