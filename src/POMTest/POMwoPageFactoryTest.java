package POMTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import SeleniumWebdriver_2.POMusingPageFactory;
import SeleniumWebdriver_2.POMwoPageFactory;

public class POMwoPageFactoryTest {

	/*
	 * @author Jino Philip
	 * 
	 * 
	 */
	@Test
	public void verifyLogin() {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com//");

		POMwoPageFactory log =	new POMwoPageFactory(driver);	
		
		
		log.typeEmail("jinophilip");
		log.typePassword("9745754904");
				
		
		
		
		
		
		
		
	}

}
