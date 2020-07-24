package SeleniumWebdriver_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumWithIEDriver {
	
	
	
	public static void main(String []args) {
	//System.setProperty("webdriver.ie.driver","E:\\Jino_testing\\Test Automation\\IEDriver\\IE_32bit\\IEDriverServer.exe");
	//System.setProperty("webdriver.ie.driver","E:\\Jino_testing\\Test Automation\\IEDriver\\IE_64bit\\IEDriverServer.exe");
System.setProperty("webdriver.edge.driver",
		"E:\\Jino_testing\\Test Automation\\IEDriver\\IE edge driver\\edge\\msedgedriver.exe");
	
	//WebDriver driver = new InternetExplorerDriver();

	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	System.out.println(driver.getTitle());
	driver.findElement(By.id("email")).sendKeys("Jino");
	
	
	
	
	}
	
	
	
	
	
	

}
