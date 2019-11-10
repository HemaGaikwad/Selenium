package com.edureka.thirdpartytools;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumGridDemo 
{
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	public static void main(String[] args) throws MalformedURLException 
	{
		String nodeUrl="http://192.168.1.159:4444/wd/hub";
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeUrl), cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium WebDriver");
		searchBox.submit();
		System.out.println(driver.getTitle());
		
		
		
	}

}
