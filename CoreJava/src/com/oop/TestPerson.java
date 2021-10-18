package com.oop;

public class TestPerson extends Person {

	public TestPerson(String name, String address, String mobileNumber) {
		super(name, address, mobileNumber);
	}

	public static void main(String[] args) {

		Person person = new Person("papa", "indore", "98598598979");
		Person person2 = new TestPerson("rohit", "indore", "4154185461");

		System.out.println(person.getMobileNumber());
		System.out.println(person2.getMobileNumber());

	}

}
