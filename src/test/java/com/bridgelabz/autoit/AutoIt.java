package com.bridgelabz.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIt {
@Test
	public void auto_ItEx() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\VAIBHAV\\OneDrive\\Documents\\upload.exe");
		Thread.sleep(3000);
		driver.close();
	}

	public void auto_ItEx1() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.freepdfconvert.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Choose file')]")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\VAIBHAV\\OneDrive\\Documents\\upload.exe");
	Thread.sleep(3000);
	driver.close();}
} 
