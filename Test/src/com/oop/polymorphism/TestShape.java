package com.oop.polymorphism;

public class TestShape {

	public static void main(String[] args) {

		Shape shape[] = new Shape[2];
		shape[0] = new Circle();
		shape[1] = new Triangle();
		double totalArea = calArea(shape);
		System.out.println(totalArea);

	}

	public static double calArea(Shape shape[]) {
		double totalArea = 0.0;
		for (int i = 0; i < shape.length; i++) {
			totalArea += shape[i].area();
		}
		return totalArea;
	}
}
