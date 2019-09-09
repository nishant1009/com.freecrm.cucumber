package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="\\Users\\dell\\git\\com.freecrm.cucumber\\com.freecrm.cucumber\\features\\Contacts.feature",
		glue={"stepDefination"},
		plugin={"html:target/execution-reports"},
		dryRun=false
		)

public class TestRunner {

}
