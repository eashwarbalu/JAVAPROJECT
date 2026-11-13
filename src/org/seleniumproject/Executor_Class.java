package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor ea = (JavascriptExecutor) driver;
		
//		ea.executeScript("window.scrollBy (0, 1000);");
//		ea.executeScript("window.scrollBy (0, -800);");
		
	WebElement signin = driver.findElement(By.xpath("(//span[text() = 'Sign in'])[2]"));
		ea.executeScript("arguments[0].scrollIntoView();", signin );
		ea.executeScript("arguments[0].click();", signin );	
		
	}

}
