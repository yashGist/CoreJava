package com.practice;

public class PrintTable {

	public static void main(String[] args) {
		int table = 2;
		int a[][] = new int[1][11];

		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < 11; j++) {
				a[i][j] = j * table;
				System.out.print(a[i][j] + " ");

			}
		}
	}

}
