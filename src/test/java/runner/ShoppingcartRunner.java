package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\shoppingcart.feature",glue = "stepDefinations",monochrome = true)

public class ShoppingcartRunner extends AbstractTestNGCucumberTests  {

}
