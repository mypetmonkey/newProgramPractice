package com.String.practice;

public class AsExpected {
	public static void main(String[] args) {
		String st="my name is Rajhansmehta";
		String rev="";
		for(int i=st.length()-1;i>=0;i--) {
			char ch=st.charAt(i);
			if(ch!=' ')
				rev=rev+ch;
		}
		System.out.println(rev);
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch==' ')
				rev=rev.substring(i)+" "+rev.substring(0,i);
		}
		System.out.println(rev);
	}

}
