package com.packt.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyDisclaimer {

		@Test
		public void verifyDisclaimer() {
			
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://mobi-downloads.xyz/qa/checkmarck");
			System.out.println("Page opened");
		}
}
