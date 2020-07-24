package SeleniumWebdriver_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecuteFailedTestCases {

	
	@Test
	public void verifyTitle() throws Exception{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");

		String actualTitle =driver.getTitle();
		System.out.println("Title "+actualTitle);
		Assert.assertEquals(actualTitle, "FacebooTYk");

	}

}
