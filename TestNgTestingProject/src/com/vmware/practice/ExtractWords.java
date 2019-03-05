package com.vmware.practice;

public class ExtractWords {
	public static void main(String[] args) {
		String str = "today is friday";
		String str1 = "is";
		//str.toUpperCase();
		//extract is
		
		String strSplit[] = str.split(" ");
		
		for(int i=0;i<strSplit.length;i++)
		{
			System.out.println(strSplit[i]);
	
		}
	}

}
