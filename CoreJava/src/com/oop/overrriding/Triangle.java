package com.oop.overrriding;

public class Triangle extends Shape {

	@Override
	public void area() {

		System.out.println("this is triangle area- " + .5 * 5 * 10);
	}
}
