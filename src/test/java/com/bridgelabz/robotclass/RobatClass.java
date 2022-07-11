package com.bridgelabz.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobatClass {
	@Test
	public void robot() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement unTB = driver.findElement(By.id("email"));
		Robot robot = new Robot();
		// Mouse Move
		robot.mouseMove(1000, 300);
		Thread.sleep(5000);
		// Scroll down
		robot.mouseWheel(1);
		Thread.sleep(2000);
		// Scroll up
		robot.mouseWheel(-1);
		Thread.sleep(2000);
		// Keyboard
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		// CLEAR
		robot.keyPress(KeyEvent.VK_CLEAR);
		robot.keyRelease(KeyEvent.VK_CLEAR);
		Thread.sleep(2000);
		// CapsLock
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);

		Thread.sleep(2000);
		driver.close();
	}

}
