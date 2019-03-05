package com.feb12.packag;

class MyClass {
	String name;
	private MyClass(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	
	private static MyClass obj1;
	public static MyClass getInst(String name)
	{
		if(obj1==null)
		{
			 obj1 =new MyClass(name);
		}
		return obj1;
	}
}


public class Singleton {
	public static void main(String[] args) {
		MyClass obj2 = MyClass.getInst("moulya");
	}
}
