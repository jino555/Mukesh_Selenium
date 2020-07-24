package SeleniumWebdriver_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/");
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebDriverWait wait = new WebDriverWait(driver,40);
		//WebElement frame2 = driver.findElement(By.name("notification-frame-~10cb64576"));
	
		
		
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("notification-frame-~10cb64576"));
	
			
	//driver.switchTo().frame(frame2);
		
	WebElement el =	driver.findElement(By.xpath("//button[text()='SEE HOW']"));

	
	
	
	wait.until(ExpectedConditions.visibilityOf(el));
	
	el.click();
           
	
	
	}

}
