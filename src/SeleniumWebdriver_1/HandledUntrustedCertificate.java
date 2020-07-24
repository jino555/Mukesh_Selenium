package SeleniumWebdriver_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandledUntrustedCertificate {

	public static void main(String[] args) {

		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

	

	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver",
			"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://untrusted-root.badssl.com/");
		
		System.out.println("Title " +driver.getTitle());
		
		
		
		/*System.setProperty("webdriver.chrome.driver",
				"E://Jino_testing//Test Automation//Chrome_driver//chromedriver.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		ChromeOptions fir = new ChromeOptions();
		fir.merge(cap);

		
		

		WebDriver driver = new ChromeDriver(fir);
		driver.get("http://www.cacert.org/");
		System.out.println("Title " +driver.getTitle());*/
		
		
		

	}

}
