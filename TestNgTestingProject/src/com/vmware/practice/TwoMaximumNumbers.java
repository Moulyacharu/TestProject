package com.vmware.practice;

public class TwoMaximumNumbers {
	public static void main(String[] args) {
		
	
	int arr[] = {2,4,5,11,6,1,4,7};
	
	int firMax = 0;
	int secMax = 0;
	int thrMax = 0;
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i] >firMax)
		{
			thrMax = secMax;
			secMax = firMax;
			firMax = arr[i];
		}
		else if(arr[i]>secMax)
		{
			thrMax = secMax;
			secMax = arr[i];
		}
		else if(arr[i]>thrMax)
		{
			thrMax = arr[i];
		}
	}
	System.out.println(firMax);
	System.out.println(secMax);
	System.out.println(thrMax);
	}
}
