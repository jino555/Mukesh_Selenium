package SeleniumWebDriver_3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import SeleniumWebdriver_1.Screenshot;

public class AttachScreenshotExtentAndScreenShotOnFailure {
	
	
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports extent ;
	ExtentTest logger;
	
	/*@BeforeMethod
//public void setUp() {
		
		
		 reporter = new ExtentHtmlReporter ("./extent3/Extentreportee3.html");
		  extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 
	}
	*/

	@Test
	public void openurl() {

		 reporter = new ExtentHtmlReporter ("./extent3/Extentreport3.html");
		  extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 logger =extent.createTest("openurl");
		 
		
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		logger.log(Status.INFO, "Application opened");
	
	
}
	
	
	@Test
	public void  validateTitle() {
		
	 logger =extent.createTest("validateTitle");
		logger.log(Status.INFO, "Title fetching");
	Assert.assertTrue(driver.getTitle().contains("Facebookdd"));
	
	logger.log(Status.INFO, "Title verified");
	
	
	
	}
	
	
	
	@AfterMethod
	
	public void close(ITestResult result) throws IOException{
	if(result.getStatus()==ITestResult.FAILURE )
	
	{
	
		
		String screecap = 	Screenshot.takesScreenshot(driver);
	
		logger.log(Status.FAIL, "Test case FAILED");
		

		logger.fail( result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screecap).build());
		
	}
	
	if(result.getStatus()==ITestResult.SUCCESS )
		
	{
	
		
		String screecap = 	Screenshot.takesScreenshot(driver);
	
	
		

		logger.pass("Test Case is passed" ,MediaEntityBuilder.createScreenCaptureFromPath(screecap).build());
		
	}
	
	extent.flush();
	

	}
	
	
	
	
	
}
