package com.test;

public class Account {

	public Account(double balance) {
		this.balance = balance;
	}

	private double balance;

	public void SetBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		Account account = new Account(50000);
		System.out.println(account.getBalance());
	}

}
