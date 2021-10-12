package com.test;

public class ConsecutiveEvenOdd {

	public static void main(String[] args) {
		int add = 0;
		int addOdd = 0;
		int count = 0;
		int countOdd = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				add = add + i;
				count++;
			} else {
				addOdd = addOdd + i;
				countOdd++;
			}
		}
		System.out.println(add);
		System.out.println("Even consecutive average is-" + add / count);
		System.out.println("Odd consecutive average is-" + addOdd / countOdd);

	}
}
