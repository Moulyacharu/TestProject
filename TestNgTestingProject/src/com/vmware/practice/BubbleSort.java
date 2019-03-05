package com.vmware.practice;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {9,8,2,6,4,3,1,5};
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
	}

}
