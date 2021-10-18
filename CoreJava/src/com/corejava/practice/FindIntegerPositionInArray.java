package com.corejava.practice;

public class FindIntegerPositionInArray {

	public static void main(String[] args) {
		int num = 5;
		int a[] = { 51, 5, 66, 9, 7, 4, 22, 3 };
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				System.out.print("The number " + num + " is present at index " + i);
			}
		}

	}

}
