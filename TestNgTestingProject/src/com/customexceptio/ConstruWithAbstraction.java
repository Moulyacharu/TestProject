package com.customexceptio;

abstract class A {
	int i;
	A(int num)
	{
		num = 2;
		this.i=num;
	}
	public void arthmaticoperation(int num) {
		int value = num+10;
		System.out.println(value);
	}
	
}
public class ConstruWithAbstraction extends A {

	ConstruWithAbstraction(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	
		
	
}

