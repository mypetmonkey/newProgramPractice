package com.arraypractice;

import java.util.*;

public class PrintOnlyDuplicate {
	public static void main(String[] args) {
		int ar[]= {2,3,4,5,2,4,7,8,5,2};
		HashSet<Integer> hs=new HashSet<Integer>();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		for(int i=0;i<ar.length;i++) {
			boolean b = hs.add(ar[i]);
			if(b==false) 
				ts.add(ar[i]);
			
		}
		for(Integer i:ts) {
			System.out.println(i);
		}
	}

}
