package org.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.navigate().to("https://www.google.com/");
		String currentUrls = driver.getCurrentUrl();
		System.out.println(currentUrls);

		Thread.sleep(4000);

		driver.navigate().to("https://www.apple.com/");
		String currentUrls1 = driver.getCurrentUrl();
		System.out.println(currentUrls1);

	}

}