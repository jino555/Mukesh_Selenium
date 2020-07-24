package SeleniumWebdriver_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFramework1 {

	@Test(dataProvider="passData")
	public void verifyLogin(String username, String password) throws Exception {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(username);

		driver.findElement(By.id("pass")).sendKeys(password);

	}
	
	
@DataProvider(name ="passData")
	public Object [][] passData(){
		
		Object [][] data = new Object [3][2];
		
		data[0][0] = "admin";
		data[0][1] ="123";
		
		data[1][0]= "jino";
	     data[1][1]="456";
	     
	    data[2][0]= "sooraj";
	   data[2][1]="789";
		
		return data;
	}
	
	
	
	

}
