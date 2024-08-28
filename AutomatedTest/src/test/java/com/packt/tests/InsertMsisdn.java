package com.packt.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsertMsisdn {
	@Test
	public void firstTest() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobi-downloads.xyz/qa/checkmarck");
		System.out.println("Page opened");
		WebElement msisdn= driver.findElement(By.id("mobile"));
		WebElement confirm= driver.findElement(By.id("confirmButton"));
		msisdn.sendKeys("30611581");
		String pagesource=driver.getPageSource();
		Assert.assertTrue(pagesource.contains("subscribe"),"Page does not contain 'subscribe'");
		System.out.println("Button name correct");

		Select dropdown = new Select(driver.findElement(By.id("operator_select")));
		dropdown.selectByVisibleText("Vodafone");
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmButton")));
		System.out.println("Button clickable correct");
		WebElement confirm1= driver.findElement(By.id("confirmButton"));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		confirm1.click();
	
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_exist_form")));
		
//		driver.quit();
	}
	
}
