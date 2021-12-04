package com.oop.polymorphism;

public class Circle extends Shape {

	private double radius;
	private static final double PI = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		Circle circle = new Circle(10);
		double radius = circle.getRadius();
		return PI * radius * radius;
	}

	public static void main(String[] args) {

		Circle circle = new Circle();
		double area = circle.area();
		System.out.println(area);
	}

	@Override
	public void compulsoryMethod() {
		
	}

}
