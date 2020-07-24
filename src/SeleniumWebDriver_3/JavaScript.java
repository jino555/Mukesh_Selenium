package SeleniumWebDriver_3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class JavaScript {
	static 	WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("alert('Welcome')");
		js.executeScript("prompt('JINO')");

	}

}
