package com.testng3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class MultipleNumbers extends VariableDeclare {
@Test
public void method3() {
	int num3 = num1*num2;
	//System.out.println("multiplication of numbers "+ num3);
	assertEquals(num3, 12);
}
}
