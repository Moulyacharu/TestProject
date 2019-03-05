package com.testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

//base class to open browser

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Leela Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
	}
	

	
	//  @AfterClass public void closeBrowser() { driver.close(); }
	 
	
}
