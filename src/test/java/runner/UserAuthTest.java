package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\UserAuthentication.feature",glue = "stepDefinations")
public class UserAuthTest extends AbstractTestNGCucumberTests  {
	
	
}
