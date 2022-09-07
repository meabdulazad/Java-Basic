package com.java.oops;

public class Encapsulation {
	
	// Encapsulation: wrapping code and data together into a single unit
			// setter and getter methods are used to set and get the data
			// Advantages:
				// read-only or write-only class
				// control over data
				// hide data
				// easy to test
	
		// A Account class which is a fully encapsulated class.
		// It has a private data member and getter and setter methods.
		// private data members
		private long acc_no;
		private String name, email, phone_num;
		private float amount;

		// public getter and setter methods
		public long getAcc_no() {
			return acc_no;
		}

		public void setAcc_no(long acc_no) {
			this.acc_no = acc_no;
		}

		public String getPhone_num() {
			return phone_num;
		}

		public void setPhone_num(String phone_num) {
			this.phone_num = phone_num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public float getAmount() {
			return amount;
		}

		public void setAmount(float amount) {
			this.amount = amount;
		}
	}