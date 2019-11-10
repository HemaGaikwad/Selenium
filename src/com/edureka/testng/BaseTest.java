package com.edureka.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest
{
	public WebDriver driver = null;
	public WebDriverWait wait = null;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
				
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else	
		{
			Reporter.log("Invalid browser selection");
			Reporter.log("");
		}
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.gmail.com/");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
