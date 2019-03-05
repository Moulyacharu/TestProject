package com.feb12.packag;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int high = arr.length - 1;
		int low = 0;
		int key = 8;

		while (low <=high) {
			int middle = (high + low) / 2;
			if (arr[middle] == key) {
				System.out.println("key present is " + middle);
				break;
			} else if (arr[middle] > key) {
				high = middle -1;
			} else if (arr[middle] < key) {
				low = middle +1;
			}
		}

	}
}
