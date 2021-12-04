package com.batch10am.test;

public class Test {

	public static int addNum1() {
		int a = 5;
		return a;
	}
	public static void main(String[] args) {
		double sum = addNum1() + addNum2();
		System.out.println("Sum -- " + sum);
	}
	public static double addNum2() {
		double a = 5.5;
		return a;
	}

}
