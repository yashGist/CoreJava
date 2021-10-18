package com.oop.overrriding;

public class TestShape {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.area();
		
		Shape shape2 = new Circle();
		shape2.area();

		Shape shape3 = new Triangle();
		shape3.area();

				
	}

}

