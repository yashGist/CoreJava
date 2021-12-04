package com.account.rays;

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

	public void withDrawal(double withdrawAmount) {
		double d = getBalance() - withdrawAmount;
		setBalance(d);
	}

	public double deposit(double deposit) {
		deposit = getBalance() + deposit;
		setBalance(deposit);
		return deposit;
	}

	public void fundTransfer(double fund, Account acc) {
		fund = getBalance() - fund;
		setBalance(fund);
	}

	public void payBill() {
	}

}
