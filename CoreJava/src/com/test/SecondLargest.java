package com.test;

public class SecondLargest {

	public static void main(String[] args) {

		int a[] = { 5, 6, 88, 999, 1, 708 };
		int largest = a[0];
		int largest2 = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}

		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest2 && a[i] < largest) {
				largest2 = a[i];
			}
		}
		System.out.println(largest2);

	}

}
