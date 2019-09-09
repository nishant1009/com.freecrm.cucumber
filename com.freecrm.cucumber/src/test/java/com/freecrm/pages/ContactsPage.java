package com.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactsPage {
	
	WebDriver driver;
	
	public ContactsPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	private By contactLink = By.xpath("//*[@id='main-nav']/a[3]");
	private By newContactButton = By.xpath("//a[@href='/contacts/new']");
	private By firstName= By.xpath("//input[@name='first_name']");
	private By lastName= By.xpath("//input[@name='last_name']");
	private By position= By.xpath("//input[@name='position']");
	private By department= By.xpath("//input[@name='department']");
	private By contactSaveButton= By.xpath("//button[@class='ui linkedin button']");
	private By contactSaveCheck= By.xpath("//*[@id='dashboard-toolbar']/div[1]");

	public By getcontactSaveCheck(){
		return contactSaveCheck;
	}
	
	
	public By getContactLink() {
		return contactLink;
	}
	public By getNewContactButton() {
		return newContactButton;
	}
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getPosition() {
		return position;
	}
	public By getDepartment() {
		return department;
	}
	public By getContactSaveButton() {
		return contactSaveButton;
	}
	
	


}
