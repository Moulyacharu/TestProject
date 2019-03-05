package TestNGSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DifferentClassExample {

	@Test
	public void browserOpen() throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Leela Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://hugelearning.com/iframe-practice-page/");
		 Thread.sleep(500);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"mega-menu-item-1659\"]"));
				
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();

		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"mega-menu-item-1659\"]/a"));
		System.out.println(ele1.getTagName());
		System.out.println(ele1.getLocation());
		//ele.click();
		driver.findElement(By.linkText("Agile Interview Questions")).click();
/*		String mainWindow = driver.getWindowHandle();
	
		String strValue = driver.getTitle();
		System.out.println(strValue);
		List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		for(String tab : tabs) {
			if(!tab.equals(mainWindow)) {
				driver.switchTo().window(tab);
				driver.close();*/
			
		/*
		 * for(String i: tabs) { if(i!=strValue) { dri }
		 * 
		 * }
		 */
		
		/*
		 * for (String i : tabs) { ; if (i != strValue) { driver.switchTo().window(i);
		 * driver.close(); } }
		 */

		//System.out.println(tabs.get(0));
		/*
		 * WebElement linkValue = driver.findElement(By.name("iframe1"));
		 * System.out.println("Frame Id :" + linkValue.getAttribute("id")); // Returns
		 * the Name of a frame. System.out.println("Frame name :" +
		 * linkValue.getAttribute("name")); driver.switchTo().frame("iframe1");
		 * driver.findElement(By.name("First_Name")).sendKeys("moulya");
		 * driver.findElement(By.name("Last_Name")).sendKeys("charudath");
		 * 
		 * driver.switchTo().parentFrame();
		 */
		// WebDriverWait wait = new WebDriverWait(driver,30);
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"list-ofwebsites-to-practice-selenium\"]")));

	}

}
