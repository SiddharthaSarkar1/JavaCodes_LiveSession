package com.learning.regex;

import java.util.*;
import java.util.regex.*;

public class RegexDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first your name : ");
		String regex = "[A-Za-z]+";
		String name = sc.nextLine();
		//System.out.println(name);
		
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(name);
		
		if(match.matches()) {
			System.out.println("Name is valid.");
		}else {
			System.out.println("Invalid input.Please enter correct name!!!");
		}

	}

}
