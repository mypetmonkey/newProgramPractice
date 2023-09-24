package com.arraypractice;

import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int ar[]= {2,3,4,5,3,5,6,4,5,7};
		HashSet< Integer> hs=new HashSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			hs.add(ar[i]);
		}
		for(Integer temp:hs) {
			System.out.print(temp+" ");
		}
	}

}
