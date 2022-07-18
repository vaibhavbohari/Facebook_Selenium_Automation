package com.bridgelabz.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ecommerce {
	@Test

	public  void eCommerce(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		//Click on Sign in
		  

		  driver.findElement(By.linkText("Sign in")).click();
		  //Login
		  driver.findElement(By.id("email")).sendKeys("test1249@test.com");
		  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
		  driver.findElement(By.id("SubmitLogin")).click();
		  
		  driver.findElement(By.linkText("WOMEN")).click();

		  WebElement SecondImg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
		  WebElement MoreBtn=driver.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
		  Actions actions=new Actions(driver);
		  actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();

	}
}
