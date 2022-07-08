package com.bridgelabz.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplictWait {
	@Test
	public void  explicttype() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gopal@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testPassword");
		
		//Explicit wait Syntax- 	webDriverWait= new WebDriverWait(WebDriverReferance,TimeOut);
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='login']")));
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
	}

}
