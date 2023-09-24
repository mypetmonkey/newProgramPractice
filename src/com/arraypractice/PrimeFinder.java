package com.arraypractice;

public class PrimeFinder {
	static boolean isPrime(int n) {
		if(n<=1)
			return false;
		else {
			for(int i=2;i*i<=n;i++) {
				if(n%i==0)
					return false;
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9,11,12};
		for(int temp:ar) {
			if(isPrime(temp))
				System.out.println(temp);
		}
	}

}
