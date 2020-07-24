package SeleniumWebDriver_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

static 	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

	driver.get("https://www.goibibo.com/");
	
		
		Actions act = new Actions(driver);
		//Right click on a webelement
		
WebElement search = driver.findElement(By.xpath("//button[text()='SEARCH']"));
act.contextClick(search).perform();
	
	//Double click on a webelement
		
	//	WebElement text = driver.findElement(By.xpath("//span[text()='Bus']"));
		//WebElement text1 = driver.findElement(By.xpath("//span[text()='Cabs']"));
		
		
		
		//act.click(text).perform(); //Click
		//act.doubleClick(text1).perform();
System.out.println("Clicked");
	
	
	}

}
