package com.fdmgroup.algorithms;

public class Main {
	public static MergeSort mergeSort= new MergeSort();
	public static void main(String[] args) {
		int[] data = {4,3,5,1,2,6,3,9,2};
		data = mergeSort.sort(data);
		
		for (int i: data){
			System.out.println(i);
		}
	}
}
