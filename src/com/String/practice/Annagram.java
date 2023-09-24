package com.String.practice;

import java.util.Arrays;

public class Annagram {
	
	static boolean isAnnagram(String s1,String s2) {
		
		String st1=s1.replaceAll(" ", "");
		String st2=s2.replaceAll(" ", "");
		char ch1[]=st1.toLowerCase().toCharArray();
		char ch2[]=st2.toLowerCase().toCharArray();
		
		if(ch1.length!=ch2.length)
			return false;
		else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			return Arrays.equals(ch1, ch2);
		}
	}
	
	
	public static void main(String[] args) {
		String s1="pool";
		String s2="lopo";
		
		boolean res=isAnnagram(s1,s2);
		if(res)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
