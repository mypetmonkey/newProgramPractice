package com.String.practice;

import java.util.*;

public class RemoveDuplicateword {
	public static void main(String[] args) {
		String st="i am am i engineer";
		String str[]=st.split(" ");
		LinkedHashSet<String> ts=new LinkedHashSet<>();
		
		for(int i=0;i<str.length;i++) {
			ts.add(str[i]);
		}
		for(String temp:ts) {
			System.out.print(temp+" ");
		}
	}

}
