package SeleniumWebdriver_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Alerts {

	public static void main(String[] args) {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver",
					"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
			driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
			
			//1st approach
			driver.switchTo().alert().accept();
			
			
			Alert alt = driver.switchTo().alert();
			System.out.println("Alert text " +alt.getText());
		//	alt.accept();
			alt.dismiss();

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
