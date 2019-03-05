package com.vmware.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSorted {
	public static void main(String[] args) {

		List<Integer> arrValue = Arrays.asList(1, 2, 4, 4, 5, 5, 6, 7, 8, 8, 8, 9, 9, 9);
		List<Integer> resValue = new ArrayList<Integer>();

		for (int i : arrValue)

		{
			if (resValue.contains(i)) 
			{
				//resValue.remove(i);
				System.out.println(i + " is duplicate");
			} else
			{

				resValue.add(resValue.size(), i);
			}
			
		}
		System.out.println(resValue);
	}

}
