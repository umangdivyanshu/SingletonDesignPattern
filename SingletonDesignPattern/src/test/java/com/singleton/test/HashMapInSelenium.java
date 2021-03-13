package com.singleton.test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//since there can be different user roles in an application, we can use hashmap in below way in selenium

public class HashMapInSelenium {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		
		System.out.println(getCredentialsMap());
		System.out.println(getCredentialsMap().get("customer"));
		
		driver.findElement(By.name("username")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getPassword("customer"));
		

	}
	
	public static HashMap<String, String> getCredentialsMap() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("customer", "john@yopmail.com:john123");
		userMap.put("seller", "jaani@yopmai.com:jaani@1234");
		userMap.put("delivery", "janardan@yopmail.com:janardan@123");
		
		return userMap;
	}
	
	
	public static String getUserName(String role) {
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[0];
	}
	
	
	public static String getPassword(String role) {
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[1];
	}
	
	

}
