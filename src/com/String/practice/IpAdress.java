package com.String.practice;


public class IpAdress {
	
	static String getPattern(String s) {
		String st = s.replaceAll("\\.", "[.]");
		return st;
	}
	
	
	public static void main(String[] args) {
		
		String st="123.44.567.8";
		
		String result=getPattern(st);
		System.out.println(result);
	}

}
