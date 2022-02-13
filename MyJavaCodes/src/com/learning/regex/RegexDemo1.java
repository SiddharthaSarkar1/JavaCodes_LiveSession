package com.learning.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {

		String reg = "[abc]+";
		String inp = "cabbac";
		
		Pattern pat = Pattern.compile(reg);
		Matcher match = pat.matcher(inp);
		
		if(match.matches()) {
			System.out.println("Pattern Match.");
		}else {
			System.out.println("Pattern Missmatch.");
		}
		

	}

}
