package com.oop;

public class Person {

	String name;
	String address;
	String mobileNumber;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public Person(String name, String address, String mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

}
