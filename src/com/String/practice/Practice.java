package com.String.practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
	public static void main(String[] args) {
		String st="Raj12hans12mehta1";
		int sum=0;
		int tsum=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='0'&&ch<='9')
			tsum=tsum*10+(ch-48);
			else {
				sum=sum+tsum;
				tsum=0;
			}
		
			
		}
		sum=sum+tsum;
		System.out.println(sum);
	}
}