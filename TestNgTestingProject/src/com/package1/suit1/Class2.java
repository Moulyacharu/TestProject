package com.package1.suit1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 extends Class1 {
	//public WebDriver driver = null;
	@BeforeClass
	public void method1()
	{
		driver.manage().window().maximize();
		/*
		 * WebElement str3 =
		 * driver.findElement(By.xpath("//*[@id=\\\"navbar-collapse\\\"]/nav/ul/li[3]/a"
		 * )); str3.click();
		 */
	}
	
	@Test
	public void method2()
	{
		driver.manage().window().maximize();
		/*
		 * WebElement str4= driver.findElement(By.xpath(
		 * "//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[5]/a")); str4.click();
		 */
	}

}
