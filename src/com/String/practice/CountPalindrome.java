package com.String.practice;

public class CountPalindrome {
	static boolean isPalindrome(String s) {
		char ch[]=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j])
				return false;
			i++;j--;
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		String st="mom dad god for me pop 121";
		String str[]=st.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++) {
			boolean b=isPalindrome(str[i]);
			if(b)
				count++;
			//System.out.println();
		}
		System.out.println(count);
	}

}
