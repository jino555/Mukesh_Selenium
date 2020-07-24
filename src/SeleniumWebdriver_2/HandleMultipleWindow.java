package SeleniumWebdriver_2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class HandleMultipleWindow {

	public static void main(String[] args) throws InterruptedException {


System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.naukri.com/");
		
		
		
	
			String parentId = driver.getWindowHandle();
			System.out.println("Parent Id " +parentId);
		
		
		Set<String > se = driver.getWindowHandles();
		System.out.println("All ids " +se);
				
		Iterator <String> it = se.iterator();
		//System.out.println("Iterator of string " +it);
		
		
		boolean val = it.hasNext();
		System.out.println("Boolean value  " +val);
		
		while(it.hasNext()) {
			
			
			String childwindow = it.next();
			
			System.out.println("Id  "+childwindow);
			if (!parentId.equalsIgnoreCase(childwindow)) {
				
				driver.switchTo().window(childwindow);
				System.out.println("Child Window  " +driver.getTitle());
				
			}
			
			
			
			
		}

		
			Thread.sleep(3000);
		driver.close();
		//driver.quit();
	}

}
