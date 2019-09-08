package stepDefination;

import org.openqa.selenium.WebDriver;

import com.freecrm.base.ScenarioContext;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Login {
	
	ScenarioContext scenarioContext;
	
	
	public Login(ScenarioContext scenarioContext){
		this.scenarioContext=scenarioContext;
		
		
	}
	
	@Given("^Webdriver is initialized and FreeCrm site is launched$")
	public void webdriver_is_initialized_and_FreeCrm_site_is_launched(){
		scenarioContext.driver=scenarioContext.testBase.initializeWebDriver();
		    
	}
	
	@Given("^User navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.loginPage.getLoginLink());
	   
	}

	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String userName, String password){
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.loginPage.getUserName(), userName);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.loginPage.getPassword(), password);
	    
	}

	@When("^Clicks on Login button$")
	public void clicks_on_Login_button(){
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.loginPage.getLoginButton());
	
	}

	@Then("^Login should be successfull$")
	public void login_should_be_successfull(){
		
		String dealsSummaryActual=scenarioContext.testBase.getText(scenarioContext.driver, scenarioContext.loginPage.getDealsSummary());
		Assert.assertEquals("Deals Summary", dealsSummaryActual);
		System.out.println(dealsSummaryActual);
	}
	
	@Then("^Login should not be successfull$")
	public void login_should_not_be_successfull() throws Throwable {
		
		String invalidLoginMsg=scenarioContext.testBase.getText(scenarioContext.driver, scenarioContext.loginPage.getinvalidLoginMessage());
		Assert.assertEquals("Something went wrong...", invalidLoginMsg);
		System.out.println(invalidLoginMsg);
	}
	
	@After
	public void tearDown(){
		scenarioContext.driver.quit();
	}




}