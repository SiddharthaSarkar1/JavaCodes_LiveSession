package com.learningjava.abstraction;

public abstract class Shape {
	
	private String color;
	abstract double area();
	
	public Shape(String color) {
		System.out.println("Constructor is called.");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
