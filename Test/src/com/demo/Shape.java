package com.demo;

public class Shape {

	int borderWidth = 0;// global variable

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.setBorderWidth(205);
		System.out.println("This is borderWidth-  " + shape.getBorderWidth());
	}

	public void setBorderWidth(int i) {
		borderWidth = i;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

}
