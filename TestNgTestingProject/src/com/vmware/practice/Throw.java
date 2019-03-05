package com.vmware.practice;
 class MyClass1 extends Thread
 {
	 public void run()
	 {
		 System.out.println("thread one running");
	 }
 }
 
public class Throw {
	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1();
		obj1.start();
	}

}
