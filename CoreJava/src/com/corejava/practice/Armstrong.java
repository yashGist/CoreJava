package com.corejava.practice;

public class Armstrong {

	public static void main(String[] args) {

		int armstrong = 153;
		int num = armstrong;
		int arm = 0;
		int rem = 0;

		while (num != 0) {
			rem = num % 10;
			arm = arm + rem * rem * rem;
			num = num / 10;
		}

		System.out.println(armstrong);
		System.out.println(arm);

		if (arm == armstrong) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not an Armstrong");

		}
	}

}
