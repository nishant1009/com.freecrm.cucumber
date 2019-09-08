package com.freecrm.base;

import org.openqa.selenium.WebDriver;

import com.freecrm.pages.LoginPage;
import com.freecrm.utilities.ReadPropertyFile;

public class ScenarioContext {
	
	public TestBase testBase;
	public ReadPropertyFile readPropertyFile;
	public WebDriver driver;
	public LoginPage loginPage;
	
	public ScenarioContext(){
		
		readPropertyFile = new ReadPropertyFile();
		testBase = new TestBase(readPropertyFile.getPropertyValue("Browser"),readPropertyFile.getPropertyValue("Url"));
		loginPage = new LoginPage(driver); 
	}
	
	
	
}
