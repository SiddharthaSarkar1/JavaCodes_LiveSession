package com.learningjava.basic;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter a letter : ");
		ch = sc.next().charAt(0);
		sc.close();
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch+" is a Vowel.");
		}else {
			System.out.println(ch+" is a Consonant.");
			
		}
	}

}
