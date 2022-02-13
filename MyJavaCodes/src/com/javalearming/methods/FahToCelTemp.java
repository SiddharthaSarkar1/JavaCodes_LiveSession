package com.javalearming.methods;
import java.util.Scanner;
public class FahToCelTemp {
	public double fahToCel(double fVal) {
		double resCel = (fVal-32)*5/9; 
		return resCel;
	}
	public static void main(String[] args) {
		double temp;
		Scanner sc = new Scanner(System.in);
		FahToCelTemp obj = new FahToCelTemp();
		System.out.println("Enter a fahrenhite tempurature : ");
		temp = sc.nextDouble();
		sc.close();
		double result = obj.fahToCel(temp);
		System.out.println("Converted Celcius value is : "+result);
	}

}
