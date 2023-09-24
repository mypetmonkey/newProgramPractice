package com.arraypractice;

public class Frequency {
	public static void main(String[] args) {
		int ar[]= {-1,3,-1,4,6,8,3,3,0};
		boolean b[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<ar.length;j++) {
					if(ar[i]==ar[j]) {
						count++;
					b[j]=true;
				}
			}
			System.out.println(ar[i]+"   ==  "+count);
		}
	}

}
}