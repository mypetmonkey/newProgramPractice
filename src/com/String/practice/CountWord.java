package com.String.practice;

public class CountWord {
	
	public static void main(String[] args) {
		String st="my name is raj bro";
		
		int count=0;
		for(int i=0;i<st.length();i++) {
			char ch[]=st.toCharArray();
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				count++;
		}
		System.out.println("total no of words "+count);
	}

}
