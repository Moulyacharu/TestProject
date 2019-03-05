package com.feb12.packag;
class MyClass2 implements Runnable
{
	public void run() {
		System.out.println("thread 2 running");
	}
}
public class Thread2 {
	public static void main(String[] args) {
		Runnable obj2 = new MyClass2();
		Thread obj3 = new Thread(obj2);
		obj3.start();
		
	}

}
