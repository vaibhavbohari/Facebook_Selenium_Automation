package com.bridgelabz.ActionClass;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionClass {

	WebDriver driver = null;

	@BeforeMethod
	public void initization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void Using_contextClick_MethodTest() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Actions action = new Actions(driver);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		action.contextClick(email).perform();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void usingRightClick() throws InterruptedException {
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right click me')]"))).perform();
		Thread.sleep(2000);
		// driver.close();
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();

	}

	@Test
	public void Using_DragAndDrop_Method() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(2000);
		// Create an object of Actions class and pass driver object as an argument
		Actions actions = new Actions(driver);

		// call the dragAndDropBy() method of Actions class
		actions.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);

		driver.close();
	}

	@Test
	public void Using_DoubleClick_Method() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		actions.doubleClick(email).perform();
		Thread.sleep(2000);
		actions.doubleClick(pass).perform();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void Keyboard_Method() throws InterruptedException, IOException, AWTException {
		driver.get("http://www.istqb.in/");
		WebElement foundation = driver.findElement(By.linkText("FOUNDATION"));
		Actions actions = new Actions(driver);
		// mouse hover on Foundation tab
		actions.moveToElement(foundation).perform();
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void mouseHoverTest() throws InterruptedException {
		driver.get("https://www.istqb.in/");
		Actions action = new Actions(driver);
		WebElement foundationElement = driver.findElement(By.xpath(
				"//li[@data-uk-dropdown=\"{'preventflip':'y'}\"]//a[@href='#'][normalize-space()='Foundation']"));
		action.moveToElement(foundationElement).perform();
		Thread.sleep(2000);
		driver.close();
	}

	@AfterMethod
	public void closeDriver() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
}
