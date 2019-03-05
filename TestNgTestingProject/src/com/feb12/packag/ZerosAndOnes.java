package com.feb12.packag;

import java.util.ArrayList;
import java.util.List;

public class ZerosAndOnes {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 0, 4, 3, 0, 2, 3, 4, 0, 0 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				list.add(0, 0);
			} else {
				list.add(list.size(), arr[i]);
			}
		}
		System.out.println(list);

	}

}
