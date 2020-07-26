package com.pom.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase implements SetUp{
	WebDriver driver;
	public WebDriver initialization() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		return driver;
	}
	public void getUrl() {
		driver.get(URL);
	}

}
