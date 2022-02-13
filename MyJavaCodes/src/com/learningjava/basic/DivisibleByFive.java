package com.learningjava.basic;

import java.util.Scanner;

public class DivisibleByFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		sc.close();
		if(num%5 == 0) {
			System.out.println("The number "+num+" is Divisible by 5.");
		}else {
			System.out.println("The number "+num+" is not  Divisible by 5.");
			
		}
	}
}
