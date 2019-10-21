package stepDefination;

import org.junit.Assert;

import com.freecrm.base.ScenarioContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Deals {
	
	ScenarioContext scenarioContext;
	String expectedCommission="150";
	
	
	public Deals(ScenarioContext scenarioContext){
		this.scenarioContext=scenarioContext;
				
	}
	
	@Given("^User is present on Deals Page$")
	public void user_is_present_on_Deals_Page() throws Throwable {
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getDealsLink());
	    
	}

	@When("^User clicks on New Deal button$")
	public void user_clicks_on_New_Deal_button() throws Throwable {
		Thread.sleep(2000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getNewDealButton());
	    
	}

	@When("^enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" and Saves the deal$")
	public void enters_and_and_Saves_the_deal(String title, String description, String probability, String amount) throws Throwable {
		int randNumber=scenarioContext.randomNumberGeneration.getRandomNumber();
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.dealsPage.getTitle(), title+"_"+randNumber);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.dealsPage.getDescription(), description);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.dealsPage.getProbability(), probability);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.dealsPage.getAmount(), amount);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getdealsSaveButton());
		
	   
	}

	@Then("^deal should be created successfully$")
	public void deal_should_be_created_successfully() throws Throwable {
		
		Assert.assertTrue(scenarioContext.testBase.checkEnable(scenarioContext.driver, scenarioContext.dealsPage.getdealsIcon()));
	   
	}
	
	@When("^User selects the Deal to edit and clicks on Edit button$")
	public void user_selects_the_Deal_to_edit_and_clicks_on_Edit_button() throws Exception {
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getDeal());
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.geteditDealButton());
		Thread.sleep(2000);
	  
	}

	@When("^User updates \"([^\"]*)\" and saves the deal$")
	public void user_updates_and_saves_the_deal(String commission) throws Exception {
		Thread.sleep(2000);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.dealsPage.getDealsCommission(), commission);
		Thread.sleep(2000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getdealsSaveButton());
	    
	}

	@Then("^Deal should be editted successfully$")
	public void deal_should_be_editted_successfully() throws Exception {
		Thread.sleep(2000);
		String actualCommission=scenarioContext.testBase.getText(scenarioContext.driver, scenarioContext.dealsPage.getdealEditCheck());
		Assert.assertTrue(expectedCommission.equals(actualCommission));
		   
	}
	
	@Given("^Deals exists in CRM application$")
	public void deals_exists_in_CRM_application() throws Exception {
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getDealsLink());
		
		Thread.sleep(2000);
		
	    
	}

	@When("^User selects Deal and deletes the selected Deal$")
	public void user_selects_Deal_and_deletes_the_selected_Deal() throws Exception{
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getDeal());
		Thread.sleep(2000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getdealsDeleteDropdown());
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getdealsDeleteDropdownOption());
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getdealDeleteButton());
		Thread.sleep(1500);
		
	    
	}

	@Then("^selected Deal should be deleted successfully$")
	public void selected_Deal_should_be_deleted_successfully() throws Exception{
		String actualDeleteConfirmationMsg=scenarioContext.testBase.getText(scenarioContext.driver, scenarioContext.dealsPage.getdealDeleteConfirmationMsg());
	    System.out.println(actualDeleteConfirmationMsg);
	    Thread.sleep(1000);
	    Assert.assertTrue(actualDeleteConfirmationMsg.equals("Confirm Deletion"));
	    scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.dealsPage.getdealDeleteConfirmButton());
	}

}
