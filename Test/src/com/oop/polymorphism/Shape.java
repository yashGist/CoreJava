package com.oop.polymorphism;

public abstract class Shape {

	private String color;
	private int borderWidth;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public double area() {
		System.out.println("this is shape area");
		return 0.0;
	}

	public abstract void compulsoryMethod();

	public static void main(String[] args) {
		Shape shape = new Shape() {
			
			@Override
			public void compulsoryMethod() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
