 package com.vmware.practice;

public class ReverseNumber {
public static void main(String[] args) {
	String num = "moulya";
	String temp = " ";
	for(int i=0;i<=num.length()-1;i++)
	{
		 temp = num.charAt(i)+temp;
		 
	}
System.out.println(temp);	
}
}
