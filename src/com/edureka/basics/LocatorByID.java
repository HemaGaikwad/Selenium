package com.edureka.basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LocatorByID 
{
	public static WebDriver driver = null;					//declaring

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();								//instantiation or initialisation
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("your_email@something.com");
		

	}

}
