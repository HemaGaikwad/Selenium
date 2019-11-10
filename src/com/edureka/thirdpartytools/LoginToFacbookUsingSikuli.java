package com.edureka.thirdpartytools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToFacbookUsingSikuli {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void login() throws FindFailed
	{
		Screen screen = new Screen();
		
		Pattern email = new Pattern(".//SikuliImages//Email.PNG");
		Pattern password = new Pattern(".//SikuliImages//Password.PNG");
		Pattern login = new Pattern(".//SikuliImages//Login.PNG");
		
		screen.wait(email, 2);
		
		screen.type(email, "your_email");
		screen.type(password, "your_password");
		screen.click(login);
		
	}

	



	

}
