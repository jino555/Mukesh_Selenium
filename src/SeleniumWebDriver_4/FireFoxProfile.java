package SeleniumWebDriver_4;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import  org.openqa.selenium.firefox.internal.ProfilesIni;

public class FireFoxProfile {

	public static void main(String[] args) {

        // Create object of ProfilesIni class
		System.setProperty("webdriver.gecko.driver",
				"E:\\Jino_testing\\Test Automation\\Gecko driver\\gecko0.26\\geckodriver.exe");
        ProfilesIni init=new ProfilesIni();



        // Get the default session  

     FirefoxProfile profile=init.getProfile("default-release-1");



      //Pass the session/profile to FirefoxDriver 

        WebDriver driver= new FirefoxDriver(profile);



        driver.get("https://facebook.com/");



        driver.quit();

	}

}
