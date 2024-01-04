package com.String.practice;

public class BracketQues {
	public static void main(String[] args) {
		
	
	String st="(())(())(())()()";//op-(((((())))))
	String str=st.replaceAll("\\(", ")");
	//System.out.println(str);
	
	String s1=str.substring(0,str.length()/2).replaceAll("\\)", "(");
	String s2=str.substring(str.length()/2);
	
	System.out.println(s1.concat(s2));
	}

}
