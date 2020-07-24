package SeleniumWebdriver_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFrameworkPart2ConfigClass {
 
	
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
	public Object [][] passData() throws IOException{
		
		
		DataDrivenFrameworkPart2Config config= new DataDrivenFrameworkPart2Config("E:\\Jino_testing\\Automation_project\\MukeshSelenium\\ReadExcel.xlsx");
		int rows = config.getRowCount(0);
		
		Object [][] data = new Object [rows][2];
		
		for(int i=1;i<rows;i++) {
			
			data[i][0]= config.getData(0, i, 0);
			data[i][1]= config.getData(0, i, 1);
			
		}
		return data;
	}
	
	
	
	

}
