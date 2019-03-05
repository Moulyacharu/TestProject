package com.vmware.practice;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str="moulya is a girl";
		String splitStr[] = str.split(" ");
		
		int i;
		for( i=0;i<=splitStr.length-1;i++)
		{
			String temp=" " ;
			String str3= splitStr[i];
			int str3Length = str.length();
			
			for(int j=0;j<=str3Length-1;j++)
			{
				temp = str3.charAt(j)+temp;
			}
			System.out.print(temp+ " ");
		}
		
	}

}
