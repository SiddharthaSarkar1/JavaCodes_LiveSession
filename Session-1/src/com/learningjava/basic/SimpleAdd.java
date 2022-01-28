package com.learningjava.basic;
import java.util.Scanner;
public class SimpleAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter the first no : ");
		num1 = sc.nextInt();
		System.out.println("Enter the second no : ");
		num2 = sc.nextInt();
		sc.close();
		int result = num1+num2;
		System.out.println("Result : "+result);
		

	}

}
