package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindAll(value= @FindBy(css  =  "ul li"))
	List<WebElement> Textbox1;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Checkout']")
	WebElement addtobutton;

	public ShoppingCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}
	public  boolean isitemSelected()
	{
		if(Textbox1.size()>0)
		{
			return true;
		}else
			return false;
		
	}
	
	public void clickcheckout()
	{
		addtobutton.click();
	}

}
