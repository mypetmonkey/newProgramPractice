package com.String.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainsAlter {

	public static void main(String[] args) {
		String str1="hello world";
		String str2="world";
		System.out.println(str1.contains(str2));
		
		
		
		String str = "Welcome to java";
		String strr="java";
		if (str.indexOf(strr) != -1) {
		    System.out.println("'given subString' found!");
		} else {
		    System.out.println("'given subString' not found");
		}
		
		
		String st = "Welcome to Java, Java is great!";
		Pattern pattern = Pattern.compile("Java");
		Matcher matcher = pattern.matcher(st);
		while (matcher.find()) {
		    System.out.println("'Java' found at index: " + matcher.start());
		}
	}
}
