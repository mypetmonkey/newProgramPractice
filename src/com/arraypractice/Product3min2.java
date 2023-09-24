package com.arraypractice;

public class Product3min2 {
	public static void main(String[] args) {
		int ar[]= {1,3,6,4,7,5};
		int prod=1;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
				  int temp=ar[i];
				  ar[i]=ar[j];
				  ar[j]=temp;
				}
			}
			
		}
		System.out.println(ar[0]+" ");
		System.out.println(ar[ar.length-1]);
		for(int p=0;p<3;p++) {
			prod=prod*ar[p];
		}
		System.out.println("the product of first 3 num "+prod);
	}

}
