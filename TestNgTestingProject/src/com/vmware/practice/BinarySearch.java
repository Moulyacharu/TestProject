package com.vmware.practice;

public class BinarySearch {
 public static void main(String[] args) {
	int arr[] = {1,3,4,5,6,7,8};
	int low = 0;
	int high = (arr.length)-1;
	
	int key = 1;
	
	while(low<=high)
	{
		int mid = (low+high)/2;
	
		if(arr[mid]==key)
		{
			System.out.println("element present in " + mid );
			break;
		}
		else if(arr[mid]>key)
		{
			high = mid-1;
			
			
		}
		else if(arr[mid]<key)
		{
			low = mid+1;
			
		}
		
	}
}
}
