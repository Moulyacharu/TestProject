package com.testng3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class AddNumbers extends VariableDeclare {

	@Test
	public void add() {
		int num3 = num1 + num2;
		//System.out.println("addition of numbers "+num3);
assertEquals(num3, 8);
	}
}
