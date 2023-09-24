package com.arraypractice;

public class Product3Min {
	public static void main(String[] args) {
		int ar[]= {5,3,8,9,2,6};//30
		int f=1,s=2,t=3;
		int fmin=ar[0];
		int smin=ar[0];
		int tmin=ar[0];
		for(int i=0;i<ar.length;i++) {
			int countf=0;
			int counts=0;
			int countt=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[i]>ar[j])
					countf++;
				else if(ar[i]>ar[j])
					counts++;
				else if(ar[i]>ar[j])
					countt++;
					
			}
			if(countf==f-1)
				fmin=ar[i];
			if(counts==s-1)
				smin=ar[i];
			if(countt==t-1)
				tmin=ar[i];
			
		}
		System.out.println(fmin);
		System.out.println(smin);
		System.out.println(fmin*smin*tmin);
	}

}
