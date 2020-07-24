package SeleniumWebdriver_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		
		WebElement el = driver.findElement(By.id("hd_user_widdget"));

		Actions act = new Actions(driver);
	    	act.moveToElement(el).perform();
		
		//1st approach
		/*WebElement el1 = driver.findElement(By.xpath("//a[text()='View Ticket']"));
		act.moveToElement(el).click(el1).build().perform();
		
		//act.click(el1).perform();
		*/
		
		//2nd approach

		List<WebElement> list = driver
				.findElements(By.xpath("//div[@class='tip tip_top right white moreSubLinks']//li"));

		System.out.println("Size of dropdown " + list.size());

		for (int i = 0; i < list.size(); i++) {

			WebElement ele = list.get(i);
		  
			String text = ele.getText();
			System.out.println("Dropdownlist " +text);
			
			if (text.contains("Make Payment"))

			{
				System.out.println("Dropdown found" +text);
				
				ele.click();
				
				//debug needed as after clickimg stale element 
			}
			
			

		}
		
		
		
		
		

	}

}
