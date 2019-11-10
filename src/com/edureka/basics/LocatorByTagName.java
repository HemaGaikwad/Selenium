package com.edureka.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagName {
	public static WebDriver driver = null;					//declaring

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();								//instantiation or initialisation
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumhq.org/");
		
		List<WebElement> allLinks = driver.findElements(By.className("inputtext _58mg _5dba _2ph-"));
		int size = allLinks.size();
		System.out.println(size);
		
		/*for(int i =0; i<size; i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}*/
	}

}
