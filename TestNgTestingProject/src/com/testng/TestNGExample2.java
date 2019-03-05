package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGExample2 extends TestNGExample3 {
	String surname;

	@BeforeClass
	public void method4() {
		this.surname = "nagaraja";
	}

	@Test
	public void method5() {
		System.out.println("method5: " + this.name + " " + surname + " " + this.age + " " + this.weight);
	}
}
