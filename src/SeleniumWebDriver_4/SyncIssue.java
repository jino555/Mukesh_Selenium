package SeleniumWebDriver_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

class SyncIssue {

	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

	System.setProperty("webdriver.chrome.driver",
			"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	SyncIssue.isElementPresnt(driver,"//input[@name='firstname']", 3);
	
	
	
	
}
		
		public static WebElement isElementPresnt(WebDriver driver,String xpath,int time)
		{
		 
		 
		WebElement ele = null;
		 
		for(int i=0;i<time;i++)
		{
		try{
		ele=driver.findElement(By.xpath(xpath));
		break;
		
		
		}
		
		catch (Exception e)
		
		
		{
			
			System.out.println("Waiting for element to appear on DOM in " +i + " seconds");
			}
			
			
			
		}
		
		return ele;
		 
		
		
		}
		 
		
		
		
		
		
}
