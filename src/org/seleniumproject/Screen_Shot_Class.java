package org.seleniumproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot_Class {
	
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://oxyzentechnologies.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		TakesScreenshot ts  = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\eashw\\eclipse-workspace\\Selenium_Project\\ScreenShot/AMAOZN.png");
		FileUtils.copyFile(src, des);
		
		Thread.sleep(4000);
	
		
		TakesScreenshot ts1  = (TakesScreenshot) driver;
		File srcs = ts1.getScreenshotAs(OutputType.FILE);
		File dess = new File("C:\\Users\\eashw\\eclipse-workspace\\Selenium_Project\\ScreenShot/FACEBOOK.png");
		FileUtils.copyFile(srcs, dess);
		
		driver.close();
		
		
	}

}