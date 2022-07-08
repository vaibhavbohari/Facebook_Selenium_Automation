package com.bridgelabz.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ImplicitWait {
	
	@Test
	public static void implicittype() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ImplicitWait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Vaibhav");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testPassword");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot/"+ "Facebook"+".png");
		FileHandler.copy(srcFile, destFile);
		driver.close();
	}
}
