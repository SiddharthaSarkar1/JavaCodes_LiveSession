package com.learning.regex;
import java.util.regex.*;
public class RegexDemo2 {

	public static void main(String[] args) {
		
		String regVal = "[987]{3}[0-9]{7}";
		String inpVal = "9874532198";
		String inpVal2 = "3874532198";
		
		Pattern pat = Pattern.compile(regVal);
		Matcher mat = pat.matcher(inpVal);
		Matcher mat2 = pat.matcher(inpVal2);
		
		if(mat.matches()) {
			System.out.println("The number is valid.");
		}else {
			System.out.println("The number is invalid.");
		}
		
		if(mat2.matches()) {
			System.out.println("The number is valid.");
		}else {
			System.out.println("The number is invalid.");
		}

	}

}
