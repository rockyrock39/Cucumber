package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\googlesearch.feature",glue = "stepDefinations")


public class GoogleSearchRunner  extends AbstractTestNGCucumberTests  {

}
