package SeleniumWebdriver_1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class MultipleTabsAndWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Terms")).click();
		
	driver.findElement(By.linkText("Data Policy")).click();
		
		driver.findElement(By.linkText("Cookie Policy")).click();
		
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id " +parentId);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println("AllId's" +allId);
		
		
		int count = allId.size();
		System.out.println("Size " +count);
		
		//1st Approach , parent (0 index), latest opened tab index(1)
	/*ArrayList<String> tab = new ArrayList<>(allId);
		
		driver.switchTo().window(tab.get(0));
		
		System.out.println("Title " +driver.getTitle());*/
		
		
		//2nd Approach, 1st parent id, then latest opened tab id 
		
		for(String childId : allId) {

			
			if(!parentId.equalsIgnoreCase(childId)) {
				
				driver.switchTo().window(childId);
				System.out.println("Title of child tabs " +driver.getTitle());
				
			}
			
			
		
				if(driver.getTitle().equals("Data Policy"))
				
				{
					
				Thread.sleep(8000);
				String text = driver.findElement(By.xpath("//h2[text()='Data Policy']")).getText();
				System.out.println("Text " +text);
				
				
			
				}
				
				
				
				
				
		}
			
			
			
			
		driver.switchTo().window(parentId);
		System.out.println("Parent tab " +driver.getTitle());
		Thread.sleep(3000);
		
		//driver.close();
     driver.quit();
	

	}
}
