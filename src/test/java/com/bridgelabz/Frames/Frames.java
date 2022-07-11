package com.bridgelabz.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	@Test
	public void frame() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/VAIBHAV/eclipse-workspace/Facebook_Automation_Selenium/Vaibhav1/page2.html");
		// using index of the frame - [ int value] [ index of frames starts with zero]
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("a");
		// using id attribute of the frame -string
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(2000);
		// using name attribute of the frame -string
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("c");
		Thread.sleep(2000);
		// using address of the frame -webelement
		WebElement f = driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t1")).sendKeys("d");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("d");
		driver.close();
	}

	@Test

	public void frames2() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		// using index of the frame - [ int value] [ index of frames starts with zero]
		driver.switchTo().frame(1);
		driver.findElement(By.id("course")).sendKeys("java");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.id("firstName")).sendKeys("Vaibhav");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Bohari");
		Thread.sleep(3000);
		driver.findElements(By.name("gender")).get(0).click();
		Thread.sleep(3000);
		driver.findElements(By.name("language")).get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Vaibhavbohari@gmail.com");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		driver.close();

	}
	
}
