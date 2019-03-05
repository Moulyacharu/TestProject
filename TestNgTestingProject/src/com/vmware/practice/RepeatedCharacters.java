package com.vmware.practice;

import java.util.Arrays;
import java.util.List;

public class RepeatedCharacters {
	public static void main(String[] args) {
		String str = "missisipi";
		int flag=1,k=1;
		String temp = " ";
		//char arr[] = str.toCharArray();
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=1;j<=str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(i) && i!=j)
				{
					//if(temp.contains(str.charAt(i)))			
					System.out.println(str.charAt(i)+ " is duplicate");
					temp = temp+str.charAt(i);
					flag = k;
					k=k+1;
				}
			}
			System.out.println(str.charAt(i) + " displayed "+flag+" times");
			k=1;
			flag=1;
		}
		
	}

}
