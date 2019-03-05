package com.feb24;

import java.util.ArrayList;
import java.util.List;

public class Class1LogicImpl implements UsingInterface {
	List<Integer> list = new ArrayList<Integer>();
	
	public void listTest() {
		int arr[] = { 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				list.add(0, arr[i]);
			} else {
				list.add(list.size(), arr[i]);
			}
		}
	}
	
	public  List<Integer> getResult() {
		return list;
	}
}
