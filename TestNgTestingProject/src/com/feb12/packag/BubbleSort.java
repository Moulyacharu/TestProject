package com.feb12.packag;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {9,5,8,2,3,1,4,7,6,10};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
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
			System.out.print(k +" ");
		}
	}

}
