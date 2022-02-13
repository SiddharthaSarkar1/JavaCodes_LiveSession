package com.learningjava.basic;
import java.util.Scanner;
public class SquareAndRectangle {
	
	public static int squareArea(int a) {
		return a*a;
	}
	public static int squareParimeter(int a) {
		return 4*a;
	}
	
	public static int rectangleArea(int l, int w) {
		return l*w;
	}
	
	public static int rectangleParimeter(int l, int w) {
		return 2*(l+w);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of Square : ");
		int sideS = sc.nextInt();
		int resSArea = squareArea(sideS);
		System.out.println("Area of the square is : "+resSArea);
		int resSPer = squareParimeter(sideS);
		System.out.println("Parimeter of the square is : "+resSPer);
		System.out.println("=============================================================");
		System.out.println("Enter the length of Rectangle : ");
		int length = sc.nextInt();
		System.out.println("Enter the width of Rectangle : ");
		int width = sc.nextInt();
		sc.close();
		int resRArea = rectangleArea(length, width);
		System.out.println("Area of the Rectangle is : "+resRArea);
		int resRPer = rectangleParimeter(length, width);
		System.out.println("Parimeter of the Rectangle is : "+resRPer);
	}

}
