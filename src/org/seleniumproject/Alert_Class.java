package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement simple = driver.findElement(By.id("alertButton"));
		simple.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		

		WebElement timer = driver.findElement(By.id("timerAlertButton"));
		timer.click();
		Thread.sleep(8000);
		driver.switchTo().alert().accept();
		
		WebElement confirm = driver.findElement(By.id("confirmButton"));
		confirm.click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		
		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Eashwar");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
