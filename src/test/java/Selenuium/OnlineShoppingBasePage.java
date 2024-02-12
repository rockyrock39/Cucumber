package Selenuium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;

public class OnlineShoppingBasePage {
	WebDriver driver;

	public OnlineShoppingBasePage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
		//PageFactory.initElements(driver, this);
	}

	//@FindBy(how = How.XPATH, using ="//input[@name=\"username\"]")
	//WebElement serachelement1;

	public void NevigateOnlineshopping() {
		driver.get("https://advantageonlineshopping.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void clickonlogin()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement serachelement= driver.findElement(By.id("menuUser"));
		js.executeScript("arguments[0].scrollIntoView();", serachelement);		
		serachelement.click();
		//serachelement.sendKeys(keyword);
		//serachelement.sendKeys(Keys.ENTER);
	}
	public void sendLoginId(String loginid,String Password)
	{WebElement serachelement1= driver.findElement(By.xpath("//input[@name='username']"));
	
		serachelement1.clear();
		serachelement1.click();
		serachelement1.sendKeys(loginid);
	}
	
	public void switchwindow(String Currenthandle) {
		
		System.out.println("Current handle"+ Currenthandle);
		Set<String> handles=driver.getWindowHandles();
		for (String handle : handles)
		{
			if (handle.trim().equals(Currenthandle.trim()))
			{
				System.out.println("Titlekjqhiuwh" );
			}
			else {
			driver.switchTo().window(handle);
			
			System.out.println("Title"+ driver.getTitle());
			
			}
			//driver.close();
			
		}
		
		
	
		
	}	

}
