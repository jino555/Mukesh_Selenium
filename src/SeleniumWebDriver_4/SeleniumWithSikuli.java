package SeleniumWebDriver_4;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;

import SeleniumWebdriver_2.SeleniumGridMac;

import org.sikuli.script.Screen;

public class SeleniumWithSikuli{
	
	 WebDriver driver;
	
			
		
				public void sikuliTesting() throws FindFailed {
					
			System.setProperty("webdriver.chrome.driver",
					"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		driver = new ChromeDriver();

			driver.manage().window().maximize();
		

			

			driver.get("https://www.facebook.com/");
		
				Screen sc = new Screen();
		
		Pattern img1 = new Pattern("C:\\Users\\Jino\\Desktop\\sikuli\\fb_username.png");
				
		Pattern img2 = new Pattern("C:/Users/Jino/Desktop/sikuli/fb_password.png");
		
		
		Pattern img3 = new Pattern("C:\\Users\\Jino\\Desktop\\sikuli\\fb_click.png");
		
		
		sc.wait(img1, 10);
		sc.type(img1, "jinophilip");
		
		sc.type(img2, "12345");
		sc.click(img3);
		
		
		}
}
		
		
		
		
		
		
		
		
		