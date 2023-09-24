package com.String.practice;

public class MergeTwoString {
	
	public static void main(String[] args) {
		
		String s1="rajhans";
		String s2="mehta";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		char ch[]=new char[ch1.length+ch2.length];
		int i=0,j=0;
		
		while(ch1.length>j&&ch2.length>j) {
			ch[i]=ch1[j];
			i++;
			ch[i]=ch2[j];
			j++;
			i++;
		}
		while(ch1.length>j) {
			ch[i]=ch1[j];
			i++;j++;
			
		}
		while(ch2.length>j) {
			ch[i]=ch2[j];
			i++;j++;
		}
		String str=new String(ch);
		System.out.println(str);
	}

}
