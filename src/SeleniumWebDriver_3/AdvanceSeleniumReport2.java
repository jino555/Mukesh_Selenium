package SeleniumWebDriver_3;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import SeleniumWebdriver_1.Screenshot;

public class AdvanceSeleniumReport2 {

	WebDriver driver;

	ExtentTest logger;
	ExtentReports report;

	@Test
	public void openApplication() {

		report = new ExtentReports(".\\Extent2\\Extentreport2.html", true);

		logger = report.startTest("openApplication");

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "browser started");
		driver.get("https://www.facebook.com/");

	}

	@Test
	public void validateTitle() {

	
			logger = report.startTest("validateTitle");
			logger.log(LogStatus.INFO, driver.getTitle());
			
			Assert.assertTrue(driver.getTitle().contains("Facebookdd"), "Assertion error");
			
			
			
			
		

	}

	@AfterMethod

	public void close(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE)

		{

			String screecap = Screenshot.takesScreenshot(driver);
			String img = logger.addScreenCapture(screecap);

			logger.log(LogStatus.FAIL, "Test case failed");
			
			logger.log(LogStatus.FAIL, result.getThrowable().getMessage());
			logger.log(LogStatus.FAIL, img);
		}

		else if (result.getStatus() == ITestResult.SUCCESS)

		{

			String screecap = Screenshot.takesScreenshot(driver);
			String img = logger.addScreenCapture(screecap);
			logger.log(LogStatus.PASS, "Test case passed");
			logger.log(LogStatus.PASS, img);

		}

		report.endTest(logger);
		report.flush();

	}
}
