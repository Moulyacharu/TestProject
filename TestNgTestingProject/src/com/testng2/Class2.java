package com.testng2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(Listener_Demo.class)

public class Class2  extends BaseClass{
	@Test
	@Parameters({"message1"})
	public void method2(String message1) {
		WebElement findC = this.driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/a"));
		findC.click();
		WebElement findD = this.driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/ul/li[3]/a"));
		findD.click();
		WebElement findF= this.driver.findElement(By.className("panel-heading"));
		//System.out.println(findF.getText());
		assertEquals(findF.getText(), message1);
	}

}
