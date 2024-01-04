package com.arraypractice;

import java.util.*;

public class PrintAllEvenOddFromArray {
	
	public static void main(String[] args) {
		int ar[]= {2,3,4,5,6,7,8,9,10};
	       List<ArrayList<Integer>> res = findEvOd(ar);

		System.out.println(res.get(0));
		System.out.println(res.get(1));

		

		
		}
		
		static List<ArrayList<Integer>> findEvOd(int []x) {
	        List<ArrayList<Integer>> result = new ArrayList<>();

			ArrayList<Integer> alev=new ArrayList<Integer>();
			ArrayList<Integer> alod=new ArrayList<Integer>();

			for(int i=0;i<x.length;i++) {
				if(x[i]%2==0) {
					alev.add(x[i]);
					result.add(alev);
				}
				
				else {
					alod.add(x[i]);
					result.add(alod);
				}
			}
			//ArrayList<Integer>[] res= {alev,alod};
			return result;
		}

}
