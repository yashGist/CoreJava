package com.corejava.practice;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0, b = 1, c = 0;
		for (int i = 0; i <= 10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(c + " ");
		}

	}

}
