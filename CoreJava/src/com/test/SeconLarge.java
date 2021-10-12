package com.test;

public class SeconLarge {

	public static void main(String[] args) {

		int array[] = { 22, 88, 5, 6, 4, 2, 99, 889 };
		int largest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		System.out.println(largest);
	}

}
