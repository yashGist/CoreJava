package com.oop;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account();
		double balance = account.fundTransfer();
		System.out.println(balance);
	}

}
