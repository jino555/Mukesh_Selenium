package SeleniumWebdriver_2;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.oracle.webservices.internal.api.message.PropertySet.Property;

public class GenerateLogs {

	
	
	
	
	public static void main(String[] args)  {
		
		Logger logger=Logger.getLogger("GenerateLogs ");
        
	PropertyConfigurator.configure("log4j2.properties");
		
		//BasicConfigurator.configure();
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			System.setProperty("webdriver.chrome.driver",
					"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			logger.info("Browser opened");
			
			driver.manage().window().maximize();
			logger.info("Browser maximise");
			
			driver.get("https://www.facebook.com/");
			logger.info("url opened");
			
			
			System.out.println(driver.getTitle());
	}

}
