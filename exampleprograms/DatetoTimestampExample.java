package com.java.exampleprograms;

import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DatetoTimestampExample {
	public static void main(String args[]) {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);

		Date date1 = new Date();
		Timestamp ts1 = new Timestamp(date1.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println();
		System.out.println(formatter.format(ts1));
	}
}