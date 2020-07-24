package SeleniumWebdriver_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class AuthenticationPopUpUsingAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
		
		
		
		
	Thread.sleep(3000);
		
	driver.get("https://the-internet.herokuapp.com/basic_auth");
	
	
		Runtime.getRuntime().exec("C:\\Users\\Jino\\Desktop\\New folder (4)\\authentication\\authentication.exe");
		
		System.out.println("Authenication");
	}

}
