package com.brodgelabz.selectclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListBoxExample {
	WebDriver driver = null;

	@BeforeMethod
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void listBox_DemoTest() throws InterruptedException {
		driver.get("file:///C:/Users/VAIBHAV/ListBox_Breakfast.html");
		WebElement list = driver.findElement(By.id("mtr"));
		// passing the address of list box as an argument
		Select select = new Select(list);
		// getOptions() method returns a list of all the elements of the list box
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println("Number of elements present inside the listbox is : " + size);
		// Print all the elements present in the list box
		for (WebElement webElement : options) {

			String text = webElement.getText();
			System.out.println(text);
		}
		// selectByIndex() selects an element based on the Index, here index starts with
		// 0
		select.selectByIndex(0);
		Thread.sleep(1000);
		// selectByValue() method selects an element based on its value attribute.
		select.selectByValue("d");
		/*
		 * selectByVisibleText() method selects an element based on the actual text that
		 * is visible to the user. For instance, if there are multiple Poori present
		 * inside the listbox , it will select all the Poori elements.
		 */
		select.selectByVisibleText("Poori");

		System.out.println("************Print all selected options*************");

		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		System.out.println("Number of items that is selected in the list box is : " + size2);
		System.out.println(" Selected items are printed below ");
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		// check whether it is a multiple select listbox or not
		System.out.println("check whether it is a multiple select listbox or not");
		boolean multiple = select.isMultiple();
		System.out.println(multiple + " yes , it is multi select");

		if (multiple) {

			WebElement firstSelectedOption1 = select.getFirstSelectedOption();
			System.out.println(firstSelectedOption1.getText() + ":IS the first Selected item in the list box");
			// deselect the item present in 0th index.
			select.deselectByIndex(0);

			WebElement firstSelectedOption2 = select.getFirstSelectedOption();
			System.out.println(firstSelectedOption2.getText() + ":IS the first Selected item ");
			select.deselectByValue("d");

			WebElement firstSelectedOption3 = select.getFirstSelectedOption();
			System.out.println(firstSelectedOption3.getText() + ":IS the first Selected item ");
			select.deselectByVisibleText("Poori");
		}
	}

	@Test
	public void  PrintListValues_SortedOrder() {
		driver.get("file:///C:/Users/VAIBHAV/ListBox_Breakfast.html");
		WebElement listElement =driver.findElement(By.id("mtr"));
		Select select = new Select(listElement);
		List<WebElement> allOptions= select.getOptions(); 
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("-----print the values in the list ----");
		ArrayList<String> list = new ArrayList<String>();
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
			list.add(text);
			}
		Collections.sort(list);
		System.out.println("-----print the value in sorted order----");
		for (String value : list) {
		System.out.println(value); 
		
		}
	}
	@Test
	public void check_UniqueElementinthelistbox() {
		
		driver.get("file:///C:/Users/VAIBHAV/ListBox_Breakfast.html");
		WebElement listElement =driver.findElement(By.id("mtr"));
		Select select = new Select(listElement);
		List<WebElement> allOptions= select.getOptions(); 
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("-----print all the elements in the list ----");
		HashSet<String> allElements = new HashSet<String>();
		//Peint unique element puri is 2 times but print only one time
		for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(text);
		allElements.add(text);
		}
		System.out.println(allElements);
		
	}
	@Test
	public void print_UniqueElementinthelist_SortedOrder() {
		driver.get("file:///C:/Users/VAIBHAV/ListBox_Breakfast.html");
		WebElement listElement =driver.findElement(By.id("mtr"));
		Select select = new Select(listElement);
		List<WebElement> allOptions= select.getOptions(); 
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("-----print all the elements in the list ----");
		TreeSet<String> allElements = new TreeSet<String>();
		for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(text);
		allElements.add(text);
		}
		System.out.println(allElements);
		
	}
	@Test
	public void check_ListhasDuplicateElements_HashSet() {
		driver.get("file:///C:/Users/VAIBHAV/ListBox_Breakfast.html");
		WebElement listBox =driver.findElement(By.id("mtr"));
		Select select = new Select(listBox);
		List<WebElement> allOptions= select.getOptions(); 
		int count1 = allOptions.size();
		
		System.out.println("Number of Elements in the List are :"+count1);
		HashSet<String> allElementText = new HashSet<String>();
		 for (int i = 0; i < count1; i++) {
		 String text = allOptions.get(i).getText();
		 System.out.println(text);
		 allElementText.add(text);
		 }
		//Check with HashMap for unique values then compare Both
		 int count2 = allElementText.size();
		 System.out.println("Number of elements in the hashset is :" +count2);
		 if (count1==count2) {
		 System.out.println("list box has NO duplicate values");
		 }
		 else{
		 System.out.println("list box has duplicate values");
		 }
		 System.out.println("Unique Elements of List Box are:"+allElementText);
	} 
	@Test
	public void Print_DuplicateElementsOfList_HashSet() {
		
		driver.get("file:///C:/Users/VAIBHAV/ListBox_Breakfast.html");
		WebElement listBox =driver.findElement(By.id("mtr"));
		Select select = new Select(listBox);
		List<WebElement> allOptions= select.getOptions(); 
		int count = allOptions.size();
		System.out.println("NUMBER OF elements in the list is:"+count);
		HashSet<String>allElementText= new HashSet<String>();
		for(int i=0; i < count; i++) {
			String text = allOptions.get(i).getText();
			/*allElementText.add(text) returns true if the element is not already 
			added, and it returns false if the same element is trying to be added 
			twice. */
			 if (!allElementText.add(text)) 
			if(!allElementText.add(text)) {
				System.out.println(text +":is the duplicate element in the list box");
			}
			
		}
		System.out.println(allElementText.size());
		// it will print all the unique values in the HashSet object
		System.out.println(allElementText);
		
	} 
	@Test
	
	public void Print_NumberOfOccurranceOfElements_InListBox() {
		
		driver.get("file:///C:/Users/VAIBHAV/ListBox_Breakfast.html");
		WebElement list =driver.findElement(By.id("mtr"));
		Select select = new Select(list);
		List<WebElement> allElements= select.getOptions(); 
		
		HashMap<String,Integer>hashMapObj=new HashMap<String,Integer>();
		
		for(WebElement element:allElements) {
			String text = element.getText();
			if(hashMapObj.containsKey(text)) {
				Integer value = hashMapObj.get(text);
				value++;
				hashMapObj.put(text, value);
				}else {
				hashMapObj.put(text, 1);
			}
		}
		Set<String> allKeys = hashMapObj.keySet();
		for (String key : allKeys) {
		Integer value = hashMapObj.get(key);
		System.out.println(key +" -->"+ value);
		if (value>1) {
		System.out.println("Occurance of " + key + " is :" + value);
			}
		}
	}
	@AfterMethod
	public void closeDriver() {
		try {
			Thread.sleep(20);
			driver.close();
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
	
	

