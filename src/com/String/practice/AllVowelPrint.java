package com.String.practice;

import java.util.HashSet;

public class AllVowelPrint {
	
	public static void main(String[] args) {
		String st="automation engineer";
		
		HashSet<Character> hs=new HashSet<>();
		
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				hs.add(ch);
		}
		for(Character temp:hs) {
			System.out.print(temp+" ");
		}
	}

}
