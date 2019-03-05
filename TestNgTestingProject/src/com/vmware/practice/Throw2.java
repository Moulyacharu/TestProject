package com.vmware.practice;
class MyClass2 implements Runnable
{
	public void run()
	{
		System.out.println("thread 2 running");
	}
}
public class Throw2 {
public static void main(String[] args) {
	Runnable obj1 = new MyClass2();
			Thread obj2 = new Thread(obj1);
			obj2.start();
}
}
