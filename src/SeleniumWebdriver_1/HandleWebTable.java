package SeleniumWebdriver_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		
		 int frSize = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Frame size " +frSize);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("__ta_notif_frame_2"));

		// driver.switchTo().frame("__ta_notif_frame_2");

		WebElement el1= driver.findElement(By.xpath("//div[@class='close']"));

		 wait.until(ExpectedConditions.visibilityOf(el1));

		 el1.click();

		
		 driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		List<WebElement> calList = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//table//td"));

		int size = calList.size();
		System.out.println("Calender onward size " + size);

		
		
		
		for (int i = 0; i < calList.size(); i++) {

			String cv = calList.get(i).getText();
			System.out.println("calender value " +cv);
		if (cv.equalsIgnoreCase("23")) {
				
			calList.get(i).click();
				
			}

	}

	}}
// div[@id='rb-calendar_onward_cal']//table//td