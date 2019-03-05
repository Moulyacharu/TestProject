package com.testng2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	
@Listeners(Listener_Demo.class)

public class Class1 extends BaseClass {
	@Test
	@Parameters({"message"})
	public void method1(String message) throws Throwable {
		
		WebElement findA = this.driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a"));
		findA.click();
		
		WebElement findB= this.driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a"));
		findB.click();
		wait(5000);
		WebElement findE= this.driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div/div/div[1]"));
		//System.out.println(findE.getText());
		assertEquals(message, findE.getText());
	
	
	}
	
}
