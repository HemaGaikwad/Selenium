package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByClassName {

	public static WebDriver driver = null;					//declaring

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();								//instantiation or initialisation
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		//WebElement mobile =driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
		//mobile.sendKeys("9663069665");
	}

}
