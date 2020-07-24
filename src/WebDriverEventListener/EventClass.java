package WebDriverEventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EventClass {

	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver event1=new EventFiringWebDriver(driver);
		ActivityCapture handle=new ActivityCapture();
		
		
		event1.register(handle);
		event1.manage().window().maximize();
		//event1.get("http://www.facebook.com/");
		//event1.findElement(By.id("email")).sendKeys("jino");
		event1.get("https://bulma.io/documentation/form/input/");
		
	JavascriptExecutor js =	(JavascriptExecutor)driver;

		WebElement el =event1.findElement(By.xpath("//input[@placeholder='Disabled input']"));
		js.executeScript("arguments[0].value ='jino'", el);
		
		
		event1.unregister(handle);
	}

}
