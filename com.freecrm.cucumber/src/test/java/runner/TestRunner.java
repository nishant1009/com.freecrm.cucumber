package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue={"stepDefination"},
		format={"pretty", "html:target/Destination"},
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/FreeCrmTestReport.html "},
		dryRun=false,
		monochrome=true
		)

public class TestRunner {
	
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Nishant Gupta");
	Reporter.setSystemInfo("Application Name", "Free Crm App ");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "QA Env");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	
	}

}
