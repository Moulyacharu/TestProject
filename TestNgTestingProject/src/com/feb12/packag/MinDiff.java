package com.feb12.packag;

public class MinDiff {
	public static void main(String[] args) {
		int arr[] = {64, 57, 2, 78, 43, 73, 100, 86};
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				int diff = arr[j]-arr[i];
				if(diff>0 && diff<min)
				{
					min = diff;
				}
			}
		}
		System.out.println(min);
	}

}
