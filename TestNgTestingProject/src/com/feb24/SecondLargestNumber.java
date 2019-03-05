package com.feb24;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumber {
	int firstLargest = 0;
	int secondLargest = 0;
	public void secondLar() {
		int arr[] = { 10, 11, 12, 13, 14, 15, 16 };
		for (int i = 0; i < arr.length; i++) {
			if ( firstLargest <  arr[i]) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if ( secondLargest < arr[i]) {
				secondLargest = arr[i];
			}
			
		}
	}

	public List<Object> getLargest() {
		List<Object> res = new ArrayList<Object>();
		res.add(firstLargest);
		res.add(secondLargest);
		return res;
		
	}

}
