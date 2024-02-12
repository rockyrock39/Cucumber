package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shoppingcartSteopdefination {
	

@Given("I have items in the cart")
public void i_have_items_in_the_cart() {
    // Write code here that turns the phrase above into concrete actions
System.out.println("I have items in the cart");}
@When("I remove the item from the cart")
public void i_remove_the_item_from_the_cart() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("I remove the item from the cart");
}
@Then("the item should be removed successfully")
public void the_item_should_be_removed_successfully() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the item should be removed successfully");
}

@Given("I am on the product page")
public void i_am_on_the_product_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("I am on the product page");
}
@When("I add the item to the cart")
public void i_add_the_item_to_the_cart() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("I add the item to the cart");
}
@Then("the item should be added successfully")
public void the_item_should_be_added_successfully() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the item should be added successfully");
}

@When("I view the cart")
public void i_view_the_cart() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("I view the cart");
}
@Then("I should see the items in the cart")
public void i_should_see_the_items_in_the_cart() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("I should see the items in the cart");
}
}
