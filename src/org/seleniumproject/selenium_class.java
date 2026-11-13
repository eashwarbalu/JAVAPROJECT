package org.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_class {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.whatsapp.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.get("https://www.royalenfield.com/");

		driver.navigate().back();

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.navigate().forward();

		driver.navigate().back();

		driver.quit();

	}

}
