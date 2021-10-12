package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeCalculate {

	public static void main(String[] args) throws ParseException {

		AgeCalculate.calculateAge();
	}

	public static void calculateAge() {

		// date of birth
		LocalDate pdate = LocalDate.of(1993, 11, 20);
		// current date
		LocalDate now = LocalDate.now();
		// difference between current date and date of birth
		Period diff = Period.between(pdate, now);

		System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}

	public static void AgeCalaulate() {
		String str = "22/03/1997";
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		String d1 = sd.format(d);

		String[] dateOfBirth = str.split("/");
		String[] todaysDate = d1.split("/");

		String a = dateOfBirth[2];
		String b = todaysDate[2];

		int c = Integer.parseInt(b) - Integer.parseInt(a);
		System.out.println("Age  " + c);
	}

}
