package com.edureka.controls;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildBrowserPopups {

	public static WebDriver driver = null;			
	public static WebDriverWait wait = null;

	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();								
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.popuptest.com/");
		
		String parentWindow = driver.getWindowHandle();
		
		WebElement multiPopupLink = driver.findElement(By.linkText("Multi-PopUp Test"));
		multiPopupLink.click();
		
	
		Set<String> handles = driver.getWindowHandles();
		
		
		for(String child: handles)
		{
			if(parentWindow.equals(child))
			{
				continue;
			}
			else
			{
				driver.switchTo().window(child);
				driver.manage().window().maximize();
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
	}

}
