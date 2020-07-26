package com.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.utils.TestBase;

public class Sc_015_Create_Account_Validations extends TestBase {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		driver=initialization();
		getUrl();
		
	}
	@Test
	public void createAccountTest() {
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

}
