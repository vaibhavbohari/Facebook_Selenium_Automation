package com.bridgelabz.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CsscssSelector {

	@Test

	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// tag&ID
		driver.findElement(By.cssSelector("#email")).sendKeys("vaibhavbohari@gmail.com");
		Thread.sleep(2000);
		// TAG &CLASS
		driver.findElement(By.cssSelector(".inputtext")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("vaibhav@gmail.com");
		Thread.sleep(2000);
		// TAG &ATTRIBUTE
		driver.findElement(By.cssSelector("[name=pass]")).sendKeys("testPassword");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=pass]")).clear();
		Thread.sleep(2000);
		// TAG,CLASS AND ATTRIBUTE
		driver.findElement(By.cssSelector(".inputtext[data-testid=royal_pass]")).sendKeys("Password");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		driver.close();
	}
}
