package com.vmware.practice;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {0, 9,8,2,6,4,3,1,5};
		int low=0;
		for(int i=0;i<arr.length-1;i++)
		{
			low = i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j] < arr[low]) 
				{
					low = j;
				}
			}
			if(arr[low] != arr[i]) {
				int temp = arr[i];
				arr[i] = arr[low];
				arr[low] = temp;
			}
		}
		for(int k:arr)
		{
			System.out.print(k + " ");
		}
	}

}
