package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_Element_Method {
	@Test 
	public void registration() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//click method
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		//send keys  method
		driver.findElement(By.name("firstname")).sendKeys("Vaibhav");
		Thread.sleep(2000);
		//clear method
		driver.findElement(By.name("firstname")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Pranav");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.name("lastname")).sendKeys("Bohari");
		Thread.sleep(2000);
		// attribute
		String attribute = driver.findElement(By.name("lastname")).getAttribute("name") ;
		System.out.println("Attribute:"+attribute);
		Thread.sleep(2000);
		//sendkeys
		driver.findElement(By.name("reg_email__")).sendKeys("Vaibhavbohari@gmail.com");
		Thread.sleep(2000);
		//get size
		WebElement element = driver.findElement(By.name("reg_email__")) ;
		org.openqa.selenium.Dimension dimensions = element.getSize();
		System.out.println("Height:"+dimensions.height + "width:"+dimensions.width);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Vaibhavbohari@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("Vaib@0123");
		Thread.sleep(2000);

		
		driver.findElement(By.name("birthday_day")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Oct");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(2000);
		driver.findElements(By.name("sex")).get(1).click();
		Thread.sleep(2000);
		// isSelected
		boolean S=driver.findElement(By.name("sex")).isSelected();

		System.out.println("isSelected"+S);
		Thread.sleep(2000);
		
		//click
		driver.findElement(By.name("websubmit")).click();
		//isEnabled
		boolean E=driver.findElement(By.name("websubmit")).isEnabled();
		System.out.println("isEnabled:"+E);
		Thread.sleep(2000);
		//is Displayed
		boolean d=driver.findElement(By.name("websubmit")).isDisplayed();
		System.out.println("isDisplay:"+d);
		Thread.sleep(2000);
		//get Text
		String str = driver.findElement(By.linkText("Sign Up")).getText();
		System.out.println("Link Text is:"+str);
		
		//tag name
		String tagName = driver.findElement(By.name("websubmit")).getTagName();  
		System.out.println("Tag Name:"+tagName);
		Thread.sleep(2000);
		// get atribute
		
		driver.close();
	}
}
	