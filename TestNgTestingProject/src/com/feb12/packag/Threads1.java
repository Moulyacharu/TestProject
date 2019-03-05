package com.feb12.packag;

class MyClass1 extends Thread{
	public void run()
	{
		System.out.println("thread 1 running");
	}
}
public class Threads1 {
	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
		obj.start();
	}
}
