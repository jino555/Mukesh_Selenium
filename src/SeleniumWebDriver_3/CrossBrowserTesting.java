package SeleniumWebDriver_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class CrossBrowserTesting {
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void browser(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			
			
			System.setProperty("webdriver.gecko.driver", "E:\\Jino_testing\\Test Automation\\Gecko driver\\New folder\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		else if(browserName.equalsIgnoreCase("Chrome")) {
			
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			System.setProperty("webdriver.chrome.driver",
					"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		driver = new ChromeDriver();
		
		}
		
		else {
		
			
			System.out.println("Check browser");
		}
		
		
		
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
		
	}
	
	@Test
	
	public void verifyTitle() {
		
		Assert.assertTrue(driver.getTitle().contains("Facebooka"));
	}
	
	
	
	

}
