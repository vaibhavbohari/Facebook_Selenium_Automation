package com.bridgelabz.userinput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;





public class UserInput_Driver {

	
	public static void main(String[]args) throws InterruptedException {
		System.out.println("Welcome for Selection of web Browser");
		UserInput_Driver userinput = new UserInput_Driver();
		int option;
		option =userinput.showMainMenu();
		userinput.launchBrowser(option);
		
	}
	public int launchBrowser(int option) throws InterruptedException {
		System.out.println("Enter Browser Name YOU Want to See");
		WebDriver driver;
		switch(option) {
		case 1:
			//String name =scanner.nextLine();
			
			System.out.println("Welcome to chrome Browser");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.close();
			break;
			
		case 2:
			//String name =scanner.nextLine();
			
			System.out.println("Welcome to Firebox Browser");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\VAIBHAV\\eclipse-workspace\\Facebook_Automation\\driver\\geckodriver.exe");
			//driver = new FirefoxDriver();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.close();
			break;
			
		}
		return option;
	}
	public int showMainMenu() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter 1;chrome \n2: firefox");
		int option =scanner.nextInt();
		return option;
	}

}
