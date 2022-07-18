package com.bridgelabz.handlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseParentWindow {
	@Test
	public void closeWindow() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentID=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='Jobseeker Register']")).click();
		Set <String>allWindowHandleSet= driver.getWindowHandles();
		for (String windowHandle:allWindowHandleSet) {
			//switch to each browser window
			driver.switchTo().window(windowHandle);
			if(windowHandle.equals(parentID)) {
				driver.close();
	

				
			}
			
		}
	}
	@Test
	public void  close_All_Child_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentID=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='Jobseeker Register']")).click();
		Set <String>allWindowHandleSet= driver.getWindowHandles();
		for (String windowHandle:allWindowHandleSet) {
			//switch to each browser window
			driver.switchTo().window(windowHandle);
			if(!windowHandle.equals(parentID)) {
				driver.close();
			}
		}
	}

}
