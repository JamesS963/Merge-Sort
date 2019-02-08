package com.fdmgroup.algorithms;

public class MergeSort extends Thread {
	private int[] sortedArray;

	public int[] mergeSort(int[] data) {
		this.sortedArray = data;

		return this.sortedArray;
	}

	public int[] merge(int[] data, int[] left, int[] right) {
		int leftSize = left.length;
		int rightSize = right.length;
		int l = 0, r = 0, d = 0;
		
		/*
		 * while not gone through the full left and right arrays this
		 * checks what value is highest from the left and right array
		 * to make it the returned array have the correct order.
		 */
		while (l < leftSize && r < rightSize) {
			if (left[l] < right[r]) {
				data[d++] = left[l++];
			} else {
				data[d++] = right[r++];
			}
		}
		/*
		 * if the left array isn't finished this will add the values to the returned
		 *  array
		 */
		while (l < leftSize) {
			data[d++] = left[l++];
		}
		/*
		 * if the right array isn't iterated through this will add the values to the returned
		 *  array
		 */
		while (r < rightSize) {
			data[d++] = right[r++];
		}
		//returns the sorted array back to the previous instance of the sort 
		return data;
	}

	public int[] sort(int[] data) {
		int size = data.length;
		
		if (size < 2) {return data;}

		int mid = size / 2;
		int[] left = new int[mid];
		int[] right = new int[size - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = data[i];
		}

		for (int i = mid; i < size; i++) {
			right[i - mid] = data[i];
		}
		
		
		left = sort(left);
		
		right = sort(right);
		
		data = merge(data,left,right);
		return data;

	}
	
}
