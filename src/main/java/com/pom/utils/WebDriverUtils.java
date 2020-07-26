package com.pom.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils {

	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void click(By prop) {
		driver.findElement(prop).click();
		
	}

}
