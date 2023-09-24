package com.arraypractice;

import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first Array Size");
		int a=sc.nextInt();
		int ar1[]=new int[a]; 
		System.out.println("enter "+a+" values");
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("enter the second Array Size");
		int b=sc.nextInt();
		int ar2[]=new int[b];
		System.out.println("enter "+b+" values");
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=sc.nextInt();
		}
		
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
