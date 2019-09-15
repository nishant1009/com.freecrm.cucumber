package com.freecrm.base;

import org.openqa.selenium.WebDriver;

import com.freecrm.pages.ContactsPage;
import com.freecrm.pages.DealsPage;
import com.freecrm.pages.LoginPage;
import com.freecrm.utilities.RandomNumberGeneration;
import com.freecrm.utilities.ReadPropertyFile;

import stepDefination.Contacts;

public class ScenarioContext {
	
	public TestBase testBase;
	public ReadPropertyFile readPropertyFile;
	public WebDriver driver;
	public LoginPage loginPage;
	public ContactsPage contactsPage;
	public RandomNumberGeneration randomNumberGeneration;
	public DealsPage dealsPage;
	
	
	public ScenarioContext(){
		
		readPropertyFile = new ReadPropertyFile();
		testBase = new TestBase(readPropertyFile.getPropertyValue("Browser"),readPropertyFile.getPropertyValue("Url"));
		loginPage = new LoginPage(driver); 
		contactsPage = new ContactsPage(driver);
		randomNumberGeneration= new RandomNumberGeneration();
		dealsPage = new DealsPage(driver);
		
	}
	
	
	
}
