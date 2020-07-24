package SeleniumWebdriver_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class IsDisplayedSelectedEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		
		// display
		
		driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		WebElement el =driver.findElement(By.xpath("//div[@class='_5v-0 _53im']//div"));
		
		
		// RADIO
	//driver.get(
			//	"https://bulma.io/documentation/form/radio/#:~:text=You%20can%20check%20a%20radio,to%20the%20element.&text=You%20can%20disable%20a%20radio,%3E%20and%20the%20.");

		// checkbox
		// driver.get("https://bulma.io/documentation/form/checkbox/");

		// textbox
		// driver.get("https://bulma.io/documentation/form/input/");

		// buttons
		// driver.get("https://www.vanguardcharitable.org/reg/register_step1");

		// driver.findElement(By.id("lastName")).sendKeys("philip");
		//WebElement el = driver.findElement(By.xpath("(//label[@class='checkbox'])[3]"));
		
		System.out.println("name " + el.getAttribute("innerHTML"));
	boolean b1 = el.isDisplayed();
		boolean b2 = el.isEnabled();
		boolean b3 = el.isSelected();
//		el.click();
		
		
		boolean b4 = el.isSelected();
		
		System.out.println("Status "  +b1 +" "+ b2 + " " + b3   +" " + b4);
		driver.close();
	}

}
