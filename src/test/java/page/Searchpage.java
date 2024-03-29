package page;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {

	@FindBy(how = How.CSS, using = "ul li.preview")
	WebElement Textbox1;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add to cart')]")
	WebElement addtobutton;

	public Searchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	public void vewitemsdetails() {
		Textbox1.click();
	}

	public boolean isButtonenable() {
		return Textbox1.isDisplayed();
	}

	public void addtocart()

	{
		addtobutton.click();
	}

}
