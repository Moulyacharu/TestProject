package com.testng3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(ListenerTest.class)
public class VariableDeclare {
	int num1;
	int num2;

	@BeforeClass
	@Parameters({ "num1", "num2" })
	public void method1(int num1, int num2) {

		this.num1 = num1;
		this.num2 = num2;

	}

}
