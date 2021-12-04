package com.account.test;

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

	public static void fundTranfer(Account from, Account to, double amountToBeTransferred) {

		from.setBalance(from.getBalance() - amountToBeTransferred);
		to.setBalance(to.getBalance() + amountToBeTransferred);
	}

}
