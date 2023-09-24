package com.String.practice;

public class NumSum {
	
	public static void main(String[] args) {
		String st="rajhans6mehta6";
		int sum=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='0'&&ch<='9')
				sum=sum+(ch-48);
		}
		System.out.println(sum);
	}

}
