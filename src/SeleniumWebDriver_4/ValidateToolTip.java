package SeleniumWebDriver_4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class ValidateToolTip  {

WebDriver driver;

	  @Test
		public void toolTip() throws InterruptedException, MalformedURLException {
	  
	  

		

WindowsUtils.killByName("chromedriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
	driver = new ChromeDriver();

		driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");

	
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	
	String msg = driver.findElement(By.xpath("//div[@class='_5v-0 _53im']//div")).getText();
	
	
	
	//String  msg = driver.findElement(By.xpath("//div[@class='_5v-0 _53im']//div")).getAttribute("innerHTML");
System.out.println("msg is " +msg);
	
	
	
WebElement hover = driver.findElement(By.xpath("//a[@id='gender-help']//i"));
	//Actions act = new Actions(driver);
	
	//act.moveToElement(hover).perform();
	
//String msg = driver.findElement(By.xpath("//span[@id='u_0_z']//following::a")).getAttribute("title");
	//System.out.println("message is " +msg);
	
	
	
	

		
		
		
		
}

}