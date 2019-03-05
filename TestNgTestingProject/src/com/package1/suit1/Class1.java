package com.package1.suit1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Class1 {
	public WebDriver driver;
	
	@Test
	@Parameters({"url"})
	
	public void login(String url)
	{
	//System.out.println(url);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Leela Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	}
	
	@Test
	public void windowMax()
	{
		driver.manage().window().maximize();
	}	

	/*
	 * @Test public void performOperation() {
	 * driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[3]/a")).
	 * click();; //str.click(); driver.findElement(By.xpath(
	 * "//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[4]/a")).click();;
	 * //str2.click(); }
	 */
	//@Test
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
	
}


