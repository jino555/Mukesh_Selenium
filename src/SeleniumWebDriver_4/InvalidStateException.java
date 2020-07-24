package SeleniumWebDriver_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class InvalidStateException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bulma.io/documentation/form/radio/");

		// input
		//driver.findElement(By.xpath("//input[@placeholder='Disabled input']")).sendKeys("jino");

		
		// checkbox
		// driver.findElement(By.xpath("(//label[@class='checkbox'])[3]"));

		Thread.sleep(1000);
		// radio
		driver.findElement(By.xpath("(//label[@class='radio'])")).click();
		
	

		 JavascriptExecutor js = (JavascriptExecutor)driver;

		

		// WebElement el =driver.findElement(By.xpath("//input[@placeholder='Disabled input']"));

		// WebElement
		//el=driver.findElement(By.xpath("(//label[@class='checkbox'])[3]"));

		// WebElement el= driver.findElement(By.xpath("(//label[@class='radio'])[6]"));
		// js.executeScript("arguments[0].click()", el);
	}

}
