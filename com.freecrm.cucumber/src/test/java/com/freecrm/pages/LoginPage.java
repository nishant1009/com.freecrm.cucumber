package com.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage( WebDriver driver){
		this.driver=driver;
		
	}
	
	private By loginLink = By.xpath("//a[@href='https://ui.freecrm.com']");
	private By userName = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//*[@id='ui']/div/div/form/div/div[3]");
	private By dealsSummary=By.xpath("//div[contains(text(),'Deals Summary')]");
	private By invalidLoginMessage= By.xpath("//div[contains(text(),'Something went wrong...')]");

	public By getinvalidLoginMessage(){
		return invalidLoginMessage;
	}
	
	
	public By getDealsSummary(){
		return dealsSummary; 
	}
	
	public By getLoginLink() {
		return loginLink;
	}
	
	public By getUserName() {
		return userName;
	}
	
	public By getPassword() {
		return password;
	}
	
	public By getLoginButton() {
		return loginButton;
	}
	
	

}
