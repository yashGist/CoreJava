package com.polyarray.test;

public class Triangle extends Shape {

	private double base;
	private double height;
	private static final double CONST = .5;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {

		return base * height * CONST;
	}
}
