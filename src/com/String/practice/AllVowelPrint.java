package com.String.practice;

import java.util.HashSet;

public class AllVowelPrint {
	
	public static void main(String[] args) {
		String st="automation engineer";
		
		HashSet<Character> al=new HashSet<>();
		
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				al.add(ch);
		}
		for(Character temp:al) {
			System.out.print(temp+" ");
		}
	}

}
