package com.corejava.practice;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] ch = { 85, 5, 44, 6, 998, 7, 4, 224, 86, 708 };
		int temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j =  i + 1; j < ch.length; j++) {

				if (ch[i] > ch[j]) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}

			}
			System.out.print(ch[i] + " ");
		}
	}

}
