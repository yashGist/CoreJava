package com.corejava.practice;

public class TwoDArray {

	public static void main(String[] args) {

		int a[][] = new int[1][10];
		int table = 2;
		a[0][2] = 3;
		for (int i = 0; i <= 11; i++) {
			
			for (int j = 1; j <= 9; j++) {
				int tab = j * table;
				a[i][j] = tab;

				System.out.print(a[i][j] + " ");
			}

		}

	}
}
