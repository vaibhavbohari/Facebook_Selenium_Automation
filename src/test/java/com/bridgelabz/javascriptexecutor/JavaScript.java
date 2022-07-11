package com.bridgelabz.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript {
	@Test
	public static void Scroll() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.org/download");
		// typecasting driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 4; i++) {
			// scroll down on the webpage
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(3000);

		}
		for (int i = 1; i < 4; i++) {
			// Scroll up on the Webpage
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(3000);
		}
		driver.close();
	}

	@Test
	public void scrollupanddowntospecificelementonwebpage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.org/download");

		// click on the close icon of the yellow color background pop up
		driver.findElement(By.xpath("//button[@class='close']")).click();
		// find the Applitools element on the webpage

		WebElement ele = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
		// get the X-coordinate and store in a variable
		int x = ele.getLocation().getX();
		// get the Y-coordinate and store in a variable
		int y = ele.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll to Applitools element’s x and y coordinate
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
		System.out.println(x + y);
		Thread.sleep(5000);
		driver.close();

	}

	@Test
	public void navigationbottomofthepage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.org/download");
		driver.findElement(By.xpath("//button[@class='close']")).click();
		// select an element which is present at the bottom of the page
		WebElement element = driver.findElement(By.linkText("About Selenium"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println("X coordinate is :" + x + " and Y coordinate is :" + y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		Thread.sleep(3000);
		element.click();
		driver.close();

	}

}
