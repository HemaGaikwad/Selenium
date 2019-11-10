package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class HandlingFrames {

	public static WebDriver driver = null;			
	public static WebDriverWait wait = null;

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();								
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		/*driver.switchTo().frame(0);
		WebElement txtbox = driver.findElement(By.xpath("//input[@type='text']"));
		txtbox.sendKeys("I'm a txtbox inside the frame");*/
		
		/*driver.switchTo().frame("singleframe");
		WebElement txtbox = driver.findElement(By.xpath("//input[@type='text']"));
		txtbox.sendKeys("I'm a txtbox inside the frame");*/
		
		/*WebElement frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(frame);
		
		WebElement txtbox = driver.findElement(By.xpath("//input[@type='text']"));
		txtbox.sendKeys("I'm a txtbox inside the frame");*/
		
		driver.switchTo().parentFrame();
		
		
		
		//Handling inline frames
		
		WebElement inlineFrameTab=driver.findElement(By.linkText("Iframe with in an Iframe"));
		inlineFrameTab.click();
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);
		driver.switchTo().frame(0);
		WebElement txtbox = driver.findElement(By.xpath("//input[@type='text']"));
		txtbox.sendKeys("I'm a txtbox inside the inline frames");

	}

}


