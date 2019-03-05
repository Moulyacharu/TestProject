package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class TestNGExample3 {
	String name;
	int age;
	int weight;
	@BeforeMethod
	@Parameters({"name","age","weight"})
	public void method1(String name,int age,int weight) {
		this.name=name;
		this.age = age;
		this.weight = weight;

	}

}
