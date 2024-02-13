package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindBy(how = How.CSS, using = "ul li.preview")
	WebElement Textbox1;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add to cart')]")
	WebElement addtobutton;

	public ShoppingCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

}
