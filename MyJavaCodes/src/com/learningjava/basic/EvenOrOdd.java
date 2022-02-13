package com.learningjava.basic;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		sc.close();
		if(num%2 == 0) {
			System.out.println("The number "+num+" is Even Number.");
		}else {
			System.out.println("The number "+num+" is Odd Number.");
			
		}

	}

}
