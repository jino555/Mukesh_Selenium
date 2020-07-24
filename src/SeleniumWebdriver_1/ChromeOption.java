package SeleniumWebdriver_1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;



public class ChromeOption {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

	
	ChromeOptions opt = new ChromeOptions();
	
	//1. headless mode
	
	//opt.addArguments("--headless");
	//opt.addArguments("--disable-gpu");
	
	
	
	//2.adding extension
	
	//opt.addExtensions(new File("C:\\Users\\Jino\\Downloads\\extension_2_0_6_0.crx"));
	
	
	//3.disable notifiction
	//opt.addArguments("--disable-infobars");	//->not working
		
	
	//4. disable notifciation popup

	//opt.addArguments("--disable-notifications");
	
	
	
	WebDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		System.out.println("Title " +driver.getTitle());
	
	}
}
	
