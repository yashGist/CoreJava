package com.oop.overrriding;

public class Circle extends Shape {

	@Override
	public void area() {

		System.out.println("this is circle area- " + 3.14 * 4 * 4);
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.area();
		
	}
}
