package com.arraypractice;

import java.util.HashSet;

public class PrintOnlyDuplicate {
	static void getDuplicate(int a[]) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			boolean b = hs.add(a[i]);
			if(b==false) 
				System.out.print(a[i]+" ");
		}
	}
	
	
	
	public static void main(String[] args) {
		int ar[]= {2,3,4,5,2,4,7,8,5};
		getDuplicate(ar);
		
	}

}
