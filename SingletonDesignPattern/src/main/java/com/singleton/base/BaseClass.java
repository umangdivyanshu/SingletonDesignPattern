package com.singleton.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	private static BaseClass instance = null;
	WebDriver driver;
	
	private BaseClass() {
		
	}
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/umangdivyanshu/amazon-workspace/SingleDesignPattern/driver/chromedriver");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static BaseClass getInstance() {
		if(instance == null) {
			instance = new BaseClass();
		}
		return instance;
	}

}
