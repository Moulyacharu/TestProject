package com.customexceptio;

public class MainMethod {
	
	public void add(int x, int y) throws ArithmeticException {
		int z = x + y;
	}
	
	public void test() {
		this.add(1, 2);
	}
}
