package com.arraypractice;

public class MergeTwoArray2 {
	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5};
		int ar2[]= {6,7,8,9};
		
		int  []mr=merge(ar1,ar2);
		for(int i=0;i<mr.length;i++) {
			System.out.print(mr[i]+" ");
		}
		
	}
	
	
	static int[] merge(int []x,int []y) {
		int []c=new int[x.length+y.length];
		for(int i=0;i<x.length;i++) {
			c[i]=x[i];
		}
		for(int i=0;i<y.length;i++) {
			c[x.length+i]=y[i];
		}
		return c;
	}

}
