package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopups {

	public static WebDriver driver = null;			
	public static WebDriverWait wait = null;

	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();								
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		/*WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'display an  alert box:')]"));
		alertButton.click();*/
		
		/*Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();*/
		
		/*WebElement confirmAlert = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		confirmAlert.click();
		WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(),'display a confirm box')]"));
		confirmButton.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		//alert.accept();
		alert.dismiss();
		
		String confirMsg = driver.findElement(By.id("demo")).getText();
		System.out.println(confirMsg);*/
		
		
		WebElement textAlert = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		textAlert.click();
		
		WebElement modalButton = driver.findElement(By.xpath("//button[contains(text(),'prompt box')]"));
		modalButton.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.sendKeys("Edureka Selenium");
		alert.accept();
		System.out.println(driver.findElement(By.id("demo1")).getText());
		
		
		
		
	}

}
