package com.arnab.training.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleSeleniumTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Jenkins\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
	}
	
	@Test
	public void validateGoogleId() throws Exception {
		System.out.println("Opening Browser");
		driver.get("https://www.youtube.com/");
		System.out.println("Entering search");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("selenium training");
		System.out.println("Clicking Search button");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		System.out.println("Clicking on the video");
		driver.findElement(By.xpath("//yt-formatted-string[@id='video-title']")).click();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}

