package com.batch3pm.test;

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

	public void payBill(int amount, Account aniket, Account rays) {
		aniket.setBalance(aniket.getBalance() - amount);
		rays.setBalance(rays.getBalance() + amount);
	}

}
