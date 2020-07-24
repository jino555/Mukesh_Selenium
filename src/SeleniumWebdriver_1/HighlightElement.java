package SeleniumWebdriver_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {
	
	
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/");
		
		WebElement el =driver.findElement(By.id("gosuggest_inputSrc"));
		
		hightlightElement(driver, el);
		
		
		
		WebElement el1 =driver.findElement(By.id("gosuggest_inputDest"));
		
		hightlightElement(driver, el1);
		
		
		
	}
	
		public static  void hightlightElement(WebDriver driver, WebElement element) throws InterruptedException {
		
			
			
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
	
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');", element);
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", element);
		
		
			
		}
		
		}
		
		
		

	


