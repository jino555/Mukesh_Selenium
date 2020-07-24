package SeleniumWebdriver_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver80\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		
		List<WebElement> se = driver.findElements(By.xpath("//ul[@class='select2-results__options']//li"));
		
		
		int a =se.size()-1;
		
		System.out.println("option in dropdown " +a);
		
		
		for (int i = 0; i < se.size(); i++) {

			String dl = se.get(i).getText();
			
			System.out.println("dropdown list is " +dl);
			if (dl.contains("Denmark")) {

				se.get(i).click();
				break;
				
			}
			
			
		}
		

	}}
	
