package com.vmware.practice;

class MyTest1 implements Runnable {
	public void run()
	{
		System.out.println("running 1");
	}
}

class MyTest2 implements Runnable {
	public void run()
	{
		System.out.println("running 2");
	}
}
public class Threads {
public static void main(String[] args) {
	Runnable obj1 = new MyTest1();
	Runnable obj2 = new MyTest2();
	Thread obj3 = new Thread(obj1);
	Thread obj4 = new Thread(obj2);
	obj3.start();
	obj4.run();
	obj3.start();
}
}
