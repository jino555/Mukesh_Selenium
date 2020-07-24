package SeleniumWebdriver_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POMusingPageFactory {

	WebDriver driver;
	
	@FindBy(id = "email")
	@CacheLookup
	WebElement userName;
	
	
	
	@FindBy(how = How.ID, using = "pass")
	WebElement passWord;
	
	
	public POMusingPageFactory(WebDriver driver1)
	{
		
		this.driver = driver1;
	}
	
	
	
	public void typeEmail(String un) {
		
		
		userName.sendKeys(un);
		
		
	}
	
	
	public void typePassword(String pw) {
		
		passWord.sendKeys(pw);
		
		
		
	}
	
	
	
	
	
	
	
	

}
