package SeleniumWebdriver_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMwoPageFactory {

	WebDriver driver;
	
	By emailId = By.id("email");
	By passWord =  By.id("pass");
	
	
	
	public POMwoPageFactory(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	
	public void typeEmail(String un) {
		
		
		driver.findElement(emailId).sendKeys(un);
		
		
	}
	
	
	public void typePassword(String pw) {
		
		driver.findElement(passWord).sendKeys(pw);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
