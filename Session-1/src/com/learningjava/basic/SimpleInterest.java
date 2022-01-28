package com.learningjava.basic;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p,t,r, si;
		System.out.println("Enter the principal amount : ");
		p = sc.nextDouble();
		System.out.println("Enter the time : ");
		t = sc.nextDouble();
		System.out.println("Enter the rate : ");
		r = sc.nextDouble();
		sc.close();
		si = (p*t*r) / 100;
		
		System.out.println("Simple Interest is : "+si);
	}

}
