package SeleniumWebdriver_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class DownloadFileAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
	
		driver.findElement(By.linkText("4.0.0-alpha-5")).click();
	
		Thread.sleep(8000);
	
		Runtime.getRuntime().exec("C:\\Users\\Jino\\Desktop\\New folder (4)\\download\\download.exe");
	}

}


