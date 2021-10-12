package com.array;

public class SortAnArray {

	public static void main(String[] args) {
		int a[] = { 72, 8, 6, 33, 4, 56, 7, 1, 708, 12 };
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
		System.out.print(a[a.length - 2]);

	}
}
