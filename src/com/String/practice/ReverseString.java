package com.String.practice;

public class ReverseString {
	static String getReverse(String st) {
		char ch[]=st.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;j--;
		}
		st=new String(ch);
		return st;
	}
	
	public static void main(String[] args) {
		String str="this is good boy";
		String res=getReverse(str);
		System.out.println(res);
	}

}
