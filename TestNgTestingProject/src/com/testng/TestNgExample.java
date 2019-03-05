package com.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExample extends TestNGExample3 {

	String surname;

	@BeforeClass
	public void method2() {
		this.surname = "charudath";
	}

	@Test
	public void method3() {
		System.out.println("method3: " + this.name + " " + surname + " " + this.age + " " + this.weight);

	}
}
