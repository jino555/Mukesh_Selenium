package SeleniumWebdriver_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Framediffcombination {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");
//WindowsUtils.killByName("chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,10);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		// driver.navigate().to("https://www.goibibo.com/");
		driver.findElement(By.linkText("Sign In")).click();
		
		//1-OK
		
//driver.switchTo().frame("authiframeh");// id
	//WebElement el =driver.findElement(By.id("authMobile"));
//	el.sendKeys("9745754904");
		
	//driver.findElement(By.id("authMobile")).sendKeys("9745754904");
	
	
		
		
		
	
		//2 -OK
		
//WebElement frame = driver.findElement(By.id("authifraume"));
	//	driver.switchTo().frame(frame);
	//	driver.findElement(By.id("authMobile")).sendKeys("9745754905");

		//3--OK
	//WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='authiframe']"));
		
//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
	//	driver.findElement(By.id("authMobile")).sendKeys("9745754907");
		
		
		//4 --OK
		
//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("authifram"));
//driver.findElement(By.id("authMobile")).sendKeys("90957031080");
//		
		//5 -OK
		 WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='authiframef']"));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
	//	driver.findElement(By.id("authMobile")).sendKeys("9745754901");
		
		//6--OK
		//WebElement frame = driver.findElement(By.id("authiframe"));
	//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
	//driver.findElement(By.id("authMobile")).sendKeys("9745754900");
	
		
		//--7--OK
			//	WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/accounts/login/?iframe=1&next=https%3A%2F%2Fwww.goibibo.com%2F'] "));
				
				
		//		driver.switchTo().frame(frame1);
			//		driver.findElement(By.id("authMobile")).sendKeys("9745754905");
				
				
				
		//8--OK
//WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/accounts/login/?iframe=1&next=https%3A%2F%2Fwww.goibibo.com%2F'] "));
		
		
	//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
	//	driver.findElement(By.id("authMobile")).sendKeys("9745754902");
		
		
		
		
		
			
		//********************************************************************//
		
		
		//1-OK
		
	Thread.sleep(9000);
		
		
		
///driver.switchTo().frame("notification-frame-~251442c09");// NAME
//WebElement button =driver.findElement(By.xpath("//a[text()='I am in']"));
	//	System.out.println("Title " +button.getText());
	
		
		//2--OK
//WebElement frame2 = driver.findElement(By.name("notification-frame-~251442c09"));

//driver.switchTo().frame(frame2);
		//Thread.sleep(2000);
//WebElement button =driver.findElement(By.xpath("//a[text()='I am in']"));
//System.out.println("Titled is " +button.getText());
	
		
		//3--OK
	//WebElement frame2 = driver.findElement(By.xpath("//iframe[@name='notification-frame-~251442c09']"));
	
//driver.switchTo().frame(frame2);
//Thread.sleep(2000);
//WebElement button =driver.findElement(By.xpath("//a[text()='I am in']"));
//System.out.println("Title ss is " +button.getText());
		
		
		
//4 OK
//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("notification-frame-~251442c09"));
	//WebElement button =driver.findElement(By.xpath("//a[text()='I am in']"));
//System.out.println("Title  is " +button.getText());
		
		//5 OK
		
//WebElement frame2 = driver.findElement(By.xpath("//iframe[@name='notification-frame-~251442c09']"));

//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame2));

//WebElement button =driver.findElement(By.xpath("//a[text()='I am in']"));
//System.out.println("Title  " +button.getText());
	
	
	
	//6 OK
	//	WebElement frame2 = driver.findElement(By.name("notification-frame-~251442c09"));

		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame2));

		//WebElement button =driver.findElement(By.xpath("//a[text()='I am in']"));
		//System.out.println("Title  " +button.getText());
	
	//7-OK
		
	//	WebElement frame = driver.findElement(By.xpath("//iframe[@data-notification-layout-id='~20cc49c3']"));
	//	driver.switchTo().frame(frame);
	//	WebElement button =driver.findElement(By.xpath("//a[text()='I am in']"));
		//System.out.println("Title sssw  " +button.getText());
	
		
		//8 OK
	
	
		//WebElement frame = driver.findElement(By.xpath("//iframe[@data-notification-layout-id='~20cc49c3']"));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		//WebElement button =driver.findElement(By.xpath("//a[text()='I am in']"));
		//	System.out.println("Title w  " +button.getText());
		
	
	}
	
	
	

}
