package SeleniumWebdriver_2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WriteExcelFileConfigClass {
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver",
			"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	
}


@Test
public void validation() {
	
	String actualTitle =driver.getTitle();
	System.out.println("Title "+actualTitle);
	Assert.assertEquals(actualTitle, "Facebook");
}
	
	
	
	
		
	@AfterMethod
		public void afterMethod(ITestResult result) throws IOException {
		
		
		if(result.getStatus()==ITestResult.FAILURE) {
		
			WriteExcelValueConfig config = new WriteExcelValueConfig("E:\\Jino_testing\\Automation_project\\MukeshSelenium\\WriteExcel.xlsx");
			config.setData(0, 2, 2, "FAIL");
		}
			else if (result.getStatus()==ITestResult.SUCCESS)	{
				
				WriteExcelValueConfig config = new WriteExcelValueConfig("E:\\Jino_testing\\Automation_project\\MukeshSelenium\\WriteExcel.xlsx");
				config.setData(0, 3, 2, "PASS");
			}
			
		
			}

	


}
