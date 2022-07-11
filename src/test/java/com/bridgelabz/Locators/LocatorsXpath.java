package com.bridgelabz.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsXpath {
	@Test
	public void page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// link-Text
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		// Absolute xpath
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("Vaibhav");
		Thread.sleep(2000);
		// And
		driver.findElement(By.xpath("//input[@type='text' and @name='lastname'] ")).sendKeys("Bohari");
		Thread.sleep(2000);
		// or xpath
		driver.findElement(By.xpath("//input[@id='inputtext _58mg _5dba _2ph-' or @name='reg_email__'] "))
				.sendKeys("Vaibhavbohari@gmail.com");
		Thread.sleep(2000);
		// Contains
		driver.findElement(By.xpath("//input[contains(@name,'confirmation')]")).sendKeys("Vaibhavbohari@gmail.com");
		Thread.sleep(2000);
		// starts-with
		driver.findElement(By.xpath("//input[starts-with(@autocomplete,'new')]")).sendKeys("Vaib@0123");
		Thread.sleep(2000);
		// Relative xpath
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("4");
		Thread.sleep(2000);
		// id
		driver.findElement(By.id("month")).sendKeys("Oct");
		Thread.sleep(2000);
		// name
		driver.findElement(By.name("birthday_year")).sendKeys("1997");
		Thread.sleep(2000);
		driver.findElements(By.name("sex")).get(1).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		driver.close();

	}
}
