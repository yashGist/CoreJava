package com.polyarray.test;

public class TestShape {

	public static void main(String[] args) {

		Shape[] shape = new Shape[2];
		shape[0] = new Circle(5);
		shape[1] = new Triangle(10, 10);
		double totalArea = 0.0;
		for (int i = 0; i < shape.length; i++) {
			totalArea = totalArea + shape[i].area();
		}
		System.out.println("Total area is ---" + totalArea);
	}
}
