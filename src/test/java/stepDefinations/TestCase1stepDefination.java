package stepDefinations;

import org.openqa.selenium.WebDriver;

import Selenuium.TestCaseBasePage;
import base.TestBase;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.*;

public class TestCase1stepDefination {
	WebDriver driver= TestBase.getDriver();
	public TestCase1stepDefination()
	{
		
	}
	
	@Given("User Should be on search Result page")
	public void user_should_be_on_search_result_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	}
	@When("User add item to cart")
	public void user_add_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am on the login page " );
	}
	@Then("Item must be added")
	public void item_must_be_added() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am on the login page " );
	}
	@Given("User is on Home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.getUrl("https://danube-webshop.herokuapp.com/");
		System.out.println("User is on Home page" + driver.getTitle() );
		//org.testng.Assert.assertEquals(title, "Danube WebShop");
	}
	@When("User Search an item {string}")
	public void user_search_an_item(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		//TestCaseBasePage.sendinputtext(string);
		//TestCaseBasePage.clickonsearch();
		System.out.println("User Search an item {string} " );
	}
	@Then("Item must be listed")
	public void item_must_be_listed() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		System.out.println("I am on the login page " );
	}
	
	@Given("User do checkout")
	public void user_do_checkout() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am on the login page " );
	}
	@Then("Should nevigate to Checkout page")
	public void should_nevigate_to_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am on the login page " );
	}
}