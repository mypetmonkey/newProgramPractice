package com.String.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrintVowelcConsonentc {
	
	static List<HashSet<Character>> getVC(String st) {
		String s=st.toLowerCase();
		HashSet<Character>  vc=new HashSet<Character>();
		HashSet<Character>  cc=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vc.add(ch);
			else
				cc.add(ch);
		}
     
		List<HashSet<Character>> result= new ArrayList<HashSet<Character>>();
		result.add(vc);
		result.add(cc);
		
		return result;
	}
	
	public static void main(String[] args) {
		String st="Rajhans Is a Good Boy";
		
		System.out.println(getVC(st).get(0));
		System.out.println(getVC(st).get(1));
		
		
		
	}

}
