package stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenuium.TestCaseBasePage;
import base.TestBase;
import org.testng.Assert;
import io.cucumber.java.en.*;
import page.HomePage;
import page.Searchpage;
import page.ShoppingCartPage;
import page.checkoutpage;
import io.cucumber.datatable.DataTable;

public class TestCase1stepDefination {
	WebDriver driver= TestBase.getDriver();
	HomePage homepage;
	Searchpage searchpage;
	ShoppingCartPage shoppingCartPage;
	checkoutpage Checkoutpage;
	public TestCase1stepDefination()
	{
		homepage= new HomePage(driver);
		searchpage= new Searchpage(driver);
		shoppingCartPage = new ShoppingCartPage(driver);
		Checkoutpage =  new checkoutpage(driver);
	}
	
	@Given("User Should be on search Result page")
	public void user_should_be_on_search_result_page() {
	    // Write code here that turns the phrase above into concrete actions
		searchpage.vewitemsdetails();
		System.out.println("User Should be on search Result page" );
	}
	
	@When("User add item to cart")
	public void user_add_item_to_cart() {
		// Write code here that turns the phrase above into concrete actions

		searchpage.addtocart();

		System.out.println("I am on the login page ");
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
		homepage.sendSearchData(string);
		homepage.searchbutton();
		System.out.println("User Search an item {string} " );
	}
	@Then("Item must be listed")
	public void item_must_be_listed() {
	    // Write code here that turns the phrase above into concrete actions
		org.testng.Assert.assertTrue(searchpage.isButtonenable());
		System.out.println("Item must be listed" );
	}
	
	@Given("User do checkout")
	public void user_do_checkout() {
	    // Write code here that turns the phrase above into concrete actions

		shoppingCartPage.clickcheckout();
		System.out.println("User do checkout" );
	}
	@Then("Should nevigate to Checkout page")
	public void should_nevigate_to_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		String checout=Checkoutpage.CheckoutpageHeader();
		Assert.assertEquals(checout, "Checkout");
		System.out.println("Should nevigate to Checkout page" + checout);
	}
	
	@Then("user should fill out the form and click buy")
	public void user_should_fill_out_the_form_and_click_buy(DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> data=dataTable.asMaps();
		Checkoutpage.setName(data.get(0).get("name"));
		Checkoutpage.setAddress(data.get(0).get("address"));
		Checkoutpage.setSurname(data.get(0).get("surname"));
		Checkoutpage.setCity(data.get(0).get("city"));
		Checkoutpage.setZipcode(data.get(0).get("zipcode"));
		Checkoutpage.setCompany(data.get(0).get("company"));
		Checkoutpage.setRadio();
		Checkoutpage.ZoomOut();
		Checkoutpage.clickbuy();
		Checkoutpage.backtoNormal();
		
		Assert.assertEquals(Checkoutpage.getOrderConfirmation(), "All good, order is on the way. Thank you!!");

		
		
	}

}
