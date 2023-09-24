package com.arraypractice;

public class ArrayEV {
	public static void main(String[] args) {
		    int ar[]= {1,2,3,4,5,6,7,8,9};
	    	int cnt[]=countevod(ar);
	    			System.out.println("even  "+cnt[0]);
	    	System.out.println("odd  "+cnt[1]);
	    
	}
	static int[] countevod(int []x) {
		int ev=0,od=0;
		for(int i=0;i<x.length;i++) {
		if(x[i]%2==0)
			ev++;
		else
			od++;
	}
		int count[]={ev,od};
		return count;
	}
}
