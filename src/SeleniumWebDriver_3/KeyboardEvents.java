package SeleniumWebDriver_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Actions act = new Actions(driver);
	act.sendKeys("jino")
		
		.sendKeys(Keys.TAB).sendKeys("philip")
		.sendKeys(Keys.TAB)
		//.sendKeys(Keys.ENTER)
		//.sendKeys(Keys.F12)
		.build().perform();
		
		
		
		
		

	}

}
