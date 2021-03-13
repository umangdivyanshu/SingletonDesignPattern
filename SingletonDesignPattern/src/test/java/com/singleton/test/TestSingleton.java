package com.singleton.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.singleton.base.BaseClass;

public class TestSingleton {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		BaseClass instance = BaseClass.getInstance();
		driver = instance.openBrowser();
	}
	
	@Test
	public void testMethod() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println("Closing the browser");
	}

}
