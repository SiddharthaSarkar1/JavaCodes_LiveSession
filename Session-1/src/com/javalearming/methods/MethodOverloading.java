package com.javalearming.methods;

public class MethodOverloading {
	
	public int add(int a, int b) {
		return a+b;
	}

	public double add(double a, double b) {
		return a+b;
	}
	
	public float add(float a, float b) {
		return a+b;
	}
	
	public double add(double a, double b, double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		MethodOverloading moobj = new MethodOverloading();
		
		System.out.println("Addition of 2 int is : "+moobj.add(3, 8));
		System.out.println("Addition of 2 float is : "+moobj.add(5.23f, 47.0f));
		System.out.println("Addition of 2 double is : "+moobj.add(70.32, 12.67));
		System.out.println("Addition of 3 double is : "+moobj.add(1.34, 2.8, 3.75));

	}

}
