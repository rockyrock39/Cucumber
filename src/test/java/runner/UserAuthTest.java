package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\UserAuthentication.feature",glue = "stepDefinations",monochrome = true,dryRun = false,plugin = {"pretty","html:target/customer-reports.html"})
public class UserAuthTest extends AbstractTestNGCucumberTests  {
	
	
}
