package SeleniumWebDriver_3;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	 protected WebDriver driver;

	

	
	
	@BeforeMethod
	public void setUpApplication() {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		 driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Browser opened");
		
	}

	
	
	
	@AfterTest
	public void close() {
		
		driver.close();
		System.out.println("Browser closed");
	}
	
}
