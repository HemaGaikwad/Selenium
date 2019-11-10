package com.edureka.controls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

	public static WebDriver driver = null;			
	public static WebDriverWait wait = null;

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();								
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.get("http://demo.automationtesting.in/Register.html");
		
	/*	//Handling txtboxes
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		firstName.sendKeys("John");
		
		//Handle Radio Button
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));
		maleRadioButton.click();
		
		//Handle Checkboxes
		WebElement cricketChkBox = driver.findElement(By.id("checkbox1"));
		cricketChkBox.click();
		
		WebElement  moviesChkBox = driver.findElement(By.xpath("//input[@value='Movies']"));
		moviesChkBox.click();*/
		
		
		//Handle DropDowns/ListBox
		/*WebElement skills = driver.findElement(By.id("Skills"));
		Select oskills = new Select(skills);
		*/
		//oskills.selectByIndex(5);
		//oskills.selectByValue("AutoCAD");
		//oskills.selectByVisibleText("Content Managment");

		
		//MultiSelect Dropdowns
		driver.get("file:///C:/Users/Zerobean/Downloads/Sample%20Web%20Page.html?text_name1=&pwd_name1=");
		WebElement select = driver.findElement(By.id("list2"));
		Select omulti = new Select(select);
		
		omulti.selectByIndex(3);
		omulti.selectByValue("rcr");
		omulti.selectByVisibleText("Bangalore");
		
		omulti.deselectByVisibleText("Delhi");
		omulti.deselectAll();
		
		
		//Interview Questions
		
		List<WebElement> allOptions = omulti.getOptions();
		int size=allOptions.size();
		System.out.println(size);
		
		for(WebElement option : allOptions)
		{
			String text = option.getText();
			System.out.println(text);
		}
		
		System.out.println("******************************************************");
		
		for(int i=1; i<size; i++)
		{
			WebElement option = allOptions.get(i);
			String txt = option.getText();
			System.out.println(txt);
		}
		
		System.out.println("******************************************************");
		
		ArrayList<String> optionsText = new ArrayList();
		//Sort the options
		for(int i =1; i<size;i++)
		{
			WebElement option = allOptions.get(i);
			String text1 = option.getText();
			optionsText.add(text1);
		}
		
		Collections.sort(optionsText);
		for(String sortedtxt: optionsText)
		{
			System.out.println(sortedtxt);
		}
		
	}

}
