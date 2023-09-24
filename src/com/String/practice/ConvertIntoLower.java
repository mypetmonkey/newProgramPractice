package com.String.practice;

public class ConvertIntoLower {
	
	public static void main(String[] args) {
		
		String st="RAJHANS MEHTA";
		
		char ch[]=st.toCharArray();
		for(int i=0;i<st.length();i++) {
			if(ch[i]>='A'&&ch[i]<'Z')
				ch[i]=(char)(ch[i]+32);
		}
		st=new String(ch);
		System.out.println(st);
	}

}
