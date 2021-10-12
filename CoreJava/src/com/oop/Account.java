package com.oop;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double fundTransfer() {
		int acc1;
		int acc2;
		double ac1Bal = 5000000;
		double ac2Bal = 1000000;
		ac1Bal = ac2Bal + ac1Bal;
		return ac1Bal;

	}

}
