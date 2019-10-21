package stepDefination;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.freecrm.base.ScenarioContext;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contacts {
	
	ScenarioContext scenarioContext;
	public String contactDescription="Automation";
	
	public Contacts(ScenarioContext scenarioContext){
		this.scenarioContext=scenarioContext;
				
	}
	@Given("^User is on Contacts page$")
	public void user_is_on_Contacts_page(){
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContactLink());
		
	}

	@When("^User Click on New Contacts button$")
	public void user_Click_on_New_Contacts_button(){
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getNewContactButton());
	    
	}

	@When("^enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and(String firstName, String lastName, String position, String department){
		
		int randNumber= scenarioContext.randomNumberGeneration.getRandomNumber();
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getFirstName(), firstName+"_"+randNumber);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getLastName(), lastName+"_"+randNumber);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getPosition(), position);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getDepartment(), department);
		
	    
	}

	@When("^User clicks on Save button$")
	public void user_clicks_on_Save_button() throws InterruptedException{
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContactSaveButton());
		Thread.sleep(1500);
	    
	}

	@Then("^Contacts should be saved successfully$")
	public void contacts_should_be_saved_successfully(){
		
		Assert.assertTrue(scenarioContext.testBase.checkEnable(scenarioContext.driver, scenarioContext.contactsPage.getcontactSaveCheck()));
	    
	}
	
	@Given("^Contacts exists in CRM application$")
	public void contacts_exists_in_CRM_application(){
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContactLink());
			    
	}

	@When("^User edits the contacts$")
	public void user_edits_the_contacts() throws Exception {
		Thread.sleep(2000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContact());
		Thread.sleep(2000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactEditButton());
		Thread.sleep(1500);
		
		
	   
	}

//	@When("^Saves the Contact$")
//	public void saves_the_Contact(//DataTable dataTable){
//		//for(Map<String,String> data : dataTable.asMaps(String.class, String.class)){
//			
//			//scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getContactDescription(),"Automation");
//			//contactDescription= data.get("Description");
//			scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getContactDescription(), "Automation");
//			scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getContactCity(), "Pune");
//			scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContactSaveButton());
//			   
//	}

	@When("^Saves the Contact$")
	public void saves_the_Contact() throws Exception{
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getContactDescription(), "Automation");
		Thread.sleep(1500);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getContactCity(), "Pune");
		Thread.sleep(1500);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContactSaveButton());
		Thread.sleep(1500);
		
	  
}

	@Then("^Contact should be editted successfully$")
	public void contact_should_be_saved_successfully() {
		String descriptionCheck=scenarioContext.testBase.getText(scenarioContext.driver, scenarioContext.contactsPage.getcontactDescriptionCheck());
	    System.out.println(descriptionCheck);
	    //Assert.assertEquals(contactDescription, descriptionCheck);
	    Assert.assertTrue(contactDescription.equals(descriptionCheck));
	}
	
	@When("^User selects Contacts and deletes the selected Contact$")
	public void user_selects_Contacts_and_deletes_the_selected_Contact() throws Exception {
		
		Thread.sleep(2000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContact());
		Thread.sleep(2000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactDeleteDropdown());
		Thread.sleep(1000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactDeleteDropdownOption());
		Thread.sleep(1000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContactDeleteButton());
		Thread.sleep(1000);
	    
	}

	@Then("^selected contacts should be deleted successfully$")
	public void selected_contacts_should_be_deleted_successfully() throws Exception {
		Thread.sleep(1000);
		String deleteConfirmation=scenarioContext.testBase.getText(scenarioContext.driver, scenarioContext.contactsPage.getcontactDeleteConfirmationMsg());
		System.out.println(deleteConfirmation);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactDeleteConfirmButton());
		
		Assert.assertTrue(deleteConfirmation.equals("Confirm Deletion"));
		
		Thread.sleep(1000);
	    
	}
	
	@When("^User search the contact using \"([^\"]*)\"$")
	public void user_search_the_contact_using(String Address) throws Exception {
		Thread.sleep(2000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactShowFilterButton());
	    Thread.sleep(1000);
	    scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactSearchField());
	    List<WebElement> searchOptions=scenarioContext.driver.findElements(By.xpath("//div[@name='name'][@role='combobox']/div[2]/div[@role='option']"));
	    for(WebElement option: searchOptions){
	    	if(option.getText().contains("Address")){
	    		
	    		option.click();
	    		
	    	}
	    	
	    	
	    }
	    scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactSearchOperator());
	    scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getcontactSearchOperator(), "Contains");
	    scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getcontactSearchValue(), Address);
	    scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactSearchFilter());
	    Thread.sleep(2000);
	   
	}
	    @Then("^User should see only contacts having matching address$")
	    public void user_should_see_only_contacts_having_matching_address() throws Exception  {
	    	Thread.sleep(2000);
	    	String actualSearch=scenarioContext.testBase.getText(scenarioContext.driver, scenarioContext.contactsPage.getcontactSearchCheck());
	        Assert.assertTrue(actualSearch.equals("Pune"));
	    }
	    
	    @When("^User add a column to be displayed in result grid$")
	    public void user_add_a_column_to_be_displayed_in_result_grid() throws Exception  {
	    	scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactShowFilterButton());
		    Thread.sleep(1000);
		    scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactSearchColumnButton());
		    Thread.sleep(2500);
		    scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactSearchColumnAccess());
		    scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactSearchColumnSetButton());
		    Thread.sleep(1500);
	    }

	    @Then("^Column should be added in result grid$")
	    public void column_should_be_added_in_result_grid() throws Exception {
	    	 Thread.sleep(1500);
	    	List<WebElement> searchColumns=scenarioContext.driver.findElements(By.xpath("//tr/th"));
	    	boolean col= false;
	    	for(WebElement column:searchColumns){
	    		
	    		if(column.getText().contains("Access")){
	    			col=true;
	    		}
	    	
	    	System.out.println(column.getText());
	    	}
	    	Assert.assertTrue(col);
	    	
	        
	    }
	    
	    
	    
	    
	    
	    
	    
}

	




