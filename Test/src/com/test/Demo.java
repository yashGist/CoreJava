package com.test;

public class Demo {
	
	enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THRUSDAY;
	}

	public static void main(String[] args) {
		switch (Days.MONDAY) {
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
