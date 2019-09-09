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
	public String contactDescription;
	
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
	public void user_clicks_on_Save_button(){
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContactSaveButton());
	    
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
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContact());
		Thread.sleep(2000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getcontactEditButton());
		
		
	   
	}

	@When("^Saves the Contact$")
	public void saves_the_Contact(DataTable credentials){
		for(Map<String,String> data : credentials.asMaps(String.class, String.class)){
			
			scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getContactDescription(), data.get("Description"));
			contactDescription= data.get("Description");
			scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.contactsPage.getContactCity(), data.get("City"));
			scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.contactsPage.getContactSaveButton());
		}
		
	   
	}

	@Then("^Contact should be saved successfully$")
	public void contact_should_be_saved_successfully() {
		String descriptionCheck=scenarioContext.testBase.getText(scenarioContext.driver, scenarioContext.contactsPage.getcontactDescriptionCheck());
	    System.out.println(descriptionCheck);
	    //Assert.assertEquals(contactDescription, descriptionCheck);
	    Assert.assertTrue(contactDescription.equals(descriptionCheck));
	}
	
	


}
