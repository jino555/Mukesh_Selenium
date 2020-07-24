package SeleniumGridwithBrowserstack;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class setupz {
	
	
	WebDriver driver;
	DesiredCapabilities cap;
	 Cookie cookie ;
	 
	 public static final String USERNAME = "jmaes4";
	  public static final String AUTOMATE_KEY = "ysoyCGTpvzt3CwRYR9xh";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	
	
	@Parameters( {"build","OS","browser", "device"})
	@BeforeTest
	public void startBrowser(String build,String OS , String br, String device)  throws IOException, InterruptedException {
	
		if(build.equals("SIT")||build.equals("UAT")) {
			
			
			if(br.equals("Safari"))
			{		
				cap = DesiredCapabilities.safari();
				  
			}
			
			
		if(br.equals("chrome"))
		{		
			cap = DesiredCapabilities.chrome();
			  
		}
		
		
		if(br.equals("firefox"))  {
			
			cap = DesiredCapabilities.firefox();
		}
		
		

		
			if (OS.equals("Mac")) {
			cap.setPlatform(Platform.MAC);
			}
			
			
			 if(OS.equals("Windows10")) {
			
			cap.setPlatform(Platform.WINDOWS);
			}	
			
			 if(OS.equals("Windows8")) {
				cap.setPlatform(Platform.WIN8);
			}
		
		
			
			 if(device.equals("Google Pixel 3 XL")&&(OS.equals("Android"))) {
				
				cap.setCapability("os_version", "9.0");
				cap.setCapability("device", "Google Pixel 3 XL");
			 }
		
			 if(device.equals("iPhone 8 Plus")&&(OS.equals("iOS"))) {
				 
				 cap.setCapability("os_version", "11");
				 cap.setCapability("device", "iPhone 8 Plus");
				 }
			
				cap.setCapability("real_mobile", "true");
				cap.setCapability("browserstack.local", "false");
				
			
			
			
			
			
			}
		
		
		 
		
		cap.setCapability("project","VanGuard");
		cap.setCapability("name", br +"_" + OS);
	cap.setCapability("build", 	build);
			
		    
	 
		
		
		
		
		driver = new RemoteWebDriver(new URL(URL), cap);
		
		driver.get("https://www.goibibo.com/");

	}	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				

		}
			
			
			
			


