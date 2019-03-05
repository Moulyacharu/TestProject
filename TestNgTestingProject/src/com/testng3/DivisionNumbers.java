package com.testng3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class DivisionNumbers extends VariableDeclare {
@Test
public void method4() {
	int num3 = num1/num2;
	//System.out.println("division of numbers "+ num3);
	assertEquals(num3, 3);
}
}
