package com.learning.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {

	public static void main(String[] args) {
		
		String regex = "(?=.*[A-Za-z]).{8,}";
		String input = "123Ac768776";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		
		if(match.matches()) {
			System.out.println("Password Valid.");
		}else {
			System.out.println("Password Invalid.");
		}
		

	}

}
