package com.polyarray.test;

public class Circle extends Shape {

	private double radius;
	private static final double PI = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		return radius * radius * PI;
	}
}
