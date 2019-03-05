package com.vmware.practice;

public class LeastDifference {
	public static void main(String[] args) {
		int arr[] = {64, 57, 2, 78, 43, 73, 100, 86};
		int min = arr[1]-arr[0];
		
		for(int i=2;i!=arr.length-1;i++)
		{
			
			min = Math.min(min, arr[i]-arr[i+1]);
		}
		
		System.out.println(min);
	}

}
