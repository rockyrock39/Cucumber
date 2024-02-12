package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\addparam.feature",glue = "stepDefinations")
public class Addparam extends AbstractTestNGCucumberTests
{
	
	
}
