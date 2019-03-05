package com.vmware.practice;

public class Fibonacci {
	public static void main(String[] args) {
		int k = 50,a=1,b=2;
		while(k<=50)
		{
			k=a+b;
			System.out.println(k);
			a=b;
			b=k;
		}
	}

}
