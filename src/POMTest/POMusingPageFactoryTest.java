package POMTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import SeleniumWebdriver_2.POMusingPageFactory;

public class POMusingPageFactoryTest {

	@Test
	public void verifyLogin() {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

	System.setProperty("webdriver.chrome.driver",
			"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com//");
	
	POMusingPageFactory log = PageFactory.initElements(driver, POMusingPageFactory.class);
	System.out.println("return page object of same class "+log);
	log.typeEmail("jinoph");
	log.typePassword("97455754904");
	
	
	
	
	
	
	
	
	
	
	
}
}
