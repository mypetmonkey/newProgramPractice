package com.String.practice;

import java.util.TreeSet;

public class RemoveDuplicateword {
	public static void main(String[] args) {
		String st="i am am i engineer";
		String str[]=st.split(" ");
		TreeSet<String> ts=new TreeSet<>();
		
		for(int i=0;i<str.length;i++) {
			ts.add(str[i]);
		}
		for(String temp:ts) {
			System.out.print(temp+" ");
		}
	}

}
