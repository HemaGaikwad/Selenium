package com.edureka.waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToGmail {

	public static WebDriver driver = null;					//declaring
	public static WebDriverWait wait = null;

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();								//instantiation or initialisation
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	/*	
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		Wait w = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	*/	
		driver.manage().deleteAllCookies();
		driver.navigate().to("www.gmail.com/");
		
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("seleniumedureka@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Apple12345");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		wait.until(ExpectedConditions.titleContains("Inbox"));   //20 seconds - TimeOutException
		String title = driver.getTitle();
		if(title.contains("seleniumedureka"))
		{
			System.out.println("Logged in to gmail successfully.");
		}
		else
		{
			System.out.println("Login failed");
		}
		
		WebElement compose = driver.findElement(By.xpath("//div[@gh=\"cm\"]"));
		if(compose.isDisplayed())
		{
			System.out.println("Logged in to gmail successfully.");
		}
		else
		{
			System.out.println("Login failed");
		}

	}

}
