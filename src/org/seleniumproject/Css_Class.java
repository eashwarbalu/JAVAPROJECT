package org.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Class {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement loginId = driver.findElement(By.cssSelector("input#_R_ojadeslcldcpbn6b5ipamH1_"));
		loginId.sendKeys("name");
		
		WebElement classs = driver.findElement(By.cssSelector("input.xggy1nq"));
		classs.sendKeys("1234");
		
		WebElement name = driver.findElement(By.cssSelector("[type=password]"));
		name.sendKeys("abc.ab");
		
		WebElement prefix = driver.findElement(By.cssSelector("[class^='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft']"));
		prefix.click();
		
		
		
	
		
	}

}
