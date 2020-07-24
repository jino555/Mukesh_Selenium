package SeleniumWebDriver_4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumLogs {

static 	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
//System.setProperty("webdriver.chrome.driver",
		//		"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");


	//System.setProperty("webdriver.chrome.logfile",".\\chrome.txt");
		
		
		
	System.setProperty("webdriver.gecko.driver",
			"E:\\Jino_testing\\Test Automation\\Gecko driver\\gecko0.26\\geckodriver.exe");
		
	
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE , "./firefoxlog.txt");

	driver = new FirefoxDriver();
					
				
	//	driver = new ChromeDriver();

		driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("jino");
	driver.findElement(By.id("pass")).sendKeys("9745754904");
	

	}

}