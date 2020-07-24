package SeleniumWebdriver_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		driver.get("https://www.goibibo.com/");
		// driver.navigate().to("https://www.goibibo.com/");
		driver.findElement(By.linkText("Sign In")).click();

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Size of frames " + size);
  
// FLOW---frame 1(Sign in popup) ===>action perfomed on close button(parent window)==>frame 2(See How)
		
	/*	driver.switchTo().frame("authiframe");// id
		
// WebElement frame = driver.findElement(By.xpath("//iframe[@id='authiframe']"));webelement using xpath
// WebElement frame = driver.findElement(By.id("authiframe"));webelement using  id

		// driver.switchTo().frame(frame); // webelement
		Thread.sleep(2000);
		driver.findElement(By.id("authMobile")).sendKeys("9745754904");
	

		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		

		driver.findElement(By.xpath("//a[@class='fr icon-close font12Lt popClose']")).click();

		
		// direct used frame name

		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("notification-frame-~10cb64576"));

		// driver.switchTo().frame(frame2);

		WebElement el = driver.findElement(By.xpath("//button[text()='SEE HOW']"));

		wait.until(ExpectedConditions.visibilityOf(el)).click();

		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Sign In")).click();*/

	

	
// frame 1 direct switch to frame 2 --frame1(login popup) =>default content
				// => switch to frame 2 (SEE How)

	Thread.sleep(2000);
		driver.switchTo().frame("authiframe");
	driver.findElement(By.id("authMobile")).sendKeys("9745754904");
	driver.switchTo().defaultContent();
	
	
	 
	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("notification-frame-~10cb64576"));

		// driver.switchTo().frame(frame2);

		WebElement ele = driver.findElement(By.xpath("//button[text()='SEE HOW']"));

		wait.until(ExpectedConditions.visibilityOf(ele)).click();

	
}
}