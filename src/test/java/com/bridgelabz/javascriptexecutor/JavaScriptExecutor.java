package com.bridgelabz.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {

	@Test
	public void script() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VAIBHAV/eclipse-workspace/Facebook_Automation_Selenium/Vaibhav1/DisabledTextBox_Prog3.html");
		driver.manage().window().maximize();
		//Typecast the driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('t2').value=''");
		
		js.executeScript("document.getElementById('t2').value='manager'");
	
		js.executeScript("document.getElementById('t2').type='button'");
		
		driver.close();
		}

}
