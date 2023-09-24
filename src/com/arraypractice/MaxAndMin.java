package com.arraypractice;

public class MaxAndMin {
	
	public static void main(String[] args) {
		
	int ar[]= {2,3,1,22,6,4,7};
   int max=ar[0];
   int min=ar[0];
   for(int i=0;i<ar.length;i++) {
	   if(max<ar[i])
		   max=ar[i];
	   else if(min>ar[i])
		   min=ar[i];
   }
   System.out.println(max);
   System.out.println(min);
}
}