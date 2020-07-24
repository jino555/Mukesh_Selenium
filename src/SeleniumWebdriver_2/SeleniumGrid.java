package SeleniumWebdriver_2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid {

	
	
	WebDriver driver;	
	public static final String USERNAME = "jino7";
	  public static final String AUTOMATE_KEY = "fbeRxBXxVpgaydxyvTjV";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	  
	  @Test
	 
	  public  void gridTestingChrome() throws MalformedURLException  {
		 
	  DesiredCapabilities cap  = DesiredCapabilities.chrome();
	  cap.setPlatform(Platform.WIN8);
	  cap.setCapability("build", "JinoChrome");
	  cap.setCapability("project", "Mukesh_SeleniumGridChrome");
		 driver = new RemoteWebDriver(new URL (URL), cap);
		 driver.get("https://www.facebook.com/");
		  System.out.println(driver.getTitle());
		 
		 
	  } 
}
