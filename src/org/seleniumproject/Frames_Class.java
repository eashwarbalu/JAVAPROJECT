package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1234");
		driver.switchTo().defaultContent();
		
		WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multi.click();
		
		WebElement nested = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html'][1]"));
		driver.switchTo().frame(nested);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px'][1]"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ab");
		
	}

}
