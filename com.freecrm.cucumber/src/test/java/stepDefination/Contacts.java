package stepDefination;

import java.util.Map;

import org.junit.Assert;

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


}
