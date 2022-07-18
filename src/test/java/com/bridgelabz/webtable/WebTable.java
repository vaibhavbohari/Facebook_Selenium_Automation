package com.bridgelabz.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {

	public WebDriver driver;

	@BeforeTest
	public void Driver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	// Count Total number of rows present in the table
	public void WebTable_RowsCount() {
		driver.get("file:///C:/Users/VAIBHAV/web.Table.html");
		driver.manage().window().maximize();
		List<WebElement> allRow = driver.findElements(By.xpath("//tr"));
		int RowC = allRow.size();
		System.out.println("Total Row Count : " + RowC);
	}

	// count total number of columns
	@Test

	public void WebTable_ColumnCount() {
		driver.get("file:///C:/Users/VAIBHAV/web.Table.html");
		driver.manage().window().maximize();
		List<WebElement> allColumn = driver.findElements(By.xpath("//th"));
		int ColumnC = allColumn.size();
		System.out.println("Total Column Count : " + ColumnC);
	}
	// Count number of cells present in the table

	@Test

	public void WebTable_TotalNumber_Of_Cells() {
		driver.get("file:///C:/Users/VAIBHAV/web.Table.html");
		driver.manage().window().maximize();
		List<WebElement> Row = driver.findElements(By.xpath("//tr"));
		int row = Row.size();
		List<WebElement> Colunm = driver.findElements(By.xpath("//th"));
		int column = Colunm.size();
		int totalCell = row * column;
		System.out.println("Total number of Cells : " + totalCell);
	}

	@Test

	public void WebTable_PrintNumericValue() {
		driver.get("file:///C:/Users/VAIBHAV/web.Table.html");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//td"));
		int NumericCount = 0;
		int Sum = 0;
		System.out.println("List of Numeric value :");
		for (WebElement element : list) {
			String value = element.getText();
			try {
				int numericValue = Integer.parseInt(value);
				System.out.println(numericValue);
				NumericCount++;
				Sum = Sum + numericValue;
			} catch (Exception e) {

			}
		}
		// Print the TOTAL number of NUMERIC values present
		System.out.println("Total count of numeric values is : " + NumericCount);
		// print the SUM of all the numeric values in the table
		System.out.println("Total sum of all the numeric values is:" + Sum);

	}
}
