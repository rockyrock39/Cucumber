package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage {
	JavascriptExecutor js;
	/*
	 * @FindAll(value= @FindBy(css = "ul li")) List<WebElement> Textbox1;
	 */
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Checkout']")
	WebElement addtobutton;
	@FindBy(how = How.ID, using = "s-name")
	WebElement name;
	@FindBy(how = How.ID, using = "s-surname")
	WebElement surname;
	@FindBy(how = How.ID, using = "s-address")
	WebElement address;
	@FindBy(how = How.ID, using = "s-zipcode")
	WebElement zipcode;
	@FindBy(how = How.ID, using = "s-city")
	WebElement city;
	@FindBy(how = How.ID, using = "s-company")
	WebElement company;
	@FindBy(how = How.ID, using = "asap")
	WebElement radio;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Buy']")
	WebElement buybutton;
	@FindBy(how = How.ID,using = "order-confirmation")
	WebElement OrgerConfirkm;
	@FindBy(how = How.TAG_NAME,using="html")
	WebElement tagname;
	
	public checkoutpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	  js= (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);

	}

	public void setName(String name1) {
		name.sendKeys(name1);
	}

	public void setSurname(String surname1) {
		 surname.sendKeys(surname1);
	}

	public void setAddress(String address1){
		address.sendKeys(address1);
	}

	public void setZipcode(String zipcode1){
		zipcode.sendKeys(zipcode1);
	}

	public void setCity(String city1){
		city.sendKeys(city1);
	}

	public void setCompany(String company1){
		company.sendKeys(company1);
	}

	public void setRadio(){
		//is.radio = radio;
		radio.click();
	}
	public Boolean isButtonEnable()
	{
		return radio.isEnabled();
	}

	public void clickbuy() throws InterruptedException {
		 //gname.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		//Thread.sleep(5000);
		//js.executeScript("arguments[0].scrollIntoView();", buybutton);
		//js.executeScript("window.scrollBy(0,350)","");
		js.executeScript("document.body.style.zoom = '.7'");
		js.executeScript("arguments[0].click();", buybutton);
		js.executeScript("document.body.style.zoom = '1'");
		 //buybutton.click();
	}
	public String getOrderConfirmation()
	{
		return OrgerConfirkm.getText();
	}
	
	public String CheckoutpageHeader() {
		return addtobutton.getText();
	}
	

}
