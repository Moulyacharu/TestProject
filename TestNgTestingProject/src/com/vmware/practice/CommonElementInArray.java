package com.vmware.practice;

public class CommonElementInArray {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {4,5,6,7,8};
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]+" is duplicate");
				}
			}
		}
	}

}
