package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.utils.WebDriverUtils;

public class LandingPage extends WebDriverUtils {
		WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickSignIn() {
		System.out.println("Driver From Landing page ::: "+driver);
		click(By.xpath("//a[@class='login']")); 
	}

}
