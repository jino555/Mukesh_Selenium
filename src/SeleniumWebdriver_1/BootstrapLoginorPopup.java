package SeleniumWebdriver_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import javafx.scene.control.Alert;

public class BootstrapLoginorPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vanguardcharitable.org/open-an-account/consent/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Policies & Guidelines")).click();
		Thread.sleep(3000);
		
		String value  = driver.findElement(By.xpath("(//h4[@class='mB-T2B']) [1]")).getText();
		
	         System.out.println("Text is " +value);
		driver.findElement(By.xpath("//button[@id='tc_okay_Btn']")).click();
	         
		
		
	/*	driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign In")).click();

		Thread.sleep(2000);
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Size of frames " + size);
	driver.switchTo().frame("authiframe");// id
	
	
		Thread.sleep(2000);
		driver.findElement(By.id("authMobile")).sendKeys("9745754904");
	

		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		

		driver.findElement(By.xpath("//a[@class='fr icon-close font12Lt popClose']")).click();
	
		*/
		
	}

}
