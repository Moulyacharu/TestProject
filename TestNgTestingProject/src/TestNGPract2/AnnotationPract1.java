package TestNGPract2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationPract1 {
	public static WebDriver driver;

	@BeforeTest
	public void display10() throws Throwable {

		System.out.println("before test 1");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Leela Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe"
		 * ); System.out.println("before test 1"); driver = new ChromeDriver();
		 * driver.get("http://hugelearning.com/iframe-practice-page/");
		 * Thread.sleep(500); driver.manage().window().maximize();
		 */
	}

	@BeforeMethod
	public void display1() {
		System.out.println("before method 1");
	}

	@Test
	public void display2() {
		System.out.println("test case 1 test");
	}

	
	//@AfterTest public void driverClose() { driver.close(); }
	 
}
