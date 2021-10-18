package com.test;

public class PrintTable {

	public static void main(String[] args) {
		int array[][] = new int[1][10];
		int table = 2;
		int tab = 1;
		for (int i = 0; i < 1; i++) {
			for (int j = 1; j < 10; j++) {
				tab = table * j;
				array[i][j] = tab;
				System.out.print(array[i][j] + " ");
			}

		}
	}

}
