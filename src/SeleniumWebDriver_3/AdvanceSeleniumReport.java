package SeleniumWebDriver_3;

import org.testng.Assert;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import SeleniumWebdriver_1.Screenshot;



public class AdvanceSeleniumReport {
	
	 WebDriver driver;
	 ExtentReports log;
	@Test
	public void openApplication() {

		
		log = ExtentReports.get(AdvanceSeleniumReport.class);
		
		log.init(".\\Extent1\\Extentreport1.html" , true);

		log.startTest("openApplication");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
  log.log(LogStatus.INFO, "Browser opened");
		System.out.println("Browser opened");

		driver.findElement(By.id("email")).sendKeys("jino");
		driver.findElement(By.id("pass")).sendKeys("9734444");
		log.log(LogStatus.INFO, "Details are entered");
		
	}
	
	
	
		@Test
		public void  verifyTitle() throws IOException {
			log.startTest("verifyTitle");
			log.log(LogStatus.INFO, "fetching title");
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		
		
		log.log(LogStatus.INFO, "Title verfied");
		String screecap = 	Screenshot.takesScreenshot(driver);
		
		log.attachScreenshot(screecap);
	
	log.endTest();
		
		
		}
		
		
		
}

