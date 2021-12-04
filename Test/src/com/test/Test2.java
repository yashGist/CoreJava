package com.test;

public class Test2 {

	public static void main(String[] args) {

		int table[][] = new int[10][10];

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {

				j = j * i;
				table[i][j] = j;

				System.out.println(table[i][j]);
			}

		}
	}

}
