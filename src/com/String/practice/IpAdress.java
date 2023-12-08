package com.String.practice;


public class IpAdress {
	
	public static void main(String[] args) {
		String st="123.44.567.8";
		
		String result=st.replaceAll("\\.","[.]" );
		System.out.println(result);
	}

}
