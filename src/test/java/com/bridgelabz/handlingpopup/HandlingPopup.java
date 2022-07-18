package com.bridgelabz.handlingpopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandlingPopup {
	@Test
	public void simpleAlertPopup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();

	}

	@Test
	public void confirmationPopup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Thread.sleep(4000);
		Alert confirmationalert = driver.switchTo().alert();
		String alertText = confirmationalert.getText();
		Thread.sleep(4000);
		System.out.println("Alert Text is:" + alertText);
		confirmationalert.accept();
		Thread.sleep(4000);
		driver.close();
	}

	@Test
	public void promptPopup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alert.getText());
		Thread.sleep(4000);
		alert.sendKeys("Vaibhav");
		Thread.sleep(2000);
		// alert.accept();
		alert.dismiss();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		driver.close();

	}

	@Test
	public void promptPopup1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Thread.sleep(2000);
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		confirmationAlert.sendKeys("Yes");
		Thread.sleep(2000);
		System.out.println("Alert Text is:" + alertText);
		confirmationAlert.accept();
		Thread.sleep(2000);
		driver.close();

	}

	@Test
	public void promptPopup2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();

		String alertText = promptAlert.getText();
		promptAlert.sendKeys("Vaibhav");
		Thread.sleep(2000);
		System.out.println("Alert Text is:" + alertText);
		promptAlert.accept();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void hiddenDivisionPopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Fri, Jul 22')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/ul/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]/div/div"))
				.click();
		driver.close();
	}

	@Test
	public void fileUploadPopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\VAIBHAV\\add.txt.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-xs']")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void fileDownloadPopup() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		// create Hashmap object and assign the profile settings
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("profile.default_content_directory", "c:\\");
		// Assign this chromePrefs object with chromeOptions object
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		// Create Capability object and assign the option object
		// DesiredCapabilities cap = DesiredCapabilities.chrome();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// DesiredCapabilities cap =DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("https:www.seleniumhq.org/download/");
		Thread.sleep(3000);
		String xp = "4.3.0";
		driver.findElement(By.linkText(xp)).click();
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.close();
	}
}
