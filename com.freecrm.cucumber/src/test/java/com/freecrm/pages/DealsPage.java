package com.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPage {
	
	WebDriver driver;
	
	
	public DealsPage(WebDriver driver){
		
		this.driver= driver;
		
	}
	
	private By dealsLink= By.xpath("//a[@href='/deals']");
	private By newDealButton= By.xpath("//a[@href='/deals/new']");
	private By title= By.xpath("//input[@name='title']");
	private By description= By.xpath("//textarea[@name='description']");
	private By probability= By.xpath("//input[@name='probability']");
	private By amount= By.xpath("//input[@name='amount']");
	private By dealsSaveButton = By.xpath("//button[@class='ui linkedin button']");
	private By dealsIcon= By.xpath("//i[@class='large money red icon']");
	private By deal= By.xpath("//tbody/tr[1]");
	private By editDealButton= By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[7]/a[2]/button/i");
	private By dealsCommission= By.xpath("//input[@name='commission']");
	private By dealEditCheck= By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[11]/div[2]");
	private By dealsDeleteDropdown= By.xpath("//div[@name='action']");
	private By dealsDeleteDropdownOption= By.xpath("//div[@name='action']//div[@role='option'][@aria-checked='false']");
	private By dealDeleteButton=By.xpath("//div/i[@class='checkmark icon']");
	private By dealDeleteConfirmButton= By.xpath("//div[@class='actions']//button[contains(text(),'Delete')]");
	private By dealDeleteConfirmationMsg= By.xpath("//div[@class='content']");
	
	
	
	public By getdealDeleteConfirmationMsg(){
		
		return dealDeleteConfirmationMsg;
	}
	
	public By getdealDeleteConfirmButton(){
		
		return dealDeleteConfirmButton;
	}
	
	
	public By getdealDeleteButton(){
		
		return dealDeleteButton;
	}
	
	public By getdealsDeleteDropdownOption(){
		
		return dealsDeleteDropdownOption;
	}
	
	
	
	public By getdealsDeleteDropdown(){
		
		return dealsDeleteDropdown;
		
	}
	
	
	public By getdealEditCheck(){
		
		return dealEditCheck;
	}
	
	
	public By getDealsCommission(){
		return dealsCommission;
	}
	
	
	public By getDeal(){
		return deal;
	}
	
	public By geteditDealButton(){
		
		return editDealButton;
	}

	
	public By getdealsSaveButton(){
		
		return dealsSaveButton;
	}
	
	public By getdealsIcon(){
		
		return dealsIcon;
	}
	
	
	public By getDealsLink() {
		return dealsLink;
	}
	public By getNewDealButton() {
		return newDealButton;
	}
	public By getTitle() {
		return title;
	}
	public By getDescription() {
		return description;
	}
	public By getProbability() {
		return probability;
	}
	public By getAmount() {
		return amount;
	}
	
	
	
	
	
	

}
