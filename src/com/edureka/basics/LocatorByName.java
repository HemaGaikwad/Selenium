package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByName {

	public static WebDriver driver = null;					//declaring

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();								//instantiation or initialisation
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("your_password");
		
		

}
}
