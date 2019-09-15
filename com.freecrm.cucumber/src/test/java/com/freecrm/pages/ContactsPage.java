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
	private By contact= By.xpath("//tbody/tr[1]");
	private By contactEditButton = By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[6]/a[2]/button/i");
	private By contactDescription =By.xpath("//textarea[@name='description']");
	private By contactCity = By.xpath("//input[@name='city']");
	private By contactDescriptionCheck = By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[6]/div[2]/div/span/p");
	private By contactDeleteDropdown= By.xpath("//div[@name='action']");
	private By contactDeleteDropdownOption= By.xpath("//div[@name='action']//div[@role='option'][@aria-checked='false']");
	private By contactDeleteButton=By.xpath("//div/i[@class='checkmark icon']");
	private By contactDeleteConfirmButton= By.xpath("//div[@class='actions']//button[contains(text(),'Delete')]");
	private By contactDeleteConfirmationMsg= By.xpath("//div[@class='content']");
	private By contactShowFilterButton=By.xpath("//button[contains(text(),'Show Filters')]");
	private By contactSearchField = By.xpath("//input[@class='search']");
	private By contactSearchAllOptions = By.xpath("//div[@name='name'] [@role='combobox']/div[2]");
	private By contactSearchFilter= By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/button[5]/i");
	private By contactSearchValue= By.xpath("//input[@name='value']");
	private By contactSearchOperator= By.xpath("//div[@name='operator']");
	private By contactSearchCheck=By.xpath("//tbody/tr/td[3]");
	private By contactSearchColumnButton=By.xpath("//i[@class='columns small icon']");
	private By contactSearchColumnAccess=By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/label");
	private By contactSearchColumnSetButton=By.xpath("//button[@class='ui button']");
	private By contactSearchColumnsCheck=By.xpath("//tr/th");
	
	
	public By getcontactSearchColumnsCheck(){
		return contactSearchColumnsCheck;
	}
	
	public By getcontactSearchColumnSetButton(){
		return contactSearchColumnSetButton;
	}
	public By getcontactSearchColumnAccess(){
		return contactSearchColumnAccess;
	}
	
	
	
	public By getcontactSearchColumnButton(){
		return contactSearchColumnButton;
	}
	
	
	public By getcontactSearchCheck(){
		return contactSearchCheck;
	}
	
	
	public By getcontactSearchOperator(){
		return contactSearchOperator;
	}
	
	
	public By getcontactSearchValue(){
		return contactSearchValue;
	}
	
	public By getcontactSearchFilter(){
		return contactSearchFilter;
	}
	public By getcontactSearchAllOptions(){
		return contactSearchAllOptions;
	}
	
	
	public By getcontactSearchField(){
		return contactSearchField;
	}
	
	public By getcontactShowFilterButton(){
		return contactShowFilterButton;
	}
	
	public By getcontactDeleteConfirmButton(){
		
		return contactDeleteConfirmButton;
	}
	
	public By getcontactDeleteConfirmationMsg(){
		
		return contactDeleteConfirmationMsg;
	}
	
	
	public By getContactDeleteButton(){
		
		return contactDeleteButton;
	}
	
	
	
	public By getcontactDeleteDropdownOption(){
		return contactDeleteDropdownOption;
	}
	
	
	public By getcontactDeleteDropdown(){
		
		return contactDeleteDropdown;
	}
	
	
	public By getcontactDescriptionCheck(){
		return contactDescriptionCheck;
	}
	
	
	
	public By getContactCity(){
		
		return contactCity;
	}
	
	
	public By getContactDescription(){
		
		return contactDescription;
	}
	
	
	public By getcontactEditButton(){
		return contactEditButton;
	}
	
	
	public By getContact(){
		
		return contact;
	}

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
