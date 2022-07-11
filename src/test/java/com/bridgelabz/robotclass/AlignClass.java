package com.bridgelabz.robotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlignClass {
	@Test
	public void alignFacebook() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.id("email"));
		int username_Ycordinate = unTB.getLocation().getY();
		System.out.println("Username y coordinate:" + username_Ycordinate);
		WebElement pwdTB = driver.findElement(By.name("pass"));
		// get the y-coordinate of password field
		int password_Ycordinate = pwdTB.getLocation().getY();
		System.out.println("password y coordinate:" + password_Ycordinate);

		if (username_Ycordinate == password_Ycordinate) {
			System.out.println("alligned");
		} else {
			System.out.println("not alligned");
		}
		driver.close();

	}

	@Test
	public void sizeFacebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement unTB1 = driver.findElement(By.id("email"));

		int username_height = unTB1.getSize().getHeight();
		// store the width of username
		int username_width = unTB1.getSize().getWidth();
		System.out.println("Height of Username:" + username_height);
		System.out.println("Width of Username:" + username_width);
		// find the password field
		WebElement pwdTB1 = driver.findElement(By.name("pass"));
		// store the height of password
		int password_height = pwdTB1.getSize().getHeight();
		// store the width of password
		int password_width = pwdTB1.getSize().getWidth();
		System.out.println("Height of Pssword:" + password_height);
		System.out.println("Width of Password:" + password_width);
		// check the height and width of username and password fields are same
		if (username_height == password_height && username_width == password_width) {
			System.out.println("Username and password fields are aligned");
		} else {
			System.out.println("Username and password fields are NOT aligned");
		}
		driver.close();
	}

}
