package com.String.practice;

public class MostRepeatingChar {
	public static void main(String[] args) {
		String st="aabbbcccc";
		
		int count[]=new int[128];
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			count[ch]++;
		}
		
		char mostRChar = '\0'; 
        int maxCount = 0;
		for(int i=0;i<128;i++) {
			if (Character.isLetter((char) i) && count[i] > maxCount) {
                maxCount = count[i];
                mostRChar = (char) i;
                System.out.println((char)i+"  ==  "+count[i]);
            }
			
		}
		System.out.println("most repeating "+mostRChar);
	}

}
