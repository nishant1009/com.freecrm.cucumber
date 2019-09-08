package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue={"stepDefination"},
		plugin={"html:target/execution-reports"},
		dryRun=false
		)

public class TestRunner {

}
