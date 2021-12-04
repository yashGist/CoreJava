package com.oop.polymorphism;

public class Triangle extends Shape {

	private double base;
	private double height;
	private static final double CONSTANT = .5;

	public Triangle() {
	}

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double area() {
		Triangle triangle = new Triangle(10, 10);
		double base = triangle.getBase();
		double height = triangle.getHeight();
		return CONSTANT * base * height;
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println(triangle.area());
	}

}
