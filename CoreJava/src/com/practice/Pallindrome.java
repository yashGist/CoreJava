package com.practice;

public class Pallindrome {

	public static void main(String[] args) {

		int number = 121;
		int num = number;
		int rem = 0;
		int rev = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (number == rev) {
			System.out.println("pallindrome");
		} else {
			System.out.println(" not pallindrome");
		}
	}

}
