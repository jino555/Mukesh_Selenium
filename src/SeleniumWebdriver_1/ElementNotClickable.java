package SeleniumWebdriver_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementNotClickable {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		
		
		
		//WebElement  el = driver.findElement(By.id("persistent"));

		int x= driver.findElement(By.id("persistent")).getLocation().getX();
		
	//	el.click();
		
	//	System.out.println("Y " +el);
	//	int y = driver.findElement(By.xpath("//label[text()='Stay signed in']")).getLocation().getY();
	//Thread.sleep(3000);	
	//driver.findElement(By.id("persistent")).click();
		
		//driver.findElement(By.xpath("//label[text()='Stay signed in']")).click();
	//System.out.println("X " +x);
System.out.println("X cordinate " +x);
driver.findElement(By.id("persistent")).click();
		//Actions act = new Actions(driver);
		//act.moveToElement(el).build().perform();
		//WebDriverWait wait = new WebDriverWait(driver,40);
	//	wait.until(ExpectedConditions.elementToBeClickable(el));
//	el.click();
		
		
	}

}
