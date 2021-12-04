package com.test;

public class Test {

	enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THRUSDAY;
	}

	public static void main(String[] args) {

		for (Days d : Days.values()) {
		
			switch (d) {
			case MONDAY:
				System.out.println("this is case MONDAY");
				break;
			case TUESDAY:
				System.out.println("this is case TUESDAY");
				break;
			case WEDNESDAY:
				System.out.println("this is case WEDNESDAY");
				break;
			default:
				System.out.println("this is default..");
				break;

			}

		}

	}
}
