package com.account.test;

public class TestAccount {

	public static void main(String[] args) {

		Account from = new Account();
		Account to = new Account();
		from.setNumber("53000542847");
		to.setNumber("53000542850");

		from.setBalance(10000);
		to.setBalance(10000);
		double amountToBeTransferred = 5000;

		Account.fundTranfer(from, to, amountToBeTransferred);
		System.out.println(from.getBalance());
		System.out.println(to.getBalance());

	}
}
