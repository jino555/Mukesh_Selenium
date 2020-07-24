package SeleniumWebdriver_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class DynamicRadioCheckBoxes {

	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		//A different approach if have multiple values
		
		List<WebElement> list = driver.findElements(By.xpath("//label[@class='_58mt']"));



		for (int i = 0; i < list.size(); i++) {
			
			String se = list.get(i).getText();

			
			System.out.println("radiobutton  is " + se);
			
			
			if (se.contains("Bar")) {

				
			list.get(i).click();
				
			}
			
		} 
		//driver.close();
		
		
		/*for(WebElement el : list) {
				
				System.out.println("Radio option "+el.getText());
				
				if(el.getText().contains("Male")) {
					
					el.click();
					break;
				}
				
			}*/
			
			

		}

	}


