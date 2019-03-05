package com.feb24;

public class SelectionSort {
	public static void main(String[] args)
	{
		int[] arr = {4,8,1,9,2,3,89};
		int low = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			low=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[low]>arr[j])
				{
					low=j;
				}
			}
				 if(low!=i)
				{
					int temp = arr[i];
					arr[i] = arr[low];
					arr[low] = temp;
				}
			}
	
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
	}

}
