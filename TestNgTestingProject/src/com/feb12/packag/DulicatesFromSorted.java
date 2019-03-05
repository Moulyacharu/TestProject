package com.feb12.packag;

import java.util.ArrayList;
import java.util.List;

public class DulicatesFromSorted {
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4,5,6,6,7,8,9,9,9};
		List<Integer> listInt = new ArrayList<Integer>();
		
		for(int i : arr)
		{
			if(listInt.contains(i))
			{
				System.out.println(i +" is duplicate");
			}
			else
			{
				listInt.add(i);
			}
		}
		System.out.println(listInt);
	}

}
