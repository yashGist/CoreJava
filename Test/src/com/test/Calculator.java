package com.test;

public class Calculator {
	int sum; // global variable

	public void setAddition(int a, int b) {
		sum = a + b;
	}

	public int getAddition() {
		return sum;
	}

	public static void main(String[] args) {
		Calculator mahak = new Calculator();
		mahak.setAddition(10, 15);
		int sum = mahak.getAddition();
		System.out.println("Mahak sum- " + sum);

		Calculator neha = new Calculator();
		neha.setAddition(10, 20);
		int sum2 = neha.getAddition();
		System.out.println("neha sum- " + sum2);

		Calculator pushpendra = new Calculator();
		pushpendra.setAddition(20, 20);
		int sum3 = pushpendra.getAddition();
		System.out.println("pushpendra sum- " + sum3);

	}

}