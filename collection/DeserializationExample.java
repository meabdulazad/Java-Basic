package com.java.collection;

import java.io.*;

public class DeserializationExample {
	public static void main(String args[]) {
		try {
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee data.txt"));
			SerializationEmployee emp = (SerializationEmployee) in.readObject();
			// printing the data of the serialized object
			System.out.println(emp.empid + " " + emp.empname);
			// closing the stream
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}