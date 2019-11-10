package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {


	public static WebDriver driver = null;			
	public static WebDriverWait wait = null;

	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();								
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.craftsvilla.com/");
		
		//WebElement kurtisAndDresses = driver.findElement(By.xpath("//a[@href='/womens-clothing/kurtis-tunics/?MID=megamenu_casualwear_seeall']"));
		
		Actions  action = new Actions(driver);
		/*action.moveToElement(kurtisAndDresses).perform();
		
		WebElement printedKurti = driver.findElement(By.linkText("Printed Kurti"));
		printedKurti.click();
*/
		
	//	action.contextClick(printedKurti).perform();
	//	action.doubleClick(kurtisAndDresses).perform();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.clear();
		
		action.keyDown(searchBox, Keys.SHIFT).sendKeys("lehengas").keyUp(Keys.SHIFT).build().perform();
		
		
		
		
		
	}

}
