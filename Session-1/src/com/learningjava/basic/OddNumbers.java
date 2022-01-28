package com.learningjava.basic;

public class OddNumbers {

	public static void main(String[] args) {
		
		System.out.println("First 50 odd numbers : ");
		int count = 0;
		for(int i =1;i<=100;i++) {
			if(i%2 != 0 && count<50) {
				System.out.println(i);
				count++;
			}
		}

	}

}
