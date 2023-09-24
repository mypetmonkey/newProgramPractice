package com.String.practice;

public class ReverseAtSamePlace {
	
	public static void main(String[] args) {
		String str="raju is a good tester";
		String st[]=str.split(" ");
		
		for(int i=0;i<st.length;i++) {
			char ch[]=st[i].toCharArray();
			int m=0,n=ch.length-1;
			while(m<n) {
				char temp=ch[m];
				ch[m]=ch[n];
				ch[n]=temp;
				m++;n--;
			}
			st[i]=new String(ch);
		}
		System.out.println(String.join(" ", st));
	}

}
