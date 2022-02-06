package com.learningjava.abstraction;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius, String color) {
		super(color);
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is = " + getColor() + " and Area is = "+area()+".";
	}
	
	
}
