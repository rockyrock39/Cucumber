package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\testcase1.feature",glue = "stepDefinations")

public class testCase1Runner extends AbstractTestNGCucumberTests {

}
