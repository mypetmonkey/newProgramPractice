package com.String.practice;

public class MaxLengthWord {
	
	public static void main(String[] args) 
	{
		String st[]= {"abc","abcd","mehta","hansraj"};
		String maxlen =st[0];
		
		for(int i=0;i<st.length;i++) {
			if(st[i].length()>maxlen.length())
				maxlen=st[i];
		}
		for(int j=0;j<st.length;j++) {
			if(st[j].length()==maxlen.length())
             maxlen=st[j];
		}
        System.out.println(maxlen);

	}

}
