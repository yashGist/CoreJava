package com.shape;

public class Shape1 {

	private String color = "Red";
	private int borderWidth = 5;

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

	public static void main(String[] args) {

		Shape1 circle = new Shape1();
		System.out.println("This is circle color --" + circle.getColor());
		

		Shape1 triangle = new Shape1();
		System.out.println("This is triangle color --" + triangle.getColor());
		
	}

}
