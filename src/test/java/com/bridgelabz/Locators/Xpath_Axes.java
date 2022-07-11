package com.bridgelabz.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {
	public void axis() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		// self= Select Current Node
		String text = driver.findElement(By.xpath("//a[contains(text(),'Bajaj Electricals')]/self::a")).getText();
		System.out.println("Text:" + text);

		// parent=Selects the Parent of the Current Node(always one)
		String text1 = driver.findElement(By.xpath("//a[contains(text(),'Bajaj Electricals')]/parent::td")).getText();
		System.out.println("Text1:" + text1);

		// child=Select all Children of Current Node(one or many)
		List<WebElement> childs = driver
				.findElements(By.xpath("//a[contains(text(),'Bajaj Electricals')]/ancestor::tr/child::td"));
		System.out.println("Chids:" + childs.size());
		// Ancestor=Selects all ancestor(parent,grant parent)
		String text2 = driver.findElement(By.xpath("//a[contains(text(),'Bajaj Electricals')]/ancestor::tr")).getText();
		System.out.println("Text2:" + text2);

		// descedeant=Selects all descedent(children,grandchildren)of the current node
		List<WebElement> descendant = driver
				.findElements(By.xpath("//a[contains(text(),'Bajaj Electricals')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant :" + descendant.size());

		// Following -Selects everything in the document after the closing tag of the
		// current node
		List<WebElement> followingnodes = driver
				.findElements(By.xpath("//a[contains(text(),'Bajaj Electricals')]/ancestor::tr/following::tr"));
		System.out.println("Number Following Nodes :" + followingnodes.size());
		// Following Sibling=Selects all Sibling after the current node
		List<WebElement> followingsibling = driver
				.findElements(By.xpath("//a[contains(text(),'Bajaj Electricals')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of followingsibling :" + followingsibling.size());

		// Preceding=Select all the node that appear before the current node of document
		List<WebElement> preceding = driver
				.findElements(By.xpath("//a[contains(text(),'Bajaj Electricals')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of Preceding :" + preceding.size());

		// Preceding=Select all the sibling before the current node
		List<WebElement> precedingsibling = driver
				.findElements(By.xpath("//a[contains(text(),'Bajaj Electricals')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of Preceding-Sibling Nodes :" + precedingsibling.size());
		driver.close();
	}
}
