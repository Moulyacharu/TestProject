package com.vmware.practice;

public class Palidrome {

	public static void main(String[] args) {
		int num = 3223;
		String temp = "";
		String strNum = Integer.toString(num);
		System.out.println(strNum);
		for (int i = 0; i < strNum.length(); i++)
		{
			temp = strNum.charAt(i) + temp;
			//System.out.println(temp);
		}
System.out.println(temp);
		int foo = Integer.parseInt(temp);
		
	}


}
