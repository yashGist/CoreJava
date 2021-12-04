package com.batch3pm.test;

public class TestAccount {

	public static void main(String[] args) {

		Account aniket = new Account();
		Account rays = new Account();

		aniket.setBalance(100000);
		rays.setBalance(1000000);
		int amount = 50000;

		System.out.println("Aniket Balance before Paying Bill- " + aniket.getBalance());
		System.out.println("Rays Balance before accepting Bill- " + rays.getBalance());
		System.out.println("----------------------------------");
		aniket.payBill(amount, aniket, rays);

		System.out.println("Aniket Balance after Paying Bill- " + aniket.getBalance());
		System.out.println("Rays Balance after accepting Bill- " + rays.getBalance());

	}
}
