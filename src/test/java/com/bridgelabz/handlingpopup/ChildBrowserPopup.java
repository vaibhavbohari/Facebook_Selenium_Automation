package com.bridgelabz.handlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChildBrowserPopup {
	@Test
	public void handleWindow() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register for free")).click();

		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windowsopened on thesystem is:" + count);
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			System.out.println("Title:" + title);
			System.out.println("Id:" + windowHandle);
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
