package stepDefinations;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenuium.OnlineShoppingBasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	WebDriver driver= new ChromeDriver();
	OnlineShoppingBasePage lOnlineShoppingBasePage = new OnlineShoppingBasePage(driver);


	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		// Write code here that turns the phrase above into concrete actions
		lOnlineShoppingBasePage.NevigateOnlineshopping();
		String title = driver.getTitle();
		lOnlineShoppingBasePage.clickonlogin();
		System.out.println("I am on the login page " + title);

	}
	@When("I enter<Login> <password> Valid Credentials")
	public void i_enter_valid_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions

		//System.out.println(login+Password);
		List<Map<String, String>> data=dataTable.asMaps();
		//List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		String Currenthandle =driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		System.out.println("handles"+handles);
		//lOnlineShoppingBasePage.switchwindow(Currenthandle);
		///lOnlineShoppingBasePage.sendLoginId(data.get(0).get("Login"),data.get(0).get("password"));
		//OnlineShoppingBasePage lOnlineShoppingBasePage = new OnlineShoppingBasePage(driver);
		WebElement serachelement1 = driver.findElement(By.xpath("//input[@name='username']"));
		serachelement1.sendKeys(data.get(0).get("Login"));
		WebElement serachelement3 = driver.findElement(By.xpath("//input[@name='password']"));
		serachelement3.sendKeys(data.get(0).get("password"));


	}
	@When("I click the login button")
	public void i_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete 
		WebElement serachelement3 = driver.findElement(By.id("sign_in_btn"));
		serachelement3.click();
	}
	@Then("I should redirected to the dashboard")
	public void i_should_redirected_to_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should redirected to the dashboard");
	}
	
	 @Then("I should see a welcome message")
	 public void i_should_see_a_welcome_message() { 
		 System.out.println("I should see a welcome message");
	 }
	 
}
