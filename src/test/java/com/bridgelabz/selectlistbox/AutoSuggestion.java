package com.bridgelabz.selectlistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestion {

	@Test
	public void autoSuggestionBox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Enter Selenium in google search text box
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions = 
		driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		
		int count = allOptions.size();
		System.out.println("Number of values present in the dropdown is : " + count);
		String expectedValue="selenium interview questions";
		//Print all the auto suggestion values
		for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(" "+text);
		//Click on Java Interview Questions
		if (text.equalsIgnoreCase(expectedValue)) {
		option.click();
		break;

		}
	}
		
		
	}
} 

