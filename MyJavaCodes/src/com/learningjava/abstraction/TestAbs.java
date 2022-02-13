package com.learningjava.abstraction;

public class TestAbs {

	public static void main(String[] args) {
		Circle c1 = new Circle(3, "Green");
		Rectangle r1 = new Rectangle(10, 8, "Blue");
		
		Shape obj = new Rectangle(5, 10, "red");
		
		System.out.println(c1);
		System.out.println(r1);
		System.out.println(obj);

	}

}
