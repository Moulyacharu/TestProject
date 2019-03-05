package com.feb12.packag;

public class Fibonacy {
	public static void main(String[] args) {
		int a=1,b=2,k=50;
		
		while(k<=50)
		{
			k=a+b;
			System.out.println(k);
			a=b;
			b=k;
		}
	}

}
