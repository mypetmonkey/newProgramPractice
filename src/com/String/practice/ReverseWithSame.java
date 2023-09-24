package com.String.practice;

public class ReverseWithSame {
	
	public static void main(String[] args) {
		String st="this is selenium";
		String str[]=st.split(" ");
		
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}

}
