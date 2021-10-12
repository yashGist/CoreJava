package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {

		DateTest.dateClass();
	}

	public static void formatADate() throws ParseException {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		String srt = format.format(d);
		System.out.println("Date :" + srt);
		Date d1 = format.parse(srt);
		System.out.println(d1);

	}

	public static void dateClass() throws ParseException {
		Date d = new Date();
		System.out.println("Date:" + d);
		System.out.println("Long Time:" + d.getTime());

	}
}
