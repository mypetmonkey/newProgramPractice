package com.String.practice;

import java.util.Scanner;

public class NumberToString {
	
	static void nw(int x,String st) {
		String fw[]= {"","one","two","three","four","five","six","seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String sw[]= {"","","twenty"+" ","thirty"+" ","fourty"+" ","fifty"+" ","sixty"+" ","seventy"+" ","eighty"+" ","ninty"+" "};
		if(x<20) {
			System.out.print(fw[x]+" ");
		}
		else {
			System.out.print(sw[x/10]+fw[x%10]+" ");
		}
		//
		if(x!=0) {
			System.out.print(st+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int amt=sc.nextInt();
		nw(amt/10000000,"crore");
		nw(amt/100000%100,"lakh");
		nw(amt/1000%100,"thousand");
		nw(amt/100%10,"hundred");
		nw(amt%100," ");

		sc.close();
		
		
	}


}
