package stepDefination;

import org.junit.Assert;

import com.freecrm.base.ScenarioContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contacts {
	
	ScenarioContext scenarioContext;
	
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


}
