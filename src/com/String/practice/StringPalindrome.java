package com.String.practice;

public class StringPalindrome {
	static boolean isPalindrome(String st) {
		char ch[]=st.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j]) 
				return false;
				i++;j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str="malayalam";
		boolean res=isPalindrome(str);
		if(res)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
