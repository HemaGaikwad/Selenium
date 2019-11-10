package com.edureka.testng;
//This class illustrates the use of data provider annotation and logs into Gmail
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToGmail extends BaseTest
{
	@DataProvider
	public String[][] getData()
	{
		String[][] credentials = new String[3][2];
		
		credentials[0][0] ="seleniumedureka@gmail.com";
		credentials[0][1] ="Apple12345";
		
		credentials[1][0] ="seleniumedureka@gmail.com";
		credentials[1][1] ="Apple12345";
		
		credentials[2][0] ="seleniumedureka@gmail.com";
		credentials[2][1] ="Apple12345";
		
		return credentials;
		
	}
	
	
	@Test(dataProvider="getData")
	public void login(String username, String password)
	{
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys(username);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		wait.until(ExpectedConditions.titleContains("Inbox"));  
		String expectedUrl = "https://mail.google.com/mail/u/0/#inbox";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);		
	}

}
