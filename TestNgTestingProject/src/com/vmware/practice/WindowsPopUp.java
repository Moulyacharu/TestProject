package com.vmware.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUp {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Leela Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("https://blueimp.github.io/jQuery-File-Upload/basic.html");
		Thread.sleep(500);
		driver.findElement(By.id("fileupload")).click();
		Thread.sleep(1000);
	}

}
