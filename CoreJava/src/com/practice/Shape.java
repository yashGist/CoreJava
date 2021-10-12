package com.practice;

public class Shape {

	private String color;
	private int size;

	public Shape() {
		System.out.println("this is shape default const");
	}

	public Shape(String color) {
		this();
		this.color = color;
	}

	public String getColor() {
		return color;
	}


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
