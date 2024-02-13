package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(how = How.XPATH ,using ="//input[@type='text']")
	WebElement Textbox;
	@FindBy(how = How.ID ,using ="button-search")
	WebElement searchbutton;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
		
	}

}
