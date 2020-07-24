package SeleniumWebdriver_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(TestNGListener.TestNGListener.class)
public class TestNGListeners {
	
	WebDriver driver;
	
	@Test(priority=0)
	public void verifyBrowser() {
		

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Browser opened");
		

	}
	
	
	@Test(priority=1)
	public void verifyTitle() {
		
		String actualTitle = driver.getTitle();
		System.out.println("Title " + actualTitle);
		Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
	
	
}
}