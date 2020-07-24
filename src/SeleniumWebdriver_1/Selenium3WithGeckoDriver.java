package SeleniumWebdriver_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium3WithGeckoDriver {

	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver",
	"E:\\Jino_testing\\Test Automation\\Gecko driver\\gecko0.26\\geckodriver.exe");

	
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	//	driver.get("https://www.google.com/");
		driver.get("https://untrusted-root.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
	//	driver.close();
	

	}

}
