package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByXpath {

	public static WebDriver driver = null;					//declaring

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();								//instantiation or initialisation
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumhq.org/");
		
//Absolute Xpath
		
		//String absXpath="/html/body/div/div/form/div/label";
		
	/*	WebElement search = driver.findElement(By.xpath("/html/body/div/div/form/div/label"));
		String text = search.getText();
		System.out.println(text);*/
		
//Relative Xpath - with attributes and value pairs
		WebElement search = driver.findElement(By.xpath("//label[@for='q']"));
		System.out.println(search.getText());
		
		//Relative Xpath - text method
		WebElement paragraph = driver.findElement(By.xpath("//strong[text()='Selenium is a suite of tools']"));
		
		//Relative Xpath - pattern matching : contains and starts-with	
		
		WebElement para = driver.findElement(By.xpath("//strong[starts-with(text(),'Selenium is a ')]"));
		
		WebElement para1 = driver.findElement(By.xpath("//strong[contains(text(),'//strong[contains(text(),'suite of tools')] ')]"));
		
		//Relative Xpath - groups and indexes
		
		WebElement mob = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		
		
	}

}
