package SeleniumWebdriver_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownInAscendingDescending {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");

	System.out.println(driver.getTitle());
	
	System.out.println("************************");
	
	List actualList= new ArrayList();
	

	WebElement month = driver.findElement(By.id("country"));
	Select se = new Select(month);
	
	List<WebElement> list = se.getOptions();
	
	
	
	for(WebElement el : list) {
		
		String values = el.getText();
		System.out.println("Dropdown values "+values);
		actualList.add(values);
		
		
	}
	
	List temp = new ArrayList();
	
	temp.addAll(actualList);
	
	//ASCENDING
	Collections.sort(temp);
	
	//DESCENDING
	//Collections.reverse(temp);
	
	System.out.println("Ascending  values" +temp);
	System.out.println("Actual Values in the application dropdown" +actualList);
	
	
	Assert.assertTrue(actualList.equals(temp));
	
}

}
