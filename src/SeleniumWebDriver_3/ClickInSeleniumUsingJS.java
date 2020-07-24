package SeleniumWebDriver_3;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class ClickInSeleniumUsingJS {

static 	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	driver.get("https://login.yahoo.com/");
	int size =driver.findElements(By.tagName("iframe")).size();
	System.out.println("size of  frame " +size);
	
	
	//driver.findElement(By.id("persistent")).click();
	//driver.findElement(By.xpath("//label[@for='persistent']")).click();

	
	
	

//JavascriptExecutor js = (JavascriptExecutor)driver;
	//By ID
//js.executeScript("document.getElementById('persistent').click()");
	
	
	//By xpath
//	WebElement el =driver.findElement(By.xpath("//label[@for='persistent']"));
	
//	js.executeScript("arguments[0].click()",el);
	


}}
