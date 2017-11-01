package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstjava {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","E:\\Desktop\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com:");
		driver.navigate().to("http://www.facebook.com");
		driver.quit();
		
	}
}