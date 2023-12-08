package com.NumberSystem;

import java.util.Scanner;

public class countPrimeTillCount {
	static boolean getPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int count=0;
		System.out.println("first "+num+" prime number");
		for(int i=2;;i++) {
			boolean b=getPrime(i);
			if(b) {
				System.out.println(i);
				count++;
				if(count==num)
					break;
			}
		}
		sc.close();
	}

}
