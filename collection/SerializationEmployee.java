package com.java.collection;

import java.io.Serializable;

public class SerializationEmployee implements Serializable {

	private static final long serialVersionUID = 1L;
	int empid;
	String empname;

	public SerializationEmployee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}
}