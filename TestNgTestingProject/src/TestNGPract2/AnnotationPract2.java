package TestNGPract2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationPract2 extends AnnotationPract1{
	//public static WebDriver driver;
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Leela Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	//WebDriver driver = new ChromeDriver();
	
	@BeforeTest(alwaysRun = true)
	public void display() {
		System.out.println("before test 2");
	}
	@BeforeMethod
	public void display3() {
		System.out.println("before method 2");
	}
	
	@Test
	public void display4() {
		System.out.println("test case 2 test");
	}
	
	/*
	 * @AfterClass public void driverClose2() { driver.close(); }
	 */
	 

}

