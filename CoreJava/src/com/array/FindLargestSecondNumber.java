package com.array;

public class FindLargestSecondNumber {

	public static void main(String[] args) {

		int[] a = { 88, 42, 66, 98, 709, 55, 44, 999 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}

			}
		}

		System.out.print(a[a.length-2]);

	}
}
