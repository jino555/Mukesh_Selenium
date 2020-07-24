package SeleniumWebDriver_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class TypeInSeleniumUsingJS {
	static WebDriver driver;
	
	public static void main(String[] args) {
		

		
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			System.setProperty("webdriver.chrome.driver",
					"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			
			driver.get("https://www.goibibo.com");
			
			driver.findElement(By.linkText("Sign In")).click();
			driver.switchTo().frame("authiframe");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement el =driver.findElement(By.id("authMobile"));
		//	js.executeScript("arguments[0].value='jino'", el);
			
			js.executeScript("document.getElementById('mobileSubmitBtn').click()");
	}

}
